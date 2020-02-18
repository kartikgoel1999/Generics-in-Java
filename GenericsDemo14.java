import java.util.*;
class GenericsDemo14 
{
	public static void main(String[] args) 
	{
		/*ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add("Java");
		System.out.println(al);*/

		ArrayList al1=new ArrayList<String>();
		al1.add("10");
		al1.add("Java");
		al1.add(100);
		System.out.println(al1);
	}
}
