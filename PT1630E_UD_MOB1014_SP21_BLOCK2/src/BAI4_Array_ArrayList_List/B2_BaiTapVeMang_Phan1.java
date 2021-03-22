/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_Array_ArrayList_List;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B2_BaiTapVeMang_Phan1 {
      /*
            //Bài 1: Viết 1 chương trình cho người dùng nhập vào 1 mảng tên sau đó in ra màn hình
            //Bài 2: Viết 1 chương trình nhập vào 1 mảng thông tin sinh viên gồm các thông tin sau
            Tên, Mã SV, Điểm. Sau đó in tất cả các thông tin sinh viên ra màn hình
            //Bài 3: Viết 1 chương trình nhập bảng cửu chương theo khoảng do người dùng mong muốn.
            
        */
    public static void main(String[] args) {
        //Bước 1:
        Scanner sc = new Scanner(System.in);
        String[] arrName;//Khai báo mảng
        int sizeArr;
        System.out.print("Bạn muốn nhập bao nhiêu tên: ");
        sizeArr = Integer.parseInt(sc.nextLine());//Lấy được kích thước mảng
        //Khởi tạo mảng
        arrName = new String[sizeArr];//Khởi tạo 1 mảng do kích thước người dùng nhập
        for (int i = 0; i < sizeArr; i++) {
            System.out.println("Mời bạn nhập tên: " + i);
            arrName[i] = sc.nextLine();//Người dùng gán giá trị cho mảng theo vị trí
        }
        //Sau khi người dùng nhập xong thì tiến hành in ra
         System.out.println("Mảng Tên bạn vừa nhập vào: ");
        for (String x : arrName) {
            System.out.print(x + " ");
        }
    }
}
