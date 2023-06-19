package thread;

public class MyThread2 implements Runable{
	@Override
	public void run()
	{
		System.out.println("Name of Thread:"+Thread.currentThread().getName());
		System.out.println("Priority of Thread:"+Thread.currentThread().getPriority());
	}

}
