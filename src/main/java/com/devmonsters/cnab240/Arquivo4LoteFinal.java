package com.devmonsters.cnab240;

public abstract class Arquivo4LoteFinal extends ArquivoLinha {

    private static final long serialVersionUID = 1705984892984151944L;

    public Arquivo4LoteFinal(String linha) {
        super(linha);
    }

    @Override
    public final int getTipo() {
        return 4;
    }
}
