import java.util.Scanner;

public class UniqueSubstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		System.out.println("enter length of substring");
		int ls=sc.nextInt();
		int l=s.length();
		char[] arr=s.toLowerCase().toCharArray();
		String[] rslt=new String[l];
		for(int i=0; i<l; i++)
		{
			rslt[i]="";
		}
		
		int k=0,m=0;
		for(int i=0; i<l; i++)
		{
			for(int j=0; j<ls; j++)
			{
				System.out.println(m);
				rslt[k]=rslt[k]+arr[m++];
				
			}
			k++;
			m--;
		}
		for(int i=0; i<l; i++)
		{
			for(int j=i+1; j<l; j++)
			{
				if(rslt[i].equals(rslt[j]))
				{
					rslt[j]="";
				}
			}
		}
		for(int i=0; i<l; i++)
		{
			if(!(rslt[i].equals("")))
			{
				System.out.println(rslt[i]+" ");
			}
		}
	}

}
