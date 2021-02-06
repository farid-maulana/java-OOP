package jti.polinema.polimorfisme.teori;

public class TelevisiJadul extends Elektronik {
    private String modelInput;

    public TelevisiJadul() {
        modelInput = "DVI";
        voltase = 220;
    }

    public String getModelInput() {
        return modelInput;
    }
}