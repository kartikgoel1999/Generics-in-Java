import java.util.*;
class GenericDemo3<T extends Number>
{
	T x;
	GenericDemo3(T y)
	{
		x=y;
		System.out.println(y);
	}
	public static void main(String[] args) 
	{
		GenericDemo3<Integer> i1=new GenericDemo3<Integer>(10);
		System.out.println(i1.x);
		GenericDemo3<Float> i2=new GenericDemo3<Float>(45.56f);
		System.out.println(i2.x);
	}
}
