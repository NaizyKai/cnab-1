package com.devmonsters.cnab240;

public abstract class Arquivo2LoteInicial extends ArquivoLinha {

    private static final long serialVersionUID = -1966821905438067062L;

    public Arquivo2LoteInicial(String linha) {
        super(linha);
    }

    @Override
    public final int getTipo() {
        return 2;
    }
}
