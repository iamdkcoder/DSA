class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       if(mat.length*mat[0].length!=r*c){
            return  mat;
        }
        int[][] ans = new int[r][c];
        int sr=0;
        int sc=0;
        for(int row =0 ; row<mat.length;row++){

            for(int col=0;col<mat[0].length;col++){
                if(sc==c){
                    sr++;
                    sc=0;
                }
                ans[sr][sc]=mat[row][col];

                sc++;
            }

        }
        return ans;
    }
}