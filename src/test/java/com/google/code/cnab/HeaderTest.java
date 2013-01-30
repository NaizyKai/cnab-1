package com.google.code.cnab;

import java.text.SimpleDateFormat;

import org.junit.Assert;
import org.junit.Test;

import com.google.code.cnab.arquivoretorno.Header;

public class HeaderTest {

    private static final String LINHA = "02RETORNO01COBRANCA       1234560000000788    ABCD DISTRIBUIDORA LTDA       104C ECON FEDERAL 010113                                                                                                                                                                                                                                                                                                 01457000001";
    private final Header header = new Header(LINHA);

    @Test
    public void codigoRegistro() {
        Assert.assertEquals("0", this.header.getCodigoRegistro());
    }

    @Test
    public void codigoRetorno() {
        Assert.assertEquals(2, this.header.getCodigoRetorno().intValue());
    }

    @Test
    public void literalRetorno() {
        Assert.assertEquals("RETORNO", this.header.getLiteralRetorno());
    }

    @Test
    public void codigoServico() {
        Assert.assertEquals("01", this.header.getCodigoServico());
    }

    @Test
    public void literalServico() {
        Assert.assertEquals("COBRANCA", this.header.getLiteralServico());
    }

    @Test
    public void codigoEmpresa() {
        Assert.assertEquals("1234560000000788", this.header.getCodigoEmpresa());
    }

    @Test
    public void nomeEmpresa() {
        Assert.assertEquals("ABCD DISTRIBUIDORA LTDA", this.header.getNomeEmpresa());
    }

    @Test
    public void codigoBanco() {
        Assert.assertEquals("104", this.header.getCodigoBanco());
    }

    @Test
    public void nomeBanco() {
        Assert.assertEquals("C ECON FEDERAL", this.header.getNomeBanco());
    }

    @Test
    public void dataGravacao() {
        Assert.assertEquals("010113", new SimpleDateFormat("ddMMyy").format(this.header.getDataGravacao().getTime()));
    }

    @Test
    public void mensagem() {
        Assert.assertEquals("                                                          ", this.header.getMensagem());
    }

    @Test
    public void sequencialA() {
        Assert.assertEquals(1457, this.header.getNumeroSequencialA().intValue());
    }

    @Test
    public void sequencialB() {
        Assert.assertEquals(1, this.header.getNumeroSequencialB().intValue());
    }
}