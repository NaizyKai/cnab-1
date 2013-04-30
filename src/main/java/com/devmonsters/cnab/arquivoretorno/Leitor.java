package com.devmonsters.cnab.arquivoretorno;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.Charsets;

import com.devmonsters.cnab.Banco;
import com.devmonsters.cnab.CnabFactory;
import com.devmonsters.cnab.arquivoretorno.header.Header;
import com.devmonsters.cnab.arquivoretorno.registro.Registro;
import com.devmonsters.cnab.arquivoretorno.trailer.Trailer;

public class Leitor {
    private Header header;
    private Trailer trailer;
    private final List<Registro> registros = new ArrayList<>();

    public Leitor(final InputStream is, final Banco banco) throws Exception {
        try (InputStreamReader isr = new InputStreamReader(is, Charsets.UTF_8); BufferedReader br = new BufferedReader(isr)) {
            String linha = null;
            while ((linha = br.readLine()) != null) {
                if (linha.startsWith("0")) {
                    this.header = new CnabFactory().getInstanceHeader(banco, linha);
                } else if (linha.startsWith("1")) {
                    this.registros.add(new CnabFactory().getInstanceRegistro(banco, linha));
                } else {
                    this.trailer = new CnabFactory().getInstanceTrailer(banco, linha);
                }
            }
        }
    }

    public Header getHeader() {
        return this.header;
    }

    public Trailer getTrailer() {
        return this.trailer;
    }

    public List<Registro> getRegistros() {
        return this.registros;
    }
}