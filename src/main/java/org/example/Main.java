package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    //public static String specialCharacters = "!@#$%^&*()-+'=<>?/[]{}|;:,.~`";

    public static boolean isValidEmail(String email) {
        // Kiểm tra xem email có ký tự '@'
        if (!email.contains("@")) {
            return false;
        }
        int atIndex = email.lastIndexOf('@');
        int dotBeforeAtIndex = email.indexOf('.');
        int dotAfterAtIndex = email.lastIndexOf('.');

        // Kiểm tra xem email có ít nhất một ký tự trước và sau ký tự '@'
        if (atIndex <= 0 || atIndex >= email.length() - 1) {
            return false;
        }


        // Kiểm tra xem email đủ dài từ 5 đến 320 ký tự
        if (email.length() > 20 || email.length() < 5) {
            return false;
        }

        // Kiểm tra xem có ít nhất một ký tự sau ký tự '.' và '.' không phải là ký tự cuối cùng
        if (dotAfterAtIndex <= atIndex || dotAfterAtIndex >= email.length() - 1 || dotBeforeAtIndex <= atIndex) {
            return false;
        }

        // Kiểm tra xem không có khoảng trắng
        if (email.contains(" ")) {
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isValidEmail("a@b"));
    }
}