package p1;

public class Protection {
    private int private_n =100 ;
    protected int protected_n = 200;
    int default_c = 300;
    public int public_d=400;
     public Protection(){
        System.out.println("private _n"+private_n);
        System.out.println(" protected_n" +protected_n);
        System.out.println("defauult_c"+default_c);
        System.out.println("public_d"+public_d);
        System.out.println("*********************************************");

    }

    public static void main(String[] args) {


    }
}
