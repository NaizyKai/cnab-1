package com.devmonsters.cnab240;

import java.io.Serializable;

abstract class ArquivoLinha implements Serializable {

    private static final long serialVersionUID = -5643739698394352808L;
    private static final int TAMANHO_PADRAO_LINHA = 241;

    /**
     * Construtor que recebe uma linha para o objeto.<br>
     * O mesmo valida que a linha n\u00e3o seja nula, e que setisfa\u00e7a o tamanho e o tipo requerido.
     *
     * @param linha Linha do objeto.
     */
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
    }

    /**
     * Representa o tipo de registro que a linha representa.
     *
     * @return tipo de registro.
     */
    public abstract int getTipo();

    /**
     * Representa a linha do arquivo.
     *
     * @return linha do arquivo.
     */
    public abstract String getLinha();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArquivoLinha)) {
            return false;
        }
        final ArquivoLinha that = (ArquivoLinha) obj;
        return this.getLinha().equals(that.getLinha());
    }

    @Override
    public int hashCode() {
        return this.getLinha().hashCode();
    }

    @Override
    public String toString() {
        return this.getLinha().toString();
    }
}
