
class MyAnotherThread extends Thread
{
    public void run()
    {
        for(int i = 10; i>=1; i--)
        {
            System.out.println("Value of i is:" +i);

            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
            }
        }
    }
    public static void main(String[] args)
    {
        MyAnotherThread t1 = new MyAnotherThread();
        {
            Thread thr = new Thread(t1);
            thr.start();
        }
    }
}
