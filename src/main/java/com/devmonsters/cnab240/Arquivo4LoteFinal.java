package com.devmonsters.cnab240;

public class Arquivo4LoteFinal extends ArquivoLinha {

    private static final long serialVersionUID = 1705984892984151944L;

    public Arquivo4LoteFinal(String linha) {
        super(linha);
    }

    @Override
    int getTipo() {
        return 4;
    }

    @Override
    String getLinha() {
        return null;
    }
}
