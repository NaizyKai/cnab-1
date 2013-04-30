package com.devmonsters.cnab.arquivoretorno.header;

import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Header {

    private final String linha;

    public Header(final String linha) {
        if (!linha.startsWith(this.getCodigoRegistro())) {
            throw new IllegalArgumentException(String.format("Header come\u00e7aa com %s", this.getCodigoRegistro()));
        }
        this.linha = linha;
    }

    public String getLinha() {
        return this.linha;
    }

    public String getCodigoRegistro() {
        return "0";
    }

    public int getCodigoRetorno() {
        return Integer.valueOf(this.linha.substring(1, 2));
    }

    public String getLiteralRetorno() {
        return this.linha.substring(2, 9);
    }

    public String getCodigoServico() {
        return this.linha.substring(9, 11);
    }

    public String getLiteralServico() {
        return this.getLinha().substring(11, 26).trim();
    }

    public abstract String getCodigoEmpresa();

    public String getNomeEmpresa() {
        return this.getLinha().substring(46, 76).trim();
    }

    public String getCodigoBanco() {
        return this.getLinha().substring(76, 79);
    }

    public String getNomeBanco() {
        return this.getLinha().substring(79, 94).trim();
    }

    public Date getDataGravacao() {
        final String dataGravacao = this.getLinha().substring(94, 100).trim();
        if (!"000000".equals(dataGravacao)) {
            final int ano = 2000 + Integer.parseInt(dataGravacao.substring(4));
            final int mes = Integer.parseInt(dataGravacao.substring(2, 4)) - 1;
            final int dia = Integer.parseInt(dataGravacao.substring(0, 2));
            return new GregorianCalendar(ano, mes, dia).getTime();
        }
        return null;
    }

    public int getNumeroSequencial() {
        return Integer.parseInt(this.getLinha().substring(394, 400).trim());
    }
}