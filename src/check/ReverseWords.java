package check;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

public class ReverseWords {

	private void processInput(BufferedReader in, PrintWriter out) throws IOException {

		int tokenSize;
		String firstLine = in.readLine();
		tokenSize = Integer.parseInt(firstLine);
		for(int i=1;i<=tokenSize;i++)
		{
			String sentence =  in.readLine();
			
			String wordarr[] = sentence.split(" ");
			
			String sentenceresult = null;
			for (int j=wordarr.length-1;j>=0;j--)
			{
				if(sentenceresult==null)
				{
					sentenceresult=wordarr[j];
				}
				else
				{
				sentenceresult = sentenceresult+" "+wordarr[j];
				}
			}
			out.print("Case #"+i+": "+sentenceresult);
			System.out.println("Case #"+i+": "+sentenceresult);
		}
	}
	
	public static void main(String[] args) {


		ReverseWords t = new ReverseWords();

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
