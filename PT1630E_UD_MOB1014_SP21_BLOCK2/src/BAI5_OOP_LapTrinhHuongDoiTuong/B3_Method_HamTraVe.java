package BAI5_OOP_LapTrinhHuongDoiTuong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dungna29
 */
public class B3_Method_HamTraVe {

    /*
         * Method trả về công thức và định nghĩa ở bên B2
         *
         * Định nghĩa: Method trả về bắt buộc phải trả về 1 giá trị hoặc 1 tập giá trị, 
           đối tượng.... tương ứng với kiểu dữ liệu của Method.
     */
    //Phần 1: Phương thức trả về không tham số
    Scanner sc = new Scanner(System.in);

    public int tinhTong() {
        int a, b;
        System.out.println("Mời bạn nhập số thứ nhất: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập số thứ hai: ");
        b = Integer.parseInt(sc.nextLine());
        return a + b;//Phải trả về đúng kiểu dữ liệu của phương thức ở đây là số nguyên
    }

    //Phần 2: Phương thức trả về có tham số
    public int tinhTong(int a, int b) {
        return a + b;
    }
    public int tinhTong(int a, int b, int c) {
        return a + b + c;
    }
    public int tinhTong(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    //Ví tham khảo
    public int[] method1(){
        int[] arrNumber ={5,6,7,8,9,8};
        return arrNumber;
    }
    public SinhVien method2(){
        SinhVien sv = new SinhVien("Long", "PH005532", 0, "UDPM");
        return sv;
    }

}
