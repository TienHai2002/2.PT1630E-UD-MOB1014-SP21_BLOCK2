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
        List lstName = new ArrayList();
        //Phần 1: Khai báo ArrayList không định kiểu
        List arrListKhongDinhKieu;//Khai báo
        arrListKhongDinhKieu = new ArrayList();

        //Có định kiểu
        List<String> arrListString = new ArrayList<>();
        List<Double> arrListDouble = new ArrayList<>();
        List<Integer> arrListInteger = new ArrayList<>();
        //Phần 2: Gán giá trị cho ArrayList
        arrListKhongDinhKieu.add("JAVA1");
        arrListKhongDinhKieu.add(1);
        arrListKhongDinhKieu.add(1.6);
        arrListKhongDinhKieu.add(true);

        arrListString.add("Z");
        arrListString.add("W");
        arrListString.add("U");
        arrListString.add("A");
        arrListString.add(0, "B");//Đẩy vào vị trí 0

        //Phần 3: Lấy giá trị cần biết index
        System.out.println(arrListString.get(0));
        System.out.println(arrListString.get(1));
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.println(arrListString.get(i));
        }

        //Ngoài ra còn 1 vài phương thức khác hay sử dụng
        System.out.println(arrListString.isEmpty());
        if (arrListString.isEmpty()) {
            System.out.println("Danh sách đang Empty");
        }

        arrListString.remove(0);//Xóa phần tử ở vị trí số 0
        System.out.println(arrListString.get(0));

        //arrListString.clear();
        System.out.println("------------------------------");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.println(arrListString.get(i));
        }
        Collections.sort(arrListString);
        System.out.println("-------------------------");
         for (int i = 0; i < arrListString.size(); i++) {
            System.out.println(arrListString.get(i));
        }
        
    }
}
