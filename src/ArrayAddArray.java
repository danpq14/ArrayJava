import java.util.Arrays;

public class ArrayAddArray {
    public static void main(String[] args) {
        String[] myArray1 = {"Anh","Dân"};
        String[] myArray2 = {"Đẹp","Trai"};
        addArray(myArray1,myArray2);
    }
    static void addArray (String[] arr1, String[] arr2) {
        String[] resultArray = new String[arr1.length+ arr2.length];
            for (int i=0; i<arr1.length;i++) {
                resultArray[i] = arr1[i];
            }
            for (int j = 0; j<arr2.length; j++) {
                resultArray[j+arr1.length] = arr2[j];
            }
        System.out.println("New Array : " + Arrays.toString(resultArray));
    }
}
