import java.util.Arrays;

public class Day_2 {

    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        Arrays.sort(arr);

        return arr[k];
    }
}
