package p1;

public class SubclassP1pack extends Protection {
   public SubclassP1pack(){
      // System.out.println("private _n"+private_n); as private members cannot be accessed in another class except same class
       System.out.println(" protected_n" +protected_n);
       System.out.println("defauult_c"+default_c);
       System.out.println("public_d"+public_d);
       System.out.println("*********************************************");
   }
}
