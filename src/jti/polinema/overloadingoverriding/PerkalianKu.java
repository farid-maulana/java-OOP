package jti.polinema.overloadingoverriding;

public class PerkalianKu {
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

//    void perkalian(int a, int b, int c) {
//        System.out.println(a * b * c);
//    }

    void perkalian(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        PerkalianKu object = new PerkalianKu();

        object.perkalian(25, 43);
//        object.perkalian(34, 23, 56);
        object.perkalian(34.56, 23.7);
    }
}
