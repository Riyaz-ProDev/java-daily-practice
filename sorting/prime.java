package sorting;

public class prime {
  public static boolean evenNumber(int n){
      if(n%2==0){
        return true;
      }
      else{
        return false;
      }
  }
   public static void main(String[] args){
      int n=11;
     boolean result=evenNumber(n);
     System.out.println(result);
   }
}
