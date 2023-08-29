public class DiagonalTraverse {
    public static void main(String[] args) {

        int[][] mat = {{1,2,3},{4,5,6}, {7,8,9}};
        int[] op;

        int m = mat.length; int n = mat[0].length;
        int[] res = new int[m*n];

        int r =0; int c=0;
        int i =0; int dir = 1;

        while(i<m*n){

            res[i] = mat[r][c];

            if(dir==1){
                if(r==0 && c!=n-1){
                    dir = -1;
                    c++;
                } else if (c==n-1){
                    dir = -1;
                    r++;
                }
                else {
                    r--;
                    c++;
                }
            }
            else{
                if(c==0 && r!=m-1){
                    dir = 1;
                    r++;
                } else if (r==m-1){
                    dir = 1;
                    c++;
                }
                else {
                    c--;
                    r++;
                }

            }

            i++;

        }

    }
}
