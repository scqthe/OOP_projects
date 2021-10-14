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

public class Dates {
        
    private static Connection connection;
    private static ArrayList<String> datesList = new ArrayList<String>();
    private static PreparedStatement addDate;
    private static PreparedStatement getAllDates;
    private static ResultSet resultSet;
    
    
    public static void addDate(java.sql.Date date)
    {
        connection = DBConnection.getConnection();
        try
        {
            addDate = connection.prepareStatement("insert into dates (date) values (?)");
            addDate.setDate(1, date);
            addDate.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
    public static ArrayList<java.sql.Date> getAllDates()
    {
        connection = DBConnection.getConnection();
        ArrayList<java.sql.Date> datesList = new ArrayList<java.sql.Date>();
        try
        {
            getAllDates = connection.prepareStatement("select * from dates order by date");
            resultSet = getAllDates.executeQuery();
            
            while(resultSet.next())
            {
                datesList.add(resultSet.getDate(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return datesList;
        
    }
    
}
