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
public class ServiceStudent implements IServiceStudent{

    IServiceGiaoVien iServiceGiaoVien = (IServiceGiaoVien) new ServiceGiaoVien();
    public ServiceStudent() {
        iServiceGiaoVien.getListGiaoVien();
    }

    

    public int tinhTong(int a, int b) {
        return a + b;
    }

    @Override
    public boolean addStudent(Student st) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editStudent(String msv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeStudent(String msv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean findStudent(String msv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> addStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
