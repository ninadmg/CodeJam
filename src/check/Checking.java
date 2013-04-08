package check;

import java.util.ArrayList;

public class Checking {

	public static void main(String[] args) 
	 { 
		
int start=1111,end=2222,count=0;

	for(int i = start; i< end;i++ )
	{

		int length = (i ==0) ? 1 : (int)Math.log10(i) + 1;

		for(int j=1 ; j<length; j++)
		{
			int k = i;
			int recycle = (int) (k%(Math.pow(10,j)));
			k = (int) (k/(Math.pow(10,j)));
			k= (int) (k+(recycle *(Math.pow(10,length-j))));
			if (k==i)
			{
				break;
			}
			
			if(k>i && k<=end)
			{
					count++;
			}
		}
	}
System.out.println(count);
}
}
