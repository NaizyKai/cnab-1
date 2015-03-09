package com.devmonsters.cnab240.bancos.caixa;

import com.devmonsters.cnab240.Arquivo9Trailer;
import org.junit.Assert;
import org.junit.Test;

public class Arquivo9TrailerCaixaTest {

    private final String LINHA_TESTE_VALIDA = "9aaabbbbcdddddddddeeeeeeffffffgggggghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh";
    private final String LINHA_TESTE_INVALIDA_TIPO = LINHA_TESTE_VALIDA.replace("9", "1");

    @Test(expected = IllegalArgumentException.class)
    public void erroAoConstruirComNulo() {
        new Arquivo9TrailerCaixa(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void erroAoConstruirComTamanhoInvalido() {
        new Arquivo9TrailerCaixa(LINHA_TESTE_VALIDA.substring(0, 240));
    }

    @Test(expected = IllegalArgumentException.class)
    public void erroAoConstruirComTipoIncorreto() {
        new Arquivo9TrailerCaixa(LINHA_TESTE_INVALIDA_TIPO);
    }

    @Test
    public void retornandoCamposCorretamente() {
        final Arquivo9TrailerCaixa trailer = new Arquivo9TrailerCaixa(LINHA_TESTE_VALIDA);
        Assert.assertEquals("aaa", trailer.getCampo01ControleBanco());
        Assert.assertEquals("bbbb", trailer.getCampo02ControleLote());
        Assert.assertEquals("c", trailer.getCampo03ControleRegistro());
        Assert.assertEquals("ddddddddd", trailer.getCampo04Reservado1());
        Assert.assertEquals("eeeeee", trailer.getCampo05TotaisQuantidadeLotes());
        Assert.assertEquals("ffffff", trailer.getCampo06TotaisQuantidadeRegistros());
        Assert.assertEquals("gggggg", trailer.getCampo07Reservado2());
        Assert.assertEquals("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", trailer.getCampo08Reservado3());
    }

    @Test
    public void aPartirDeUmaLinhaOArquivoDeveSeRecompor() {
        Arquivo9Trailer trailer = new Arquivo9TrailerCaixa(LINHA_TESTE_VALIDA);
        Assert.assertEquals(LINHA_TESTE_VALIDA, trailer.getLinha());
        Assert.assertEquals(LINHA_TESTE_VALIDA, trailer.toString());
    }
}
