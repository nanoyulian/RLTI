
package com.logistik.shp;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author nano
 * 
 * Model Class
 */

// SHP table
@Entity 
@Table(name = "log_shp")
public class SHP implements Serializable {
    
    @Id 
    private String id_shp;
    @Column
    private String id_klas_barang;
    @Column
    private String merk; 
    @Column
    private String tipe;    
    @Column
    private Double harga;
    @Column
    private String tgl;
    @Column
    private String ppk;
    @Column
    private String penyedia;

      
    
    public SHP() {
        
    }

    public SHP(String id_shp, String id_klas_barang, String merk, String tipe, Double harga, String tgl, String ppk, String penyedia) {
        this.id_shp = id_shp;
        this.id_klas_barang = id_klas_barang;
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
        this.tgl = tgl;
        this.ppk = ppk;
        this.penyedia = penyedia;
    }

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
