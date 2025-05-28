package org.example;

import oo.abstrato.Animal;
import oo.abstrato.Cachorro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal a = new Cachorro();
        System.out.println(((Cachorro) a).mamar());
        System.out.println(a.mover());
        System.out.println(a.respirar());
    }
}