
class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] answer = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';

                int temp = a * b + answer[i + j + 1];

                answer[i + j + 1] = temp % 10;
                answer[i + j] += temp / 10;
            }
        }

        StringBuilder s = new StringBuilder();

        for (int digit : answer) {
            if (s.length() == 0 && digit == 0) {
                continue;
            }
            s.append(digit);
        }

        return s.toString();
    }
}
