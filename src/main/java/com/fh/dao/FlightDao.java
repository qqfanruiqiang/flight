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

    List<Area> xiala1();

    List<Area> xiala2(int id);

    List<Area> xiala3(int id);

    List<Area> xialaa();

    List<Area> xialab(int id);

    List<Area> xialac(int id);

    List<Type> queryJixing();

    List<TicketName> queryJipiao();

    void addflight(Flight flight);

    void addJipiao(Flight flight);
}
