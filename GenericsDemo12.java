import java.util.*;
class Test implements Runnable
{
	public void run(){}
}
class GenericsDemo12
{
	public static <T1 extends Number,T2 extends Runnable>void m1(T1 a,T2 b) 
	{
		System.out.println(a+"  "+b);
	}
	public static void main(String[] args) 
	{
		m1(10,new Test());
	}
}
