package com.devmonsters.cnab240;

import com.google.common.base.Strings;

public class Arquivo0Header extends ArquivoLinha {

    private static final long serialVersionUID = -6610229286044687956L;
    private String campo01ControleBanco;
    private String campo02ControleLote;
    private String campo03ControleRegistro;
    private String campo04Reservado1;
    private String campo05EmpresaInscricaoTipo;
    private String campo06EmpresaInscricaoNumero;
    private String campo07EmpresaConvenio;
    private String campo08EmpresaContaCorrenteAgenciaCodigo;
    private String campo09EmpresaContaCorrenteAgenciaDV;
    private String campo10EmpresaContaCorrenteContaNumero;
    private String campo11EmpresaContaCorrenteContaDV;
    private String campo12EmpresaContaCorrenteDV;
    private String campo13EmpresaNome;
    private String campo14NomeBanco;
    private String campo15Reservado2;
    private String campo16ArquivoCodigo;
    private String campo17ArquivoDataGeracao;
    private String campo18ArquivoHoraGeracao;
    private String campo19ArquivoSequencia;
    private String campo20ArquivoLayout;
    private String campo21ArquivoDensidade;
    private String campo22ReservadoBanco;
    private String campo23ReservadoEmpresa;
    private String campo24Reservado3;

    public Arquivo0Header(final String linha) {
        super(linha);
        this.campo01ControleBanco = linha.substring(1, 4);
        this.campo02ControleLote = linha.substring(4, 8);
        this.campo03ControleRegistro = linha.substring(8, 9);
        this.campo04Reservado1 = linha.substring(9, 18);
        this.campo05EmpresaInscricaoTipo = linha.substring(18, 19);
        this.campo06EmpresaInscricaoNumero = linha.substring(19, 33);
        this.campo07EmpresaConvenio = linha.substring(33, 53);
        this.campo08EmpresaContaCorrenteAgenciaCodigo = linha.substring(53, 58);
        this.campo09EmpresaContaCorrenteAgenciaDV = linha.substring(58, 59);
        this.campo10EmpresaContaCorrenteContaNumero = linha.substring(59, 71);
        this.campo11EmpresaContaCorrenteContaDV = linha.substring(71, 72);
        this.campo12EmpresaContaCorrenteDV = linha.substring(72, 73);
        this.campo13EmpresaNome = linha.substring(73, 103);
        this.campo14NomeBanco = linha.substring(103, 133);
        this.campo15Reservado2 = linha.substring(133, 143);
        this.campo16ArquivoCodigo = linha.substring(143, 144);
        this.campo17ArquivoDataGeracao = linha.substring(144, 152);
        this.campo18ArquivoHoraGeracao = linha.substring(152, 158);
        this.campo19ArquivoSequencia = linha.substring(158, 164);
        this.campo20ArquivoLayout = linha.substring(164, 167);
        this.campo21ArquivoDensidade = linha.substring(167, 172);
        this.campo22ReservadoBanco = linha.substring(172, 192);
        this.campo23ReservadoEmpresa = linha.substring(192, 212);
        this.campo24Reservado3 = linha.substring(212, 241);
    }

    public String getCampo01ControleBanco() {
        return campo01ControleBanco;
    }

    public void setCampo01ControleBanco(String campo01ControleBanco) {
        this.campo01ControleBanco = campo01ControleBanco;
    }

    public String getCampo02ControleLote() {
        return campo02ControleLote;
    }

    public void setCampo02ControleLote(String campo02ControleLote) {
        this.campo02ControleLote = campo02ControleLote;
    }

    public String getCampo03ControleRegistro() {
        return campo03ControleRegistro;
    }

    public void setCampo03ControleRegistro(String campo03ControleRegistro) {
        this.campo03ControleRegistro = campo03ControleRegistro;
    }

    public String getCampo04Reservado1() {
        return campo04Reservado1;
    }

    public void setCampo04Reservado1(String campo04Reservado1) {
        this.campo04Reservado1 = campo04Reservado1;
    }

