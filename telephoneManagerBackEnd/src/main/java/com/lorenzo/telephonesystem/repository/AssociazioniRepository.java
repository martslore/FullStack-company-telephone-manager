package com.lorenzo.telephonesystem.repository;

import com.lorenzo.telephonesystem.model.Associazioni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociazioniRepository extends JpaRepository<Associazioni,Integer> {
}