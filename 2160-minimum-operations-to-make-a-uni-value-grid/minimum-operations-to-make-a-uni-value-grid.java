class Solution {
    public int minOperations(int[][] grid, int x) {
        int m=grid.length;
        int n=grid[0].length;
        int[] arr=new int[m*n];
        int index=0;
        for(int[]nums :grid){
            for(int num:nums){
                arr[index++]=num;
            }
        }
        Arrays.sort(arr);
        int mid=arr[(0+arr.length)/2];
        int res=0;
        for(int num:arr){
            if((num%x)!=(mid%x)) return -1;

            res=res+(Math.abs(mid-num)/x);
        }
        return res;

    }
}