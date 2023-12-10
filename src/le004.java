public class le004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;

        int n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1); // 保证 m <= n
        }
        int iMin = 0, iMax = m;
        //二分法找i
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = (m + n + 1) / 2 - i;
            if (j != 0 && i != m && nums2[j-1] > nums1[i]){ // i 需要增大
                iMin = i + 1;
            }
            else if (i != 0 && j != n && nums1[i-1] > nums2[j]) { // i 需要减小
                iMax = i - 1;
            }
            else { // 达到要求，并且将边界条件列出来单独考虑
                int maxLeft = 0;
                if (i == 0) { maxLeft = nums2[j-1]; }
                else if (j == 0) { maxLeft = nums1[i-1]; }
                else { maxLeft = Math.max(nums1[i-1], nums2[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; } // 奇数的话不需要考虑右半部分

                int minRight = 0;
                if (i == m) { minRight = nums2[j]; }
                else if (j == n) { minRight = nums1[i]; }
                else { minRight = Math.min(nums2[j], nums1[i]); }

                return (maxLeft + minRight) / 2.0; //如果是偶数的话返回结果
            }
        }
        return 0.0;
    }
    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int len1=nums1.length,len2=nums2.length,toLen=(len1+len2)/2;
        int left=-1,right=-1;//???
        int start1=0,start2=0;

        for (int i=0;i<=toLen;i++){
            left=right;
            if (start1<len1&&start2<len2){
                if (nums1[start1]<nums2[start2]){
                    right=nums1[start1++];
                }else {
                    right=nums2[start2++];
                }
            } else if (start1<len1) {
                right=nums1[start1++];
            } else if (start2<len2) {
                right=nums2[start2++];
                System.out.println("right--------"+right);
            }
        }
        if ((len1+len2)%2==1){
            return right;
        }
        if ((len1+len2)%2==0){
            return (left+right)/2;
        }


        return 0.0;
    }


    public static void main(String[] args) {
        le004 le004=new le004();
        double a=le004.findMedianSortedArrays1(new int[]{},new int[]{1});
        System.out.println(a);
    }
}
