import java.lang.reflect.Array;
import java.util.*;
import java.util.LinkedList;

public class Adobe1 {

    public static int students(List<Integer> heights, int x) {

        int n = heights.size();

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(heights.get(i))) {
                map.merge(heights.get(i), 1, Integer::sum);
            } else {
                map.merge(heights.get(i), 1, Integer::sum);
            }
        }

        //Map sorting according to values
        List<Map.Entry<Integer, Integer>> heightsList = new LinkedList<>(map.entrySet());

        Collections.sort(heightsList, (l1, l2) -> l2.getValue().compareTo(l1.getValue()));

        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, Integer> entry : heightsList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(sortedMap);

        int countArray = 0;
        int countX = 0;

        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            if (countX == x + 1) {
                break;
            }
            countArray += entry.getValue();
            countX++;
        }

        System.out.println(countArray);

        return 0;

    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

//        list.add(1);
//        list.add(2);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(4);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(7);
//        list.add(7);
//        list.add(7);
//        list.add(8);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        int x = 5;

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        int x = 1;
        int ret = students(list, x);

    }

}
