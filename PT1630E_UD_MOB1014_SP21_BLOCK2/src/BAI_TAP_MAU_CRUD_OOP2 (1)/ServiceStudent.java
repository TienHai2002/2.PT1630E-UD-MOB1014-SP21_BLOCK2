/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_OOP2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class ServiceStudent {

    //Khai báo biến toàn cục ở trên đầu
    Scanner _sc = new Scanner(System.in);
    List<Student> _lstStudents = new ArrayList<>();
    Student _student;
    String _input;

    public ServiceStudent() {
        Student st1 = new Student("PH1", 5.6, "A", "0123456", "A@gmail");
        Student st2 = new Student("PH2", 7.9, "B", "0123457", "B@gmail");
        _lstStudents.add(st1);
        _lstStudents.add(st2);
        //Khi khởi sử dụng class ServiceStudent sẽ luôn có 2 sinh viên FAKE trong danh sách
    }

    public void addStudent() {
        System.out.println("Bạn muốn thêm bao nhiêu sinh viên: ");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _student = new Student();
            System.out.println("Mời bạn nhập tên: ");
            _student.setTen(_sc.nextLine());
            System.out.println("Mời bạn nhập sdt: ");
            _student.setSdt(_sc.nextLine());
            System.out.println("Mời bạn nhập email: ");
            _student.setEmail(_sc.nextLine());
            System.out.println("Mời bạn nhập msv: ");
            _student.setMsv(_sc.nextLine());
            System.out.println("Mời bạn nhập điểm Java: ");
            _student.setDiemJava(Double.parseDouble(_sc.nextLine()));
            _lstStudents.add(_student);
        }
        System.out.println("Bạn đã thêm thành công");
    }

    public void getListStudent() {
        inDs(_lstStudents);//Sử dụng phương thức để in ra màn hình

    }

    public void finStudent() {
        System.out.println("Mời bạn nhập mã muốn tìm: ");
        _input = _sc.nextLine();
        int temp = getIndex(_input);
        if (temp == -1) {
            System.out.println("Mã sinh viên không tồn tại");
            return;
        }
        _lstStudents.get(temp).inRaManHinh();
    }

    public void removeStudent() {
        System.out.println("Mời bạn nhập mã muốn xóa: ");
        _input = _sc.nextLine();
        int temp = getIndex(_input);
        if (temp == -1) {
            System.out.println("Mã sinh viên không tồn tại");
            return;
        }
        _lstStudents.remove(temp);
        System.out.println("Xóa thành công");
    }

    public void editStudent() {
        System.out.println("Mời bạn nhập mã muốn xóa: ");
        _input = _sc.nextLine();
        int temp = getIndex(_input);
        if (temp == -1) {
            System.out.println("Mã sinh viên không tồn tại");
            return;
        }
        do {
            System.out.println("Bạn muốn sửa gì?");
            System.out.println("1. Sửa Tên");
            System.out.println("2. Sửa Sdt");
            System.out.println("3. Thoát");
            System.out.println("Mời bạn chọn chức năng");
            _input = _sc.nextLine();
            switch (_input) {
                case "1":
                    System.out.println("Tên cũ là: " + _lstStudents.get(temp).getTen());
                    System.out.println("Mời bạn nhập tên mới: ");
                    _lstStudents.get(temp).setTen(_sc.nextLine());
                    break;
                case "2":
                    System.out.println("Sdt cũ là: " + _lstStudents.get(temp).getSdt());
                    System.out.println("Mời bạn nhập sdt mới: ");
                    _lstStudents.get(temp).setSdt(_sc.nextLine());
                    break;
                case "3":
                    System.out.println("Chào tạm biệt");
                    break;
                default:
                    System.out.println("Chức năng không tồn tại");
            }
        } while (!(_input.equals("3")));

    }

    public void sortStudent() {
//        Collections.sort(_lstStudents, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //Đối với dạng chuỗi
//                //return o1.getMsv().compareTo(o2.getMsv());//Sắp xếp xuôi
//                //return -o1.getMsv().compareTo(o2.getMsv());//Sắp xếp ngược
//
//                //Đối với các dạng số
//                if (o1.getDiemJava() > o2.getDiemJava()) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            }
//        });

        //Cách 2 : Dùng biểu thức lamda để sắp xếp
        _lstStudents.sort((o1, o2) -> o1.getTen().compareTo(o2.getTen()));
        Collections.sort(_lstStudents, Comparator.comparing(Student::getDiemJava));
        Collections.reverse(_lstStudents);//Đảo ngược danh sách
        //Lambda expression for sorting theo điểm
        //_lstStudents.sort((Student s1, Student s2)->s1.getDiemJava()-s2.getDiemJava()); 
    }

    //Phương thức 1 Tái sử dụng: Dùng để in danh sách sinh viên
    private void inDs(List<Student> lstSv) {
        for (Student x : lstSv) {
            x.inRaManHinh();
        }
    }

    //Phương thức 2: Tìm index của đối tượng trong danh sách
    private int getIndex(String msv) {
        for (int i = 0; i < _lstStudents.size(); i++) {
            if (_lstStudents.get(i).getMsv().equalsIgnoreCase(msv)) {
                return i;
            }
        }
        return -1;//Không tìm thấy mã sinh viên trong danh sách
    }

    /*
        Xóa theo cách sử dụng vòng lặp thuần túy
     */
//    private void xoa() {
//        System.out.println("Mời bạn nhập mã muốn xóa: ");
//        _input = _sc.nextLine();
//        for (int i = 0; i < _lstStudents.size(); i++) {
//            if (_lstStudents.get(i).getMsv().equalsIgnoreCase(_input)) {
//                _lstStudents.remove(i);
//            }
//        }
//    }
//    private void timkiem() {
//        System.out.println("Mời bạn nhập mã muốn timkiem: ");
//        _input = _sc.nextLine();
//        for (int i = 0; i < _lstStudents.size(); i++) {
//            if (_lstStudents.get(i).getMsv().equalsIgnoreCase(_input)) {
//                _lstStudents.get(i).inRaManHinh();
//            }
//        }
//    }
    
      private int getIndexObj1(int msv) {
        for (int i = 0; i < _lstStudents.size(); i++) {
//            if (Integer.parseInt(_lstStudents.get(i).getMsv())==msv) {
//                return i;
//            }
            if (_lstStudents.get(i).getMsv().equalsIgnoreCase(String.valueOf(msv))) {
                return i;
            }
        }
        return -1;
    }
}
