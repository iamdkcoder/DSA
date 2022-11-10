class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<>(); 
        for(int i=s.length()-1 ; i>=0;i--){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
                
            }else{
                stack.push(s.charAt(i));
            }
        }
        String str = "";
        while(!stack.isEmpty()){
            str+=stack.pop();
        }
        return str;
    }
}