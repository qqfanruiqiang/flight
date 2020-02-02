package com.fh.service.impl;

import com.fh.dao.FlightDao;
import com.fh.model.*;
import com.fh.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    private FlightDao flightDao;

    @Override
    public void queryFlight(Bean<Flight> bean) {
        int count=flightDao.queryCount();
        bean.setRecordsTotal(count);
        bean.setRecordsFiltered(count);
        List<Flight> list=flightDao.queryFlight(bean);
        for (int i = 0; i < list.size(); i++) {
            int typeId=list.get(i).getTypeId();
            int startId=list.get(i).getStartTerminalId();
            int endId=list.get(i).getEndTerminalId();
            Type type=flightDao.queryPlaneType(typeId);
            String str="";
            str=list.get(i).getName()+"<br>"+type.getName()+"<br>"+"("+type.getTypeName()+")";
            list.get(i).setName(str);
            Area area=flightDao.queryNameById(startId);
            String idName=area.getName();
            String pidName=flightDao.queryNameByPid(area.getPid());
            Date startTime = list.get(i).getStartTime();
            SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
            String format = sdf.format(startTime);
            String str2="";
            str2=format+"<br>"+pidName+"<br>"+idName;
            list.get(i).setStartTimeStr(str2);
            Area area1=flightDao.queryNameById(endId);
            String idName1=area1.getName();
            String pidName1=flightDao.queryNameByPid(area1.getPid());
            Date endTime = list.get(i).getEndTime();
            String format1 = sdf.format(endTime);
            String str3="";
            str3=format1+"<br>"+pidName1+"<br>"+idName1;
            list.get(i).setEndTimeStr(str3);
            int flightId=list.get(i).getId();
            Ticket ticket=flightDao.getTicketById(flightId);
            list.get(i).setCount(ticket.getTotalCount());
            list.get(i).setPrice(ticket.getPrice());
        }
        bean.setData(list);
    }
}
