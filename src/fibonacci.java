import java.util.ArrayList;

public class fibonacci {

//    public int fibonacci(int n, ArrayList<Integer> dp){
//
//        if(n<=1){
//            return n;
//        }
//
//        if(dp.get(n)!=-1){
//            return dp.get(n);
//        }
//        int ans = fib(n-1) + fib(n-2);
//
//        dp.set(n, ans);
//
//        return ans;
//    }
//
//    public int fib(int n) {
//
//        ArrayList<Integer> dp = new ArrayList<>(n+1);
//
//        for(int i=0; i<n+1; i++){
//            dp.add(-1);
//        }
//
//        return fibonacci(n, dp);
//
//
//    }


    public int fib(int n) {

        if(n<=1){
            return n;
        }
        int first=0;
        int second=1;
        int third=0;

        for(int i=2; i<n+1; i++){
            third = first+second;
            first=second;
            second=third;
        }

        return third;

    }

}
