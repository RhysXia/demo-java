package site.rhys.demo;

import org.junit.Assert;
import org.junit.Test;

public class TextDemoTest {

    @Test
    public void reverse() {

        String str = "asdfghjkl";
        String reverseStr = TextDemo.reverse(str);
        Assert.assertEquals(reverseStr, "lkjhgfdsa");
    }

    @Test
    public void vowelCount() {
        String str = "asdfghjkla";
        int count = TextDemo.vowelCount(str);
        Assert.assertEquals(count, 2);
    }


    @Test
    public void palindrome() {
        String str = "asdfghjklkjhgfdsa";
        boolean flag = TextDemo.palindrome(str);
        Assert.assertEquals(flag, true);
    }
}