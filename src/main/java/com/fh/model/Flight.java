package com.fh.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Flight {
    private int id;
    private String name;
    private int typeId;
    @DateTimeFormat(pattern = "HH:mm")
    private Date startTime;
    private String startTimeStr;
    private String endTimeStr;
    @DateTimeFormat(pattern = "HH:mm")
    private Date endTime;
    private int startTerminalId;
    private int endTerminalId;
    private String startFlight;
    private String endFlight;
    private int count;
    private double price;

    public String getStartTimeStr() {
        return startTimeStr;
    }

    public void setStartTimeStr(String startTimeStr) {
        this.startTimeStr = startTimeStr;
    }

    public String getEndTimeStr() {
        return endTimeStr;
    }

    public void setEndTimeStr(String endTimeStr) {
        this.endTimeStr = endTimeStr;
    }

    public int getStartTerminalId() {
        return startTerminalId;
    }

    public void setStartTerminalId(int startTerminalId) {
        this.startTerminalId = startTerminalId;
    }

    public int getEndTerminalId() {
        return endTerminalId;
    }

    public void setEndTerminalId(int endTerminalId) {
        this.endTerminalId = endTerminalId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStartFlight() {
        return startFlight;
    }

    public void setStartFlight(String startFlight) {
        this.startFlight = startFlight;
    }

    public String getEndFlight() {
        return endFlight;
    }

    public void setEndFlight(String endFlight) {
        this.endFlight = endFlight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
