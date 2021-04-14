/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI9_Interface;

/**
 *
 * @author Dungna29
 */
public class Main {
    public static void main(String[] args) {
//        ServiceStudent serviceStuden = new ServiceStudent();        
//        System.out.println(serviceStuden.tinhTong(5, 5));
     IServiceStudent iServiceStudent = new ServiceStudent();
     iServiceStudent.addStudent();
     iServiceStudent.removeStudent(null);
    }
}
