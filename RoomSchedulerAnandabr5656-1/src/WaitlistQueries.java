/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnandRajan
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Timestamp;

public class WaitlistQueries {
    
    private static Connection connection;
    private static ArrayList<String> waitlist = new ArrayList<String>();
    private static PreparedStatement addWaitlistEntry;
    private static PreparedStatement deleteWaitlistEntry;
    private static PreparedStatement getWaitlist;
    private static ResultSet resultSet;
    
    
    public static void addWaitlistEntry(String faculty, Date date, int seats, Timestamp timestamp)
    {
        connection = DBConnection.getConnection();
        try
        {            
            addWaitlistEntry = connection.prepareStatement("insert into waitlist (faculty, date, seats, timestamp) values (?, ?, ?, ?)");
            addWaitlistEntry.setString(1, faculty);
            addWaitlistEntry.setString(2, date.toString());
            addWaitlistEntry.setString(3, Integer.toString(seats));
            addWaitlistEntry.setString(4, timestamp.toString());
            addWaitlistEntry.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
    public static ArrayList<WaitlistEntry> getWaitlistByDate()
    {
        connection = DBConnection.getConnection();
        ArrayList<WaitlistEntry> waitlist = new ArrayList<WaitlistEntry>();
        try
        {
            getWaitlist = connection.prepareStatement("select * from waitlist order by date");
            resultSet = getWaitlist.executeQuery();
            
            while(resultSet.next())
            {
                String faculty = resultSet.getString("faculty");
                java.sql.Date date = resultSet.getDate("date");
                int seats = resultSet.getInt("seats");
                Timestamp timestamp = resultSet.getTimestamp("timestamp");
                WaitlistEntry returnEntry = new WaitlistEntry(faculty, date, seats, timestamp);
                
                waitlist.add(returnEntry);
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return waitlist;
        
    }
    
    public static ArrayList<WaitlistEntry> getWaitlistByTimestamp()
    {
        connection = DBConnection.getConnection();
        ArrayList<WaitlistEntry> waitlist = new ArrayList<WaitlistEntry>();
        try
        {
            getWaitlist = connection.prepareStatement("select * from waitlist order by timestamp");
            resultSet = getWaitlist.executeQuery();
            
            while(resultSet.next())
            {
                String faculty = resultSet.getString("faculty");
                java.sql.Date date = resultSet.getDate("date");
                int seats = resultSet.getInt("seats");
                Timestamp timestamp = resultSet.getTimestamp("timestamp");
                WaitlistEntry returnEntry = new WaitlistEntry(faculty, date, seats, timestamp);
                
                waitlist.add(returnEntry);
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return waitlist;
        
    }
    
    public static void deleteWaitlistEntry(String faculty, Date date){
    connection = DBConnection.getConnection();
        try
        {
            deleteWaitlistEntry = connection.prepareStatement("delete from waitlist where faculty = ? AND date = ?");
            deleteWaitlistEntry.setString(1, faculty);
            deleteWaitlistEntry.setString(2, date.toString());
            deleteWaitlistEntry.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
}
