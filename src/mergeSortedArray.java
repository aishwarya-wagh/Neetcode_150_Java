import java.util.Arrays;

public class mergeSortedArray {
    // https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

    public static void main(String args[]){
    int[] nums1=new int[]{1,2,3,0,0,0};
    int m=3;
    int n=3;
    int[] nums2 = new int[]{2,5,6};
    mergeSortedArray.merge2(nums1,m,nums2,n);
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

    // complexity is O(m+n);
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1;
        int len2 = n - 1;
        int totalLen = m + n - 1;

        while (len2 >= 0) {
            if (len1 >= 0 && nums1[len1] > nums2[len2]) {
                nums1[totalLen--] = nums1[len1--];
            } else {
                nums1[totalLen--] = nums2[len2--];
            }
        }
    }


}
