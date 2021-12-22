package com.example.testConnectDb.Model;

import javax.persistence.*;

@Entity
@Table(name="tb_request_barang")
public class RequestBarang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "idrequest")
    private long idrequest;

    public long getIdrequest() {
        return idrequest;
    }

    public void setIdrequest(long idrequest) {
        this.idrequest = idrequest;
    }

    @Column(name= "nama_barang")
    private String nama_barang;

    @Column(name= "harga")
    private int harga;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
