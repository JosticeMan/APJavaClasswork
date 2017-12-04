package search;

public class MoreRecursion {
	
	public static void main(String[] args) {
		//System.out.println(reverseString("c"));
		//mystery(10);
		//mystery1(10);
		//mystery2(9);
		//System.out.println(mystery3(6));
		//System.out.println(mystery4(10));
		//System.out.println(mystery5(3543));
		//System.out.println(mystery6(10));
		//System.out.println(mystery7(30,18));
		System.out.println(mystery(10));
		System.out.println(mystery2(10));
		System.out.println(mystery3(10));
		System.out.println(mystery4(10));
	}
	
	/*
	public static String reverseString(String a) {
		if(a.length() > 0) {
			return a.substring(a.length() - 1, a.length()) + reverseString(a.substring(0, a.length() - 1));
		}
		return "";
	}
	
	//Answer: A - 10 8 6 4 2 
	public static void mystery(int x) {
		if(x <= 0) {
		}
		else {
			System.out.print(x + " ");
			mystery(x - 2);
		}
	}
	
	//Answer: B - 2 4 6 8 10
	public static void mystery1(int x) {
	  if(x <= 0)
	  {
	  }
	  else
	  {
		   mystery1(x - 2);
		   System.out.print(x + " ");
	  }
	}
	
	//Answer: E - Nothing is printed due to infinite recursion
	public static void mystery2(int x) {
	  if(x == 0)
	  {
	  }
	  else
	  {
	   mystery2(x - 2);
	   System.out.print(x + " ");
	  }
	 }
	
	//Answer: D - 64
	public static int mystery3(int x)
	{
	 if (x == 1)
	  return 2;
	 else
	  return 2 * mystery3(x - 1);
	}
	
	//Answer: D - 22
	public static int mystery4(int x)
	{
	 if (x == 0)
	 {
	  return 0;
	 }
	 else
	 {
	  return (x + mystery4(x / 2) + mystery4(x / 4));
	 }
	}
	
	//Answer: B - 15 - 3 + 4 + 5 + 3 + 0
	//precondition:  x >= 0
	public static int mystery5(int x)
	{
	 if (x == 0)
	 {
	  return 0;
	 }
	 else
	 {
	  return ((x % 10) + mystery5(x / 10));
	 }
	}
	
	//Answer: B - 2 * mystery(x-2)
	public static int mystery6(int x)
	{
	 if (x <= 1)
	 {
	  return 1;
	 }
	 else
	 {
	  return (2 * mystery6(x - 2));
	 }
	}
	
	//Answer: B - 1
	public static int mystery7(int x, int y)
	{
	 if (x >= 100 || y <= 0)
	 {
	  return 1;
	 }
	 else
	 {
	  return mystery7(x + 10, y - 3);
	 }
	}
	*/
	
	public static int mystery(int x)
	{
	 int sum = 0;
	 while( x >= 0)
	 {
	  sum += x;
	  x--;
	 }
	 return sum;
	}
	
	public static int mystery2(int x)
	 {
	  if (x == 0)
	  {
	   return 0;
	  }
	  return (x + mystery2(x - 1));
	 }
	
	public static int mystery3(int x)
	 {
	  if (x == 0)
	   return 0;
	  else
	   return mystery3(x - 1);
	 }
	
	public static int mystery4(int x)
	 {
	  if (x == 1)
	  {
	   return 1;
	  }
	  return (x + mystery4(x - 1));
	 }
}
