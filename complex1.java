import java.util.Scanner;

class complex
{
  
  Double real;
  Double img;

  public complex()
  {
     real=0.0;
     img=0.0;

  }


  public complex(Double a , Double b)
  {
    real=a;
    img=b;
  }

  void display()
  {
    System.out.println(real+"+"+img+"i");
  }

}

class complextest
{
    public static complex add(complex ob1,complex ob2)
    {
        complex c = new complex();
        c.real=ob1.real + ob2.real;
        c.real-ob1.img + ob2.img;
        return c;
    }


    public static void main(String arg[])
    {
        Scanner s = new Scanner(System.in);
        Double x, y;

         System.out.println("enter values");
         x=s.nextDouble();
         y=s.nextDouble();

         complex c1=new complex(x,y);
         System.out.println("enter values");
         x=s.nextDouble();
         y=s.nextDouble();

         complex c2=new complex(x,y);

         complex c= new complex();

         c=add(c1,c2);

         System.out.println("enter first number:");
         c1.display();
         System.out.println("enter second number:");
         c2.display();
         System.out.println("result:");
         c.display();



    }
}