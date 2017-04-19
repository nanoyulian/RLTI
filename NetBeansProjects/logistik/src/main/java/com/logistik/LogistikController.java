/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logistik;

import com.logistik.shp.SHP;
import com.logistik.shp.SHPFormCreate;
import com.logistik.shp.SHPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author nano
 */
@Controller
public class LogistikController {
    @Autowired
    private SHPService shpService;
    
    @RequestMapping("/")
    public String index() {
       
        return "default";
    }
    
    @RequestMapping("/halo")
    public String halo() {       
        return "halo";
    }
    
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", 
                                         required=false, 
                                         defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting"; //nama template html (page)
    }
    
    @RequestMapping(value = "/shpcreate", method=RequestMethod.GET)
    public String shpcreate(SHPFormCreate model) {
        
          
        return "shpcreate";
    }
    
   @RequestMapping(value = "/shpcreate", method = RequestMethod.POST)
    public String saveSHP(@ModelAttribute SHP shp, BindingResult errors, Model model) {
        System.out.println("Merek---------------------------------------------------");        
        System.out.println(shp.getMerk());

        return "redirect:/shpcreate";
        // logic to process input data
    }
    
}
