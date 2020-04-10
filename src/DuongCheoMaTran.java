public class DuongCheoMaTran {
    public static void main(String[] args) {
        int[][] myArray = {
                {1,2,3,4},
                {4,5,2,5},
                {4,1,42,4},
                {0,4,2,14}
        };
            sumOfDiagonal(myArray);
    }

    static void sumOfDiagonal (int[][] arr) {
        int sum = 0;
        for (int i=0; i< arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
        }
    }
        System.out.printf("Đường chéo chính của ma trận có tổng là %s",sum );
    }
}
