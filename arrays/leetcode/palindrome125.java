package arrays.leetcode;

public class palindrome125 {
  
  public static boolean findPalindrome(String s){
    s=s.toLowerCase();
    int left=0;
    int right=s.length()-1;
    while(left<right){
         if(!Character.isLetterOrDigit(s.charAt(left))){
            left++;
         }
         else if(!Character.isLetterOrDigit(s.charAt(right))){
           right--;
         }
         else if(s.charAt(right)!=s.charAt(left)){
           return false;
         }
         else{
        left++;
        right--;
         }
    }
    return true;
  }
  public static void main(String[] args){
    String s="A man, a plan, a canal: Panama";

    // String s="riyaz";
    System.out.println(findPalindrome(s));
  }
}
