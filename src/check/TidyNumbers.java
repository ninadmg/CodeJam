 /*
 * Created by ninad on 08/04/17.                                                                  
 */                                                                                               
public class TidyNumbers {                                                                        
                                                                                                  
    private void processInput(BufferedReader in, PrintWriter out) throws IOException {            
                                                                                                  
        int tokenSize;                                                                            
        String firstLine = in.readLine();                                                         
        tokenSize = Integer.parseInt(firstLine);                                                  
        for(int i=1;i<=tokenSize;i++)                                                             
        {                                                                                         
            String sentence = in.readLine();                                                      
                                                                                                  
            int digits[] = new int[sentence.length()];                                            
            for (int j=0; j<sentence.length();j++)                                                
            {                                                                                     
                digits[j] = Character.getNumericValue(sentence.charAt(j));                        
            }                                                                                     
                                                                                                  
            while(true)                                                                           
            {                                                                                     
               int brokenindex =  getBrokenIndex(digits);                                         
               if(brokenindex==-1)                                                                
               {                                                                                  
                   break;                                                                         
               }                                                                                  
               replaceWithNine(digits,brokenindex);                                               
                                                                                                  
            }                                                                                     
            long output=0;                                                                        
            for (int j=0; j<digits.length;j++)                                                    
            {                                                                                     
                output = output*10+digits[j];                                                     
            }                                                                                     
            out.print("Case #"+i+": "+output);                                                    
            System.out.println("Case #"+i+": "+output);                                           
                                                                                                  
        }                                                                                         
                                                                                                  
    }                                                                                             
                                                                                                  
    private int getBrokenIndex(int digits[])                                                      
    {                                                                                             
        for (int j=0; j<digits.length-1;j++) {                                                    
            if (digits[j] > digits[j + 1]) {                                                      
                return j;                                                                         
            }                                                                                     
        }                                                                                         
        return -1;                                                                                
    }                                                                                             
                                                                                                  
    private void replaceWithNine(int digits[],int pos)                                            
    {                                                                                             
        digits[pos]--;                                                                            
        for (int j=pos+1; j<digits.length;j++)                                                    
        {                                                                                         
            digits[j] = 9;                                                                        
        }                                                                                         
    }                                                                                             
                                                                                                  
                                                                                                  
                                                                                                  
                                                                                                  
    public static void main(String[] args) {                                                      
                                                                                                  
                                                                                                  
        TidyNumbers t = new TidyNumbers();                                                        
                                                                                                  
        try {                                                                                     
                                                                                                  
            BufferedReader in;                                                                    
            PrintWriter out;                                                                      
                                                                                                  
            in = new BufferedReader(new FileReader("B-large.in"));                                
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
