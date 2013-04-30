package com.devmonsters.cnab;

import com.devmonsters.cnab.arquivoretorno.header.Header;
import com.devmonsters.cnab.arquivoretorno.registro.Registro;
import com.devmonsters.cnab.arquivoretorno.trailer.Trailer;

public class CnabFactory {

    public Header getInstanceHeader(final Banco banco, final String linha) throws Exception {
        return banco.getHeader(linha);
    }

    public Registro getInstanceRegistro(final Banco banco, final String linha) throws Exception {
        return banco.getRegistro(linha);
    }

    public Trailer getInstanceTrailer(final Banco banco, final String linha) throws Exception {
        return banco.getTrailer(linha);
    }
}