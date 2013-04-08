package check;

import java.util.Arrays;
import java.util.HashMap;

public class SpeakInToung {

	public static void main(String[] args) 
	 { 
		
		HashMap<Character, Character> sit = new HashMap<Character,Character>();
		
		String in1 ="ejp mysljylc kd kxveddknmc re jsicpdrysi",in2="rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",in3="de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String out1 ="our language is impossible to understand",out2="there are twenty six factorial possibilities",out3="so it is okay if you want to just give up",question="rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
	
		char[] charin1 = in1.toCharArray();
		char[] charout1 = out1.toCharArray();
		char[] charin2 = in2.toCharArray();
		char[] charout2 = out2.toCharArray();
		char[] charin3 = in3.toCharArray();
		char[] charout3 = out3.toCharArray();
		char[] ques = question.toCharArray();
		for(int i=0;i<charin1.length;i++)
		{
			sit.put(charin1[i], charout1[i]);
		}
		for(int i=0;i<charin2.length;i++)
		{
		sit.put(charin2[i], charout2[i]);
		}
		for(int i=0;i<charin3.length;i++)
		{
		sit.put(charin3[i], charout3[i]);
		}
		for(int i=0;i<ques.length;i++)
		{
			ques[i] = sit.get(ques[i]);
		}
		for(int i=0;i<ques.length;i++)
		{
		System.out.println(ques[i]);
		}
	 }
	
	
	
}
