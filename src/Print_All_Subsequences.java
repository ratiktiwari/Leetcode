import java.sql.Array;
import java.util.ArrayList;

public class Print_All_Subsequences {

    public static void printF(int index, ArrayList<Integer> array, ArrayList<Integer> sub){

        if(index==array.size()){
            for(int i : sub){
                System.out.print(i);
            }
            if(sub.size()==0){
                System.out.print("{}");
            }
            System.out.print(", ");

            return;
        }

        //take operation
        sub.add(array.get(index));
        printF(index+1, array, sub);

        //not take operation
        sub.remove(sub.size()-1); //remove last element from arraylist
        printF(index+1, array, sub);

    }


    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList();
        array.add(1);
        array.add(2);
        array.add(3);

        ArrayList<Integer> sub = new ArrayList();

        printF(0, array, sub);
    }
}
