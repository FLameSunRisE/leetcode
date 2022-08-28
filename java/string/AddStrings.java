package string;

/**
 * Created by jayyeh on 2022/07/29
 *
 * <p>
 * Given two binary strings, return their sum (also a binary string).
 *
 * <p>
 * For example, a = "11" b = "1" Return "100".
 */
public class AddStrings {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
//        Input: num1 = "11", num2 = "123"
//        Output: "134"
        System.out.println(new AddStrings().addStrings("456","77"));
//        Input: num1 = "456", num2 = "77"
//        Output: "533"
        System.out.println(new AddStrings().addStrings("0","0"));
//        Input: num1 = "0", num2 = "0"
//        Output: "0"
    }

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        char[] num1Array = num1.toCharArray();
        char[] num2Array = num2.toCharArray();
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry == 1) {
            int a = i >= 0 ? (num1Array[i--] - '0') : 0;
            int b = j >= 0 ? (num2Array[j--] - '0') : 0;
            int sum = a + b + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;
        }
        return sb.toString();
    }
}
