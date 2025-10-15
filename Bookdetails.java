import java.util.Scanner;
class Books
{
    String name;
    String author;
    int price;
    int numPages;
    Books(String name,String author,int price,int numPages)
    {
        this.name=name;
        this.author=author;
        this.price=price;
        this.numPages=numPages;
        
    }
    public String toString()
    {
        String name,author,price,numPages;
        name="Book name:"+this.name+"\n";
        author="Author name:"+this.author+"\n";
        price="Price:"+this.price+"\n";
        numPages="Number of pages:"+this.numPages+"\n";
        return name+author+price+numPages;

    }
}
public class Bookdetails
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,price,numPages;
        String name,author;
        System.out.println("Enter no of books:");
        n=s.nextInt();
        s.nextLine();
        Books b[];
        b=new Books[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name of book:");
            name=s.nextLine();
            System.out.println("Enter author of book:");
            author=s.nextLine();
            System.out.println("Enter price of book:");
            price=s.nextInt();
            s.nextLine();
            System.out.println("Enter no of pages of book:");
            numPages=s.nextInt();
            s.nextLine();
            b[i]=new Books(name,author,price,numPages);
            System.out.println("Details of book " + (i + 1) + ":\n" + b[i].toString());


        }


    }
}
