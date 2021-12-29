package com.lorenzo.telephonesystem.repository;

import com.lorenzo.telephonesystem.model.Persone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersoneRepository extends JpaRepository<Persone,Integer> {
}

