import java.util.*;
class GenericDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();//This ArrayList will Accept only
												//Integer Type
		al.add(10);
		al.add(20);
		al.add(new Integer(30));
		System.out.println(al);
		int i=al.get(0);
	}
}
/*
	Problems with Non-Generic Collection
	------------------------------------
	1)Type Safety Is Not Available
	2)Type Casting is needed while retrieving the objects.
	3)Always the Exceptions are getting raised at Runtime,No Compiletime Checking.

	Benefits of Generics
	--------------------
	1)Type Safety is always there while using generics.
	2)No Type Conversion is needed since it maintains the homogeneous type.
	3)If any problem is there,compiler always displays oncompile time only.


	->Generics Concept was introduced in java 1.5V.

*/
