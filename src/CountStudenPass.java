import java.util.Scanner;

public class CountStudenPass {
    public static void main(String[] args) {
        System.out.println("Chương trình đếm số học sinh thi đỗ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sinh viên : ");
        int size = sc.nextInt();
        int count = 0;
        if (size > 10 ) {
            System.out.println("Xin mời nhập lại số lượng sinh viên (<10) : ");
            size = sc.nextInt();
        }
        for (int i = 1; i < size + 1; i++) {
            System.out.printf("Nhập điểm của sinh viên thứ %s : ", i);
            double x = sc.nextDouble();
            if (x > 5) count++;
        }
        System.out.printf("Số lượng sinh viên thi đỗ là : %s" , count);
    }
}
