package check;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimumScalarProduct {

	private void processInput(BufferedReader in, PrintWriter out) throws IOException {

		int tokenSize;
		String firstLine = in.readLine();
		tokenSize = Integer.parseInt(firstLine);
		for(int i=1;i<=tokenSize;i++)
		{
			int result=0;
			int numbers = Integer.parseInt(in.readLine());
			String str = in.readLine();
			String[] strArray = str.split(" ");
			ArrayList<Integer> Xarrp = new ArrayList<>();
			
			for(int j = 0; j < strArray.length; j++) {
				Xarrp.add(Integer.parseInt(strArray[j]));
			}
			str = in.readLine();
			strArray = str.split(" ");
			ArrayList<Integer> Yarrp = new ArrayList<>() ;
			for(int j = 0; j < strArray.length; j++) {
				
			
				Yarrp.add(Integer.parseInt(strArray[j]));
				
			}
			
		Collections.sort(Xarrp);
		Collections.sort(Yarrp);
		int MSP=0;
		int size = Xarrp.size();
		for (int j=0;j<size;j++)
		{
			MSP = MSP + (Xarrp.get(j)*Yarrp.get(size-(j+1)));
			
		}
		
		System.out.println("Case #"+i+": "+MSP);
		out.print("Case #"+i+": "+MSP+"\n");
		}

	}
	
	
	public static void main(String[] args) {

		MinimumScalarProduct t = new MinimumScalarProduct();

		try {

			BufferedReader in;
			PrintWriter out;

			in = new BufferedReader(new FileReader("qs.in"));
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
