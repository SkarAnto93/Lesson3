package com.company;

import com.company.Categories.Coupe;
import com.company.Categories.Racing;
import com.company.Categories.Suv;

public class Main {

    public static void main(String[] args) {
        Suv suv1 = new Suv();
        Coupe coupe1 = new Coupe();
        Racing racing = new Racing();

        suv1.speedUp(100);

        suv1.changeGear(4);
        suv1.applyBreaks(20);

        System.out.println(suv1.getGear());
    }
}
