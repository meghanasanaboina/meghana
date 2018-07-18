import java.util.regex.Pattern;
import java.util.regex.Matcher;
 public class Regx {
     public static void main(String[] args) {
        Pattern p=Pattern.compile("\\s");
        String s=p.split("krishna is a bad boy");
        for(String string:s){
         System.out.println(string);
        }
      }
  }
