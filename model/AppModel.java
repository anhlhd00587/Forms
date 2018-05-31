/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.App;
import entity.connectionHandle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Le Hoang Anh
 */
public class AppModel {

    public boolean submit(App app){
        try {
            String sql = "insert into forms (name,img,price)  values (?,?,?)";
            PreparedStatement preparedStatement = connectionHandle.getInstance().getConnection().prepareStatement(sql);
            preparedStatement.setString(1, app.getName());
            preparedStatement.setString(2, app.getImg());
            preparedStatement.setString(3, app.getPrice());
            preparedStatement.execute();

            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return false;
    }

}
