/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;

import edu.ijse.mvc.db.DBConnection;
import java.sql.SQLException;


/**
 *
 * @author dilshara
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws edu.ijse.mvc.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        // TODO code application logic here
        DBConnection.getInstance().getConnection();
    }

   
    }
    

