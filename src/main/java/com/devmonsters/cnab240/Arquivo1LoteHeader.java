package com.devmonsters.cnab240;

public abstract class Arquivo1LoteHeader extends ArquivoLinha {

    private static final long serialVersionUID = 6283184142944710761L;

    public Arquivo1LoteHeader(String linha) {
        super(linha);
    }

    @Override
    public final int getTipo() {
        return 1;
    }
}
