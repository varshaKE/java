import java.awt.*;
import java.awt.event.*;
public class frame1 extends Frame implements ActionListener
{
    TextField t1,t2,t3,t4;
    Label l1,l2,l3,l4;
    Button b1;

    frame1()
    {
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        t4=new TextField(10);
        l1=new Label("first number");
        l2=new Label("second number");
        l3=new Label("third number");
        l4=new Label("result");
        b1=new Button("submit");
        b1.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(l4);
        add(t4);
        setLayout(new FlowLayout());

    }

    public void actionPerformed(ActionEvent ae)
    {
        int a,b,c,r,temp;
        if(ae.getSource()==b1)
        {
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            c=Integer.parseInt(t3.getText());
            temp=a>b?a:b;
            r=c>temp?c:temp;
            t4.setText(String.valueOf(r));

        }
    }

    public static void main(String args[])
    {
        frame1 f = new frame1();
        f.setSize(400,200);
        f.setVisible(true);
    }
}