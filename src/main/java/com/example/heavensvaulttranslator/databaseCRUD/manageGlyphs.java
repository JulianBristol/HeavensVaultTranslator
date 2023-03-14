package com.example.heavensvaulttranslator.databaseCRUD;

import com.example.heavensvaulttranslator.DatabaseConnection;
import com.example.heavensvaulttranslator.model.HVT_Translation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class manageGlyphs {
    private static final String SQL_CREATE_STMT = "INSERT INTO translations (ancientGlyphs, translation, isConfirmed, isMarked) VALUES (?, ?, ?, ?)";
    private static final String SQL_READ = "SELECT * FROM translations WHERE translation LIKE ? and isMarked IN (?,1) AND isConfirmed IN (?,1)";
    private static final String SQL_READ_ANCIENT = "SELECT * FROM translations WHERE ancientGlyphs LIKE ? and isMarked IN (?,1) AND isConfirmed IN (?,1)";
    private static final String SQL_UPDATE = "UPDATE translations SET ancientGlyphs = ?, translation = ?, isConfirmed = ?, isMarked = ? WHERE translationID = ?";
    private static final String SQL_SELECT = "SELECT * FROM translations WHERE translationID = ?";
    private static final String SQL_DELETE_STMT = "DELETE FROM translations WHERE translationID = ?";
    private static final String SQL_DROP_TABLE = "DROP TABLE translations";
    private static final String SQL_CREATE_TABLE = "CREATE TABLE `translations` (\n" +
            "  `translationID` int NOT NULL AUTO_INCREMENT,\n" +
            "  `ancientGlyphs` varchar(45) NOT NULL,\n" +
            "  `translation` varchar(65) DEFAULT NULL,\n" +
            "  `isConfirmed` tinyint NOT NULL DEFAULT '0',\n" +
            "  `isMarked` tinyint NOT NULL DEFAULT '0',\n" +
            "  PRIMARY KEY (`translationID`)\n" +
            ") ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci\n";

    public void revertApp(){
        try{
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.getConnection();
            Statement stmt = connection.createStatement();
            stmt.execute(SQL_DROP_TABLE);
            stmt.execute(SQL_CREATE_TABLE);
            System.out.println("Application reset");
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Failed to revert the application");
        }
    }
    public void insertTranslation(HVT_Translation translation){
        try{
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.getConnection();
            PreparedStatement prepStmt = connection.prepareStatement(SQL_CREATE_STMT);
            prepStmt.setString(1, translation.getAncientGlyph());
            prepStmt.setString(2, translation.getTranslation());
            prepStmt.setInt(3, translation.getIsConfirmed());
            prepStmt.setInt(4, translation.getIsMarked());
            prepStmt.execute();
            System.out.println("Translation inserted: " + translation.toString());
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Failed to insert a translation into the database");
        }
    }

    public ObservableList<HVT_Translation> getTranslations(String search, boolean marked, boolean confirmed){
        ObservableList<HVT_Translation> list = FXCollections.observableArrayList();
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.getConnection();
            PreparedStatement prepStmt = connection.prepareStatement(SQL_READ);
            prepStmt.setString(1, "%"+search+"%");
            prepStmt.setInt(2, marked ? 1 : 0);
            prepStmt.setInt(3, confirmed ? 1 : 0);
            ResultSet resultSet = prepStmt.executeQuery();
            while(resultSet.next()){
                list.add(new HVT_Translation(
                        resultSet.getInt("translationID"),
                        resultSet.getString("ancientGlyphs"),
                        resultSet.getString("translation"),
                        resultSet.getInt("isMarked"),
                        resultSet.getInt("isConfirmed")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to retrieve any data from the database while appending information to the tableview");
        }
        return list;
    }

    public ObservableList<HVT_Translation> getAncients(String search, boolean marked, boolean confirmed){
        ObservableList<HVT_Translation> list = FXCollections.observableArrayList();
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.getConnection();
            PreparedStatement prepStmt = connection.prepareStatement(SQL_READ_ANCIENT);
            prepStmt.setString(1, "%"+search+"%");
            prepStmt.setInt(2, marked ? 1 : 0);
            prepStmt.setInt(3, confirmed ? 1 : 0);
            ResultSet resultSet = prepStmt.executeQuery();
            while(resultSet.next()){
                list.add(new HVT_Translation(
                        resultSet.getInt("translationID"),
                        resultSet.getString("ancientGlyphs"),
                        resultSet.getString("translation"),
                        resultSet.getInt("isMarked"),
                        resultSet.getInt("isConfirmed")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to retrieve any data from the database while appending information to the tableview");
        }
        return list;
    }
    public void deleteTranslation(int translationID){
        try{
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.getConnection();
            PreparedStatement prepStmt = connection.prepareStatement(SQL_DELETE_STMT);
            prepStmt.setInt(1, translationID);
            prepStmt.execute();
            System.out.println("Translation deleted");
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Failed to delete the translation with a translationID of " + translationID);
        }
    }
    public void updateTranslation(int translationID, String ancientGlyph, String translation, int isConfirmed, int isMarked) throws NullPointerException{
        try{
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.getConnection();
            if (getTranslation(translationID) == null){
                throw new NullPointerException();
            }
            PreparedStatement prepStmt = connection.prepareStatement(SQL_UPDATE);
            prepStmt.setString(1, ancientGlyph);
            prepStmt.setString(2, translation);
            prepStmt.setInt(3, isConfirmed);
            prepStmt.setInt(4, isMarked);
            prepStmt.setInt(5, translationID);
            prepStmt.execute();
            System.out.println("Translation updated");
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Failed to update translationID " + translationID + " in the database");
        }
    }
    public HVT_Translation getTranslation(int translationID) throws NullPointerException{
        HVT_Translation translation = null;
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.getConnection();
            PreparedStatement prepStmt = connection.prepareStatement(SQL_SELECT);
            prepStmt.setInt(1, translationID);
            ResultSet resultSet = prepStmt.executeQuery();
            while(resultSet.next()){
                translation = new HVT_Translation(
                        resultSet.getInt("translationID"),
                        resultSet.getString("ancientGlyphs"),
                        resultSet.getString("translation"),
                        resultSet.getInt("isMarked"),
                        resultSet.getInt("isConfirmed"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to retrieve character information from the database");
        }
        return translation;
    }
}
