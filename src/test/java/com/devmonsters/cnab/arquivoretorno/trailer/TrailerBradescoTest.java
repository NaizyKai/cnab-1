package com.devmonsters.cnab.arquivoretorno.trailer;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class TrailerBradescoTest {

    private static final String LINHA = "9201237          000014790000069741200200000655          00503000142392164000014774304000350000147602340000100000010000000000000000000000000290000045907630000000000000000000000000000000000                                                                                                                                                                              00000000000000000000000         000619";

    @Test
    public void codigoRetorno() {
        Assert.assertEquals("2", new TrailerBradesco(TrailerBradescoTest.LINHA).getCodigoRetorno());
    }

    @Test
    public void codigoServico() {
        Assert.assertEquals("01", new TrailerBradesco(TrailerBradescoTest.LINHA).getCodigoDoServico());
    }

    @Test
    public void codigoBanco() {
        Assert.assertEquals("237", new TrailerBradesco(TrailerBradescoTest.LINHA).getCodigoDoBanco());
    }

    @Test
    public void sequencialRegistro() {
        Assert.assertEquals(619, new TrailerBradesco(TrailerBradescoTest.LINHA).getSequencial());
    }

    @Test
    public void brancos1() {
        Assert.assertEquals("          ", new TrailerBradesco(TrailerBradescoTest.LINHA).getBrancos1());
    }

    @Test
    public void qtdeTitulosCobranca() {
        Assert.assertEquals(1479, new TrailerBradesco(TrailerBradescoTest.LINHA).getQtdTitulosCobranca());
    }

    @Test
    public void valorTotalCobranca() {
        Assert.assertEquals(new BigDecimal("6974120.02"), new TrailerBradesco(TrailerBradescoTest.LINHA).getValorTotalCobranca());
    }

    @Test
    public void numeroAvisoBancario() {
        Assert.assertEquals("00000655", new TrailerBradesco(TrailerBradescoTest.LINHA).getNumeroAvisoBancario());
    }

    @Test
    public void brancos2() {
        Assert.assertEquals("          ", new TrailerBradesco(TrailerBradescoTest.LINHA).getBrancos2());
    }

    @Test
    public void qtdeRegistrosOcorrencia02ConfirmacaoEntradas() {
        Assert.assertEquals(503, new TrailerBradesco(TrailerBradescoTest.LINHA).getQtdRegistrosOcorrencia02ConfirmacaoEntradas());
    }

    @Test
    public void valorRegistrosOcorrencia02ConfirmacaoEntradas() {
        Assert.assertEquals(new BigDecimal("1423921.64"), new TrailerBradesco(TrailerBradescoTest.LINHA).getValorRegistros02ConfirmacaoEntradas());
    }

    @Test
    public void qtdeRegistrosOcorrencia06Liquidacao() {
        Assert.assertEquals(35, new TrailerBradesco(TrailerBradescoTest.LINHA).getQtdRegistrosOcorrencia06());
    }

    @Test
    public void valorRegistrosOcorrencia06Liquidacao() {
        Assert.assertEquals(new BigDecimal("147743.04"), new TrailerBradesco(TrailerBradescoTest.LINHA).getValorRegistros06Liquidacao());
    }

    @Test
    public void valorRegistrosOcorrencia0609Baixados() {
        Assert.assertEquals(new BigDecimal("147602.34"), new TrailerBradesco(TrailerBradescoTest.LINHA).getValorRegistrosOcorrencia0609Baixados());
    }

    @Test
    public void qtdeRegistrosOcorrencia0910TitulosBaixados() {
        Assert.assertEquals(1, new TrailerBradesco(TrailerBradescoTest.LINHA).getQtdRegistrosOcorrencia0910TitulosBaixados());
    }

    @Test
    public void valorRegistrosOcorrencia0910TitulosBaixados() {
        Assert.assertEquals(new BigDecimal("1000"), new TrailerBradesco(TrailerBradescoTest.LINHA).getValorRegistrosOcorrencia0910TitulosBaixados());
    }

    @Test
    public void qtdeRegistrosOcorrencia13AbatimentoCancelado() {
        Assert.assertEquals(0, new TrailerBradesco(TrailerBradescoTest.LINHA).getQtdRegistrosOcorrencia13AbatimentoCancelado());
    }

    @Test
    public void valorRegistrosOcorrencia13AbatimentoCancelado() {
        Assert.assertEquals(BigDecimal.ZERO, new TrailerBradesco(TrailerBradescoTest.LINHA).getValorRegistrosOcorrencia13AbatimentoCancelado());
    }

    @Test
    public void qtdeRegistrosOcorrencia14VencimentoAlterado() {
        Assert.assertEquals(29, new TrailerBradesco(TrailerBradescoTest.LINHA).getQtdRegistrosOcorrencia14VencimentoAlterado());
    }

    @Test
    public void valorRegistrosOcorrencia14VencimentoAlterado() {
        Assert.assertEquals(new BigDecimal("45907.63"), new TrailerBradesco(TrailerBradescoTest.LINHA).getValorRegistrosOcorrencia14VencimentoAlterado());
    }

    @Test
    public void qtdeRegistrosOcorrencia12AbatimentoConcedido() {
        Assert.assertEquals(0, new TrailerBradesco(TrailerBradescoTest.LINHA).getQtdRegistrosOcorrencia12AbatimentoConcedido());
    }

    @Test
    public void valorRegistrosOcorrencia12AbatimentoConcedido() {
        Assert.assertEquals(BigDecimal.ZERO, new TrailerBradesco(TrailerBradescoTest.LINHA).getValorRegistrosOcorrencia12AbatimentoConcedido());
    }

    @Test
    public void qtdeRegistrosOcorrencia19ConfirmacaoInstrucaoProtesto() {
        Assert.assertEquals(0, new TrailerBradesco(TrailerBradescoTest.LINHA).getQtdRegistrosOcorrencia19ConfirmacaoInstrucaoProtesto());
    }

    @Test
    public void valorRegistrosOcorrencia19ConfirmacaoInstrucaoProtesto() {
        Assert.assertEquals(BigDecimal.ZERO, new TrailerBradesco(TrailerBradescoTest.LINHA).getValorOcorrencia19ConfirmacaoInstrucaoProtesto());
    }

    @Test
    public void brancos3() {
        Assert.assertEquals("                                                                                                                                                                              ", new TrailerBradesco(TrailerBradescoTest.LINHA).getBrancos3());
    }

    @Test
    public void qtdeRateiosEfetuados() {
        Assert.assertEquals(0, new TrailerBradesco(TrailerBradescoTest.LINHA).getQtdRateiosEfetuados());
    }

    @Test
    public void valorRateiosEfetuados() {
        Assert.assertEquals(BigDecimal.ZERO, new TrailerBradesco(TrailerBradescoTest.LINHA).getValorRateiosEfetuados());
    }
}