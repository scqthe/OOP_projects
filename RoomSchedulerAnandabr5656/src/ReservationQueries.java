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
    
public class ReservationQueries {

    private static Connection connection;
    private static ArrayList<String> reservationsList = new ArrayList<String>();
    private static PreparedStatement addReservationEntry;
    private static PreparedStatement deleteReservation;
    private static PreparedStatement getReservations;
    private static ResultSet resultSet;
    
    public static void addReservationEntry(String faculty, String room, Date date, int seats, Timestamp timestamp)
    {
        connection = DBConnection.getConnection();
        try
        {
            
            addReservationEntry = connection.prepareStatement("insert into reservations (faculty, room, date, seats, timestamp) values (?, ?, ?, ?, ?)");
            addReservationEntry.setString(1, faculty);
            addReservationEntry.setString(2, room);
            addReservationEntry.setString(3, date.toString());
            addReservationEntry.setString(4, Integer.toString(seats));
            addReservationEntry.setString(5, timestamp.toString());
            addReservationEntry.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
    public static ArrayList<ReservationEntry> getReservationsByDate()
    {
        connection = DBConnection.getConnection();
        ArrayList<ReservationEntry> reservationsList = new ArrayList<ReservationEntry>();
        try
        {
            getReservations = connection.prepareStatement("select * from reservations order by date");
            resultSet = getReservations.executeQuery();
            
            while(resultSet.next())
            {
                String faculty = resultSet.getString("faculty");
                String room = resultSet.getString("room");
                java.sql.Date date = resultSet.getDate("date");
                int seats = resultSet.getInt("seats");
                Timestamp timestamp = resultSet.getTimestamp("timestamp");
                ReservationEntry returnEntry = new ReservationEntry(faculty, room, date, seats, timestamp);
                
                reservationsList.add(returnEntry);
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return reservationsList;
        
    }
    
    
    public static ArrayList<ReservationEntry> getReservationsByFaculty()
    {
        connection = DBConnection.getConnection();
        ArrayList<ReservationEntry> reservationsList = new ArrayList<ReservationEntry>();
        try
        {
            getReservations = connection.prepareStatement("select * from reservations order by faculty");
            resultSet = getReservations.executeQuery();
            
            while(resultSet.next())
            {
                String faculty = resultSet.getString("faculty");
                String room = resultSet.getString("room");
                java.sql.Date date = resultSet.getDate("date");
                int seats = resultSet.getInt("seats");
                Timestamp timestamp = resultSet.getTimestamp("timestamp");
                ReservationEntry returnEntry = new ReservationEntry(faculty, room, date, seats, timestamp);
                
                reservationsList.add(returnEntry);
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return reservationsList;
        
    }
    
//    public static deleteReservation()
//    FINAL PROJECT
}
