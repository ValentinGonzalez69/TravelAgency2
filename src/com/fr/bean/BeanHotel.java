package com.fr.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
@ManagedBean
public class BeanHotel {
	private String country;
	
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@PostConstruct
    public void init() {
    country = (String) FacesContext.getCurrentInstance().getExternalContext()
            .getFlash().get("pays");


 }
}
