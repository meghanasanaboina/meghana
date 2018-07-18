import java.io.*;
 
public class FileMerge
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter pw = new PrintWriter("text3.txt");
        BufferedReader br = new BufferedReader(new FileReader("text1.txt"));
         
        String line = br.readLine();
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
         
        br = new BufferedReader(new FileReader("text2.txt"));
         
        line = br.readLine();
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
         
        pw.flush();
        br.close();
        pw.close();
         
        System.out.println("Merged text1.txt and text2.txt into text3.txt");
    }
}
