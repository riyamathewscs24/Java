class College extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("BMS College Of Engineering");
                Thread.sleep(10000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Thread Interrupted");
        }
    }
}
class Dept extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Thread Interrupted");
        }
    }
}
class Threadpgm 
{
    public static void main(String args[])
    {
        College c=new College();
        c.start();
        Dept d=new Dept();
        d.start();
    }
}
