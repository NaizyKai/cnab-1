package com.devmonsters.cnab.arquivoretorno.header;

import java.util.Date;
import java.util.GregorianCalendar;

public class HeaderBradesco extends Header {

    public HeaderBradesco(final String linha) {
        super(linha);
    }

    @Override
    public String getCodigoEmpresa() {
        return super.getLinha().substring(26, 46);
    }

    public String getZeros() {
        return super.getLinha().substring(100, 108);
    }

    public String getNumeroAvisoBancario() {
        return super.getLinha().substring(108, 113);
    }

    public String getBrancos1() {
        return super.getLinha().substring(113, 379);
    }

    public Date getDataCredito() {
        final String dataCredito = super.getLinha().substring(379, 385).trim();
        if (!"000000".equals(dataCredito)) {
            final int ano = 2000 + Integer.parseInt(dataCredito.substring(4));
            final int mes = Integer.parseInt(dataCredito.substring(2, 4)) - 1;
            final int dia = Integer.parseInt(dataCredito.substring(0, 2));
            return new GregorianCalendar(ano, mes, dia).getTime();
        }
        return null;
    }

    public String getBrancos2() {
        return super.getLinha().substring(385, 394);
    }
}