import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener
{
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;

    Calculator()
    {
        l1 = new JLabel("Number 1");
        l2 = new JLabel("Number 2");
        l3 = new JLabel("Result");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");

        l1.setBounds(30,30,80,30);
        t1.setBounds(120,30,100,30);

        l2.setBounds(30,70,80,30);
        t2.setBounds(120,70,100,30);

        l3.setBounds(30,110,80,30);
        t3.setBounds(120,110,100,30);

        b1.setBounds(20,160,50,30);
        b2.setBounds(80,160,50,30);
        b3.setBounds(140,160,50,30);
        b4.setBounds(200,160,50,30);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1); add(b2); add(b3); add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setTitle("Simple Calculator");
        setSize(300,250);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double r = 0;

        if (e.getSource() == b1)
            r = a + b;
        else if (e.getSource() == b2)
            r = a - b;
        else if (e.getSource() == b3)
            r = a * b;
        else if (e.getSource() == b4)
            r = a / b;

        t3.setText(String.valueOf(r));
    }

    public static void main(String[] args)
    {
        new Calculator();
    }
}
