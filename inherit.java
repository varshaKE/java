
 class grandparent
 {
   int a=20;

    void disp()
    {
        System.out.println("a="+a);
    }
 } 
 
 
 class parent extends grandparent
 {
  int x=16;

  void show()
  {
     System.out.println("x="+x);
  } 

}

class child extends parent
{
int y=10;

void display()
{
   System.out.println("y="+y);
   super.show();
}


void show()
{
      System.out.println("this is show method of child");
}

}
 
 
 
 class inherit
 {
   public static void main(String args[])
   {

    parent a=new parent();
    child b= new  child();

    a.show();
    b.show();
    b.disp();
    b.display();


   }

 }  

