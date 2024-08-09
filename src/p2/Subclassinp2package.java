package p2;

import p1.Protection;

public class Subclassinp2package  extends Protection{

    public Subclassinp2package(){
     //   System.out.println("private _n"+private_n);  private members cannot be accssed in otherpackage except in same package
        System.out.println(" protected_n" +protected_n);
     //   System.out.println("defauult_c"+default_c); even default cannot be accessed in other packages
        System.out.println("public_d"+public_d);
        System.out.println("*********************************************");

    }

}
