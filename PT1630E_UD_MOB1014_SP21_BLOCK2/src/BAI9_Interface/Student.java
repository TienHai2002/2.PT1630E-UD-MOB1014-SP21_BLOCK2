/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI9_Interface;

import BAI_TAP_MAU_NHAP_XUAT_OOP1.*;

/**
 *
 * @author Dungna29
 */
public class Student {
    private String ten;
    private String maSv;
    private int namSinh;
    private double diemJava;

    public Student() {
    }

    public Student(String ten, String maSv, int namSinh, double diemJava) {
        this.ten = ten;
        this.maSv = maSv;
        this.namSinh = namSinh;
        this.diemJava = diemJava;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }
    
   void inRaManHinh(){
        System.out.printf("Tên: %s | Mã: PH%s | Năm Sinh: %d | Điểm Java: %f \n"
        ,ten,maSv,namSinh,diemJava);
    }
}
