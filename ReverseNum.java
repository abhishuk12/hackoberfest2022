public class ReverseNum {   public static void main(String[] args) {
    System.out.println(reverse(232));

}
    static int reverse(int n){
        if(n%10==n)
            return n;

        return n%10+reverse(n/10);
    }
}
