import java.util.*;
class MyRunnable implements Runnable
{
	public void run(){}
}
class GenericDemo4<T extends Runnable>
{
	T x;
	GenericDemo4(T y)
	{
		x=y;
		System.out.println(y);
	}
	public static void main(String[] args) 
	{
		MyRunnable r=new MyRunnable();
		GenericDemo4<MyRunnable> i1=new GenericDemo4<MyRunnable>(r);
		System.out.println(i1.x);
		
	}
}
