package com.devmonsters.cnab240;

import java.io.Serializable;

abstract class ArquivoLinha implements Serializable {

    private static final long serialVersionUID = -5643739698394352808L;
    private static final int TAMANHO_PADRAO_LINHA = 241;
    private final String linha;

    public ArquivoLinha(final String linha) {
        if (linha == null) {
            throw new IllegalArgumentException("A linha n\u00e3o pode ser nula");
        }
        if (linha.length() != TAMANHO_PADRAO_LINHA) {
            throw new IllegalArgumentException(String.format("Era esperado uma linha com %s caracteres, mas a linha possui %s: %s", TAMANHO_PADRAO_LINHA, linha.length(), linha));
        }
        if (!linha.startsWith(String.valueOf(getTipo()))) {
            throw new IllegalArgumentException(String.format("A linha n\u00e3o satisfaz o tipo esperado %s: %s", getTipo(), linha));
        }
        this.linha = linha;
    }

    /**
     * Retorna a linha a qual este objeto representa, sem manipulacao.
     *
     * @return linha completa.
     */
    public String getLinha() {
        return linha;
    }

    /**
     * Representa o tipo de registro que a linha representa.
     *
     * @return tipo de registro.
     */
    abstract int getTipo();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArquivoLinha)) {
            return false;
        }
        final ArquivoLinha that = (ArquivoLinha) obj;
        return this.linha.equals(that.linha);
    }

    @Override
    public int hashCode() {
        return linha.hashCode();
    }

    @Override
    public String toString() {
        return this.linha;
    }
}
