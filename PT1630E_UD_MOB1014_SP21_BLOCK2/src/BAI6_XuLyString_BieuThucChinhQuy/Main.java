package BAI6_XuLyString_BieuThucChinhQuy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DungNAPC
 */
public class Main {

    public static void main(String[] args) {
        String name = "     FPT poly       ";
        System.out.println(name);
        System.out.println(name.trim());//Xóa khoảng trắng ở 2 đầu
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String name2 =  "Vietnam";
        System.out.println(name2.charAt(0));
        System.out.println(name2.substring(2, name2.length()));
        String name3 = "FPT POLYTECHNIC 2021";
        String[] words = name3.split("\\s");//"\\s" điều kiện để cắt chuỗi thành mảng
        for (String word : words) {//In mảng           
            System.out.println(word);
        }
    }
}
