package Calculatrice;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;

public class Calculatrice extends Container {

    private JPanel mainPanel;

    private JButton buttonAddi, buttonSoustrac, buttonMulti, buttonDivis;
    private JButton buttonEgale, buttonEgaleAddition, buttonPourcen, buttonPoint;
    private JButton buttonSupr, cButton;

    private JButton a0Button, a1Button, a2Button, a3Button, a4Button, a5Button, a6Button, a7Button, a8Button, a9Button;

    private JButton buttonHistorique;
    private JList<String> listHistorique;

    private JButton buttonDarkLight;
    private JPanel JPanelChiffre;
    private JPanel JPaneHisto;

    private JTextPane affichage;
    private final DefaultListModel<String> modeleHistorique = new DefaultListModel<>();

    private double operandePremiere = 0.0;
    private Operation operateurCourant = null;
    private boolean nouveauNombre = true;
    private boolean enErreur = false;
    private boolean isDarkMode = false;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TP JAVA - Calculatrice");
        Calculatrice calc = new Calculatrice();

        if (calc.mainPanel == null) {
            System.err.println("ERREUR : Le mainPanel est null. Vérifiez que le fichier .form est bien lié.");
            return;
        }

        frame.setContentPane(calc.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public Calculatrice() {
        if (affichage != null) {
            affichage.setEditable(false);
            affichage.setFocusable(false);
            affichage.setDocument(new DefaultStyledDocument() {
                @Override
                public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                    if (str == null) return;
                    if ((getLength() + str.length()) <= 20) {
                        super.insertString(offs, str, a);
                    }
                }
            });
            afficher("0");
        }

        if (listHistorique != null) {
            listHistorique.setModel(modeleHistorique);
            listHistorique.setVisible(false);
        }

        if (buttonHistorique != null) {
            buttonHistorique.addActionListener(e -> {
                if (listHistorique != null) listHistorique.setVisible(!listHistorique.isVisible());
            });
        }

        JButton[] chiffres = {
                a0Button, a1Button, a2Button, a3Button, a4Button, a5Button, a6Button, a7Button, a8Button, a9Button
        };
        for (int i = 0; i < chiffres.length; i++) {
            int finalI = i;
            if (chiffres[i] != null) {
                chiffres[i].addActionListener(e -> ajouterAuAffichage(String.valueOf(finalI)));
            }
        }

        if (buttonPoint != null) {
            buttonPoint.addActionListener(e -> {
                if (nouveauNombre) {
                    afficher("0.");
                    nouveauNombre = false;
                } else if (!affichage.getText().contains(".")) {
                    ajouterAuAffichage(".");
                }
            });
        }

        buttonAddi.addActionListener(e -> appuiOperateur("+"));
        buttonSoustrac.addActionListener(e -> appuiOperateur("-"));
        buttonMulti.addActionListener(e -> appuiOperateur("*"));
        buttonDivis.addActionListener(e -> appuiOperateur("/"));

        buttonEgale.addActionListener(e -> appuiEgal());

        cButton.addActionListener(e -> effacerTout());


            buttonSupr.addActionListener(e -> {
                if (enErreur) return;
                String cur = affichage.getText();
                if (nouveauNombre) return;

                if (cur.length() <= 1 || (cur.startsWith("-") && cur.length() == 2)) {
                    afficher("0");
                    nouveauNombre = true;
                } else {
                    afficher(cur.substring(0, cur.length() - 1));
                }
            });



            buttonPourcen.addActionListener(e -> {
                if (enErreur) return;
                double val = obtenirValeurAffichage();
                afficher(formaterDouble(val / 100.0));
                nouveauNombre = true;
            });



            buttonEgaleAddition.addActionListener(e -> {
                if (enErreur) return;
                String cur = affichage.getText();
                if (!cur.equals("0") && !cur.equals("0.")) {
                    afficher(cur.startsWith("-") ? cur.substring(1) : "-" + cur);
                }
            });



            buttonDarkLight.addActionListener(e -> {
                isDarkMode = !isDarkMode;
                setDarkMode(isDarkMode);
            });



            configurerClavier();


        setDarkMode(false);
    }

