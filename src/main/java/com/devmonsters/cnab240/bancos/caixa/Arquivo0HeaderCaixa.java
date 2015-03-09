package com.devmonsters.cnab240.bancos.caixa;

import com.devmonsters.cnab240.Arquivo;
import com.devmonsters.cnab240.Arquivo0Header;
import com.google.common.base.Strings;

public class Arquivo0HeaderCaixa extends Arquivo0Header {

    private static final long serialVersionUID = -5796765176699138362L;
    private String campo01ControleBanco;
    private String campo02ControleLote;
    private String campo03ControleRegistro;
    private String campo04Reservado1;

    private String campo05EmpresaInscricaoTipo;
    private String campo06EmpresaInscricaoNumero;
    private String campo07UsoExclusivo;

    private String campo08EmpresaIdentificadorAgenciacodigo;
    private String campo09EmpresaIdentificadorAgenciaDV;
    private String campo10EmpresaIdentificadorCodigoCedente;
    private String campo11EmpresaUsoExclusivo;
    private String campo12EmpresaUsoExclusivo;
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
    private String campo24VersaoAplicativo;
    private String campo25Reservado3;

    public Arquivo0HeaderCaixa(String linha) {
        super(linha);
        this.campo01ControleBanco = linha.substring(1, 4);
        this.campo02ControleLote = linha.substring(4, 8);
        this.campo03ControleRegistro = linha.substring(8, 9);
        this.campo04Reservado1 = linha.substring(9, 18);

        this.campo05EmpresaInscricaoTipo = linha.substring(18, 19);
        this.campo06EmpresaInscricaoNumero = linha.substring(19, 33);
        this.campo07UsoExclusivo = linha.substring(33, 53);

        this.campo08EmpresaIdentificadorAgenciacodigo = linha.substring(53, 58);
        this.campo09EmpresaIdentificadorAgenciaDV = linha.substring(58, 59);
        this.campo10EmpresaIdentificadorCodigoCedente = linha.substring(59, 65);
        this.campo11EmpresaUsoExclusivo = linha.substring(65, 72);
        this.campo12EmpresaUsoExclusivo = linha.substring(72, 73);
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
        this.campo24VersaoAplicativo = linha.substring(212, 216);
        this.campo25Reservado3 = linha.substring(216, 241);
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

    public String getCampo07UsoExclusivo() {
        return campo07UsoExclusivo;
    }

    public void setCampo07UsoExclusivo(String campo07UsoExclusivo) {
        this.campo07UsoExclusivo = campo07UsoExclusivo;
    }

    public String getCampo08EmpresaIdentificadorAgenciacodigo() {
        return campo08EmpresaIdentificadorAgenciacodigo;
    }

    public void setCampo08EmpresaIdentificadorAgenciacodigo(String campo08EmpresaIdentificadorAgenciacodigo) {
        this.campo08EmpresaIdentificadorAgenciacodigo = campo08EmpresaIdentificadorAgenciacodigo;
    }

    public String getCampo09EmpresaIdentificadorAgenciaDV() {
        return campo09EmpresaIdentificadorAgenciaDV;
    }

    public void setCampo09EmpresaIdentificadorAgenciaDV(String campo09EmpresaIdentificadorAgenciaDV) {
        this.campo09EmpresaIdentificadorAgenciaDV = campo09EmpresaIdentificadorAgenciaDV;
    }

    public String getCampo10EmpresaIdentificadorCodigoCedente() {
        return campo10EmpresaIdentificadorCodigoCedente;
    }

    public void setCampo10EmpresaIdentificadorCodigoCedente(String campo10EmpresaIdentificadorCodigoCedente) {
        this.campo10EmpresaIdentificadorCodigoCedente = campo10EmpresaIdentificadorCodigoCedente;
    }

    public String getCampo11EmpresaUsoExclusivo() {
        return campo11EmpresaUsoExclusivo;
    }

    public void setCampo11EmpresaUsoExclusivo(String campo11EmpresaUsoExclusivo) {
        this.campo11EmpresaUsoExclusivo = campo11EmpresaUsoExclusivo;
    }

    public String getCampo12EmpresaUsoExclusivo() {
        return campo12EmpresaUsoExclusivo;
    }

    public void setCampo12EmpresaUsoExclusivo(String campo12EmpresaUsoExclusivo) {
        this.campo12EmpresaUsoExclusivo = campo12EmpresaUsoExclusivo;
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

    public String getCampo24VersaoAplicativo() {
        return campo24VersaoAplicativo;
    }

    public void setCampo24VersaoAplicativo(String campo24VersaoAplicativo) {
        this.campo24VersaoAplicativo = campo24VersaoAplicativo;
    }

    public String getCampo25Reservado3() {
        return campo25Reservado3;
    }

    public void setCampo25Reservado3(String campo25Reservado3) {
        this.campo25Reservado3 = campo25Reservado3;
    }

    @Override
    public String getLinha() {
        final StringBuilder linha = new StringBuilder(String.valueOf(this.getTipo()));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo01ControleBanco), 3, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo02ControleLote), 4, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo03ControleRegistro), 1, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo04Reservado1), 9, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_ALFA));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo05EmpresaInscricaoTipo), 1, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.isNullOrEmpty(this.campo06EmpresaInscricaoNumero) ? "00000000000000" : Strings.padStart(this.campo06EmpresaInscricaoNumero, 14, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo07UsoExclusivo), 20, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_ALFA));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo08EmpresaIdentificadorAgenciacodigo), 5, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo09EmpresaIdentificadorAgenciaDV), 1, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_ALFA));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo10EmpresaIdentificadorCodigoCedente), 6, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo11EmpresaUsoExclusivo), 7, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_ALFA));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo12EmpresaUsoExclusivo), 1, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_ALFA));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo13EmpresaNome), 30, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_ALFA));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo14NomeBanco), 30, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_ALFA));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo15Reservado2), 10, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_ALFA));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo16ArquivoCodigo), 1, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo17ArquivoDataGeracao), 8, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo18ArquivoHoraGeracao), 6, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo19ArquivoSequencia), 6, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.isNullOrEmpty(this.campo20ArquivoLayout) ? String.format("%s%s", Arquivo.ARQUIVO_VERSAO, Arquivo.ARQUIVO_RELEASE) : Strings.padStart(this.campo20ArquivoLayout, 3, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo21ArquivoDensidade), 5, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo22ReservadoBanco), 20, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_ALFA));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo23ReservadoEmpresa), 20, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_ALFA));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo24VersaoAplicativo), 4, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_ALFA));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo25Reservado3), 25, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_ALFA));
        return linha.toString();
    }
}
