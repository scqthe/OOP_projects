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

public class RoomQueries {
    
    private static Connection connection;
    private static ArrayList<String> roomsList = new ArrayList<String>();
    private static PreparedStatement addRoom;
    private static PreparedStatement dropRoom;
    private static PreparedStatement getRoomsList;
    private static ResultSet resultSet;
    
    public static void addRoom(RoomEntry room)
    {
        connection = DBConnection.getConnection();
        try
        {
            addRoom = connection.prepareStatement("insert into rooms (name) values (?)");
            addRoom.setString(1, room.name);
            addRoom.setString(2, Integer.toString(room.seats));
            addRoom.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
    public static ArrayList<RoomEntry> getRoomsList()
    {
        connection = DBConnection.getConnection();
        ArrayList<RoomEntry> roomsList = new ArrayList<RoomEntry>();
        try
        {
            getRoomsList = connection.prepareStatement("select * from rooms order by name");
            resultSet = getRoomsList.executeQuery();
            
            while(resultSet.next())
            {
                roomsList.add(new RoomEntry(resultSet.getString(1), resultSet.getInt(2)));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return roomsList;
        
    }
    
    public static void dropRoom(RoomEntry room)     // ADD ON FOR FINAL PROJECT; UNFINISHED
    {
        connection = DBConnection.getConnection();
        try
        {
            dropRoom = connection.prepareStatement("delete from rooms");
            dropRoom.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
}
