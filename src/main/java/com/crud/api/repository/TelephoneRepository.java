package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Telephone;

public interface TelephoneRepository extends JpaRepository<Telephone, Long>{

}
