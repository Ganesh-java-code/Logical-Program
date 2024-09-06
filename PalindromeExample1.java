package in.ganesh.test;

public class PalindromeExample1 {
    public static void main(String[] args) {
      String name = "madam",rev="";
        String[] split = name.split(" ");
        String temp = name;
      for (int i=0;i<split.length;i++){
          String s = split[i];
          String revWrd="";
          for (int j=s.length()-1;j>=0;j--){
              revWrd=revWrd+s.charAt(j);
          }
          rev=rev+revWrd;

      }
        System.out.println(rev);
      if(name.equals(rev)){
          System.out.println("given string is palindrome..");
      }else{
          System.out.println("given string is not palindrome..");
      }
    }
}
