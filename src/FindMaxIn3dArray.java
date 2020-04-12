public class FindMaxIn3dArray {
    public static void main(String[] args) {
        int[][] myArray = {
                {1,2,3,4,312},
                {12,123,12,14,124},
                {4,5,12,412,5,6,23,4142,523,1321},
                {34,47,654,12,18273,1223}
        };
         findMaxin2dArray(myArray);
    }
    public static void findMaxin2dArray(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i<arr.length;i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr [i][j];
                }
            }
        }
        System.out.println("Max in Array is : "+ max);
    }
}
