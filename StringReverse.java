package string;
public class StringReverse 
{
	public static void main(String[] args) 
	{
		String name = "Sowmya";
		for(int i=name.length()-1; i>=0; i--)
		{
			System.out.println(name.charAt(i));
		}
	}
}
