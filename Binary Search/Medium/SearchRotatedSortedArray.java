//SRSA -> short form for Search in Rotated Sorted Array

//My solution
public class SearchRotatedSortedArray {
    public int search(int[] nums, int target) {
        int index = -1;
        boolean dip = false;
        int j = 1;
        for(int i = 0; i < nums.length && j < nums.length; i++) {
            if(nums[i] > nums[j]) {
                dip = true;
                index = binarySearch(0, i, target, nums);
                if(dip == true && index == -1) {
                    index = binarySearch(j, nums.length-1, target, nums);
                }
                break;
            }
            j++;
        }
        if(dip == false) {
            index = binarySearch(0, nums.length-1, target, nums);
        }
        return index;
    }
    public int binarySearch(int start, int end, int target, int nums []) {
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) {
                return mid; 
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
