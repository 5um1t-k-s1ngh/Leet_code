class Solution {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while(n!=0){
            int num=n%10;
            product=num*product;
            sum=sum+num;
            n=n/10;
        }
            int result=product-sum; 
        return result;
        
    }
    // return -1;
}