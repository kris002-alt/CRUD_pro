package org.example.CRUD_Program.repo;

import org.example.CRUD_Program.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User, Long> {

}
