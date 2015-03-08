package com.devmonsters.cnab240;

public class Arquivo9Trailer extends ArquivoLinha {

    private static final long serialVersionUID = 6870217246794836499L;

    public Arquivo9Trailer(String linha) {
        super(linha);
    }

    @Override
    int getTipo() {
        return 9;
    }

    @Override
    String getLinha() {
        return null;
    }
}
