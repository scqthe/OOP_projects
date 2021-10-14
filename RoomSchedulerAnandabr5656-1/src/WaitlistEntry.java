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

public class WaitlistEntry {
    
    public String faculty;
    public Date date;
    public int seats;
    public Timestamp timestamp;
    
    public WaitlistEntry(String faculty, Date date, int seats, Timestamp timestamp)
    {
        if (seats < 0)
            throw new IllegalArgumentException("Seats must be a positive number");
        
        this.faculty = faculty;
        this.date = date;
        this.seats = seats;
        this.timestamp = timestamp;
    }
    
    public String getWaitlistedFaculty() {return this.faculty;}
    public Date getWaitlistedDate() {return this.date;}
    public int getWaitlistedSeats() {return this.seats;}
    public Timestamp getWaitlistedTime() {return this.timestamp;}
    
}
