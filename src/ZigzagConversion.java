public class ZigzagConversion {
//    public static void convert(String s, int numRows) {
//
//        int numColumns = s.length();
//
//        char[][] array = new char[numRows][numColumns];
//
//
//
//        int p=0;
//        int q=0;
//        int flag = 0;
//        int count = 0;
//
//        for(int i=0; i<s.length(); i++){
//
//            if(flag==0) {
//                array[p][q] = s.charAt(i);
//                p++;
//                count++;
//                if(count==numRows){
//                    flag=1;
//                    count=0;
//                    p=p-1;
//                    continue;
//                }
//            }
//            if(flag==1){
//                p=p-1;
//                q=q+1;
//                array[p][q] = s.charAt(i);
//                count++;
//                if(count==numRows-2){
//                    flag=0;
//                    count=0;
//                    p=0;
//                    q=q+1;
//                }
//            }
//
//        }
//
//
//        for(int j=0; j<numColumns; j++){
//            for(int i=0; j<numRows; i++){
////                if(array[i][j]){
//
//                }
//            }
//            System.out.println();
//        }
//
//    }


    public static void main(String[] args) {
        String s = "PAYPALISHIRING";

        int numRows = 4;

//        convert(s, numRows);
    }
}
