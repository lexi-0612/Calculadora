import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class Padre extends JDialog {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel Padre;
    private JTextField textField1;
    private JButton Button1;
    private JButton Button9;
    private JButton ButtonClear;
    private JButton Button2;
    private JButton Button4;
    private JButton Button7;
    private JButton Button0;
    private JButton Button3;
    private JButton Button5;
    private JButton Button8;
    private JButton Button12;
    private JButton ButtonS;
    private JButton Button6;
    private JButton ButtonD;
    private JButton ButtonR;
    private JButton ButtonM;
    private JButton ButtonG;

    private void getoperator (String ButtonText){
        math_operator = ButtonText.charAt(0);
        total1 = total1 + Double.parseDouble(textField1.getText());
        textField1.setText("");
    }


    public Padre() {
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Button1Text = textField1.getText() + Button1.getText();
                textField1.setText(Button1Text);
            }

        });
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Button2Text = textField1.getText() + Button2.getText();
                textField1.setText(Button2Text);
            }
        });
        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Button3Text = textField1.getText() + Button3.getText();
                textField1.setText(Button3Text);
            }
        });
        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Button4Text = textField1.getText() + Button4.getText();
                textField1.setText(Button4Text);
            }
        });
        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Button5Text = textField1.getText() + Button5.getText();
                textField1.setText(Button5Text);
            }
        });
        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Button6Text = textField1.getText() + Button6.getText();
                textField1.setText(Button6Text);
            }
        });
        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Button7Text = textField1.getText() + Button7.getText();
                textField1.setText(Button7Text);
            }
        });

        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Button8Text = textField1.getText() + Button8.getText();
                textField1.setText(Button8Text);
            }
        });


        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Button9Text = textField1.getText() + Button9.getText();
                textField1.setText(Button9Text);
            }
        });
        Button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Button0Text = textField1.getText() + Button0.getText();
                textField1.setText(Button0Text);
            }
        });
        Button12.addActionListener(new ActionListener() {
            public  void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("")) {
                    textField1.setText("0. ");
                }
                else if (textField1.getText().contains(".")) {
                    Button12.setEnabled(false);
                }
                else {
                    String Button12Text = textField1.getText() + Button12.getText();
                    textField1.setText(Button12Text);
                }
                Button12.setEnabled(true);
            }

        });



        ButtonS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String Button_Text = ButtonS.getText();
               getoperator(Button_Text);
            }
        });
        ButtonG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator){
                    case '+':
                        total2 = total1 +Double.parseDouble(textField1.getText());
                        break;
                    case '-':
                        total2 = total1 -Double.parseDouble(textField1.getText());
                    case '/':
                        total2 = total1 /Double.parseDouble(textField1.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textField1.getText());
                        break;
                 }

                textField1.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        ButtonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textField1.setText("");
            }
        });
        ButtonR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button_Text = ButtonR.getText();
                getoperator(Button_Text);
            }
        });
        ButtonD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button_Text = ButtonD.getText();
                getoperator(Button_Text);
            }
        });
        ButtonM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button_Text = ButtonM.getText();
                getoperator(Button_Text);
            }
        });
    }







    public static void main(String[] args) {
        JFrame frame = new JFrame("Padre");
        frame.setContentPane(new Padre().Padre);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
