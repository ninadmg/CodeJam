package check;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class StoreCredit {
// Question - https://code.google.com/codejam/contest/351101/dashboard#s=p0
	
	//Correct
	private void processInput(BufferedReader in, PrintWriter out) throws IOException {

		int tokenSize;
		String firstLine = in.readLine();
		tokenSize = Integer.parseInt(firstLine);
		
		for(int i=0;i<tokenSize;)
		{
			int Credt = Integer.parseInt(in.readLine());
			int number = Integer.parseInt(in.readLine());
			String priceStr = in.readLine();
			
			String[] arr_price=priceStr.split(" ");
			int size = arr_price.length;
			if(size!=number)
			{
				
			}
			else
			{
			for(int j=0;j<size-1;j++)
			{Boolean flag =false;
				for(int k=j+1;k<size;k++)
				{
				int temp = (Integer.parseInt(arr_price[j])+Integer.parseInt(arr_price[k]));
					if(temp==Credt)
					{
						out.printf("Case #%d: %d %d  \n", i+1,j+1,k+1 );
						System.out.println("Case #"+(i+1)+": "+(j+1)+ "  "+(k+1));
						i++;
						flag=true;
						break;
					}
				}
				
//				if(flag==true)
//				{
//					break;
//				}
				
			}
			}
		}

	}
	
	public static void main(String[] args) {

//		if (args.length != 2) {
//			System.out.println("Usage: AlienTranslator <inputfile> <outputfile>");
//		}

		StoreCredit t = new StoreCredit();

		try {

			BufferedReader in;
			PrintWriter out;

			in = new BufferedReader(new FileReader("storein.in"));
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
