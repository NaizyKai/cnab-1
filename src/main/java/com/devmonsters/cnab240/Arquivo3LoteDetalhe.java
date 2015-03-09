package com.devmonsters.cnab240;

public abstract class Arquivo3LoteDetalhe extends ArquivoLinha {

    private static final long serialVersionUID = -3405629109259795608L;

    public Arquivo3LoteDetalhe(String linha) {
        super(linha);
    }

    @Override
    public final int getTipo() {
        return 3;
    }
}
