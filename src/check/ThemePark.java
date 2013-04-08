package check;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ThemePark {
	private void processInput(BufferedReader in, PrintWriter out) throws IOException {

		int tokenSize;
		String firstLine = in.readLine();
		tokenSize = Integer.parseInt(firstLine);
		for(int i=1;i<=tokenSize;i++)
		{
			int R,K,N,r=1,k=1;
			boolean pattengot = false;
			String RKN[] =  in.readLine().split(" ");
			R= Integer.parseInt(RKN[0]);
			K=Integer.parseInt(RKN[1]);
			N=Integer.parseInt(RKN[2]);
			
			String grps[]=in.readLine().split(" ");
			ArrayList<Long> groups = new ArrayList<>();
			for(int j=0;j<grps.length;j++)
			{
				groups.add(Long.parseLong(grps[j]));
			}
			while (R>=r && K>=k)
			{long Totfill=0;
			
				for (int j=0;j<groups.size();j++)
				{
					if((Totfill+groups.get(j))<K)
					{
						Totfill=Totfill+groups.get(j);
						if(j==(groups.size()-1))
						{
							pattengot=true;
						}
					}
					else
					{
					
					r++;
					Totfill=0;
					Totfill=Totfill+groups.get(j);
					}
				}
				if(pattengot==true)
				{
					break;
				}
				else
				{
				k++;
				}
			}
			
			if(pattengot==true)
			{
				
			}
			else
			{
				
			}
			
		}
	}
	public static void main(String[] args) {

		ThemePark t = new ThemePark();

		try {

			BufferedReader in;
			PrintWriter out;

			in = new BufferedReader(new FileReader("q.in"));
			out = new PrintWriter(new FileWriter("storeout.in"));
			t.processInput(in, out);
		} catch (IOException e) {
			System.out.println("Error processing input.");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Error in input file.");
			e.printStackTrace();
		}
	}
	
	
}
