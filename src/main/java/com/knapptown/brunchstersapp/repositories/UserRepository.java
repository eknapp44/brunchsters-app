package com.knapptown.brunchstersapp.repositories;

import com.knapptown.brunchstersapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
