import java.util.Arrays;

public class AddElementToArray {
    public static void main(String[] args) {
            int[] myArr = {1,2,3,4,5,6,0,0,0,0,0};
            addElement(myArr, 0, 3);
        }

     static void addElement (int[] arr, int number, int index) {
            for (int i = arr.length-1; i> index; i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = number;
         System.out.println(Arrays.toString(arr));
     }
}
