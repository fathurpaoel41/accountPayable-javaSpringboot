package com.example.testConnectDb.Model;

import javax.persistence.*;

@Entity
@Table(name="tb_invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name="idrequest")
    private long idrequest;

    @Column(name="division")
    private String division;

    @Column(name="total")
    private int total;

    @Column(name="status")
    private String status;

    @Column(name="tanggal")
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
