interface printable
    {  
        void print();  
    }  

class interface1 implements printable

{

public void print()
    {
        System.out.println("Hello");
    }  
  
public static void main(String args[])
    {  
        interface1 obj = new interface1();  
        obj.print();

    }  
}  