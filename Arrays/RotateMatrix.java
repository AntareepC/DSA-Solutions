class RotateMatrix {
    public void rotate(int[][] arr) {
        int rows=arr.length;
        int cols=arr[0].length;
        for(int i=0;i<rows;i++) {
            for(int j=i+1;j<cols;j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<rows;i++) {
            int left=0;
            int right=cols-1;
            while(left<right) {
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
        }
    }
}