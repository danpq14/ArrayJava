import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        System.out.println("Chương trình đảo ngược phần tử của mảng");
        int[] inputArray = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<inputArray.length; i++) {
            System.out.println("Nhập phần tử thứ "+i+ " của mảng");
            inputArray[i] = sc.nextInt();
        }
        for (int i=0; i<inputArray.length/2;i++) {
            int temp = 0;
            temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - i-1];
            inputArray[inputArray.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(inputArray));
    }
}
