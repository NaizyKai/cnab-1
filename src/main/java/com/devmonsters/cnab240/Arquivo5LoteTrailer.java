package com.devmonsters.cnab240;

public abstract class Arquivo5LoteTrailer extends ArquivoLinha {

    private static final long serialVersionUID = 8374627901928131030L;

    public Arquivo5LoteTrailer(String linha) {
        super(linha);
    }

    @Override
    public final int getTipo() {
        return 5;
    }
}