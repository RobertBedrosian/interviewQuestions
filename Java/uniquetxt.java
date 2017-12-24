/**This program checks a string for all unique characters and returns true if all unique, false if not**/


//256 ASCII characters

public class uniquetxt
{
	public static void main(String [] args)
	{
		String a= "haha";
		String b="this unq";
		System.out.println("String a is " + uniquechk(a));
		System.out.println("String b is " + uniquechk(b));

	}
	public static boolean uniquechk(String a)
	{
		boolean[] char_set= new boolean[256];


		for (int i=0; i < a.length() ; i++)
		{
		int val = a.charAt(i);
		if (char_set[val]) return false;
		char_set[val]=true;

		}
		return true;
	}	
}
