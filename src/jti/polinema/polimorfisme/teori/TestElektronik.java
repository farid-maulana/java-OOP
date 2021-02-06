package jti.polinema.polimorfisme.teori;

public class TestElektronik {
    public static void main(String[] args) {
        Manusia indro = new Manusia();
        TelevisiJadul tvJadul = new TelevisiJadul();
        TelevisiModern tvmodern = new TelevisiModern();

        indro.nyalakanPerangkat(tvJadul);
        indro.nyalakanPerangkat(tvmodern);
    }
}