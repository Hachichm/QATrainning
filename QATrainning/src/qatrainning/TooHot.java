
public class TooHot {

	public static void main (String[] args)
	{
		System.out.println(weather(70,false));
	}
	
	public static boolean weather(int temperature, boolean isSummer)
	{
		boolean temp= false;
		if (isSummer){
			
			if ((temperature >= 60) && (temperature <=100))
				{
					System.out.println("Summer");
					temp = true;
					
				}
		
		}
		else {
			
			if ((temperature >= 60) && (temperature <=90))
			{
				System.out.println("Not Summer");
				temp = true;
				
			}
			
			
		}
		
		
		return temp;
	}
}
