package org.example;
import org.junit.Assert;
import org.junit.Test;
public class MainTest {
    @Test
    public void check_passing_entrance() {
        Assert.assertEquals("Ngành không hợp lệ", Main.passingEntranceExam("CN8", 20));
        Assert.assertEquals("Điểm không hợp lệ", Main.passingEntranceExam("CN1", 31));
        Assert.assertEquals("Trượt", Main.passingEntranceExam("CN1", 10));
        Assert.assertEquals("Trượt", Main.passingEntranceExam("CN1", 29));
        Assert.assertEquals("Đỗ", Main.passingEntranceExam("CN1", 29.15));
        Assert.assertEquals("Đỗ", Main.passingEntranceExam("CN12", 28));
    }
}
