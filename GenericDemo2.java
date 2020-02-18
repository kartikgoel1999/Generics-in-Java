import java.util.*;
class GenericDemo2<T>
{
	T x;
	GenericDemo2(T y)
	{
		x=y;
		System.out.println(y);
	}
	public static void main(String[] args) 
	{
		GenericDemo2<Integer> i1=new GenericDemo2<Integer>(10);
		System.out.println(i1.x);
		GenericDemo2<String> i2=new GenericDemo2<String>("Java");
		System.out.println(i2.x);
	}
}
