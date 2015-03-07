package com.devmonsters.cnab240;

import java.io.Serializable;
import java.util.List;

public class ArquivoLote implements Serializable {

    private static final long serialVersionUID = 2274014671297831913L;
    private Arquivo1LoteHeader header;
    private List<Arquivo2LoteInicial> iniciais;
    private List<Arquivo3LoteDetalhe> detalhes;
    private List<Arquivo4LoteFinal> finais;
    private Arquivo5LoteTrailer trailer;

    public ArquivoLote() {
        this.header = null;
        this.iniciais = null;
        this.detalhes = null;
        this.finais = null;
        this.trailer = null;
    }

    public Arquivo1LoteHeader getHeader() {
        return header;
    }

    public void setHeader(Arquivo1LoteHeader header) {
        this.header = header;
    }

    public List<Arquivo2LoteInicial> getIniciais() {
        return iniciais;
    }

    public void setIniciais(List<Arquivo2LoteInicial> iniciais) {
        this.iniciais = iniciais;
    }

    public List<Arquivo3LoteDetalhe> getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(List<Arquivo3LoteDetalhe> detalhes) {
        this.detalhes = detalhes;
    }

    public List<Arquivo4LoteFinal> getFinais() {
        return finais;
    }

    public void setFinais(List<Arquivo4LoteFinal> finais) {
        this.finais = finais;
    }

    public Arquivo5LoteTrailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Arquivo5LoteTrailer trailer) {
        this.trailer = trailer;
    }
}
