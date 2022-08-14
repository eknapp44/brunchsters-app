package com.knapptown.brunchstersapp.repositories;

import com.knapptown.brunchstersapp.entities.Brunch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrunchRepository extends JpaRepository<Brunch, Long> {
}
