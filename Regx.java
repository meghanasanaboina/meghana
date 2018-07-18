import java.util.regex.Pattern;
import java.util.regex.Matcher;
 public class Regx {
     public static void main(String[] args) {
        Pattern p=Pattern.compile("a?");
        Matcher m=p.matcher("aaaa");
        int count=0;
        while(m.find())
         {
		count++;
		System.out.println(m.start()+"...."+m.end()+"...."+m.group());
	 }
       System.out.println(count++);
      }
   }
