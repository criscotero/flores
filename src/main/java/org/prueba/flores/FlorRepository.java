package org.prueba.flores;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlorRepository extends JpaRepository<Flor,Integer> {

    List<Flor> findAll();
    List<Flor> findAllByName(String name);
}
