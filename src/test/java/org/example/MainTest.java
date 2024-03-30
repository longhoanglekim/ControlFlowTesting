package org.example;
import org.junit.Assert;
import org.junit.Test;
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
}
