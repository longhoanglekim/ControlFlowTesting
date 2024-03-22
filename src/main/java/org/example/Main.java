package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String passingEntranceExam(String field, double score) {
        if (!field.equals("CN1") && !field.equals("CN12")) {
            return "Ngành không hợp lệ";
        }
        if (score < 0 || score > 30) {
            return "Điểm không hợp lệ";
        }
        if (score < 27)
            return "Trượt";
        if (field.equals("CN1")) {
            if (score < 29.15)
                return "Trượt";
            return "Đỗ";
        }
        return "Đỗ";
    }

    public static void main(String[] args) {
        System.out.println(passingEntranceExam("CN1",10));
        System.out.println(passingEntranceExam("CN1",27));
        System.out.println(passingEntranceExam("CN1", 29.15));
        System.out.println(passingEntranceExam("CN12",10));
        System.out.println(passingEntranceExam("CN12",27));
        System.out.println(passingEntranceExam("CN1", 29.15));
        System.out.println(passingEntranceExam("CN8",30));
    }
}