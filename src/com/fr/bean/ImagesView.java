package com.fr.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.fr.bean.BeanHotel;
@ManagedBean
public class ImagesView {
     
    private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i <= 8; i++) {
            images.add("paysage" + i + ".jpg");
        }
    }
 
    public List<String> getImages() {
        return images;
    }
    
  
   }