    private void setDarkMode(boolean darkMode) {
        Color panelBg, buttonBg, textBg, fg, operatorFg;
        Color operatorButtonBg;

        if (darkMode) {
            panelBg = new Color(43, 43, 43);
            buttonBg = new Color(75, 75, 75);
            textBg = new Color(60, 60, 60);
            fg = Color.WHITE;
            operatorButtonBg = new Color(242, 163, 60);
            operatorFg = Color.WHITE;
            if (buttonDarkLight != null) buttonDarkLight.setText("Mode Clair");
        } else {
            panelBg = UIManager.getColor("Panel.background");
            buttonBg = UIManager.getColor("Button.background");
            textBg = Color.WHITE;
            fg = Color.BLACK;
            operatorButtonBg = buttonBg;
            operatorFg = fg;
            if (buttonDarkLight != null) buttonDarkLight.setText("Mode Sombre");
        }

        mainPanel.setBackground(panelBg);
        JPanelChiffre.setBackground(panelBg);
        JPaneHisto.setBackground(panelBg);

            affichage.setBackground(textBg);
            affichage.setForeground(fg);
            affichage.setCaretColor(fg);


            listHistorique.setBackground(textBg);
            listHistorique.setForeground(fg);


        JButton[] allButtons = {
                a0Button, a1Button, a2Button, a3Button, a4Button, a5Button, a6Button, a7Button, a8Button, a9Button,
                buttonPoint, buttonEgale, buttonEgaleAddition, buttonPourcen, buttonSupr, cButton, buttonHistorique, buttonDarkLight
        };

        JButton[] operatorButtons = {buttonAddi, buttonSoustrac, buttonMulti, buttonDivis};

        for (JButton btn : allButtons) {
            if (btn != null) {
                btn.setBackground(buttonBg);
                btn.setForeground(fg);
            }
        }

        for (JButton btn : operatorButtons) {
            if (btn != null) {
                btn.setBackground(operatorButtonBg);
                btn.setForeground(operatorFg);
            }
        }
    }

    private void appuiOperateur(String op) {
        if (enErreur) return;
        if (operateurCourant != null && !nouveauNombre) {
            appuiEgal();
        }
        operandePremiere = obtenirValeurAffichage();

        switch (op) {
            case "+": operateurCourant = new Addition(); break;
            case "-": operateurCourant = new Soustraction(); break;
            case "*": operateurCourant = new Multiplication(); break;
            case "/": operateurCourant = new Division(); break;
            default: operateurCourant = null; break;
        }
        nouveauNombre = true;
    }

    private void appuiEgal() {
        if (enErreur || operateurCourant == null) return;

        double second = obtenirValeurAffichage();
        double result = 0.0;
        boolean erreurLoc = false;

        if (operateurCourant instanceof Division && second == 0.0) {
            erreurLoc = true;
        } else {
            result = operateurCourant.apply(operandePremiere, second);
        }

        if (erreurLoc) {
            afficher("Erreur");
            operateurCourant = null;
            nouveauNombre = true;
            enErreur = true;
        } else {
            String resStr = formaterDouble(result);
            modeleHistorique.addElement(formaterDouble(operandePremiere) + " " + operateurCourant.symbol() + " " + formaterDouble(second) + " = " + resStr);
            afficher(resStr);
            operandePremiere = result;
            operateurCourant = null;
            nouveauNombre = true;
        }
    }

    private void effacerTout() {
        afficher("0");
        operandePremiere = 0.0;
        operateurCourant = null;
        nouveauNombre = true;
        enErreur = false;
    }

    private void ajouterAuAffichage(String s) {
        if (enErreur) return;
        if (nouveauNombre) {
            afficher(s.equals(".") ? "0." : s);
            nouveauNombre = false;
        } else {
            String cur = affichage.getText();
            afficher((cur.equals("0") && !s.equals(".")) ? s : cur + s);
        }
    }

    private double obtenirValeurAffichage() {
        try {
            return Double.parseDouble(affichage.getText());
        } catch (NumberFormatException ex) {
            return 0.0;
        }
    }

    private void afficher(String s) {
        if (affichage != null) affichage.setText(s);
    }

    private String formaterDouble(double d) {
        return BigDecimal.valueOf(d).stripTrailingZeros().toPlainString();
    }

    private void configurerClavier() {
        InputMap im = mainPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = mainPanel.getActionMap();

        for (int i = 0; i <= 9; i++) {
            String key = String.valueOf(i);
            im.put(KeyStroke.getKeyStroke(key), "digit" + key);
            im.put(KeyStroke.getKeyStroke("NUMPAD" + key), "digit" + key);
            am.put("digit" + key, new AbstractAction() {
                @Override public void actionPerformed(java.awt.event.ActionEvent e) {
                    ajouterAuAffichage(key);
                }
            });
        }

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0), "plus");
        am.put("plus", new AbstractAction() {
            @Override public void actionPerformed(java.awt.event.ActionEvent e) {
                appuiOperateur("+");
            }
        });

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0), "moins");
        am.put("moins", new AbstractAction() {
            @Override public void actionPerformed(java.awt.event.ActionEvent e) {
                appuiOperateur("-");
            }
        });

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0), "fois");
        am.put("fois", new AbstractAction() {
            @Override public void actionPerformed(java.awt.event.ActionEvent e) {
                appuiOperateur("*");
            }
        });

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0), "div");
        am.put("div", new AbstractAction() {
            @Override public void actionPerformed(java.awt.event.ActionEvent e) {
                appuiOperateur("/");
            }
        });

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "egal");
        am.put("egal", new AbstractAction() {
            @Override public void actionPerformed(java.awt.event.ActionEvent e) {
                appuiEgal();
            }
        });

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), "back");
        am.put("back", new AbstractAction() {
            @Override public void actionPerformed(java.awt.event.ActionEvent e) {
                if(buttonSupr != null) buttonSupr.doClick();
            }
        });
    }
}
