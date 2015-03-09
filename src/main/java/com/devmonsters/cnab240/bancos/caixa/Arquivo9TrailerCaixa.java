package com.devmonsters.cnab240.bancos.caixa;

import com.devmonsters.cnab240.Arquivo;
import com.devmonsters.cnab240.Arquivo9Trailer;
import com.google.common.base.Strings;

public class Arquivo9TrailerCaixa extends Arquivo9Trailer {

    private static final long serialVersionUID = -284223605116156577L;
    private String campo01ControleBanco;
    private String campo02ControleLote;
    private String campo03ControleRegistro;
    private String campo04Reservado1;
    private String campo05TotaisQuantidadeLotes;
    private String campo06TotaisQuantidadeRegistros;
    private String campo07Reservado2;
    private String campo08Reservado3;

    public Arquivo9TrailerCaixa(String linha) {
        super(linha);
        this.campo01ControleBanco = linha.substring(1, 4);
        this.campo02ControleLote = linha.substring(4, 8);
        this.campo03ControleRegistro = linha.substring(8, 9);
        this.campo04Reservado1 = linha.substring(9, 18);
        this.campo05TotaisQuantidadeLotes = linha.substring(18, 24);
        this.campo06TotaisQuantidadeRegistros = linha.substring(24, 30);
        this.campo07Reservado2 = linha.substring(30, 36);
        this.campo08Reservado3 = linha.substring(36, 241);
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

    public String getCampo05TotaisQuantidadeLotes() {
        return campo05TotaisQuantidadeLotes;
    }

    public void setCampo05TotaisQuantidadeLotes(String campo05TotaisQuantidadeLotes) {
        this.campo05TotaisQuantidadeLotes = campo05TotaisQuantidadeLotes;
    }

    public String getCampo06TotaisQuantidadeRegistros() {
        return campo06TotaisQuantidadeRegistros;
    }

    public void setCampo06TotaisQuantidadeRegistros(String campo06TotaisQuantidadeRegistros) {
        this.campo06TotaisQuantidadeRegistros = campo06TotaisQuantidadeRegistros;
    }

    public String getCampo07Reservado2() {
        return campo07Reservado2;
    }

    public void setCampo07Reservado2(String campo07Reservado2) {
        this.campo07Reservado2 = campo07Reservado2;
    }

    public String getCampo08Reservado3() {
        return campo08Reservado3;
    }

    public void setCampo08Reservado3(String campo08Reservado3) {
        this.campo08Reservado3 = campo08Reservado3;
    }

    @Override
    public String getLinha() {
        final StringBuilder linha = new StringBuilder(String.valueOf(this.getTipo()));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo01ControleBanco), 3, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo02ControleLote), 4, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo03ControleRegistro), 1, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo04Reservado1), 9, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_ALFA));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo05TotaisQuantidadeLotes), 6, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo06TotaisQuantidadeRegistros), 6, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo07Reservado2), 6, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_NUMERICO));
        linha.append(Strings.padStart(Strings.nullToEmpty(this.campo08Reservado3), 205, Arquivo.ARQUIVO_CAMPO_PREENCHIMENTO_ALFA));
        return linha.toString();
    }
}
