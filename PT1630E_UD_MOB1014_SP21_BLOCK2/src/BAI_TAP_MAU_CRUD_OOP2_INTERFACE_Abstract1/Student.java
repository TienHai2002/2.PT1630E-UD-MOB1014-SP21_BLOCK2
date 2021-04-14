/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_OOP2_INTERFACE_Abstract1;

/**
 *
 * @author Dungna29
 */
public class Student extends Person{
    private String msv;
    private double diemJava;

    public Student() {
    } 

    public Student(String msv, double diemJava, String ten, String sdt, String email) {
        super(ten, sdt, email);
        this.msv = msv;
        this.diemJava = diemJava;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }
    //Alt + Insert ->> Override Method --> Chọn phương thức của lớp cha
    
    @Override
    public void inRaManHinh() {
        System.out.printf("Tên: %s Sdt: %s Email: %s Msv %s Điểm: %f \n"
                ,getTen(),getSdt(),getEmail(),msv,diemJava);
    }
    
}
