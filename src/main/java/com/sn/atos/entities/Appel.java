package com.sn.atos.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "Appel")
public class Appel {
		@GeneratedValue
		@Id
		private long id;
	    private long Nombre_Appel;
	    private long Duree_Appel;

		public long getDuree_Appel() {
			return Duree_Appel;
		}

		public void setDuree_Appel(long duree_Appel) {
			Duree_Appel = duree_Appel;
		}

		private List<String> appels = new ArrayList<>();

	    @StartNode
		private Subscriber source ;

		@EndNode
		private Subscriber destinataire;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public long getNombre_Appel() {
			return Nombre_Appel;
		}

		public void setNombre_Appel(int nombre_Appel) {
			Nombre_Appel = nombre_Appel;
		}

		public List<String> getAppels() {
			return appels;
		}

		public Subscriber getSource() {
			return source;
		}

		public Subscriber getDestinataire() {
			return destinataire;
		}


	}


