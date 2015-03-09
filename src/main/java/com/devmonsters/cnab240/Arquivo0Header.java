package com.devmonsters.cnab240;

public abstract class Arquivo0Header extends ArquivoLinha {

    private static final long serialVersionUID = -6610229286044687956L;

    public Arquivo0Header(final String linha) {
        super(linha);
    }

    @Override
    public final int getTipo() {
        return 0;
    }
}
