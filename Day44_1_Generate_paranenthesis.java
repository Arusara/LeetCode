class Solution {
    public List<String> generateParenthesis(int n) {
        
      return genreateList(new ArrayList<>(), n,"",0,0);
    }
  
     public  List<String> genreateList(List<String> result,int n ,String str, int open, int close) {

        if (str.length()==n*2) {
            result.add(str);
            return result;
        }
        if (open <n) genreateList(result, n, str+"(", open+1, close);
        if (close<open) genreateList(result, n, str+")", open, close+1);
        return result;
    }
}
