/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_OOP_LapTrinhHuongDoiTuong;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B2_Method_PhuongThucKhongTraVe {

    int a;
    /*
         *  Bài Phương thức - Method
         *  Định nghĩa: 1 tập các câu lệnh cùng nhau thực hiện 1 tác vụ nào đó.
         *  LỢI ÍCH: - Giúp quản lý code tốt hơn
         *           - Tái sử dụng
         *
         *  Công thức chung:
         *  <Phạm vi truy cập> <Kiểu trả về> <Tên phương thức> (<Danh sách tham số>)
         *  {
         *          Body code
         *  }
    
         * <Phạm vi truy cập> - Access Modifier:Public,Private,Protected, Default
         *
         * <Kiểu trả về> : có 2 kiểu trả về và không trả về
         *          - Kiểu không trả về: void
         *          - Kiểu trả về: là giá trị(int,string,double....) hoặc tập giá trị(Array,List.....) 
                    hoặc đối tượng(class) và còn nhiều kiểu khác.
         *
         * <Tên phương thức>: Tên động từ viết thường + tên hàm viết hóa chữ cái đầu của từ
         * <Danh sách tham số>: Phương thức có thể có tham hoặc không tham số và lưu ý khi sử dụng tham số 
           thì khi gọi phương thức thì phải truyền đúng vị trí của tham số.
     */

    //Phần 1: Phương thức không trả về và không tham số
    Scanner sc = new Scanner(System.in);

    public void tinhTong() {//() khu vực truyền tham số
        int a, b;
        System.out.println("Mời bạn nhập số thứ nhất: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập số thứ hai: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Tổng 2 số là : " + (a + b));
    }
    //Phần 2: Phương thức không trả về có tham số
//    public void tinhTong(){//Không được khai báo tên phương và kiểu phương thức trùng nhau
//        
//    }

    //Xem lý thuyết thêm phần nạp chồng phương thức trong tính chất đa hình file lý thuyết của thầy
    public void tinhTong(int a, int b) {//Sử dụng nạp chồng phương thức
        System.out.println("Tổng 2 số là : " + (a + b));
    }

    public void tinhTong(int a, int b, int c) {//Sử dụng nạp chồng phương thức
        System.out.println("Tổng 3 số là : " + (a + b + c));
    }

    public void tinhTong(int a, int b, int c, int d) {//Sử dụng nạp chồng phương thức
        System.out.println("Tổng 3 số là : " + (a + b + c + d));
    }
    
    //Ngoài ra còn rất nhiều kiểu tham số truyền vào
    public void method1(SinhVien sv, SinhVien[] svArr, List<SinhVien> lstSinhVien,
            String name,double diem){
        
    }
}
