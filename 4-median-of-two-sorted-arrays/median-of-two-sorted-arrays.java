class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int l1 = nums1.length;
        int l2 = nums2.length;
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            arr[l1 + i] = nums2[i];
        }
        double result;
        Arrays.sort(arr);
        if (arr.length % 2 != 0) {
            result = (double) arr[arr.length / 2];
        } else {
            int a1 = arr[arr.length / 2];
            int a2 = arr[(arr.length / 2) - 1];
            result = (double) (a1 + a2) / 2;

        }
        return result;

    }
}