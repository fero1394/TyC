package com.sofka.TyC.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Users")
public class User {
    @Id
    private String id;

    private String document;

    @DBRef
    private TyC tyc;

    public User() {
    }

    public User(String id, String document, TyC tyc) {
        this.id = id;
        this.document = document;
        this.tyc = tyc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public TyC getTyc() {
        return tyc;
    }

    public void setTyc(TyC tyc) {
        this.tyc = tyc;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", document='" + document + '\'' +
                ", tyc=" + tyc +
                '}';
    }
}
