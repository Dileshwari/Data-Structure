package StackQueue;

import java.util.Stack;

public class MinAdditionToMakeValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s="())";
           int minadd=ValidParanthesis(s);
           System.out.println(minadd);
           
           
           int minins=minInsertions(s);
           System.out.println(minins);
           
           
	}

	private static int ValidParanthesis(String s) {
		 Stack<Character> c=new Stack<>();
		 for(char ch:s.toCharArray()) {
			 
			 if(ch==')') {
				 
				 if(!c.isEmpty() && c.peek() =='(') {
					 
					 c.pop();
				 }else {
					 
					 c.push(ch);
				 }
			 }else {
			 c.push(ch);
			 }
		 }
				 
		return c.size();
	}
	
	public static int minInsertions(String s) {
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(c);
            }
            else{
                if(i+1<s.length()&& s.charAt(i+1)==')'){
                    i++;
                }
                else {
                    count++;
                }
                
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    count++;
                }
            }
        }
        count += 2*stack.size();
        return count;
    }

}
