class Solution {
    public boolean checkRecord(String s) {
        int a=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'){
                a++;
                if(a>=2)
                return false;
            }
            if(ch=='L'){
                l++;
                if(l>=3){
                    return false;
                }
            }
            else{
                l=0;
            }
        }
        return true;
    }
}
