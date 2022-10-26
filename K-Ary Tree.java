class Solution {
    static Long karyTree(int k, int m) {
        
      return pow(k,m);
        
    }
    
    static Long pow(long k,long m){
        long mod = 1000000007L;
        Long ans = 1L;
        while(m>0){
        if(m%2!=0){
            ans = (ans%mod)*(k%mod);
        }
        m=m>>1;
        k = (k%mod)*(k%mod);
        }
        return ans%mod;
    }
}
