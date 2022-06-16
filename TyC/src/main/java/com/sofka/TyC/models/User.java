package com.sofka.TyC.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Objects;

@Document(collection="Users")
public class User {
    @Id
    private String id;

    private String tipo;
    private String document;

    @DBRef
    private TyC tyc;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime date;

    public User() {
    }

    public User(String id, String tipo, String document, TyC tyc, LocalDateTime date) {
        this.id = id;
        this.tipo = tipo;
        this.document = document;
        this.tyc = tyc;
        this.date = date;
    }

    public User(String tipo, String document, TyC tyc) {
        this.tipo = tipo;
        this.document = document;
        this.tyc = tyc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", tipo='" + tipo + '\'' +
                ", document='" + document + '\'' +
                ", tyc=" + tyc +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(tipo, user.tipo) && Objects.equals(document, user.document) && Objects.equals(tyc, user.tyc) && Objects.equals(date, user.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipo, document, tyc, date);
    }
}
