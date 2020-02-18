import java.util.*;
class GenericsDemo9>
{
	public static void m1(ArrayList<T extends Number> al) 
	{
		System.out.println(al);
		//al.add(551);
		al.add(null);
	}
	public static void main(String[] args) 
	{
		Child c=new Child();
		ArrayList<Integer> s2=new ArrayList<Integer>();
		s2.add(10);
		m1(s2);
		ArrayList<Float> s3=new ArrayList<Float>();
		s3.add(10.8f);
		m1(s3);
		
	}
}
