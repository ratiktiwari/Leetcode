import java.util.ArrayList;

public class PrintAnySubsequenceWhereSumIsK {

    public static boolean printF(int index, ArrayList<Integer> array, ArrayList<Integer> sub, int sum, int k){

        if(index==array.size()){

            if(sum==k) {
                for (int i : sub) {
                    System.out.print(i);
                }
                if (sub.size() == 0) {
                    System.out.print("{}");
                }
                System.out.print(", ");

                return true;
            }

            else return false;
        }

        //take operation
        sub.add(array.get(index));
        sum+=array.get(index);
        if(printF(index+1, array, sub, sum, k) == true) return true;

        //not take operation
        sum-= sub.get(sub.size()-1);
        sub.remove(sub.size()-1); //remove last element from arraylist
        if(printF(index+1, array, sub, sum, k) == true) return true;


        return false;

    }


    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList();
        array.add(1);
        array.add(2);
        array.add(4);
        array.add(7);
        array.add(9);
        array.add(6);

        int sum = 0;
        int k = 13;

        ArrayList<Integer> sub = new ArrayList();

        printF(0, array, sub, sum, k);
    }

}
