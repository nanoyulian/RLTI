package com.logistik.shp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nano
 * 
 * Bisnis Service Class: Survei Harga Pasar (SHP)
 */

@Service
public class SHPService {
    
    @Autowired
    private SHPRepository shpRepository;
    
    // immutable list [data] dummy data    
    /*
    private  List<SHP> shps = new ArrayList <> (Arrays.asList(        
            new SHP("0001","pensil2B","01-01-2017",5000.0),
            new SHP("0002","bolpen","01-02-2017",9000.0)        
        ));
    */
    
    // untuk GET
    public List<SHP> getAllSHP() {
        List<SHP> shpAll = new ArrayList<>();
        shpRepository.findAll().forEach(shpAll::add);
        return shpAll;
        
        //pake dummy data
        //return shps; 
    }

    // untuk GET dgn Param : id
    public SHP getSHP(String id) {
        return shpRepository.findOne(id);
        
        //pake dummy data
        //return shps.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    // untuk POST 
    public void addSHP(SHP shp) {
        shpRepository.save(shp); 
        
        //pake dummy data
        //shps.add(shp);
    }

    // untuk PUT by id
    public void updateSHP(SHP shp, String id) {
        shpRepository.save(shp);
        
        /* pake dummy data
        for (int i = 0; i<shps.size(); i++) {
           SHP s = shps.get(i);
           if (s.getId().equals(id)) {
               shps.set(i, shp); 
           }
        }*/
    }

    // untuk DELETE by id
    public void deleteSHP(String id) {
        shpRepository.delete(id);
        
        /* pake dummy data
        for (int i = 0; i<shps.size(); i++) {
            SHP s = shps.get(i);
            if (s.getId().equals(id)) {
                shps.remove(i);
            }
        }*/
        // shps.removeIf(t->t.getId().equals(id));
    }
    
    
}
