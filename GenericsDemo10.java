import java.util.*;
class GenericsDemo10
{
	public static <T>void m1(T a,T b) 
	{
		System.out.println(a+"  "+b);
	}
	public static void main(String[] args) 
	{
		m1(10,20);
		m1("Core","Java");
	}
}
