package check;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.ArrayList;


public class AlienWordMatch {
	private void processInput(BufferedReader in, PrintWriter out) throws IOException {

		int tokenSize;
		int knownWordCount;
		int testCaseCount;

		try {
			String firstLine = in.readLine();
			String[] fields = firstLine.split(" +");

			tokenSize = Integer.parseInt(fields[0]);
			knownWordCount = Integer.parseInt(fields[1]);
			testCaseCount = Integer.parseInt(fields[2]);

		} catch (NumberFormatException e) {
			System.out.println("The first line in the input must be 3 numbers separated by spaces.");
			throw e;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The first line in the input must be 3 numbers separated by spaces.");
			throw e;
		}

		List<String> knownWords = getKnownWords(in, knownWordCount);

		for (int i=0; i<testCaseCount; i++) {

			try {
				String currLine = in.readLine();

				int matches = processLine(knownWords, currLine);
				System.out.println("On line " + (i+1));
				out.printf("Case #%d: %d", i+1, matches);
				out.println();
			} catch (IOException e) {
				System.out.println("Error reading the input file. File might not have enough lines.");
				throw e;
			}
		}

		in.close();
		out.close();

	}

	private List<String> getKnownWords(BufferedReader in, int count) throws IOException {

		List<String> words = new ArrayList<String>();

		for (int i=0; i<count; i++) {
			try {
				String currWord = in.readLine();
				words.add(currWord);
			} catch (IOException e) {
				System.out.println("Error reading the input file. File might not have enough lines.");
				throw e;
			}
		}

		return words;
	}

	private int processLine(List<String> knownWords, String testCase) {

		String regex = testCase.replace("(", "[").replace(")", "]");

		int matches = 0;

		for(String knownWord: knownWords) {
			if (knownWord.matches(regex)) {
				matches++;
			}
		}

		return matches;
	}


	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Usage: AlienTranslator <inputfile> <outputfile>");
		}

		AlienWordMatch t = new AlienWordMatch();

		try {

			BufferedReader in;
			PrintWriter out;

			in = new BufferedReader(new FileReader(args[0]));
			out = new PrintWriter(new FileWriter(args[1]));
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
