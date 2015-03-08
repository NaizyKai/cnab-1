package com.devmonsters.cnab240;

import java.io.Serializable;
import java.util.List;

public class Arquivo implements Serializable {

    private static final long serialVersionUID = -7482405864830800313L;
    public static final String ARQUIVO_VERSAO = "09";
    public static final String ARQUIVO_RELEASE = "0";

    private Arquivo0Header header;
    private List<ArquivoLote> lotes;
    private Arquivo9Trailer trailer;

    public Arquivo() {
        this.header = null;
        this.lotes = null;
        this.trailer = null;
    }

    public Arquivo0Header getHeader() {
        return header;
    }

    public void setHeader(Arquivo0Header header) {
        this.header = header;
    }

    public List<ArquivoLote> getLotes() {
        return lotes;
    }

    public void setLotes(List<ArquivoLote> lotes) {
        this.lotes = lotes;
    }

    public Arquivo9Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Arquivo9Trailer trailer) {
        this.trailer = trailer;
    }
}
