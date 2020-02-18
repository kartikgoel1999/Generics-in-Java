import java.util.*;
class MyRunnable implements Runnable
{
	public void run(){}
}
class GenericDemo5<T extends Object,Runnable>
{
	GenericDemo5(T x)
	{
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		MyRunnable r=new MyRunnable();
		GenericDemo5<Object,MyRunnable> t=new GenericDemo5<Object,MyRunnable>(10);
		GenericDemo5<Object,MyRunnable> t1=new GenericDemo5<Object,MyRunnable>(r);
	}
}
