import java.util.Scanner;
class WrongAge extends Exception {
    WrongAge() {
        super("Age Error!");
    }
    WrongAge(String msg) {
        super(msg);
    }
}
class InputScanner {
    Scanner s = new Scanner(System.in);
}
class Father extends InputScanner {

    int fatherAge;

    Father() throws WrongAge {

        System.out.print("Enter Father's Age: ");
        fatherAge = s.nextInt();

        if (fatherAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }

    void displayFather() {
        System.out.println("Father's Age: " + fatherAge);
    }
}
class Son extends Father {

    int sonAge;

    Son() throws WrongAge {

        System.out.print("Enter Son's Age: ");
        sonAge = s.nextInt();

        if (sonAge >=fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age");
        }
        else if (sonAge < 0) {
            throw new WrongAge("Son's age cannot be negative");
        }
    }

    void displaySon() {
        System.out.println("Son's Age: " + sonAge);
    }
}
class ExceptionHandling{

    public static void main(String[] args) {

        try {
            Son s = new Son();    
            s.displayFather();
            s.displaySon();
        }
        catch (WrongAge e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}