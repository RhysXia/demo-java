package site.rhys.demo;

public class TextDemo {

    /**
     * 反转字符串
     *
     * @param str
     * @return
     */
    public static String reverse(String str) {
        byte[] bytes = str.getBytes();
        int i = 0, j = bytes.length - 1;

        while (i < j) {
            byte temp = bytes[i];
            bytes[i] = bytes[j];
            bytes[j] = temp;
            i++;
            j--;
        }
        return new String(bytes);
    }

    /**
     * 统计元音字母个数
     *
     * @param str
     * @return
     */
    public static int vowelCount(String str) {
        byte[] bytes = str.getBytes();

        byte[] vowels = "aeiou".getBytes();

        int count = 0;
        for (int i = 0; i < bytes.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (bytes[i] == vowels[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 判断是否是回文
     *
     * @param str
     * @return
     */
    public static boolean palindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
