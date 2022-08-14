package com.knapptown.brunchstersapp.services;

import com.knapptown.brunchstersapp.repositories.LocationRepository;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

}
