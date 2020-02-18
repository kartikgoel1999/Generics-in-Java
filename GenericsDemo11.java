import java.util.*;
class GenericsDemo11
{
	public static <T1,T2>void m1(T1 a,T2 b) 
	{
		System.out.println(a+"  "+b);
	}
	public static void main(String[] args) 
	{
		m1(10,"Ten");
		m1("Core",20);
	}
}
