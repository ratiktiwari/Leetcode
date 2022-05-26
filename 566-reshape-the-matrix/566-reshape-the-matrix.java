class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        
        if(r*c!=m*n){
            return mat;
        }

        int[] arr = new int[m*n];
        int k = 0;
        
        int[][] resizedMat = new int[r][c];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[k++] = mat[i][j];
            }
        }
        
        k=0;

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                resizedMat[i][j] = arr[k++];
            }
        }
        
        return resizedMat;
    }
}