package com.sn.atos.repositories;
import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.sn.atos.entities.Movie;
import com.sn.atos.entities.Subscriber;


public interface SubscriberRepository extends Neo4jRepository<Subscriber,Long> {
	@Query("MATCH (s:Subscriber)-[r:Appel]->(t:Subscriber) RETURN s,r,t LIMIT 1")
	Collection<Subscriber> getAll();
	
	Subscriber findByNumero(@Param("numero") String title);

}
