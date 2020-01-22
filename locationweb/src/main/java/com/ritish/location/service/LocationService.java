package com.ritish.location.service;

import java.util.List;

import com.ritish.location.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location updatLocation(Location location);

	void deleteLocation(Location location);

	Location getLocationById(int id);

	List<Location> getAllLocations();
}
