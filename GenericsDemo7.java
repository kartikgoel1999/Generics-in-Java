import java.util.*;
class GenericsDemo7 
{
	public static void m1(ArrayList<?> al) 
	{
		System.out.println(al);
	}
	public static void main(String[] args) 
	{
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("Java");
		m1(s1);
		ArrayList<Integer> s2=new ArrayList<Integer>();
		s2.add(10);
		m1(s2);
		ArrayList<Float> s3=new ArrayList<Float>();
		s3.add(10.8f);
		m1(s3);
	}
}
