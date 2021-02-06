package jti.polinema.overloadingoverriding;

public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println(segitiga.totalSudut(70));
        System.out.println(segitiga.totalSudut(60, 35));
        System.out.println(segitiga.keliling(26,31, 17));
        System.out.println(segitiga.keliling(36, 25));
    }
}
