package com.fr.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
@ManagedBean
public class DateBean {

		
		private String dateF;
		private String dateD;
		private int nbNuit;
		

		public int getNbNuit() {
			return nbNuit;
		}

		public void setNbNuit(int nbNuit) {
			this.nbNuit = nbNuit;
		}

		public String getDateF() {
			return dateF;
		}

		public void setDateF(String dateF) {
			this.dateF = dateF;
		}

		public String getDateD() {
			return dateD;
		}

		public void setDateD(String dateD) {
			this.dateD = dateD;
		}

	
}
