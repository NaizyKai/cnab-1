package com.devmonsters.cnab;

public enum Banco {

    CEF("104"),
    BRADESCO("237");

    private final String codigo;

    private Banco(final String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static Banco valueOfCodigo(final String codigoBanco) {
        for (final Banco banco : Banco.values()) {
            if (codigoBanco.equals(banco.getCodigo())) {
                return banco;
            }
        }
        return null;
    }
}