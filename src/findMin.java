public class findMin {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,1,-2,3,41,-32};
        System.out.println(findMin(myArray));
    }
    static int findMin (int [] arr) {
        int min = arr[0];
        for (int i =1; i < arr.length;i++) {
            if (min>arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
