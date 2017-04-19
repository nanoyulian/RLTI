
package com.logistik.shp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nano
 * 
 * Survei Harga Pasar (SHP) Controller Class
 */

@RestController
public class SHPController {
    
    // linked to SHPService (business service class)
    @Autowired
    private SHPService shpService; 
    
    
    // GET
    @RequestMapping("/shps")
    public List<SHP> getAllSHP() {
        return shpService.getAllSHP();
    }
    
    // GET with param : id
    @RequestMapping("/shps/{id}")
    public SHP getSHP(@PathVariable String id) {
        return shpService.getSHP(id);
    }
    
    // POST (create new SHP Objek Record)
    @RequestMapping(method=RequestMethod.POST, value = "/shps")
    public void addSHP(@RequestBody SHP shp) {
        shpService.addSHP(shp);
    }
    
    // PUT (Update SHP Objek Record)
    @RequestMapping(method=RequestMethod.PUT, value = "/shps/{id}")
    public void updateSHP(@RequestBody SHP shp, @PathVariable String id) {
        shpService.updateSHP(shp, id);
    }
    
    // DELETE (DELETE SHP Objek Record)
    @RequestMapping(method=RequestMethod.DELETE, value = "/shps/{id}")
    public void deleteSHP(@PathVariable String id) {
        shpService.deleteSHP(id);
    }
    
    
    
}
