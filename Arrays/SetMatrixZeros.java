class SetMatrixZeros {
    public void setZeroes(int[][] arr) {
        int rows=arr.length;
        int cols=arr[0].length;
        boolean rowz[]=new boolean[rows];
        boolean colz[]=new boolean[cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(arr[i][j]==0) {
                    rowz[i]=true;
                    colz[j]=true;
                }
            }
        }
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(rowz[i]||colz[j]) {
                    arr[i][j]=0;
                }
            }
        }
    }
}