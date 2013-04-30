package com.devmonsters.cnab;

import org.junit.Assert;
import org.junit.Test;

public class BancoTest {

    @Test
    public void bancoCefPeloCodigo() {
        Assert.assertEquals(Banco.CEF, Banco.valueOfCodigo("104"));
    }

    @Test
    public void bancoCefPeloNome() {
        Assert.assertEquals(Banco.CEF, Banco.valueOf("CEF"));
    }

    @Test
    public void bancoBradescoPeloCodigo() {
        Assert.assertEquals(Banco.BRADESCO, Banco.valueOfCodigo("237"));
    }

    @Test
    public void nuloSeCodigoInvalido() {
        Assert.assertNull(Banco.valueOfCodigo("000"));
    }
}