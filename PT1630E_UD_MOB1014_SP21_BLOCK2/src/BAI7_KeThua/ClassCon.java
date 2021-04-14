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
/*
    - từ extends để kế thừa lớp cha
    - Chỉ được phép có 1 cha, trong java và C# chỉ có đơn kế thừa
    - Lớp con kế thừa lại thuộc tính và phương thức của cha
    - Lớp con chỉ khai báo các thuộc tính đặc trưng riêng của đối tượng
*/
public class ClassCon extends ClassCha{
    private String thuocTinhCon1;
    private String thuocTinhCon2;
    private String thuocTinhCon3;

    public ClassCon() {
    }

    public ClassCon(String thuocTinhCon1, String thuocTinhCon2, String thuocTinhCon3, String thuocTinhCha1, String thuocTinhCha2, String thuocTinhCha3, String thuocTinhCha4) {
        super(thuocTinhCha1, thuocTinhCha2, thuocTinhCha3, thuocTinhCha4);
        this.thuocTinhCon1 = thuocTinhCon1;
        this.thuocTinhCon2 = thuocTinhCon2;
        this.thuocTinhCon3 = thuocTinhCon3;
        // Từ khóa this dùng để tham chiếu đến thuộc tính và phương thức của lớp hiện tại
        // Từ khóa super dùng để tham chiếu đến thuộc tính và phương thức của lớp cha
    }

    public String getThuocTinhCon1() {
        return thuocTinhCon1;
    }

    public void setThuocTinhCon1(String thuocTinhCon1) {
        this.thuocTinhCon1 = thuocTinhCon1;
    }

    public String getThuocTinhCon2() {
        return thuocTinhCon2;
    }

    public void setThuocTinhCon2(String thuocTinhCon2) {
        this.thuocTinhCon2 = thuocTinhCon2;
    }

    public String getThuocTinhCon3() {
        return thuocTinhCon3;
    }

    public void setThuocTinhCon3(String thuocTinhCon3) {
        this.thuocTinhCon3 = thuocTinhCon3;
    }
    /*
        - Kế thừa phương thức của lớp cha mà cha cho phép
        - Khi kế thừa chính là hành động ghi đè phương thức của lớp cha
    */

    @Override
    public void method2Cha() {
       //Lớp con có thể code lại bên trong phương thức kế thừa của lớp cha
    }

    @Override
    public void method1Cha(int a, int b) {
       
    }
    
}
