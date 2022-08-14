package com.knapptown.brunchstersapp.services;

import com.knapptown.brunchstersapp.repositories.BrunchRepository;
import org.springframework.stereotype.Service;

@Service
public class BrunchService {

    private BrunchRepository brunchRepository;

    public BrunchService(BrunchRepository brunchRepository) {
        this.brunchRepository = brunchRepository;
    }

}
