
package com.logistik.shp;

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
public class SHP {
    
    //primary key
    @Id
    private String id;
    //fields
    private String product_name;
    private String product_date;
    private Double product_price;

    public SHP(String id, String product_name, String product_date, Double product_price) {
        this.id = id;
        this.product_name = product_name;
        this.product_date = product_date;
        this.product_price = product_price;
    }
    
    public SHP() {
        
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_date() {
        return product_date;
    }

    public void setProduct_date(String product_date) {
        this.product_date = product_date;
    }

    public Double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }

      
    
}
