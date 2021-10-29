import syntaxtree.*;
import visitor.*;

public class P2 {
   public static void main(String [] args) {
      try {
         Node root = new MiniJavaParser(System.in).Goal();
         Maps map = new Maps();
         root.accept(new GJDepthFirst_maps(map),null); // Your assignment part is invoked here.
         root.accept(new GJDepthFirst(map),null);
         System.out.println("Program type checked successfully");
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 
