public class RemoveDuplicates {
    public static void main(String[] args) {


        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        int p1 = m-1;
        int p2 = n-1;
        int ap = m+n-1;

        while(p1>=0 && p2>=0){

            if(nums2[p2]<=nums1[p1]){
                nums1[ap] = nums1[p1];
                p1--;
            }
            else{
                nums1[ap] = nums2[p2];
                p2--;
            }
            ap--;
        }

        while(p2>=0){
            nums1[ap] = nums2[p2];
            p2--;
            ap--;
        }

    }

    }
