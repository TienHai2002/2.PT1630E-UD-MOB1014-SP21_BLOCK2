/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

/**
 *
 * @author Dungna29
 */
public class ClassD {
    void method(){
        ClassA classA = new ClassA();
        //classA.a = 1; a bị private nên chỉ được phép gọi bên trong class
        classA.b =2; //b Vẫn sử dụng được vi bên trong cùng package
        classA.c = 3;
        //classA.d = 4; Phải là lớp con của cha thì mới sử dụng được
    }
}
