
public class Trainning {
	
	
	public static void main (String[] args)
	{
		//printName();
		//displayHello();
		//System.out.println(displayWorld());
	//for (int i = 1; i <=10; i++)
		//{
		//System.out.println(integ(10,5,true));
		
		//}
		//arrays();
		iterationArrays();
	}
	
	
	
	
	
	public static void printName () {
		System.out.println("Hello World!");			
	}
	
	public static void displayHello() {
		String word = "Hello World!";
		System.out.println(word);
	}
	
	public static void acceptString(String param) {
		System.out.println(param);				
	}
	
	
	public static String displayWorld()
	{		
		return "Hello World!";
	}
	
	public static int integ (int param1, int param2, boolean param3)
	{
		if (param1 == 0)
		{
			return param2;
		}
		else if (param2 == 0)
		{
			return param1;
		}
		else {
			if (param3)
			{
				return param1 + param2;
			}
			else 
			{
			return param1 * param2;
			}
		}
			
	}
	
	public static void arrays () {
		int[] arrayOfInts = {1,2,3,4,5,6,7,8,9,10};
		for (int i=0; i <arrayOfInts.length; i++)
		{			
			System.out.println(integ(arrayOfInts[i],5,true)); 
		}
	}
	
	public static void iterationArrays()
	{
		int[] iterationArrays = new int [10];
		int cntr = 1;
		for (int i=0 ; i < iterationArrays.length ; i++)
		{
			iterationArrays[i] = cntr;
			cntr++;
			System.out.println(iterationArrays[i]);
			
		}
		
		for (int i = 0; i <iterationArrays.length; i++)
			{
				iterationArrays[i] = iterationArrays[i]*10;
				System.out.println(iterationArrays[i]);
			}
	}
	
	

}
