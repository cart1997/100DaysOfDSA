import java.util.ArrayList;
import java.util.List;

public class SearchInTwoDMatrix {
    public static void main(String[] args) {

        List<List<Integer>> matrix = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int i =0;
        int j = n-1;

        while(i<m && j>=0){

            if(matrix[i][j]==target) return true;

            if(matrix[i][j]<target){
                i++;
            }
            else {
                j--;
            }

        }
    }
}
