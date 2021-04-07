/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_XuLyString_BieuThucChinhQuy;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class S3_DemoXuLyChuoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Mời bạn nhập tên: ");
            String name = sc.nextLine();
            name = name.trim().toLowerCase();//Xử lý chuỗi người dùng nhập vào
            String[] words = name.split("\\s");//NGUYEN VAN TOAN
            for (String word : words) {
                System.out.print(vietHoaChuCaiDauCuaTen(word) + " ");
            }
            System.out.println("");
        } while (true);
        //nguyen van toan
        //Nguyen Van Toan
    }
    static String vietHoaChuCaiDauCuaTen(String name){       
        return String.valueOf(name.charAt(0)).toUpperCase() 
                +name.substring(1,name.length());
        //String.valueOf(name.charAt(0)).toUpperCase() = t --> T
        //name.substring(1,name.length() = oan
    }

   

}
