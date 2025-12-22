class Solution {
        public boolean isPrime(int num){
            if(num<2){
                return false;
            }
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
    public boolean completePrime(int num) {
        int no=num,c=0;
        while(no>0){
            no=no/10;
            c++;
        }
        int suffix=0,prefix=0;
        for(int i=1;i<=c;i++){
            suffix=num%(int)Math.pow(10,i);
            prefix=num/(int)Math.pow(10,c-i);
            if(!isPrime(suffix) || !isPrime(prefix)){
                return false;
            }
        }
        return true;
    }
}