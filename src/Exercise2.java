


public class Exercise2 {
    // static binary search method
    public static int BinarySearch(int[] sortedList, int key) {
        int lower = 0;
        int upper = sortedList.length - 1;
        int mid = (int) Math.floor((lower + upper) / 2);
        
        // binary search loops until key is found or lower > upper
        while (lower <= upper) {
            // key found
            if (sortedList[mid] == key) {
                System.out.println("Key value: " + key + " found at index " + mid);
                return mid;
            }
            // key is between mid and upper
            else if (sortedList[mid] < key) {
                lower = mid + 1;
                mid = (int) Math.floor((lower + upper) / 2);
            }
            // key is between lower and mid
            else if (sortedList[mid] > key) {
                upper = mid - 1;
                mid = (int) Math.floor((lower + upper) / 2);
            }
        }
        System.out.println("Key value: " + key + " not found");
        return -1;
    }
}
