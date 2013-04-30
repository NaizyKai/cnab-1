package com.devmonsters.cnab.arquivoretorno.header;

public class HeaderCaixa extends Header {

    public HeaderCaixa(final String linha) {
        super(linha);
    }

    @Override
    public String getCodigoEmpresa() {
        return super.getLinha().substring(26, 42).trim();
    }

    public String getMensagem() {
        return super.getLinha().substring(100, 158);
    }

    public int getNumeroSequencialA() {
        return Integer.parseInt(super.getLinha().substring(389, 394).trim());
    }
}