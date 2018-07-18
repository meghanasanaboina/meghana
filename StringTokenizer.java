import java.util.regex.Pattern;
import java.util.regex.Matcher;
 public class StringTokenizer {
     public static void main(String[] args) {
       StringTokenizer tokenizer=new StringTokenizer("Dhoni is loss the match");
         while(tokenizer.hasMoreTokens())
           {
               System.out.println(tokenizer.nexttoken());
            }
      }
  }
