package String;

public class count_whitespaces_ofstring 
{
	//Java program to count whitespaces of the string
	
			public static void main(String[] args) 
			{
				String str="fd jhdgc jhgdda kjdjhsd adef ueyfvb s54fsdvdh";
				int count=0;
				char[] a=str.toCharArray();
				for(char c:a)
				{
					if(c==' ')
					{
						count++;
					}
				}
				System.out.println("Total number of whitespaces- "+count);
			}

}
