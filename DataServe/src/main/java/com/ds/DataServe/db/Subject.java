package com.ds.DataServe.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IO_SUBJECTS")
public class Subject {
	 @Id
	 @Column(name="SUBJECTID")
	 private Long id;
	 
	 @Column(name="SUBJECTTEXT")
	 private String sujecttext;
	 
	 @Column(name="SUBJECTOWNER")
	 private String subjectOwnet;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSujecttext() {
		return sujecttext;
	}

	public void setSujecttext(String sujecttext) {
		this.sujecttext = sujecttext;
	}

	public String getSubjectOwnet() {
		return subjectOwnet;
	}

	public void setSubjectOwnet(String subjectOwnet) {
		this.subjectOwnet = subjectOwnet;
	}
	 
		    
		    

}
