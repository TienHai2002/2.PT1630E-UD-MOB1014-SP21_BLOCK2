/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_XuLyString_BieuThucChinhQuy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S2_BieuThucChinhQuy {

    public static void main(String[] args) {

        //Viết chương trình bắt nhập số nguyên
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.print("Mời bạn nhập chữ: ");
            input = sc.nextLine();           
        } while (!checkChu(input));
        System.out.println("Chúc mừng bạn đã nhập đúng");
    }

    static boolean checkSo(String text) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();//Nếu là số sẽ return true
    }
    static boolean checkChu(String text) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();//Nếu là số sẽ return true
    }

}
