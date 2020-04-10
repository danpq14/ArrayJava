import java.util.Arrays;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,5,1,6,7,5,7,8,9,5,4,5,5,5,5,12,12,5,12,15,5};
        int x = 5;
        delNumber(myArray,x);
    }
    static void delNumber (int[] arr, int number) {
        for (int i=0; i< arr.length; i++) {
            int index = 0;
            int temp = 0;
            if (arr[i] == number) {
                index = i;
                for (int j = index; j< arr.length - 1 ; j++ ) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == number) arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
