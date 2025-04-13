class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isSymmetric(int num) {
        String s = Integer.toString(num);
        int len = s.length();
        
        if (len % 2 != 0) return false;

        int mid = len / 2;
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < mid; i++) {
            sum1 += s.charAt(i) - '0';
            sum2 += s.charAt(i + mid) - '0';
        }

        return sum1 == sum2;
    }
}
