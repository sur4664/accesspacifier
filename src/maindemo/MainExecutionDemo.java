package maindemo;

import p1.Independentclassp1pkge;
import p1.Protection;
import p1.SubclassP1pack;
import p2.IndependentclassP2package;
import p2.Subclassinp2package;

public class MainExecutionDemo {
    public static void main(String[] args) {
        // execute Protection class constructor
        Protection p1 =new Protection();
        //execute Subclass P1 package class constructor
        SubclassP1pack o1 = new SubclassP1pack();
        //execute IndependentClassP1package class constructor
        Independentclassp1pkge o2= new Independentclassp1pkge();
        //excute Subclass constructor P2 package          
        Subclassinp2package o3 = new Subclassinp2package();
        //exdcute Independent class P2 package constructor
        IndependentclassP2package ind2 = new IndependentclassP2package();
    }
}
