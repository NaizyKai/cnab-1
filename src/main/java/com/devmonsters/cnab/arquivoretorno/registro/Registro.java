package com.devmonsters.cnab.arquivoretorno.registro;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Registro {

    private final String linha;

    public Registro(final String linha) {
        if (!linha.startsWith(this.getCodigoRegistro())) {
            throw new IllegalArgumentException(String.format("Registro come\u00e7a com %s", this.getCodigoRegistro()));
        }
        this.linha = linha;
    }

    public String getLinha() {
        return this.linha;
    }

    public final String getCodigoRegistro() {
        return "1";
    }

    public InscricaoDaEmpresa getInscricaoDaEmpresa() {
        return InscricaoDaEmpresa.valueOfCodigo(this.getLinha().substring(1, 3));
    }

    public String getNumeroInscricao() {
        return this.getLinha().substring(3, 17);
    }

    public String getUsoEmpresa() {
        return this.getLinha().substring(37, 62).trim();
    }

    public abstract String getNossoNumero();

    public abstract String getCarteira();

    public String getCodigoOcorrencia() {
        return this.getLinha().substring(108, 110);
    }

    public Date getDataOcorrencia() {
        return "000000".equals(this.getLinha().substring(110, 116)) ? null : new GregorianCalendar(this.getDataOcorrenciaAno(), this.getDataOcorrenciaMes() - 1, this.getDataOcorrenciaDia()).getTime();
    }

    private int getDataOcorrenciaAno() {
        return 2000 + Integer.parseInt(this.getLinha().substring(114, 116));
    }

    private int getDataOcorrenciaMes() {
        return Integer.parseInt(this.getLinha().substring(112, 114));
    }

    private int getDataOcorrenciaDia() {
        return Integer.parseInt(this.getLinha().substring(110, 112));
    }

    public String getSeuNumero() {
        return this.getLinha().substring(116, 126);
    }

    public Date getVencimento() {
        return "000000".equals(this.getLinha().substring(146, 152)) ? null : new GregorianCalendar(this.getDataVencimentoAno(), this.getDataVencimentoMes() - 1, this.getDataVencimentoDia()).getTime();
    }

    private int getDataVencimentoAno() {
        return 2000 + Integer.parseInt(this.getLinha().substring(150, 152));
    }

    private int getDataVencimentoMes() {
        return Integer.parseInt(this.getLinha().substring(148, 150));
    }

    private int getDataVencimentoDia() {
        return Integer.parseInt(this.getLinha().substring(146, 148));
    }

    public BigDecimal getValorTitulo() {
        return new BigDecimal(this.getLinha().substring(152, 165)).divide(new BigDecimal(100));
    }

    public String getAgenciaCobradora() {
        return this.getLinha().substring(168, 173);
    }

    public String getEspecie() {
        return this.getLinha().substring(173, 175);
    }

    public BigDecimal getTarifaDeCobranca() {
        return new BigDecimal(this.getLinha().substring(175, 188)).divide(new BigDecimal(100));
    }

    public String getLocalDePagamento() {
        return this.getLinha().substring(188, 191);
    }

    public BigDecimal getIof() {
        return new BigDecimal(this.getLinha().substring(214, 227)).divide(new BigDecimal(100));
    }

    public BigDecimal getValorAbatimento() {
        return new BigDecimal(this.getLinha().substring(227, 240)).divide(new BigDecimal(100));
    }

    public BigDecimal getDescontos() {
        return new BigDecimal(this.getLinha().substring(240, 253)).divide(new BigDecimal(100));
    }

    public BigDecimal getValorPrincipal() {
        return new BigDecimal(this.getLinha().substring(253, 266)).divide(new BigDecimal(100));
    }

    public BigDecimal getValorJuros() {
        return new BigDecimal(this.getLinha().substring(266, 279)).divide(new BigDecimal(100));
    }

    public abstract Date getDataCredito();

    public int getSequencial() {
        return Integer.parseInt(this.getLinha().substring(394, 400));
    }
}