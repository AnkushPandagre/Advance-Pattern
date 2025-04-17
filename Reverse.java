public class Reverse {

    public static int rev_rec(int num, int res ){
     if(num==0){
        return res;
    }
    return rev_rec(num/10 , (res*10)+ (num%10));
}

    public static void main(String[] args) {
        int num = 251;

        int res = 0;
        System.err.println(rev_rec(num, res));zazqs
        // System.out.println(rev_rec(num, res));
    }
}