package CIE;
import java.util.Scanner;
public class Internals extends Student
{
    protected int cmarks[]=new int[5];
    public void inputCIEmarks()
    {
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter CIE marks for subject "+(i+1)+":(out of 50)");
            cmarks[i]=s.nextInt();
        }
    }
}
