/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI9_Interface;

import java.util.List;

/**
 *
 * @author Dungna29
 */
public interface IServiceStudent {

    /*
     - Trên interface không sử dụng từ khóa private
     - Các phương thức không có body code
     */

    //Phương thức gì
    public boolean addStudent(Student st);

    boolean editStudent(String msv);

    boolean removeStudent(String msv);

    boolean findStudent(String msv);

    List<Student> addStudent();
}
