package com.sofka.TyC.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;


@Document(collection="TyC")
public class TyC {

    @Id
    private Long id;

    private String report;

    public TyC() {
    }

    public TyC(String report) {
        this.report = report;
    }

    public TyC(Long id, String report) {
        this.id = id;
        this.report = report;
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

}
