class Solution {
    public int reverse(int x) {
        int y =0;
        while(x!=0){
            int lastDigit=x%10;
            int newResult=y*10+lastDigit;
            if((newResult-lastDigit)/10!=y){
                return 0;
            }
            y=newResult;
            x/=10;
        }
        return y;
        
    }
}