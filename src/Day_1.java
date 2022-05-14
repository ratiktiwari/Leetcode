import java.util.List;

public class Day_1 {

    public void reverseString(char[] s) {

//        int n = s.length;
//        char temp;
//        for(int i=0; i<n/2; i++){
//            temp=s[i];
//            s[i]=s[n-(i+1)];
//            s[n-(i+1)] = temp;
//        }

        int start = 0, end = s.length-1;
        char temp = s[start];

        while(start<end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }

    public int getMinimumAndMaximum(int[] nums) {
        int indexMin = 0;
        int indexMax = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i]>nums[indexMax]){
                indexMax = i;
            }
            if(nums[i]<nums[indexMin]){
                indexMin=i;
            }
        }

        if(indexMax==indexMin){
            return Math.min(indexMin+1, n-indexMin);
        }
        if(indexMin<indexMax){
            return Math.min(Math.min(indexMax+1, n-indexMin), indexMin+1 + n-indexMax);
        }
        if(indexMin>indexMax){
            return Math.min(Math.min(indexMin+1, n-indexMax), indexMax+1 + n-indexMin);
        }

        return 0;

    }



//    0,1 ,2,3,4,5,6,7
//    2,10,7,5,4,1,8,6

//  f - 1
//  l - 5

}
