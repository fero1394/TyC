package com.sofka.TyC.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class Usuario {

    @Id
    private Long id;
    private boolean passport;
    private boolean nui;
    private String document;

    public Usuario() {
    }

    public Usuario(Long id, boolean passport, boolean nui, String document) {
        this.id = id;
        this.passport = passport;
        this.nui = nui;
        this.document = document;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPassport() {
        return passport;
    }

    public void setPassport(boolean passport) {
        this.passport = passport;
    }

    public boolean isNui() {
        return nui;
    }

    public void setNui(boolean nui) {
        this.nui = nui;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
