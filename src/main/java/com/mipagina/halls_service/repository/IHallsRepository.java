package com.mipagina.halls_service.repository;

import com.mipagina.halls_service.model.Halls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHallsRepository extends JpaRepository<Halls,Long> {
}
