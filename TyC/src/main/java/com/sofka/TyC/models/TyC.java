package com.sofka.TyC.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Objects;
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

    @Override
    public String toString() {
        return "TyC{" +
                "id=" + id +
                ", report='" + report + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TyC tyC = (TyC) o;
        return Objects.equals(id, tyC.id) && Objects.equals(report, tyC.report);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, report);
    }
}
