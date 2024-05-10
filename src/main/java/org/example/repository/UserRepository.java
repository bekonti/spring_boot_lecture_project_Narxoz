package org.example.repository;

import org.example.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Person, Long> {

    public Optional<Person> getByUsername(String username);
    boolean existsByUsername(String username);
    public List<Person> getAllByName(String name);


}
