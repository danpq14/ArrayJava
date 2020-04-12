import java.util.Arrays;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,5,1,6,5,5,7,5,7,8,9,5,4,12,12,5,12,15,5};
        int x = 5;
        delNumber(myArray,5);
    }
    static void delNumber (int[] arr, int number) {
        for (int i=0; i< arr.length; i++) { //đẩy hết số muốn xóa xuống cuối Mảng
            int index = 0;
            if (arr[i] == number) {
                index = i;
                for (int j = index; j< arr.length - 1 ; j++ ) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length-1] = 0;
                i--;
            }
        }
        for (int i = 0; i<arr.length; i++) { //thay hết các số muốn xóa ở cuối Mảng = 0
            if (arr[i] == number) arr[i] = number;
        }
        System.out.println(Arrays.toString(arr));
    }
}
