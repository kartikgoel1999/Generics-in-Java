import java.util.*;
class GenericsDemo8
{
	public static void m1(ArrayList<? extends Number> al) 
	{
		System.out.println(al);
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> s2=new ArrayList<Integer>();
		s2.add(10);
		m1(s2);
		ArrayList<Float> s3=new ArrayList<Float>();
		s3.add(10.8f);
		m1(s3);
	}
}
