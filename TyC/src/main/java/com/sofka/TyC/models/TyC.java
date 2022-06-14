package com.sofka.TyC.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TyC {

    @Id
    private Long id;
    private String tyc;

    public TyC() {
    }

    public TyC(Long id, String tyc) {
        this.id = id;
        this.tyc = tyc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTyc() {
        return tyc;
    }

    public void setTyc(String tyc) {
        this.tyc = tyc;
    }
}
