package com.bellinfo.ioc.xml;


public class MedicalService {
	
	String name;

	public MedicalService(String name) {
		this.name =name;
	}
	 public void doMedicalStuff() {
		 System.out.println(name);
		 System.out.println("in medical checkup");
	 }
	
}
