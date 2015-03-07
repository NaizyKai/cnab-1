package com.devmonsters.cnab240;

public class Arquivo0Header extends ArquivoLinha {

    private static final long serialVersionUID = -6610229286044687956L;

    public Arquivo0Header(final String linha) {
        super(linha);
    }

    @Override
    int getTipo() {
        return 0;
    }

    public String getCampo01ControleBanco() {
        return this.getLinha().substring(1, 4);
    }

    public String getCampo02ControleLote() {
        return this.getLinha().substring(4, 8);
    }

    public String getCampo03ControleRegistro() {
        return this.getLinha().substring(8, 9);
    }

    public String getCampo04Reservado1() {
        return this.getLinha().substring(9, 18);
    }

    public String getCampo05EmpresaInscricaoTipo() {
        return this.getLinha().substring(18, 19);
    }

    public String getCampo06EmpresaInscricaoNumero() {
        return this.getLinha().substring(19, 33);
    }


    public String getCampo07EmpresaConvenio() {
        return this.getLinha().substring(33, 53);
    }


    public String getCampo08EmpresaContaCorrenteAgenciaCodigo() {
        return this.getLinha().substring(53, 58);
    }


    public String getCampo09EmpresaContaCorrenteAgenciaDV() {
        return this.getLinha().substring(58, 59);
    }

    public String getCampo10EmpresaContaCorrenteContaNumero() {
        return this.getLinha().substring(59, 71);
    }

    public String getCampo11EmpresaContaCorrenteContaDV() {
        return this.getLinha().substring(71, 72);
    }

    public String getCampo12EmpresaContaCorrenteDV() {
        return this.getLinha().substring(72, 73);
    }

    public String getCampo13EmpresaNome() {
        return this.getLinha().substring(73, 103);
    }

    public String getCampo14NomeBanco() {
        return this.getLinha().substring(103, 133);
    }

    public String getCampo15Reservado2() {
        return this.getLinha().substring(133, 143);
    }

    public String getCampo16ArquivoCodigo() {
        return this.getLinha().substring(143, 144);
    }

    public String getCampo17ArquivoDataGeracao() {
        return this.getLinha().substring(144, 152);
    }

    public String getCampo18ArquivoHoraGeracao() {
        return this.getLinha().substring(152, 158);
    }

    public String getCampo19ArquivoSequencia() {
        return this.getLinha().substring(158, 164);
    }

    public String getCampo20ArquivoLayout() {
        return this.getLinha().substring(164, 167);
    }

    public String getCampo21ArquivoDensidade() {
        return this.getLinha().substring(167, 172);
    }

    public String getCampo22ReservadoBanco() {
        return this.getLinha().substring(172, 192);
    }

    public String getCampo23ReservadoEmpresa() {
        return this.getLinha().substring(192, 212);
    }

    public String getCampo24Reservado3() {
        return this.getLinha().substring(212, 241);
    }
}
