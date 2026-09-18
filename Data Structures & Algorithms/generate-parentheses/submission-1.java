class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        StringBuilder temp=new StringBuilder();
        solve(n,0,0,ans,temp);
        return ans;
    }
    public void solve(int n,int open,int close,List<String> ans,StringBuilder temp){
        if(temp.length()== 2*n){
            ans.add(temp.toString());
            return;
        }
        if(open<n){
            temp.append('(');
            solve(n,open+1,close,ans,temp);
            temp.deleteCharAt(temp.length()-1);
        }
        if(close<open){
            temp.append(')');
            solve(n,open,close+1,ans,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}
