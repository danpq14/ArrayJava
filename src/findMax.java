public class findMax {
    public static void main(String[] args) {
        System.out.println("tìm giá trị lớn nhất trong mảng");
        double[] ArrayNumber = {1,12,1.4,123.42,12.2,41};
        System.out.println(findMax(ArrayNumber));

    }
    static double findMax(double[] array) {
        double max = array[0];
        for (int i = 1; i<array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
