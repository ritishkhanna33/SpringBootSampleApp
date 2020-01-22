package com.ritish.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ritish.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
