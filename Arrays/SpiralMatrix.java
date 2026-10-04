import java.util.*;
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int rows=matrix.length;
        int cols=matrix[0].length;
        int top=0;
        int bot=rows-1;
        int left=0;
        int ryt=cols-1;
        while(top<=bot&&left<=ryt) {
            for(int i=left;i<=ryt;i++) {
                res.add(matrix[top][i]);
            } top++;
            for(int i=top;i<=bot;i++) {
                res.add(matrix[i][ryt]);
            } ryt--;
            if(top<=bot) {
                for(int i=ryt;i>=left;i--) {
                   res.add(matrix[bot][i]);
            } bot--;
            }
            if(left<=ryt) {
                for(int i=bot;i>=top;i--) {
                    res.add(matrix[i][left]);
                } left++;
            }
        } return res;
    }
}