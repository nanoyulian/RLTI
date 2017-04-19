/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logistik.shp;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author nano
 */
public class SHPFormCreate {
    @NotNull
    private String id_shp;
    @NotNull
    private String id_klas_barang;
    @NotNull
    @Size(min=2, max=30, message = "merk size should be in the range [2...30]")
    private String merk; 
     @NotNull
    private String tipe;    
     @NotNull
    private Double harga;
     @NotNull
     @Size(max=10)
    private String tgl;
     @NotNull
    private String ppk;
     @NotNull
    private String penyedia;

    public String getId_shp() {
        return id_shp;
    }

    public void setId_shp(String id_shp) {
        this.id_shp = id_shp;
    }

    public String getId_klas_barang() {
        return id_klas_barang;
    }

    public void setId_klas_barang(String id_klas_barang) {
        this.id_klas_barang = id_klas_barang;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getPpk() {
        return ppk;
    }

    public void setPpk(String ppk) {
        this.ppk = ppk;
    }

    public String getPenyedia() {
        return penyedia;
    }

    public void setPenyedia(String penyedia) {
        this.penyedia = penyedia;
    }    
}
