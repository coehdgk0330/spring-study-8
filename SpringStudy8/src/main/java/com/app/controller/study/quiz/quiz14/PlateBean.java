package com.app.controller.study.quiz.quiz14;

import lombok.Data;

@Data
public class PlateBean {
	 DessertBean dessertBean;
	 
	 public PlateBean(DessertBean dessertBean) {
		 this.dessertBean = dessertBean;
		 
	 }
	 
	 //setter
	 public void setDessertBean(DessertBean dessertBean) {
		 this.dessertBean = dessertBean;
	 }
}
