//m1= Software m2= Testing o/p-->SoftwareTesting(vertically)

package string;
public class Practice2 
{
	public static void main(String[] args) 
	{
		String str1 = "Software";
		String str2 = "Testing";
		String str3 = str1.concat(str2);
		for(int i=0; i<=str3.length()-1; i++)
		{
			System.out.println(str3.charAt(i));
		}
	}
}
