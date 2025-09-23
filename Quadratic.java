import java.util.Scanner;
class Quadratic
{
    public static void main (String args[])
    {
        int a,b,c,d;
        double r1,r2;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter coefficients of quadratic equation");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a==0||b==0||c==0) 
        {
            System.out.println("Not a quadratic equation");
        }
        else
        {
            d=(b*b)-(4*a*c);
            if(d==0)
            {
                System.out.println("Roots are real and equal");
                r1=(-b/(2*a));
                System.out.println("Root="+r1);
            }
            else if(d>0)
            {
                System.out.println("Roots are real and distinct");
                r1=((-b)+(Math.sqrt(d)))/(double)(2*a);
                r2=((-b)-(Math.sqrt(d)))/(double)(2*a);
                System.out.println("Root1="+r1);
                System.out.println("Root2="+r2);


            }
            else if(d<0)
            {
                System.out.println("Roots are imaginary");
                r1=(-b/(double)(2*a));
                r2=(Math.sqrt(Math.abs(d)))/(2*a);
                System.out.println("Root1="+r1+"+i"+r2);
                System.out.println("Root2="+r1+"-i"+r2);

            }
            else
            {
                System.out.println("Invalid input");
            }
        }
    }
}