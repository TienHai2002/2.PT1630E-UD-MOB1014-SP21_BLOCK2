/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI7_KeThua;

/**
 *
 * @author Dungna29
 */
public class ClassChau extends ClassCon {

    private String thuocTinhChau1;

    public ClassChau() {
    }

    public ClassChau(String thuocTinhChau1, String thuocTinhCon1, String thuocTinhCon2, String thuocTinhCon3, String thuocTinhCha1, String thuocTinhCha2, String thuocTinhCha3, String thuocTinhCha4) {
        super(thuocTinhCon1, thuocTinhCon2, thuocTinhCon3, thuocTinhCha1, thuocTinhCha2, thuocTinhCha3, thuocTinhCha4);
        this.thuocTinhChau1 = thuocTinhChau1;
    }

    public String getThuocTinhChau1() {
        return thuocTinhChau1;
    }

    public void setThuocTinhChau1(String thuocTinhChau1) {
        this.thuocTinhChau1 = thuocTinhChau1;
    }

    @Override
    public void method1Cha(int a, int b) {
        
    }

    @Override
    public void method2Cha() {
        
    }
    

}
