package com.fh.dao;

import com.fh.model.*;

import java.util.List;

public interface FlightDao {
    int queryCount();

    List<Flight> queryFlight(Bean<Flight> bean);

    Type queryPlaneType(int typeId);

    Area queryNameById(int startId);

    String queryNameByPid(int pid);

    Ticket getTicketById(int flightId);
}