    public String getCampo05EmpresaInscricaoTipo() {
        return campo05EmpresaInscricaoTipo;
    }

    public void setCampo05EmpresaInscricaoTipo(String campo05EmpresaInscricaoTipo) {
        this.campo05EmpresaInscricaoTipo = campo05EmpresaInscricaoTipo;
    }

    public String getCampo06EmpresaInscricaoNumero() {
        return campo06EmpresaInscricaoNumero;
    }

    public void setCampo06EmpresaInscricaoNumero(String campo06EmpresaInscricaoNumero) {
        this.campo06EmpresaInscricaoNumero = campo06EmpresaInscricaoNumero;
    }

    public String getCampo07EmpresaConvenio() {
        return campo07EmpresaConvenio;
    }

    public void setCampo07EmpresaConvenio(String campo07EmpresaConvenio) {
        this.campo07EmpresaConvenio = campo07EmpresaConvenio;
    }

    public String getCampo08EmpresaContaCorrenteAgenciaCodigo() {
        return campo08EmpresaContaCorrenteAgenciaCodigo;
    }

    public void setCampo08EmpresaContaCorrenteAgenciaCodigo(String campo08EmpresaContaCorrenteAgenciaCodigo) {
        this.campo08EmpresaContaCorrenteAgenciaCodigo = campo08EmpresaContaCorrenteAgenciaCodigo;
    }

    public String getCampo09EmpresaContaCorrenteAgenciaDV() {
        return campo09EmpresaContaCorrenteAgenciaDV;
    }

    public void setCampo09EmpresaContaCorrenteAgenciaDV(String campo09EmpresaContaCorrenteAgenciaDV) {
        this.campo09EmpresaContaCorrenteAgenciaDV = campo09EmpresaContaCorrenteAgenciaDV;
    }

    public String getCampo10EmpresaContaCorrenteContaNumero() {
        return campo10EmpresaContaCorrenteContaNumero;
    }

    public void setCampo10EmpresaContaCorrenteContaNumero(String campo10EmpresaContaCorrenteContaNumero) {
        this.campo10EmpresaContaCorrenteContaNumero = campo10EmpresaContaCorrenteContaNumero;
    }

    public String getCampo11EmpresaContaCorrenteContaDV() {
        return campo11EmpresaContaCorrenteContaDV;
    }

    public void setCampo11EmpresaContaCorrenteContaDV(String campo11EmpresaContaCorrenteContaDV) {
        this.campo11EmpresaContaCorrenteContaDV = campo11EmpresaContaCorrenteContaDV;
    }

    public String getCampo12EmpresaContaCorrenteDV() {
        return campo12EmpresaContaCorrenteDV;
    }

    public void setCampo12EmpresaContaCorrenteDV(String campo12EmpresaContaCorrenteDV) {
        this.campo12EmpresaContaCorrenteDV = campo12EmpresaContaCorrenteDV;
    }

    public String getCampo13EmpresaNome() {
        return campo13EmpresaNome;
    }

    public void setCampo13EmpresaNome(String campo13EmpresaNome) {
        this.campo13EmpresaNome = campo13EmpresaNome;
    }

    public String getCampo14NomeBanco() {
        return campo14NomeBanco;
    }

    public void setCampo14NomeBanco(String campo14NomeBanco) {
        this.campo14NomeBanco = campo14NomeBanco;
    }

    public String getCampo15Reservado2() {
        return campo15Reservado2;
    }

    public void setCampo15Reservado2(String campo15Reservado2) {
        this.campo15Reservado2 = campo15Reservado2;
    }

    public String getCampo16ArquivoCodigo() {
        return campo16ArquivoCodigo;
    }

    public void setCampo16ArquivoCodigo(String campo16ArquivoCodigo) {
        this.campo16ArquivoCodigo = campo16ArquivoCodigo;
    }

    public String getCampo17ArquivoDataGeracao() {
        return campo17ArquivoDataGeracao;
    }

