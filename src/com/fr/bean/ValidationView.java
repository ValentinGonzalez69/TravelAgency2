package com.fr.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

@ManagedBean
public class ValidationView {
     
   /* public void info() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Information", "Votre message a �t� envoy�, nous vous r�pondrons vite!"));
    }*/
     
    public void warn() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning!", "Watch out for PrimeFaces."));
    }
     
    public void error() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Contact admin."));
    }
     
    public void fatal() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal!", "System Error"));
    }
    
    
    
    public void info() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Message Envoy�", "Nous vous r�pondrons vite!");
         
        PrimeFaces.current().dialog().showMessageDynamic(message);
    }


}

