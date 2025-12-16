import java.util.Scanner;
interface Check
{
    void input();
}
class incorrectAge extends Exception
{
    incorrectAge()
    {
        System.out.println("Age error!");
    }
    incorrectAge(String msg)
    {
        System.out.println(msg);
    }
}
class Voter implements Check
{
    int age;
    Scanner s=new Scanner(System.in);
    public void input()
    {
        System.out.println("Enter age:");
        age=s.nextInt();
    }
    Voter() throws incorrectAge
    {
        if(age<0)
        {
           throw new incorrectAge("Age cannot be negative");
        }
        else if(age<18)
        {
            throw new incorrectAge("Not eligible for voting");
        }
        else
        {
            System.out.println("Eligible for voting");
        }

    }
}
class VotingAge
{
    public static void main(String args[])
    {
        try
        {
            Voter v=new Voter();
            v.input();
        }
        catch(incorrectAge e)
        {
            System.out.println("Exception caught:"+e);
        }
        finally
        {
            System.out.println("Voting age verified!");
        }
    }
}