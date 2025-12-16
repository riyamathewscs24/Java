import java.util.Scanner;
interface Check {
    void input();
    void checkage() throws IncorrectAge;                                                                                                                                                                                    
}

class IncorrectAge extends Exception {
    IncorrectAge(String msg) {
        super(msg);
    }
}

class Voter implements Check {
    int age;
    Scanner s = new Scanner(System.in);

    public void input() {
        System.out.println("Enter age:");
        age = s.nextInt();
    }

    public void checkage() throws IncorrectAge {
        if (age < 0) 
        {
            throw new IncorrectAge("Age cannot be negative");
        } 
        else if (age < 18) 
        {
            throw new IncorrectAge("Not eligible for voting");
        } 
        else 
        {
            System.out.println("Eligible for voting");
        }
    }
}

public class VotingAgenew {
    public static void main(String args[]) {
        try 
        {
            Voter v = new Voter();
            v.input();
            v.checkage();
        } 
        catch (IncorrectAge e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        } 
        finally
        {
            System.out.println("Voting age verified!");
        }
    }
}
