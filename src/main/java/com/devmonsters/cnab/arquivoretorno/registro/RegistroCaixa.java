package com.devmonsters.cnab.arquivoretorno.registro;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

public class RegistroCaixa extends Registro {

    public RegistroCaixa(final String linha) {
        super(linha);
    }

    public String getCodigoEmpresa() {
        return super.getLinha().substring(17, 33);
    }

    @Override
    public String getNossoNumero() {
        return super.getLinha().substring(62, 73);
    }

    public String getCodigoRejeicao() {
        return super.getLinha().substring(79, 82);
    }

    public String getUsoBanco() {
        return super.getLinha().substring(82, 106);
    }

    @Override
    public String getCarteira() {
        return super.getLinha().substring(106, 108);
    }

    public String getCodigoBanco() {
        return super.getLinha().substring(165, 168);
    }

    public int getTipoLiquidacao() {
        return Integer.parseInt(super.getLinha().substring(188, 191));
    }

    public FormaPagamento getFormaPagamento() {
        return FormaPagamento.valueOfCodigo(Integer.parseInt(super.getLinha().substring(191, 192)));
    }

    public int getFloatNegociado() {
        return Integer.parseInt(super.getLinha().substring(192, 194));
    }

    public Date getDataDebitoTarifa() {
        return "000000".equals(super.getLinha().substring(194, 200)) ? null : new GregorianCalendar(this.getDataDebitoTarifaAno(), this.getDataDebitoTarifaMes() - 1, this.getDataDebitoTarifaDia()).getTime();
    }

    private int getDataDebitoTarifaAno() {
        return 2000 + Integer.parseInt(super.getLinha().substring(198, 200));
    }

    private int getDataDebitoTarifaMes() {
        return Integer.parseInt(super.getLinha().substring(196, 198));
    }

    private int getDataDebitoTarifaDia() {
        return Integer.parseInt(super.getLinha().substring(194, 196));
    }

    public BigDecimal getValorMulta() {
        return new BigDecimal(super.getLinha().substring(279, 292)).divide(new BigDecimal(100));
    }

    public int getCodigoMoeda() {
        return Integer.parseInt(super.getLinha().substring(292, 293));
    }

    @Override
    public Date getDataCredito() {
        return "000000".equals(super.getLinha().substring(293, 299)) ? null : new GregorianCalendar(this.getDataCreditoAno(), this.getDataCreditoMes() - 1, this.getDataCreditoDia()).getTime();
    }

    private int getDataCreditoAno() {
        return 2000 + Integer.parseInt(super.getLinha().substring(297, 299));
    }

    private int getDataCreditoMes() {
        return Integer.parseInt(super.getLinha().substring(295, 297));
    }

    private int getDataCreditoDia() {
        return Integer.parseInt(super.getLinha().substring(293, 295));
    }
}