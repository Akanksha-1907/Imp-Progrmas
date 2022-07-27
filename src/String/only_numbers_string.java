package String;

public class only_numbers_string
{
	public static void main(String[] args)
	{
		//Method 20-->replaceAll();
		//Java program to print only numbers from the given string.
		
		String str="mhsdfds86g4ds6g cnfghbdfgd4524fgfg 35s4cfgfgdfgdf";
		String result=str.replaceAll("[^0-9]","");  //^ matlab 0-9 chod ke sab replace karo.s
		System.out.println(result);
		
		String result1=str.replaceAll("[0-9]","");   //number chod k sab print including whitespaces.
		System.out.println(result1);
		
		String result2=str.replaceAll("[^a-zA-Z]","");  //whitespaces and number chod k sb replace.
		System.out.println(result2);
		
		String result3=str.replaceAll(" ", "");
		System.out.println(result3);
	}

}
