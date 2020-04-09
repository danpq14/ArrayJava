import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        System.out.println("CHương trình chuyển đổi nhiệt độ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn chuyển đổi ntn ?");
        System.out.println("1 : C --> F");
        System.out.println("2 : F --> C");
        System.out.println("0 : Exit ");
        boolean flag = true;
        while (flag) {
            System.out.println("Lựa chọn của bạn : ");
            int choice = sc.nextInt();
            System.out.println("Nhập số nhiệt độ : ");
            double temp = sc.nextDouble();
            switch (choice) {
                case 1:
                    System.out.println(temp + "độC =" + C2F(temp) + "đôF");
                    break;
                case 2:
                    System.out.println(temp + "độF =" + F2C(temp) + "đôC");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
            }
        }
    }

    static double C2F (double c) {
        double f = (9.0/5)*c + 32;
        return f;
    }
    static double F2C (double f) {
        double c = (5.0/9)*(f-32);
        return c;
    }
}
