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
public class StaticVidu {
    private static String tempStatic= "Đây là biến Static";
    //khối static
    static {
        System.out.println("Đây là khối static 1");
    }
    static {
        System.out.println("Đây là khối static 2");
    }
    
    public StaticVidu() {
        System.out.println("Đã vào hàm main");
        System.out.println("Đây là " + tempStatic);
    }
    public static void main(String[] args) {
        StaticVidu st = new StaticVidu();
        st.method1();//Không nhất thiết sử dụng phương có static mà gọi thông qua lớp
        
    }
    void method1(){
        
    }
    
}
