import java.util.*;
class GenericsDemo16
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1001,"raja");
		h.put(1002,"raja1");
		h.put(1003,"raja2");
		h.put(1004.7,"raja3");
		System.out.println(h);
	}
}
