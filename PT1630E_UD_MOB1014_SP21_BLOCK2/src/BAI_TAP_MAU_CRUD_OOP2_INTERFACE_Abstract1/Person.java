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
public class Person {//Tạo lớp cha
    private String ten;
    private String sdt;
    private String email;

    public Person() {
    }

    public Person(String ten, String sdt, String email) {
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" + "ten=" + ten + ", sdt=" + sdt + ", email=" + email + '}';
    }
    
    public void inRaManHinh(){
        
    }
    
}
