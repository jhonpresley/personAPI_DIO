package one.digitalinovation.personAPI.repository;

import one.digitalinovation.personAPI.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
