package br.com.larissa.spring.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.larissa.spring.data.orm.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {

}