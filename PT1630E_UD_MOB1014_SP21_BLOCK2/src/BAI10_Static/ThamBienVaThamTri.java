/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI10_Static;

/**
 *
 * @author Nguyen Anh Dung
 */
public class ThamBienVaThamTri {

    int data = 50;

    void congThemGiaTri(int data) {
        data = data + 100;
    }

    void congThemGiaTri(ThamBienVaThamTri ob) {
        ob.data = ob.data + 100;
    }

    public static void main(String[] args) {
        ThamBienVaThamTri ob = new ThamBienVaThamTri();
        System.out.println("Kiểu tham trị");
        System.out.println("Trước khi thay đổi giá trị " + ob.data);
        ob.congThemGiaTri(500);
        System.out.println("Sa khi thay đổi giá trị " + ob.data);
        System.out.println("Kiểu tham biến");
        System.out.println("Trước khi thay đổi giá trị " + ob.data);
        ob.congThemGiaTri(ob);
        System.out.println("Sa khi thay đổi giá trị " + ob.data);

    }

}
