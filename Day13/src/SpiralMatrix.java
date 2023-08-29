import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {

        int[][] matrix= {{1,2,3},{4,5,6}, {7,8,9}};
    List<Integer> op = new ArrayList<>();
        int left = 0; int right = matrix[0].length-1;
        int top = 0; int bottom = matrix.length-1;
    while(left<=right && top<=bottom){

        //top
        for(int col = left; col<=right;col++){
            op.add(matrix[top][col]);
        }
        top++;
        //right coloumn down

        if(left<=right & top<=bottom){
            for (int row = top; row<=bottom;row++){

                op.add(matrix[row][right]);
            }
            right--;

        }

        // bottom up
        if(left<=right & top<=bottom){
            for (int col = right; col>=left; col--){
                op.add(matrix[bottom][col]);
            }
            bottom--;
        }
        if(left<=right & top<=bottom){
            // bottom up
            for (int row = bottom; row>=top; row--){
                op.add(matrix[row][left]);
            }
            left++;
        }
    }
    }
}
