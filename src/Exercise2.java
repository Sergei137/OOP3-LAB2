


public class Exercise2 {
    // static binary search method
    public static int BinarySearch(int[] sortedList, int key) {
        int lower = 0;
        int upper = sortedList.length - 1;
        int mid = (int) Math.floor((lower + upper) / 2);
        
        // binary search loops until key is found or lower > upper
        while (lower <= upper) {
            if (sortedList[mid] == key) {
                System.out.println("Key " + key + " found at index " + mid);
                return mid;
            }
            else if (sortedList[mid] < key) {
                lower = mid + 1;
                mid = (int) Math.floor((lower + upper) / 2);
            } 
            else if (sortedList[mid] > key) {
                upper = mid - 1;
                mid = (int) Math.floor((lower + upper) / 2);
            }
        }
        System.out.println("Key " + key + " not found");
        return -1;
    }
}
