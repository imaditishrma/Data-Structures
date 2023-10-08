public class BinarySearch {
    public static int Search(int[] Array, int target){
        int left = 0;
        int right = Array.length - 1;
        while (left <= right) {
            int mid = (left + right)/2;
            if (Array[mid] == target) {
                return mid;
            }
            else if (target > Array[mid]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int target=90;
        int[] Array= {12,13,45,70,80,90,100,101}; //Array must be sorted
        System.out.println(Search(Array, target));
    }
}
