import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculGui extends JFrame {
    private JTextField textField1;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a5Button;
    private JButton a0Button;
    private JButton a8Button;
    private JButton a2Button;
    private JButton a9Button;
    private JButton a0ButtonP;
    private JButton a6Button1;
    private JButton a3Button;
    private JPanel principale;
    private JButton ButtonAddition;
    private JButton ButtonSous;
    private JButton ButtonMul;
    private JButton ButtonDiv;
    private JButton cButton2;
    private double  res = 0;
    private boolean enAttente = false;
    private String op = "";

    private void comparer(int nbr) {
        switch (op) {
            case "+":
                res += nbr;
                break;
            case "-":
                res -= nbr;
                break;
            case "*":
                res *= nbr;
                break;
            case "/":
                res /= nbr;
                break;
        }
        textField1.setText(Double.toString(res));
        enAttente = false;
    }

    public CalculGui() {
        setContentPane(principale);
        setTitle("Calculatrice");
        setSize(200, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!enAttente) {
                    textField1.setText(textField1.getText() + "0");
                } else {
                    comparer(0);
                }
            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!enAttente) {
                    textField1.setText(textField1.getText() + "1");
                } else {
                    comparer(1);

                }
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!enAttente) {
                    textField1.setText(textField1.getText() + "2");
                } else {
                    comparer(2);

                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!enAttente) {
                    textField1.setText(textField1.getText() + "3");
                } else {
                    comparer(3);
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!enAttente) {
                    textField1.setText(textField1.getText() + "4");
                } else {
                    comparer(4);

                }
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!enAttente) {
                    textField1.setText(textField1.getText() + "5");
                } else {
                    comparer(5);
                }
            }
        });
        a6Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!enAttente) {
                    textField1.setText(textField1.getText() + "6");
                } else {
                    comparer(6);
                }
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!enAttente) {
                    textField1.setText(textField1.getText() + "7");
                } else {
                    comparer(7);
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!enAttente) {
                    textField1.setText(textField1.getText() + "8");
                } else {
                    comparer(8);
                }
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!enAttente) {
                    textField1.setText(textField1.getText() + "9");
                } else {
                    comparer(9);
                }
            }
        });

        a0ButtonP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!enAttente) {
                    textField1.setText(textField1.getText() + ",");
                }
            }
        });
        cButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                res = 0;
                enAttente = false;
                textField1.setText("");
            }
        });

        // LES OPERATIONS:

        ButtonAddition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText() != "") {
                    res = Double.parseDouble(textField1.getText());
                    enAttente = true;
                    op = "+";
                }

            }
        });
        ButtonSous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText() != "") {
                    res = Double.parseDouble(textField1.getText());
                    enAttente = true;
                    op = "-";
                }
            }
        });
        ButtonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText() != "") {
                    res = Double.parseDouble(textField1.getText());
                    enAttente = true;
                    op = "*";
                }
            }
        });
        ButtonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText()  != "") {
                    enAttente = true;
                    res = Double.parseDouble(textField1.getText());
                    op = "/";
                }
            }
        });

    }
}
