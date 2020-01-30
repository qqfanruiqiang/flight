package com.fh.service.impl;

import com.fh.dao.FlightDao;
import com.fh.model.*;
import com.fh.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    private FlightDao flightDao;

}
