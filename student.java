class student
{
  public static void main(String args[])
  
   { 
      String Name=args[0];
      int rollno=Integer.parseInt(args[1]);
      Double marks=Double.parseDouble(args[2]);
      System.out.println("name="+Name);
      System.out.println("roll no="+rollno);
      marks=marks+10;
      System.out.println("marks="+marks);
      
      student f= new student();
      f.show();

   }

   
    void show()
    {
      
        System.out.println("show");
    
    }
}
  

    