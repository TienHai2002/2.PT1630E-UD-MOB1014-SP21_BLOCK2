/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C;

import A.ClassA;

/**
 *
 * @author Dungna29
 */
public class ClassC extends ClassA {

    void method() {
        //a = 1; a bị private nên chỉ được phép gọi bên trong class
        //b =2; b là Default chỉ được phép gọi bên trong 1 package
        c = 3;
        d = 4;//d sử dụng được vì Class C là con của ClassA
    }
}
