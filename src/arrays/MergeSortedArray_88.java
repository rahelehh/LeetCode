package arrays;

public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temp = new int[m];
        System.arraycopy(nums1, 0, temp, 0, m);

        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        if (n == 0)
            return;
        for (int i = 0, j = 0, k = 0; i < m + n; ) {
            if (k < m) {
                if (j < n) {
                    if (temp[k] < nums2[j]) {
                        nums1[i] = temp[k];
                        i++;
                        k++;
                    } else if (temp[k] == nums2[j]) {
                        nums1[i] = temp[k];
                        nums1[i + 1] = nums2[j];
                        i += 2;
                        k++;
                        j++;
                    } else {
                        nums1[i] = nums2[j];
                        i++;
                        j++;
                    }
                } else {
                    nums1[i] = temp[k];
                    i++;
                    k++;
                }
            } else {
                nums1[i] = nums2[j];
                i++;
                j++;
            }
        }
        for (int i : nums1) {
            System.out.println(i);
        }
    }

    public void merge_solution2(int[] nums1, int m, int[] nums2, int n) {
        int last_index = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[last_index] = nums1[m - 1];
                m -= 1;
            } else {
                nums1[last_index] = nums2[n - 1];
                n -= 1;
            }
            last_index -= 1;
        }
        while (n > 0) {
            nums1[last_index] = nums2[n - 1];
            n -= 1;
            last_index -= 1;
        }
    }
}
