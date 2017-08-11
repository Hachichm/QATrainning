
public class BlackJack {

	
	
	public static void main (String[] args)
	{
		System.out.println(blackJack(18,21));
	}
	
	public static int blackJack(int param1, int param2) {
		
	
		if (param1 > param2)
		{
			return param1;
		}
		else if ( param2 > param1 )
		{
			return param2;
		}
		else if ((param1 >21) || (param2 >21))
		{
			return 0;
		}
		return param1;
		
	}
}
