package com.idat.springbootapirestaula.app.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="aulas")
public class Aula {
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String id_aula;
    private String aula;
    private String aforo;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getId_aula() {
		return id_aula;
	}

	public void setId_aula(String id_aula) {
		this.id_aula = id_aula;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public String getAforo() {
		return aforo;
	}

	public void setAforo(String aforo) {
		this.aforo = aforo;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
