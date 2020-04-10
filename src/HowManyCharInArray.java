public class HowManyCharInArray {
    public static void main(String[] args) {
        String myStr = "jhrgrhghosfoawegohaaaeshgaiwehg";
        char myChar = 'a';
        countChar(myStr,myChar);
    }
    static void countChar(String str, char a) {
        int count =0;
        for (int i = 0; i< str.length(); i++) {
         if (str.charAt(i) == a) {
             count ++;
         }
        }
        System.out.printf("Số lần xuất hiện của kí tự '%s' trong chuỗi là : %s", a, count);
    }
}
