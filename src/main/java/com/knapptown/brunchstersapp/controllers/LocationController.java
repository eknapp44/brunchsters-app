package com.knapptown.brunchstersapp.controllers;

import com.knapptown.brunchstersapp.services.LocationService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

    private LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

}
