//Author Name: Al-Fareed
//Date of creation: 13/04/2022
//Registration no: 210970049
//Program to rearrange the characters in alphabetic order


import java.util.Scanner;
class strings
{
			String str;

			char ch,temp;
			int i,j=0;

		strings(String newstr)
		{
			str=newstr;
		}
		public void withCase()
		{
			char arr1[]=str.toCharArray();
						int len1=arr1.length;

			for(i=0;i<len1-1;i++)
			{
				for(j=0;j<len1-i-1;j++)
				{
					if(arr1[j]>arr1[j+1])
					{
						temp=arr1[j];
						arr1[j]=arr1[j+1];
						arr1[j+1]=temp;

					}

				}
			}
				System.out.println("\nOutput string(with case): ");
				for(i=0;i<len1;i++)
				{
					  System.out.print(arr1[i]);
				}
				System.out.println();


		}


			public void withoutCase()
			{
			char arr2[]=str.toCharArray();
			int len2=arr2.length;
			for(i=0;i<len2-1;i++)
			{
			for(j=0;j<len2-i-1;j++)
			{
				if(asc(arr2[j])>asc(arr2[j+1]))
				{
					temp=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp;

				}

			}
			}
			System.out.println("\nOutput string(without case): ");
			for(i=0;i<len2;i++)
			{
				  System.out.print(arr2[i]);
			}
				System.out.println();
			}


		int asc(char ch)
			{
				int alpha=(int)ch;
				if(alpha>=97)
				{
					return (char)(alpha-32);
				}
				return alpha;
			}
}


class UpperLower
{
	public static void main(String args[])
	{
		String string1=new String();
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the String: ");
		string1=sc.next();
		strings s=new strings(string1);
		s.withCase();
		s.withoutCase();

	}


}

