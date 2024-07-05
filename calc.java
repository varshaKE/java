import java.awt.*;
import java.awt.event.*;
public class calc extends Frame implements ActionListener{
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    Label l1,l2,l3;

    calc()
    {
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        b1=new Button("+");
        b1.addActionListener(this);
        b2=new Button("-");
        b2.addActionListener(this);
        b3=new Button("*");
        b3.addActionListener(this);
        b4=new Button("/");
        b4.addActionListener(this);
        l1=new Label("first number");
        l2=new Label("second number");
        l3=new Label("result");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l3);
        add(t3);
        setLayout(new FlowLayout());

    }

    public void actionPerformed(ActionEvent ae)
    {
        float a,b,r=0;
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        if(ae.getSource()==b1)
        {
            r=a+b;
        }
        else if(ae.getSource()==b2)
        {
            r=a-b;
        }
        else if(ae.getSource()==b3)
        {
            r=a*b;
        }
        else if(ae.getSource()==b4)
        {
            r=a/b;
        }
        t3.setText(String.valueOf(r));

    }

    public static void main(String args[])
    {
        calc c=new calc();
        c.setSize(500,300);
        c.setVisible(true);
        
    }

}