package jti.polinema.interfaces;

import jti.polinema.interfaces.ICumlaude;
import jti.polinema.interfaces.Mahasiswa;
import jti.polinema.interfaces.PascaSarjana;
import jti.polinema.interfaces.Rektor;
import jti.polinema.interfaces.Sarjana;

public class interfacemain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

//        pakrektor.beriSertifikatCumlaude(mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        sarjanaCumlaude.kuliahDiKampus();
        sarjanaCumlaude.lulus();
        sarjanaCumlaude.meraihIPKTinggi();
        System.out.println("----------------------------------");
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
        masterCumlaude.kuliahDiKampus();
        masterCumlaude.lulus();
        masterCumlaude.meraihIPKTinggi();
        System.out.println("----------------------------------");
    }
}
