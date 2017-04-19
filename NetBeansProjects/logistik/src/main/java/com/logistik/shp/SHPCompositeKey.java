/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logistik.shp;

import javax.persistence.Embeddable;

/**
 *
 * @author nano
 */
@Embeddable
public class SHPCompositeKey {
  
    private String id_klas_barang;
   
    private String merk;
   
    private String tipe;

}
