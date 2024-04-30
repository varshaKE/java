interface A
{  
void a();
void b();  
void c();  
void d();  
}  

interface N extends A
{
   
   void e();

}
  
  
 abstract  class B implements A
{  
        public void c()
        {
            System.out.println("I am C");
        } 

        public void e()
        {
            System.out.println("I am e");
        } 
}  
  

class M extends B
{  
        public void a()
        {
            System.out.println("I am a");
            
        }  
        public void b()
        {
            System.out.println("I am b");
        }  
        public void d()
        {
            System.out.println("I am d");
        }  
}  
  
  
class interfacetest
{  
        public static void main(String args[])
        {  

            M ob=new M();  
            ob.a();  
            ob.b();  
            ob.c();  
            ob.d();  
            ob.e();

        }
}  