package com.devmonsters.cnab;

import org.junit.Assert;
import org.junit.Test;

import com.devmonsters.cnab.arquivoretorno.header.HeaderBradesco;
import com.devmonsters.cnab.arquivoretorno.header.HeaderCaixa;
import com.devmonsters.cnab.arquivoretorno.registro.RegistroBradesco;
import com.devmonsters.cnab.arquivoretorno.registro.RegistroCaixa;
import com.devmonsters.cnab.arquivoretorno.trailer.TrailerBradesco;
import com.devmonsters.cnab.arquivoretorno.trailer.TrailerCaixa;

public class CnabFactoryTest {

    @Test
    public void headerCef() {
        Assert.assertTrue(new CnabFactory().getInstanceHeader(Banco.CEF, "0LINHA") instanceof HeaderCaixa);
    }

    @Test
    public void headerBradesco() {
        Assert.assertTrue(new CnabFactory().getInstanceHeader(Banco.BRADESCO, "0LINHA") instanceof HeaderBradesco);
    }

    @Test
    public void registroCef() {
        Assert.assertTrue(new CnabFactory().getInstanceRegistro(Banco.CEF, "1LINHA") instanceof RegistroCaixa);
    }

    @Test
    public void registroBradesco() {
        Assert.assertTrue(new CnabFactory().getInstanceRegistro(Banco.BRADESCO, "1LINHA") instanceof RegistroBradesco);
    }

    @Test
    public void trailerCef() {
        Assert.assertTrue(new CnabFactory().getInstanceTrailer(Banco.CEF, "9LINHA") instanceof TrailerCaixa);
    }

    @Test
    public void trailerBradesco() {
        Assert.assertTrue(new CnabFactory().getInstanceTrailer(Banco.BRADESCO, "9LINHA") instanceof TrailerBradesco);
    }
}