import java.util.*;
class GenericDemo1 
{
	public static void main(String[] args) 
	{
		//List<Integer> al1=new ArrayList<Integer>();//valid
		//List<Number> al2=new ArrayList<Integer>();//Invalid-No Subclassing for Type Parameter
		//ArrayList<Object> al3=new ArrayList<String>();//Invalid
		Collection<Integer> al=new Vector<Integer>();
		al.add(10);
		al.add(20);
		al.add(new Integer(30));
		System.out.println(al);
		//int i=al.get(0);
	}
}
/*
	NOTE-There Can be Sub-classing of Types but not the Parameter.
*/