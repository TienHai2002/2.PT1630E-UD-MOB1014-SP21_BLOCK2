/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_NHAP_XUAT_OOP1;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class ServiceSinhVien {

    Scanner _sc = new Scanner(System.in);
    SinhVien _sv;
    String _input;
    SinhVien[] arrSinhViens;//Khai báo mảng

    public ServiceSinhVien() {
    }

    //Tạo 1 sinh viên bằng 2 cách sử dụng Conctructor có tham số và không tham số
    void bai1Them2SinhVien() {
        //Cách 1: Contructor có tham số
        SinhVien sv1 = new SinhVien("Thủy", "005555", 2000, 7.6);

        //Cách 2: Contructor không tham số
        SinhVien sv2 = new SinhVien();
        sv2.setTen("Long");
        sv2.setMaSv("005556");
        sv2.setNamSinh(2001);
        sv2.setDiemJava(7.9);

        //In 2 sinh viên ra màn hình
        sv1.inRaManHinh();
        sv2.inRaManHinh();
    }

    //Viêt 1 chương trình cho phép nhập thông tin đối tượng
    void bai2Them1SinhVienDoNguoiDungNhap() {
        SinhVien sv1 = new SinhVien();
        System.out.print("Mời bạn nhập tên: ");
        sv1.setTen(_sc.nextLine());
        System.out.print("Mời bạn nhập mã: ");
        sv1.setMaSv(_sc.nextLine());
        System.out.print("Mời bạn nhập năm sinh: ");
        sv1.setNamSinh(Integer.parseInt(_sc.nextLine()));
        System.out.print("Mời bạn nhập điểm: ");
        sv1.setDiemJava(Double.parseDouble(_sc.nextLine()));

        //In thông tin đối tượng
        sv1.inRaManHinh();
    }

    //Viết 1 chương trình cho phép nhập nhiều đối tượng dùng mảg
    void bai3ThemNhieuSinhVienArray() {
        System.out.println("Bạn muốn thêm bao nhiêu SV: ");
        _input = _sc.nextLine();
        //Khởi tạo mảng sinh viên
        arrSinhViens = new SinhVien[Integer.parseInt(_input)];
        for (int i = 0; i < Integer.parseInt(_input); i++) {
             arrSinhViens[i] = new SinhVien();
            System.out.print("Mời bạn nhập tên: ");
            arrSinhViens[i].setTen(_sc.nextLine());
            System.out.print("Mời bạn nhập mã: ");
            arrSinhViens[i].setMaSv(_sc.nextLine());
            System.out.print("Mời bạn nhập năm sinh: ");
            arrSinhViens[i].setNamSinh(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập điểm: ");
            arrSinhViens[i].setDiemJava(Double.parseDouble(_sc.nextLine()));
        }
    }

    //Viết 1 phương thức in ra màn hình của mả sinh viên
    void inArraySinhVienBai3() {
        for (var x : arrSinhViens) {
            x.inRaManHinh();
            //x là tên biến và đại diện cho 1 đối tượng được lưu bên trong mảng
        }
    }
}
