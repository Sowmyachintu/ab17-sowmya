package string;
import java.util.Date;
public class CurrentDate 
{
	public static void main(String[] args) 
	{
		Date d1 = new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		String myDate = d2.toString();
		System.out.println(myDate);
	}
}

