package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import orm.Cargo;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Long> {

}