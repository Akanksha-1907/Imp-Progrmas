package String;

public class count_upper_lowercase
{
	public static void main(String[] args) 
	{
		String s="AkaNKshA heDaOO";
		System.out.println(s);
		int count=0;
		int count1=0;
		String w=s.replaceAll(" ", "");
		System.out.println(w);
		for(int i=0;i<=w.length()-1;i++)
     {
	    if((w.charAt(i)=='A')||(w.charAt(i)=='N')||(w.charAt(i)=='K')||(w.charAt(i)=='D')||(w.charAt(i)=='O'))
			{
		count++;
			}
	    else
	    	{
	    	count1++;
	    	}
	
     }
		System.out.println("Uppercase letters- "+count);
		System.out.println("Lowercase letters- "+count1);
		
	}

}
