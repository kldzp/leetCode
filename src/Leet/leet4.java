package Leet;

public class leet4 {
	public static void main(String[] args) {
		leet4 le =new leet4();
		int[] nums1 = {1,2,6};
		int[] nums2 = {3,4,5};
		double result = le.findMedianSortedArrays(nums1, nums2);
		System.out.println(result);
	}
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length_nums1 = nums1.length;
		int length_nums2 = nums2.length;
		int length_arr = nums1.length + nums2.length;
	    int loop_times = length_arr/2 + 1 ;
	    int flag =  length_arr%2 ;
        int[] arr = new int[loop_times];
        int i=0,j=0,m=0;
        double result = 0;
        while ( m < loop_times  ) {
			if (i<length_nums1 && j<length_nums2) {
				if ( nums1[i] < nums2[j] ) {
					arr[m] = nums1[i]; m++; i++;
				}else {
					arr[m] = nums2[j]; m++; j++;
				}
			}else if ( i<length_nums1 ) {
				arr[m] = nums1[i]; m++; i++;
			}else if ( j<length_nums2 ) {
				arr[m] = nums2[j]; m++; j++;
			}
		}
        if (flag == 1) {
        	 result = arr[loop_times-1];
		}else {
			 result = ((double)arr[loop_times-2]+(double)arr[loop_times-1])/2;
		}
		return result;
    }
}
