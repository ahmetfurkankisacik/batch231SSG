package org.example.polymorphism;

public class C02_child extends C01_parent{
    @Override
    public void yazdir() {
        System.out.println("childdaki method");
        super.yazdir();
        System.out.println("super keywordunden sonra");
    }
}
