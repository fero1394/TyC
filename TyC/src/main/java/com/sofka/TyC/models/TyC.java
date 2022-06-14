package com.sofka.TyC.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Document(collection="TyC")
public class TyC {

    @Id
    private Long id;

    private String report;
    private LocalDate date;

    public TyC() {
        this.date = LocalDate.now();
    }

    public TyC(Long id, String report) {
        this.id = id;
        this.report = report;
        this.date = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
