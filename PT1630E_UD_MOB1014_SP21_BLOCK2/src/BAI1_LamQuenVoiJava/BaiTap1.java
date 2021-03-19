/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1_LamQuenVoiJava;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class BaiTap1 {

    /*
     Bài 1: Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên 
        từ bàn phím và xuất ra định dạng sau: 
	“Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> 
        đến với chương trình java đầu tiên.”
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bước 1: Xác định số lượng biến
        String ten, masv;
        int ns;
        //Bước 2: Triển khai lấy giá trị nhập vào
        System.out.print("Mời bạn nhập tên: ");
        ten = sc.nextLine();
        System.out.print("Mời bạn nhập năm sinh: ");
        //ns = sc.nextInt();//Bị trôi lệnh
        //Cách 1:
        ns = Integer.parseInt(sc.nextLine());
        //Cách 2:
        //sc.nextLine();
        System.out.print("Mời bạn nhập mã sinh viên: ");
        masv = sc.nextLine();
        System.out.printf("\n Tên: %s | Năm Sinh: %d | %s", ten, ns, masv);
    }
}
