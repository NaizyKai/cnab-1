package com.devmonsters.cnab.arquivoretorno.registro;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

public class RegistroBradesco extends Registro {

    public RegistroBradesco(final String linha) {
        super(linha);
    }

    public String getZeros1() {
        return super.getLinha().substring(17, 20);
    }

    public String getIdentificacaoEmpresaCedente() {
        return super.getLinha().substring(20, 37);
    }

    public String getZeros2() {
        return super.getLinha().substring(62, 70);
    }

    /**
     * Identificação do Título no Banco - Caso o Arquivo-Remessa tenha sido enviado com "Zeros", nesse campo estará sendo confirmado o Nosso Número gerado para o Título. - Caso o Arquivo-Remessa tenha sido enviado com o Nosso Número
     * formatado, o mesmo será confirmado.
     */
    @Override
    public String getNossoNumero() {
        return super.getLinha().substring(70, 82);
    }

    public String getUsoBanco1() {
        return super.getLinha().substring(82, 92);
    }

    public String getUsoBanco2() {
        return super.getLinha().substring(92, 104);
    }

    /**
     * Somente será informado "R", para a Empresa participante da rotina de rateio de crédito, caso não, será informado branco.
     */
    public String getIndicadorRateio() {
        return super.getLinha().substring(104, 105);
    }

    public String getZeros3() {
        return super.getLinha().substring(105, 107);
    }

    @Override
    public String getCarteira() {
        return super.getLinha().substring(107, 108);
    }

    public String getIdentificacaoTituloNoBanco() {
        return super.getLinha().substring(126, 146);
    }

    public String getBancoCobrador() {
        return super.getLinha().substring(165, 168);
    }

    public BigDecimal getOutrasDespesas() {
        return new BigDecimal(super.getLinha().substring(188, 201)).divide(new BigDecimal(100));
    }

    public BigDecimal getJurosOperacaoEmAtraso() {
        return new BigDecimal(super.getLinha().substring(201, 214)).divide(new BigDecimal(100));
    }

    public BigDecimal getOutrosCreditos() {
        return new BigDecimal(super.getLinha().substring(279, 292)).divide(new BigDecimal(100));
    }

    public String getBrancos1() {
        return super.getLinha().substring(292, 294);
    }

    public String getMotivoCodigoOcorrencia() {
        return super.getLinha().substring(294, 295);
    }

    @Override
    public Date getDataCredito() {
        return "000000".equals(super.getLinha().substring(295, 301)) ? null : new GregorianCalendar(this.getDataCreditoAno(), this.getDataCreditoMes() - 1, this.getDataCreditoDia()).getTime();
    }

    private int getDataCreditoAno() {
        return 2000 + Integer.parseInt(super.getLinha().substring(299, 301));
    }

    private int getDataCreditoMes() {
        return Integer.parseInt(super.getLinha().substring(297, 299));
    }

    private int getDataCreditoDia() {
        return Integer.parseInt(super.getLinha().substring(295, 297));
    }

    public String getBrancos2() {
        return super.getLinha().substring(301, 318);
    }

    public String getMotivosRejeicao() {
        return super.getLinha().substring(318, 328);
    }

    public String getBrancos3() {
        return super.getLinha().substring(328, 394);
    }
}