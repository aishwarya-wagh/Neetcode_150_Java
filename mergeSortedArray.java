import java.util.Arrays;

public class mergeSortedArray {
    // https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

    public static void main(String args[]){
    int[] nums1=new int[]{1,2,3,0,0,0};
    int m=3;
    int n=3;
    int[] nums2 = new int[]{2,5,6};
    mergeSortedArray.merge1(nums1,m,nums2,n);
    for(int nu: nums1)
        System.out.println(nu);
    }

    // complexity o[(m+n) log(m+n) ]
    public static void  merge1(int[] nums1, int m, int[] nums2, int n) {

        for(int i=m; i<m+n;i++){
            nums1[i]=nums2[i-m];

        }
        Arrays.sort(nums1);
    }



}
