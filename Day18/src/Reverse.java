public class Reverse {
    public static void main(String[] args) {

        int[] numToTen = new int[10];

        int num = 916;


        for(int i =0; i<numToTen.length;i++){

            if (i==6){
                numToTen[6] = 9;
            }
            else if(i==9){
                numToTen[9] = 6;
            }
            else{
                numToTen[i] = i;
            }
        }
        int op =0;
        while (num>0){

            int temp1 = num/10;
            int temp2 = num%10;

            temp2 = numToTen[temp2];
            op = temp2 + op *10;
            num = temp1;
            System.out.println(op);

        }


    }
}
