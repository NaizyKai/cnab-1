package com.devmonsters.cnab;

import com.devmonsters.cnab.arquivoretorno.header.Header;
import com.devmonsters.cnab.arquivoretorno.header.HeaderBradesco;
import com.devmonsters.cnab.arquivoretorno.header.HeaderCaixa;
import com.devmonsters.cnab.arquivoretorno.registro.Registro;
import com.devmonsters.cnab.arquivoretorno.registro.RegistroBradesco;
import com.devmonsters.cnab.arquivoretorno.registro.RegistroCaixa;
import com.devmonsters.cnab.arquivoretorno.trailer.Trailer;
import com.devmonsters.cnab.arquivoretorno.trailer.TrailerBradesco;
import com.devmonsters.cnab.arquivoretorno.trailer.TrailerCaixa;

import java.lang.reflect.InvocationTargetException;

public enum Banco {

    CEF("104", HeaderCaixa.class, RegistroCaixa.class, TrailerCaixa.class),
    BRADESCO("237", HeaderBradesco.class, RegistroBradesco.class, TrailerBradesco.class);

    private final String codigo;
    private final Class<? extends Header> classeHeader;
    private final Class<? extends Registro> classeRegistro;
    private final Class<? extends Trailer> classeTrailer;

    Banco(final String codigo, final Class<? extends Header> classeHeader, final Class<? extends Registro> classeRegistro, final Class<? extends Trailer> classeTrailer) {
        this.codigo = codigo;
        this.classeHeader = classeHeader;
        this.classeRegistro = classeRegistro;
        this.classeTrailer = classeTrailer;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public Header getHeader(final String linha) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return this.classeHeader.getConstructor(String.class).newInstance(linha);
    }

    public Registro getRegistro(final String linha) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return this.classeRegistro.getConstructor(String.class).newInstance(linha);
    }

    public Trailer getTrailer(final String linha) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return this.classeTrailer.getConstructor(String.class).newInstance(linha);
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