
public class FindElementInArray {
    public static void main(String[] args) {
        String[] studentName = {"Khang", "Khôi", "Dân", "Lý", "Hoàn"};
        String name = "Việt";
        findName(studentName,name);
        findName(studentName,"Dân");
    }

    static void findName(String array[], String name) {
        boolean result = false;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (name == array[i]) {
                result = true;
                index = i;
                break;
            }
        }
        if (result == false) {
            System.out.println("Ko tìm thấy "+name+ " trong danh sách");
        }
        else {
            System.out.println("Tìm thấy "+ name + " ở vị trí "+ index);
        }
    }
}
