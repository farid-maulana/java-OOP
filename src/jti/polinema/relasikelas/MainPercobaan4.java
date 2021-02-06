package jti.polinema.relasikelas;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);

        Penumpang budi = new Penumpang("56789", "Budi");
        gerbong.setPenumpang(budi, 1);

        Penumpang farlan = new Penumpang("31081212", "Farlan");
        gerbong.setPenumpang(farlan, 7);

        System.out.println(gerbong.info());
    }
}
