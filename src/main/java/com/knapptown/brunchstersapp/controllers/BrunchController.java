package com.knapptown.brunchstersapp.controllers;

import com.knapptown.brunchstersapp.services.BrunchService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrunchController {

    private BrunchService brunchService;

    public BrunchController(BrunchService brunchService) {
        this.brunchService = brunchService;
    }

}
