package check;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class T9Spelling {

	
	//incorrect
	private void processInput(BufferedReader in, PrintWriter out) throws IOException {

		int tokenSize;
		String firstLine = in.readLine();
		tokenSize = Integer.parseInt(firstLine);
		for(int i=1;i<=tokenSize;i++)
		{
			String sentence =  in.readLine();
			int prevbtn=1;
			char charactarr[] = sentence.toCharArray();
			String result="";
			for(int j =0;j<charactarr.length;j++)
			{
				char letter=charactarr[j];
				int val,btn;
				switch (letter) {
				case 'a':val=2;btn=2;
					break;
				case 'b':val=22;btn=2;
				break;
				case 'c':val=222;btn=2;
				break;
				case 'd':val=3;btn=3;
				break;
				case 'e':val=33;btn=3;
				break;
				case 'f':val=333;btn=3;
				break;
				case 'g':val=4;btn=4;
				break;
				case 'h':val=44;btn=4;
				break;
				case 'i':val=444;btn=4;
				break;
				case 'j':val=5;btn=5;
				break;
				case 'k':val=55;btn=5;
				break;
				case 'l':val=555;btn=5;
				break;
				case 'm':val=6;btn=6;
				break;
				case 'n':val=66;btn=6;
				break;
				case 'o':val=666;btn=6;
				break;
				case 'p':val=7;btn=7;
				break;
				case 'q':val=77;btn=7;
				break;
				case 'r':val=777;btn=7;
				break;
				case 's':val=7777;btn=7;
				break;
				case 't':val=8;btn=8;
				break;
				case 'u':val=88;btn=8;
				break;
				case 'v':val=888;btn=8;
				break;
				case 'w':val=9;btn=9;
				break;
				case 'x':val=99;btn=9;
				break;
				case 'y':val=999;btn=9;
				break;
				case 'z':val=9999;btn=9;
				break;
				default:val=0;btn=0;
					break;
				}
				
				if(btn==prevbtn)
				{
					result=result+" "+val;
					prevbtn= btn;
				}
				else
				{
					result=result+val;
					prevbtn= btn;
				}
			}
			System.out.println("Case #"+i+": "+result);
			out.print("Case #"+i+": "+result+"\n");
		}
	}
	public static void main(String[] args) {

		T9Spelling t = new T9Spelling();

		try {

			BufferedReader in;
			PrintWriter out;

			in = new BufferedReader(new FileReader("q1.in"));
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
