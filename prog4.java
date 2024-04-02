import java.util.Scanner;

class  matrix
{
   int a,b,i,j;
   int arr[][]=new int[10][10];
   Scanner s=new Scanner(System.in);

   void create()
   {
        
        System.out.print("Enter the matrix:");
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=b;j++)
            {
               arr[i][j]=s.nextInt();
            }

        }
   }

    void display(String n)
    {
    System.out.println(n+" matrix");
     for(i=1;i<=a;i++)
          {
            for(j=1;j<=b;j++)
            {
                System.out.println(arr[i][j]+" ");
            }

             System.out.println();

          }
   }

   void add(matrix m1,matrix m2)
   {
    for(i=1;i<=a;i++)
          {
            for(j=1;j<=b;j++)
            {
                arr[i][j]=m1.arr[i][j]+m2.arr[i][j];
              
            }
          }


    }
}

public class prog4
{
    public static void main(String args[])
    {
        int a,b;

        Scanner s= new Scanner(System.in);

        matrix m1=new matrix();
        matrix m2=new matrix();
        matrix m3=new matrix();

         System.out.println("enter no of rows:");
         a=s.nextInt();
         System.out.println("enter no of columns:");
         b=s.nextInt();

         m1.a=m2.a=m3.a=a;
         m1.b=m2.b=m3.b=b;

        System.out.println("matrix1:");
        m1.create();
        System.out.println("matrix2:");
        m2.create();
        m1.display("1st");
        m2.display("2st");
        m3.add(m1,m2);
        m3.display("Resulant");

      

    }
}