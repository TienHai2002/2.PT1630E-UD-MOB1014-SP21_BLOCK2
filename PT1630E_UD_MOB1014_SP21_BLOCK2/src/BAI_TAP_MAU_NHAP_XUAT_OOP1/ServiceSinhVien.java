/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_NHAP_XUAT_OOP1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class ServiceSinhVien {

    //Biến toàn cục luôn được khai báo trên đầu dưới Class
    Scanner _sc = new Scanner(System.in);
    List<SinhVien> _lstSinhViens;//Khai báo
    SinhVien _sv;//Khai báo    
    String _input;
    SinhVien[] arrSinhViens;//Khai báo mảng

    public ServiceSinhVien() {
        _lstSinhViens = new ArrayList<>();//Khởi tạo khi ServiceSinhVien được gọi
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

    //Viết 1 phương thêm đối tượng sử dụng List<SinhVien>
    void bai4ThemNhieuSinhVienList() {
        System.out.println("Bạn muốn thêm bao nhiêu SV: ");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            SinhVien sv1 = new SinhVien();
            System.out.print("Mời bạn nhập tên: ");
            sv1.setTen(_sc.nextLine());
            System.out.print("Mời bạn nhập mã: ");
            sv1.setMaSv(_sc.nextLine());
            System.out.print("Mời bạn nhập năm sinh: ");
            sv1.setNamSinh(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập điểm: ");
            sv1.setDiemJava(Double.parseDouble(_sc.nextLine()));            
            _lstSinhViens.add(sv1);//Sau khi nhập giá trị cho sv1 tiến hành thêm đối tượng vào List
        }
    }
    void bai4ThemNhieuSinhVienList1() {
       
        _input = getValueInput("thêm bao nhiêu SV: ");
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            SinhVien sv1 = new SinhVien();           
            sv1.setTen(getValueInput("nhập tên: "));            
            sv1.setMaSv(getValueInput("nhập mã: "));          
            sv1.setNamSinh(Integer.parseInt(getValueInput("nhập năm sinh: ")));            
            sv1.setDiemJava(Double.parseDouble(getValueInput("nhập điểm: ")));            
            _lstSinhViens.add(sv1);//Sau khi nhập giá trị cho sv1 tiến hành thêm đối tượng vào List
        }
    }
    String getValueInput(String text){
        System.out.println("Mời bạn " + text);//text tham số dùng để hiển thị tùy biến
        return _sc.nextLine();//Trả về kiểu dữ liệu String
    }
    void bai4GetListSV(){
        for (SinhVien x : _lstSinhViens) {
            x.inRaManHinh();
        }
    }
}
