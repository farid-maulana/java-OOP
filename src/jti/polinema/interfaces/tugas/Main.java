package jti.polinema.interfaces.tugas;

public class Main {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Kedelai", 4, "Hehehehe", "Abu-Abu");
        keledai.displayData();
        
        Gorilla gorilla = new Gorilla("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        gorilla.displayData();

        Singa singa = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");
        singa.displayData();
    }
}