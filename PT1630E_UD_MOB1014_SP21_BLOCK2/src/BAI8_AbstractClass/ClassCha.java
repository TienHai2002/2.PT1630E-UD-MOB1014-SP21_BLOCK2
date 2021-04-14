/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI8_AbstractClass;

import BAI7_KeThua.*;

/**
 *
 * @author Dungna29
 */
 /*
    - Từ khóa abstract đứng trước Class gọi là lớp trừu tượng
    - Trong lớp phải có 1 phương thức abstract
 */
public abstract class ClassCha {
   
    private String thuocTinhCha1;
    private String thuocTinhCha2;
    private String thuocTinhCha3;
    private String thuocTinhCha4;

    public ClassCha() {
    }

    public ClassCha(String thuocTinhCha1, String thuocTinhCha2, String thuocTinhCha3, String thuocTinhCha4) {
        this.thuocTinhCha1 = thuocTinhCha1;
        this.thuocTinhCha2 = thuocTinhCha2;
        this.thuocTinhCha3 = thuocTinhCha3;
        this.thuocTinhCha4 = thuocTinhCha4;
    }

    public String getThuocTinhCha1() {
        return thuocTinhCha1;
    }

    public void setThuocTinhCha1(String thuocTinhCha1) {
        this.thuocTinhCha1 = thuocTinhCha1;
    }

    public String getThuocTinhCha2() {
        return thuocTinhCha2;
    }

    public void setThuocTinhCha2(String thuocTinhCha2) {
        this.thuocTinhCha2 = thuocTinhCha2;
    }

    public String getThuocTinhCha3() {
        return thuocTinhCha3;
    }

    public void setThuocTinhCha3(String thuocTinhCha3) {
        this.thuocTinhCha3 = thuocTinhCha3;
    }

    public String getThuocTinhCha4() {
        return thuocTinhCha4;
    }

    public void setThuocTinhCha4(String thuocTinhCha4) {
        this.thuocTinhCha4 = thuocTinhCha4;
    }
    
    //non-abstract
    public void method1Cha(int a, int b) {

    }
    //non-abstract
    public void method2Cha() {

    }
    //non-abstract
    private void method3Cha() {

    }
    
    /*
        - Phương thức abstract không body code còn tên rồi tham số vẫn theo định nghĩa phương thức
    */
    public abstract void method4Cha();
    public abstract void method5Cha(String name);
}
