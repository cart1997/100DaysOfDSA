class HouseColoring {
    public static void main(String[] args) {
       int[][] costs = {{17,2,17},{16,16,5}, {14,3,19}};

       int len = costs.length-1;

       int colorR = costs[len-1][0];
       int colorB = costs[len-1][1];
       int colorG = costs[len-1][2];

       for (int i=len-1; i>=0;i--){

           int tempR = colorR;
           int tempB = colorB;

           colorR = costs[i][0]+Math.min(colorG,colorB);
           colorB = costs[i][1]+Math.min(colorG,tempR);
           colorG = costs[i][2]+Math.min(tempB,tempR);

       }
        System.out.println(Math.min(colorB,Math.min(colorB,colorG)));
    }
   }