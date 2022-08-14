package com.knapptown.brunchstersapp.repositories;

import com.knapptown.brunchstersapp.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
