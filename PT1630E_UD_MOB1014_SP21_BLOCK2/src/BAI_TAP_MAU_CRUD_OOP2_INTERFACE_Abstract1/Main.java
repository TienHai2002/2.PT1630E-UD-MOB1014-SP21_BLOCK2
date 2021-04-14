/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_OOP2_INTERFACE_Abstract1;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class Main {

    public static void main(String[] args) {
        IServiceStudent sv = new ServiceStudent();
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println("1. Thêm");
            System.out.println("2. Sửa");
            System.out.println("3. Xóa");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Xuất danh sách");
            System.out.println("6. Sắp xếp");
            System.out.println("7. Thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            input = sc.nextLine();
            switch (input) {
                case "1" ->sv.addStudent();
                case "2" ->sv.editStudent();
                case "3" ->sv.removeStudent();
                case "4" ->sv.finStudent();
                case "5" ->sv.getListStudent();
                case "6" ->sv.sortStudent(); 
                default -> {
                    System.out.println("Chức năng không tồn tại");
                }
            }
        } while (!(input.equals("7")));

    }
}
