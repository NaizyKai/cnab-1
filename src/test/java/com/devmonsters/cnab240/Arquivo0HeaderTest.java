package com.devmonsters.cnab240;

import org.junit.Assert;
import org.junit.Test;

public class Arquivo0HeaderTest {

    private final String LINHA_TESTE_VALIDA = "0aaabbbbcdddddddddeffffffffffffffgggggggggggggggggggghhhhhijjjjjjjjjjjjklmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnoooooooooopqqqqqqqqrrrrrrsssssstttuuuuuvvvvvvvvvvvvvvvvvvvvxxxxxxxxxxxxxxxxxxxxyyyyyyyyyyyyyyyyyyyyyyyyyyyyy";
    private final String LINHA_TESTE_INVALIDA_TIPO = LINHA_TESTE_VALIDA.replace("0", "1");

    @Test(expected = IllegalArgumentException.class)
    public void erroAoConstruirComNulo() {
        new Arquivo0Header(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void erroAoConstruirComTipoIncorreto() {
        new Arquivo0Header(LINHA_TESTE_INVALIDA_TIPO);
    }

    @Test
    public void retornandoCamposCorretamente() {
        final Arquivo0Header header = new Arquivo0Header(LINHA_TESTE_VALIDA);
        Assert.assertEquals("aaa", header.getCampo01ControleBanco());
        Assert.assertEquals("bbbb", header.getCampo02ControleLote());
        Assert.assertEquals("c", header.getCampo03ControleRegistro());
        Assert.assertEquals("ddddddddd", header.getCampo04Reservado1());
        Assert.assertEquals("e", header.getCampo05EmpresaInscricaoTipo());
        Assert.assertEquals("ffffffffffffff", header.getCampo06EmpresaInscricaoNumero());
        Assert.assertEquals("gggggggggggggggggggg", header.getCampo07EmpresaConvenio());
        Assert.assertEquals("hhhhh", header.getCampo08EmpresaContaCorrenteAgenciaCodigo());
        Assert.assertEquals("i", header.getCampo09EmpresaContaCorrenteAgenciaDV());
        Assert.assertEquals("jjjjjjjjjjjj", header.getCampo10EmpresaContaCorrenteContaNumero());
        Assert.assertEquals("k", header.getCampo11EmpresaContaCorrenteContaDV());
        Assert.assertEquals("l", header.getCampo12EmpresaContaCorrenteDV());
        Assert.assertEquals("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmm", header.getCampo13EmpresaNome());
        Assert.assertEquals("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", header.getCampo14NomeBanco());
        Assert.assertEquals("oooooooooo", header.getCampo15Reservado2());
        Assert.assertEquals("p", header.getCampo16ArquivoCodigo());
        Assert.assertEquals("qqqqqqqq", header.getCampo17ArquivoDataGeracao());
        Assert.assertEquals("rrrrrr", header.getCampo18ArquivoHoraGeracao());
        Assert.assertEquals("ssssss", header.getCampo19ArquivoSequencia());
        Assert.assertEquals("ttt", header.getCampo20ArquivoLayout());
        Assert.assertEquals("uuuuu", header.getCampo21ArquivoDensidade());
        Assert.assertEquals("vvvvvvvvvvvvvvvvvvvv", header.getCampo22ReservadoBanco());
        Assert.assertEquals("xxxxxxxxxxxxxxxxxxxx", header.getCampo23ReservadoEmpresa());
        Assert.assertEquals("yyyyyyyyyyyyyyyyyyyyyyyyyyyyy", header.getCampo24Reservado3());
    }
}
