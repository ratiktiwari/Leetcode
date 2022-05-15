import java.util.ArrayList;

public class PrintAllSubsequencesWhereSumIsK {
    public static void printF(int index, ArrayList<Integer> array, ArrayList<Integer> sub, int sum, int k){

        if(index==array.size()){

            if(sum==k) {
                for (int i : sub) {
                    System.out.print(i);
                }
                if (sub.size() == 0) {
                    System.out.print("{}");
                }
                System.out.print(", ");
            }

            return;
        }

        //take operation
        sub.add(array.get(index));
        sum+=array.get(index);
        printF(index+1, array, sub, sum, k);

        //not take operation
        sum-= sub.get(sub.size()-1);
        sub.remove(sub.size()-1); //remove last element from arraylist
        printF(index+1, array, sub, sum, k);

    }

    public static int printF(int index, ArrayList<Integer> array, int sum, int k){

        if(sum>k) return 0;  //Time complexity optimization with base case
        if(index==array.size()){

            if(sum==k) {
                return 1;
            }

            else return 0;
        }

        //take operation
        sum+=array.get(index);
        int l = printF(index+1, array, sum, k);

        //not take operation
        sum-= array.get(index);
        int r = printF(index+1, array, sum, k);

        return l+r;
    }




    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList();
        array.add(1);
        array.add(2);
        array.add(1);
        array.add(3);
        array.add(1);

        int sum = 0;
        int k = 5;

        ArrayList<Integer> sub = new ArrayList();

        printF(0, array, sub, sum, k);
        System.out.println();
        System.out.println(printF(0, array, sum, k));
    }
}
