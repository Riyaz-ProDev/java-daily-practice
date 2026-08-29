public class palindrome {
 
  public static boolean findPalindrome(String s){
    s=s.toLowerCase();
    int left=0;
    int right=s.length()-1;
    while(left<right){
        if(s.charAt(right)==s.charAt(left)){
           left++;
           right--;
        }
        else{
          return false;
        }
    }
       return true;
  }
  
  public static void main(String[] args) {
    //  String s="A man, a plan, a canal: Panama";

    String s="madam";
   System.out.println(findPalindrome(s));

  }
}