    public void setCampo17ArquivoDataGeracao(String campo17ArquivoDataGeracao) {
        this.campo17ArquivoDataGeracao = campo17ArquivoDataGeracao;
    }

    public String getCampo18ArquivoHoraGeracao() {
        return campo18ArquivoHoraGeracao;
    }

    public void setCampo18ArquivoHoraGeracao(String campo18ArquivoHoraGeracao) {
        this.campo18ArquivoHoraGeracao = campo18ArquivoHoraGeracao;
    }

    public String getCampo19ArquivoSequencia() {
        return campo19ArquivoSequencia;
    }

    public void setCampo19ArquivoSequencia(String campo19ArquivoSequencia) {
        this.campo19ArquivoSequencia = campo19ArquivoSequencia;
    }

    public String getCampo20ArquivoLayout() {
        return campo20ArquivoLayout;
    }

    public void setCampo20ArquivoLayout(String campo20ArquivoLayout) {
        this.campo20ArquivoLayout = campo20ArquivoLayout;
    }

    public String getCampo21ArquivoDensidade() {
        return campo21ArquivoDensidade;
    }

    public void setCampo21ArquivoDensidade(String campo21ArquivoDensidade) {
        this.campo21ArquivoDensidade = campo21ArquivoDensidade;
    }

    public String getCampo22ReservadoBanco() {
        return campo22ReservadoBanco;
    }

    public void setCampo22ReservadoBanco(String campo22ReservadoBanco) {
        this.campo22ReservadoBanco = campo22ReservadoBanco;
    }

    public String getCampo23ReservadoEmpresa() {
        return campo23ReservadoEmpresa;
    }

    public void setCampo23ReservadoEmpresa(String campo23ReservadoEmpresa) {
        this.campo23ReservadoEmpresa = campo23ReservadoEmpresa;
    }

    public String getCampo24Reservado3() {
        return campo24Reservado3;
    }

    public void setCampo24Reservado3(String campo24Reservado3) {
        this.campo24Reservado3 = campo24Reservado3;
    }

    @Override
    int getTipo() {
        return 0;
    }

    @Override
    public String getLinha() {
        final StringBuilder linha = new StringBuilder(String.valueOf(this.getTipo()));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo01ControleBanco), 3, '0'));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo02ControleLote), 4, '0'));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo03ControleRegistro), 1, '0'));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo04Reservado1), 9, ' '));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo05EmpresaInscricaoTipo), 1, '0'));
        linha.append(Strings.isNullOrEmpty(this.campo06EmpresaInscricaoNumero) ? "00000000000000" : Strings.padStart(this.campo06EmpresaInscricaoNumero, 14, '0'));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo07EmpresaConvenio), 20, ' '));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo08EmpresaContaCorrenteAgenciaCodigo), 5, '0'));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo09EmpresaContaCorrenteAgenciaDV), 1, ' '));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo10EmpresaContaCorrenteContaNumero), 12, '0'));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo11EmpresaContaCorrenteContaDV), 1, ' '));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo12EmpresaContaCorrenteDV), 1, ' '));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo13EmpresaNome), 30, ' '));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo14NomeBanco), 30, ' '));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo15Reservado2), 10, ' '));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo16ArquivoCodigo), 1, '0'));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo17ArquivoDataGeracao), 8, '0'));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo18ArquivoHoraGeracao), 6, '0'));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo19ArquivoSequencia), 6, '0'));
        linha.append(Strings.isNullOrEmpty(this.campo20ArquivoLayout) ? String.format("%s%s", Arquivo.ARQUIVO_VERSAO, Arquivo.ARQUIVO_RELEASE) : Strings.padStart(this.campo20ArquivoLayout, 3, '0'));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo21ArquivoDensidade), 5, '0'));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo22ReservadoBanco), 20, ' '));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo23ReservadoEmpresa), 20, ' '));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo24Reservado3), 29, ' '));
        return linha.toString();
    }
}
