package com.example.testConnectDb.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "tb_tagihan")
public class Tagihan {

    @JsonProperty("id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @JsonProperty("idrequest")
    @Column(name = "idrequest")
    private long idrequest;

    @JsonProperty("division")
    @Column(name = "division")
    private String division;

    @JsonProperty("total")
    @Column(name = "total")
    private int total;

    @JsonProperty("status")
    @Column(name = "status")
    private String status;

    @JsonProperty("tanggal")
    @Column(name = "tanggal")
    private String tanggal;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdrequest() {
        return idrequest;
    }

    public void setIdrequest(long idrequest) {
        this.idrequest = idrequest;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
