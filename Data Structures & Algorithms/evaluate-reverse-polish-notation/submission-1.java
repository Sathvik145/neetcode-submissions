class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int n=tokens.length;
        int i=0;
    
        while(i<n){
            String s=tokens[i];
            if(s.equals("+")){
                int b=st.pop();
                int a=st.pop();
                
                i++;
                st.push(a+b);

            }else if(s.equals("-")){
                int b=st.pop();
                int a=st.pop();
                
                i++;
                st.push(a-b);
            }else if(s.equals("*")){
                int b=st.pop();
                int a=st.pop();
                
                i++;
                st.push(a*b);
            }else if(s.equals("/")){
                int b=st.pop();
                int a=st.pop();
                
                i++;
                st.push(a/b);
            }else{
                int x=Integer.valueOf(s);
                st.push(x);
                i++;
            }
        }
        return st.pop();
    }
}
