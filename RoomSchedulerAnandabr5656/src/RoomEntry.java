/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnandRajan
 */
public class RoomEntry {
    
    public String name;
    public int seats;
    
    public RoomEntry(String name, int seats)
    {
        if (seats < 0)
            throw new IllegalArgumentException("Number of seats must be a positive number");
        
        this.name = name;
        this.seats = seats;
    }
    
    public int getNumSeats()
    {
        return this.seats;
    }
    
    public String getRoomName()
    {
        return this.name;
    }
    
}
