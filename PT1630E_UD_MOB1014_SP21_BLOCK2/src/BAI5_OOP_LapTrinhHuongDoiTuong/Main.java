/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_OOP_LapTrinhHuongDoiTuong;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Dungna29
 */
public class Main {

    public static void main(String[] args) {
        /*
        Phần 1: Sử dụng phương thức không trả về không tham số
            - Cần phải biết tên phương thức và vị trí của phương thức nằm trong class nào
            - Khi gọi phương thức phải kết thúc bằng dấu ();
         */
        B2_Method_PhuongThucKhongTraVe b2 = new B2_Method_PhuongThucKhongTraVe();
        //b2.tinhTong();

        /*
        Phần 2: Sử dụng phương không trả về có tham số
            - Truyền đúng vị trí của tham số
            - Truyền đủ tham số
            - Truyền đúng kiểu dữ liệu cho tham số
        [KHI NẠP CHỒNG PHƯƠNG THỨC DỰA VÀO SỐ LƯỢNG THAM SỐ ĐỂ XÁC ĐỊNH PHƯƠNG THỨC NÀO 
        SẼ ĐƯỢC SỬ DỤG]
         */
        //b2.tinhTong(0);Lỗi thiếu tham số truyền vào
        //b2.tinhTong("5","5");Lỗi truyền kiểu dữ liệu cho tham số
        //b2.tinhTong(5, 5);
        //b2.tinhTong(5, 5, 5);
        //b2.tinhTong(5, 5, 5, 5);
        /*
        Phần 3: Sử dụng phương trả về không tham số
            - Cần phải biết tên phương thức và vị trí của phương thức nằm trong class nào
            - Phương thức trả về là 1 giá trị hoặc tập giá trị hoặc.........
         */
        B3_Method_HamTraVe b3 = new B3_Method_HamTraVe();
        //b3.tinhTong();//Cả phương thứ cày là 1 giá trị kiểu số nguyên
        System.out.println(b3.tinhTong());

        /*
        Phần 4: Sử dụng phương thức trả về có tham số
            - Truyền đúng vị trí của tham số
            - Truyền đủ tham số
            - Truyền đúng kiểu dữ liệu cho tham số
        [KHI NẠP CHỒNG PHƯƠNG THỨC DỰA VÀO SỐ LƯỢNG THAM SỐ ĐỂ XÁC ĐỊNH PHƯƠNG THỨC NÀO 
        SẼ ĐƯỢC SỬ DỤG]
         */
        System.out.println("Tổng 2 số là: " + b3.tinhTong(5, 5));
        System.out.println("Tổng 3 số là: " + b3.tinhTong(5, 5,5));
        
        //Ví dụ thêm phương thức trả về:
        for (int x : b3.method1()) {
            System.out.print(x);
        }
        b3.method2().inThongTinSV();
    }
}
