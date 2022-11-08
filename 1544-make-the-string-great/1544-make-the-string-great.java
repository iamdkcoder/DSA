class Solution {
    public String makeGood(String s) {
        String res ="";
        Stack<Character> stack = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(!stack.isEmpty() && (stack.peek()==s.charAt(i)+32 || stack.peek()+32 == s.charAt(i)) ){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            res+=stack.pop();
        }
        return res;
    }
}