package com.ritish.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ritish.location.entities.Location;
import com.ritish.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository repository;
	
	@Override
	public Location saveLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public Location updatLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);
	}

	@Override
	public Location getLocationById(int id) {
		Optional<Location> optionalLocalRepository= repository.findById(id);
		Location location = optionalLocalRepository.get();
		return location;
	}

	@Override
	public List<Location> getAllLocations() {
		return repository.findAll();
	}

}
