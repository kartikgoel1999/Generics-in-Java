import java.util.*;
class Demo
{
	int x;
	Demo(int x)
	{
		this.x=x;
	}
	public String toString()
	{
		return x+"";
	}
}
class GenericsDemo13 
{
	public static void m1(ArrayList al)
	{
		Demo d=new Demo(101);
		System.out.println("M1 :: "+al);
		al.add(10);
		al.add("HB");
		al.add(d);
		System.out.println("M1 :: "+al);
	}
	public static void main(String[] args) 
	{
		ArrayList<String>al=new ArrayList<String>();
		al.add("Raja");
		al.add("Java");
		System.out.println("MAIN :: "+al);
		m1(al);
		System.out.println("MAIN :: "+al);
		//String s1=(String)al.get(2);
		//System.out.println(s1);
		Demo d=(Demo)al.get(4);
	}
}
