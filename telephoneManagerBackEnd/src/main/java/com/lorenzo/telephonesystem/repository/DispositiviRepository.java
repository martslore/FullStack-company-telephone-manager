package com.lorenzo.telephonesystem.repository;

import com.lorenzo.telephonesystem.model.Dispositivi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispositiviRepository extends JpaRepository<Dispositivi,Integer> {
}
