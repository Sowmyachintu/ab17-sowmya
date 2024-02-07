//str = "Abhishek", remove A from string

package string;
public class Replace_String 
{
	public static void main(String[] args) 
	{
		String str = "abhishek";
		System.out.println(str.replaceAll("a", ""));
		//replace smaller a with capital
		System.out.println(str.replaceAll("a", "A"));
		//remove spaces 
		String quote = "i love my country";
		System.out.println(quote.replaceAll(" ", ""));
		
		//remove all the alphabet from it
		String str1 = "country123";
		System.out.println(str1.replaceAll("[a-z]",""));
		
		String a1 = "My Name Is Sowmya";
		System.out.println(a1.replaceAll("[a-z]", ""));
		String a2 = a1.replaceAll("[a-z]", "");
		System.out.println(a2.replaceAll(" ",""));
		
		String b1 = "SoWmYa";
		System.out.println(b1.replaceAll("[a-z]",""));
		System.out.println(b1.replaceAll("[A-Z]",""));
	}

}
