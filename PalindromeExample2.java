package in.ganesh.test;

public class PalindromeExample2 {
    public static void main(String[] args) {
        String str="12321";
            if(isPalindrome(str)){
                System.out.println("Palindrome ");
            }else{
                System.out.println("not palindrome");
        }
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
