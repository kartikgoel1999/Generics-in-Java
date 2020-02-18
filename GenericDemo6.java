import java.util.*;
class MyRunnable implements Runnable
{
	public void run(){}
}
class GenericDemo6<T extends Object,Runnable>
{
	GenericDemo6(T x)
	{
		System.out.println(x);
	}
	void m1(T x)
	{
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		MyRunnable r=new MyRunnable();
		GenericDemo6<Object,MyRunnable> t=new GenericDemo6<Object,MyRunnable>(10);
		t.m1(100);
		GenericDemo6<Object,MyRunnable> t1=new GenericDemo6<Object,MyRunnable>(r);
		t1.m1(null);
	}
}
