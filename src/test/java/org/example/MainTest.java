package org.example;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTest {
    @Test
    public void bound_test_valid_email() {
        Assert.assertEquals(false, Main.isValidEmail("@ab.d"));
        Assert.assertEquals(true, Main.isValidEmail("ab@c.d"));
        Assert.assertEquals(true, Main.isValidEmail("abcd@efg.jk"));
        Assert.assertEquals(true, Main.isValidEmail("abcdefgh@klm.not.rty"));
        Assert.assertEquals(true, Main.isValidEmail("abcdefg@klm.not.rty"));
    }

    @Test
    public void tilt_table_test_valid_email() {
        Assert.assertEquals(false, Main.isValidEmail("a@b")); //T1
        Assert.assertEquals(false, Main.isValidEmail("@b.c")); //T2
        Assert.assertEquals(false, Main.isValidEmail("abcde")); //T3
        Assert.assertEquals(false, Main.isValidEmail("abcd@")); //T4
        Assert.assertEquals(false, Main.isValidEmail("@abcd")); //T5
        Assert.assertEquals(false, Main.isValidEmail("abcd@e")); //T6
        Assert.assertEquals(false, Main.isValidEmail("abc.de")); //T7
        Assert.assertEquals(false, Main.isValidEmail("abcd e")); //T8
        Assert.assertEquals(true, Main.isValidEmail("abc@def.gh")); //T9
        Assert.assertEquals(false, Main.isValidEmail("abc@def.gh.")); //T10
        Assert.assertEquals(false, Main.isValidEmail(" ab c@def.gh")); //T11
        Assert.assertEquals(false, Main.isValidEmail("abcd@efg.hjkl.mno.uvt")); //T12
    }

    @Test
    public void testC2_valid_email() {
        assertTrue(Main.isValidEmail("example@example.com")); // Ca kiểm thử 1
        Assert.assertFalse(Main.isValidEmail("exampleexample.com")); // Ca kiểm thử 2
        Assert.assertFalse(Main.isValidEmail("example@")); // Ca kiểm thử 3
        Assert.assertFalse(Main.isValidEmail("@example.com")); // Ca kiểm thử 4
        Assert.assertFalse(Main.isValidEmail("a@b")); // Ca kiểm thử 5

        // Ca kiểm thử 6: Email dài (hơn 320 ký tự)
        StringBuilder longEmail = new StringBuilder("a@example.com");
        for (int i = 0; i < 317; i++) {
            longEmail.insert(1, "@");
        }
       Assert.assertFalse(Main.isValidEmail(longEmail.toString())); // Ca kiểm thử 6

        Assert.assertFalse(Main.isValidEmail("example@com.")); // Ca kiểm thử 7
        Assert.assertFalse(Main.isValidEmail("example @example.com")); // Ca kiểm thử 8
    }


    @Test
    public void test_all_uses_valid_email() {
        assertFalse(Main.isValidEmail("Abc")); // false
        assertFalse(Main.isValidEmail("abcd@")); // false
        assertFalse(Main.isValidEmail("abcde@")); // false
        assertFalse(Main.isValidEmail("@abcde")); // false
        assertFalse(Main.isValidEmail("a@b")); // false
        assertFalse(Main.isValidEmail("a@bcd")); // false
        assertTrue(Main.isValidEmail("abc@cde.ef")); // true
        assertFalse(Main.isValidEmail("abc@")); // false
        assertFalse(Main.isValidEmail("abcd@efg")); // false
        assertFalse(Main.isValidEmail("ab cd@efg.jk")); // false
        assertFalse(Main.isValidEmail("abcd@efgh")); // false
    }


}
