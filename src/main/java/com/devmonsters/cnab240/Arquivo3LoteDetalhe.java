package com.devmonsters.cnab240;

public class Arquivo3LoteDetalhe extends ArquivoLinha {

    private static final long serialVersionUID = -3405629109259795608L;

    public Arquivo3LoteDetalhe(String linha) {
        super(linha);
    }

    @Override
    int getTipo() {
        return 3;
    }

    @Override
    String getLinha() {
        return null;
    }
}
