package org.example.deneme02;

import org.example.polymorphism01.C01_parent;
import org.example.polymorphism01.C02_child;

public class Runner {
    public static void main(String[] args) {
        C02_child c02_child=new C02_child();
        C01_parent c01_parent=new C02_child();
        C01_parent c01_parent1=new C01_parent();
        c02_child.yazdir();//childdaki method
        c01_parent.yazdir();//childdaki method
        c01_parent1.yazdir();//parenttaki method

    }
}
