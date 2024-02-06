package in.ganesh.test;

import java.util.Stack;

public class BalancedBracketEx {
    public static void main(String[] args) {
            String str = "{[()]}";
            if(BalancedBracket(str)){
                System.out.println("balanced bracket...");
            }else {
                System.out.println("not balanced bracket..");
            }
    }

    private static boolean BalancedBracket(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch=='{' || ch=='[' ||ch=='('){
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty()){
                return false;
            }
            char c;
            switch (ch){
                case '}':
                    c=stack.pop();
                    if(c=='(' || c=='[')
                        return false;
                    break;
                case ']':
                    c=stack.pop();
                    if(c=='{' || c=='(')
                        return false;
                    break;
                case ')':
                    c=stack.pop();
                    if (c=='{' || c=='[')
                        return false;
                    break;
            }
        }

        return (stack.isEmpty());
    }
}
