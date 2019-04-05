package com.fr.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class ChoixPaysBean {

	public String validationPays(String country) {
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("pays", country);
		return "hotel";
	}


}
