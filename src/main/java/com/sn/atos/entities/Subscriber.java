package com.sn.atos.entities;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Subscriber {
	
	@GeneratedValue
	@Id
	private long id;
	private String numero;
	@Relationship(type="Appel",direction=Relationship.INCOMING)
	
	private List<Appel> appels;
	
	public Subscriber(){
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public List<Appel> getAppels() {
		return appels;
	}

}
