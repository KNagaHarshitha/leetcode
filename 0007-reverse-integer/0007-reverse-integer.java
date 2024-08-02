// class Solution {
//     public int reverse(int x) {
//         int y =0;
//         while(x!=0){
//             int lastDigit=x%10;
//             int newResult=y*10+lastDigit;
//             if((newResult-lastDigit)/10!=y){
//                 return 0;
//             }
//             y=newResult;
//             x/=10;
//         }
//         return y;
        
//     }
// }

class Solution{
    public int reverse(int x){
        long ans=0;
        while(x!=0){
            ans=ans*10+x%10;
            x/=10;
        }
        return (ans<Integer.MIN_VALUE||ans>Integer.MAX_VALUE?0:(int)ans);
    }
}