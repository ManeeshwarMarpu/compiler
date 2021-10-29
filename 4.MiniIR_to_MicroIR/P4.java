import syntaxtree.*;
import visitor.*;

public class P4 {
   public static void main(String [] args) {
      try {
         Node root = new MiniIRParser(System.in).Goal();
         Integer tempMax = Integer.parseInt(root.accept(new GJNoArguDepthFirst()).toString());
         root.accept(new GJDepthFirst(tempMax),null); // Your assignment part is invoked here.
         //System.out.println("Program parsed successfully");
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 



