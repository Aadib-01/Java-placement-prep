public class LC88_MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // your code
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1, 3, nums2, 3);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
} 
