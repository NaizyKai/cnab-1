package com.devmonsters.cnab240.bancos.caixa;

import com.devmonsters.cnab240.Arquivo0Header;
import org.junit.Assert;
import org.junit.Test;

public class Arquivo0HeaderCaixaTest {

    private final String LINHA_TESTE_VALIDA = "0aaabbbbcdddddddddeffffffffffffffgggggggggggggggggggghhhhhijjjjjjkkkkkkklmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnoooooooooopqqqqqqqqrrrrrrsssssstttuuuuuvvvvvvvvvvvvvvvvvvvvxxxxxxxxxxxxxxxxxxxxyyyyzzzzzzzzzzzzzzzzzzzzzzzzz";
    private final String LINHA_TESTE_INVALIDA_TIPO = LINHA_TESTE_VALIDA.replace("0", "1");

    @Test(expected = IllegalArgumentException.class)
    public void erroAoConstruirComNulo() {
        new Arquivo0HeaderCaixa(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void erroAoConstruirComTamanhoInvalido() {
        new Arquivo0HeaderCaixa(LINHA_TESTE_VALIDA.substring(0, 240));
    }

    @Test(expected = IllegalArgumentException.class)
    public void erroAoConstruirComTipoIncorreto() {
        new Arquivo0HeaderCaixa(LINHA_TESTE_INVALIDA_TIPO);
    }

    @Test
    public void retornandoCamposCorretamente() {
        final Arquivo0HeaderCaixa header = new Arquivo0HeaderCaixa(LINHA_TESTE_VALIDA);
        Assert.assertEquals("aaa", header.getCampo01ControleBanco());
        Assert.assertEquals("bbbb", header.getCampo02ControleLote());
        Assert.assertEquals("c", header.getCampo03ControleRegistro());
        Assert.assertEquals("ddddddddd", header.getCampo04Reservado1());
        Assert.assertEquals("e", header.getCampo05EmpresaInscricaoTipo());
        Assert.assertEquals("ffffffffffffff", header.getCampo06EmpresaInscricaoNumero());
        Assert.assertEquals("gggggggggggggggggggg", header.getCampo07UsoExclusivo());
        Assert.assertEquals("hhhhh", header.getCampo08EmpresaIdentificadorAgenciacodigo());
        Assert.assertEquals("i", header.getCampo09EmpresaIdentificadorAgenciaDV());
        Assert.assertEquals("jjjjjj", header.getCampo10EmpresaIdentificadorCodigoCedente());
        Assert.assertEquals("kkkkkkk", header.getCampo11EmpresaUsoExclusivo());
        Assert.assertEquals("l", header.getCampo12EmpresaUsoExclusivo());
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
        Assert.assertEquals("yyyy", header.getCampo24VersaoAplicativo());
        Assert.assertEquals("zzzzzzzzzzzzzzzzzzzzzzzzz", header.getCampo25Reservado3());
    }

    @Test
    public void aPartirDeUmaLinhaOArquivoDeveSeRecompor() {
        Arquivo0Header header = new Arquivo0HeaderCaixa(LINHA_TESTE_VALIDA);
        Assert.assertEquals(LINHA_TESTE_VALIDA, header.getLinha());
        Assert.assertEquals(LINHA_TESTE_VALIDA, header.toString());
    }
}
