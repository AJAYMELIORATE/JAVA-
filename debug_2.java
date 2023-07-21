class debug_2 extends Thread 
{
    public static void main(String [] args) 
    {
        debug_2 t = new debug_2();
        t.start();
        System.out.print("one. ");
        t.start();
        System.out.print("two. ");
    }
	public void run() 
    {
        System.out.print("Thread ");
    }
}

