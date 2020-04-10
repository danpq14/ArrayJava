public class SumOfCollum {
    public static void main(String[] args) {
        int[][] myArray = {
                {1,2,3,4},
                {4,5,2,5},
                {4,1,42,4},
                {0,4,2,14}
        };
        sumOfCollum(myArray,0);
    }

    static void sumOfCollum (int[][] arr, int x) {
        int sum = 0;
        for (int i=0; i< arr.length; i++) {
            sum += arr[i][x];
        }
        System.out.printf("Sum of collum %s is : %s ", x, sum );
    }
}
