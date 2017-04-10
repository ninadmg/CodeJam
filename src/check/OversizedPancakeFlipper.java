import java.io.*;

/**
 * Created by ninad on 08/04/17.
 */
public class OversizedPancakeFlipper {

    private void processInput(BufferedReader in, PrintWriter out) throws IOException {

        int tokenSize;
        String firstLine = in.readLine();
        tokenSize = Integer.parseInt(firstLine);
        for(int i=1;i<=tokenSize;i++)
        {

            String sentence = in.readLine();
            String[] split  = sentence.split(" ");
            int flipperSize = Integer.parseInt(split[1]);

            char patty[] = new char[split[0].length()];

            for (int j=0; j<split[0].length();j++)
            {
                patty[j] = split[0].charAt(j);
            }
            int flip = 0;
            for(int j=0; j<=patty.length-(flipperSize);j++)
            {
                if(patty[j] == '-')
                {
                    for(int k = 0; k<flipperSize;k++)
                    {
                        if(patty[j+k]=='-')
                        {
                            patty[j+k]='+';
                        }
                        else
                        {
                            patty[j+k]='-';
                        }
                    }
                    flip++;
                }
            }

            //verify
            boolean possible = true;
            for(int j=0; j<patty.length;j++)
            {
                if(patty[j] == '-')
                {
                    possible = false;
                }
            }

            if(possible) {
                out.print("Case #" + i + ": "+flip);
                System.out.println("Case #" + i + ": "+flip);
            }
            else
            {
                out.print("Case #" + i + ": IMPOSSIBLE");
                System.out.println("Case #" + i + ": IMPOSSIBLE");
            }

        }
        out.close();

    }

    public static void main(String[] args) {


        OversizedPancakeFlipper t = new OversizedPancakeFlipper();

        try {

            BufferedReader in;
            PrintWriter out;

            in = new BufferedReader(new FileReader("A-large.in"));
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
