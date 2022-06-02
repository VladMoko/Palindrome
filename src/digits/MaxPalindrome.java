package digits;

import java.util.TreeSet;

public class MaxPalindrome {

    public static void main(String[] args) {
        MaxPalindrome max = new MaxPalindrome();
        max.isPalindrome();
    }

    public boolean isPalindrome() {
        TreeSet<Integer> list = new TreeSet<>();
        int result = 0;
        String str = String.valueOf(result);
        StringBuilder newStr = new StringBuilder(str);

        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 0; j--) {
                result = i * j;
                if (str.equals(newStr.reverse().toString())) {
                    list.add(result);
                }
            }
        }
        System.out.println(list.pollLast());
        return true;
    }
}
