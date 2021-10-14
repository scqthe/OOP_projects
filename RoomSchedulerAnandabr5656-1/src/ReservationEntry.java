/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnandRajan
 */

import java.util.Date;
import java.sql.Timestamp;

public class ReservationEntry {
    
    public String faculty;
    public String room;
    public Date date;
    public int seats;
    public Timestamp timestamp;
    
    public ReservationEntry(String faculty, String room, Date date, int seats, Timestamp timestamp)
    {
        if (seats < 0)
            throw new IllegalArgumentException("Seats must be a positive number");
                    
        this.faculty = faculty;
        this.room = room;
        this.date = date;
        this.seats = seats;
        this.timestamp = timestamp;
    }
    
    public String getFacultyName() {return this.faculty;}
    public String getRoomName() {return this.room;}
    public Date getReservationDate() {return this.date;}
    public int getReservedSeats() {return this.seats;}
    public Timestamp getReservationTime() {return this.timestamp;}
    
    @Override
    public String toString()
    {
        String output = String.format("%s reserved Room %s on %s", getFacultyName(), getRoomName(), getReservationDate());
        return output;
    }
 
}
