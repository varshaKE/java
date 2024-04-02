import java.util.Scanner;

 class second
 {
   public static void main(String args[])
   {

      try
      {
           Scanner s=new Scanner(System.in);
           System.out.println("enter a string:");
           String name=s.next();
           

           System.out.println("enter a number in integer:");
           int i=s.nextInt();

           System.out.println("enter a number in float");
           float f=s.nextFloat();


           System.out.println("string is:"+name);
           System.out.println("integer value is:"+i);
           System.out.println("float value is:"+f);

           s.close();


      }catch(Exception E)  
      {
        System.out.println(E);
           
      }    

   }

 }     
           
           

           