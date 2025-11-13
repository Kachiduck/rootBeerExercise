public class Main {

   public static String singRootBeerSong(int numOfBottles) {
      String Verse = "";
      Verse += numOfBottles +" bottles of root beer on the wall\n";
      Verse += numOfBottles +" bottles of root beer\n";
      Verse += "Take one down, pass it around\n";
      Verse += (numOfBottles-1) +" bottles of root beer on the wall\n";   
      return Verse;
   
   }   
   
   public static void main(String [] args) {
      int x = 10;
      System.out.println(singRootBeerSong(x));
      while (x > 0) {
         System.out.println(singRootBeerSong(x));
         x= x-1;
      }
         
         
      
      
   
      
   
   
   }
}   