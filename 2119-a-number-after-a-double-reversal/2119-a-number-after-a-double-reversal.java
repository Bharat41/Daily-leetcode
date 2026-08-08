class Solution {
    public boolean isSameAfterReversals(int num) {
        int original = num;
        int rev = 0;
        while(num>0){
            int r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        int rev1=0;
        while(rev>0){
            int a=rev%10;
            rev1=rev1*10+a;
            rev=rev/10;
        }
        if(rev1==original){
            return true;
        }
        else{
            return false;
        }
    }
}