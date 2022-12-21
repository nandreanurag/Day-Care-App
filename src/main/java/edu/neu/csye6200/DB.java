/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

import java.sql.*;

/**
 * DB Class - to connect and query from the database.
 * 
 * <code> 
 * db = DB.getObj();                // gives instance of DB
 * db.query("query-statement");     // gives resultant set
 * </code>
 * 
 * @author dubey
 */
public class DB {
        static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/ood";
        static final String USER = "root";
        static final String PASS = "root";
        public Connection conn;
        private Statement statement;

        public static DB db;

         DB() {
                createConnection();
        }

        /**
         * Connect to database
         */
        private void createConnection() {
                try {
                    
                        conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        statement = conn.createStatement();

                } catch (SQLException e) {
                        System.out.print(e.toString());
                }
        }

        /**
         * Query database
         * 
         * @param queryStatement
         * @return
         */
        public ResultSet query(String queryStatement) {
                try {
                        ResultSet rs = statement.executeQuery(queryStatement);
                        return rs;
                } catch (Exception e) {
                        System.out.print(e.toString());
                        return null;
                }
        }

        public int update(String queryStatement) {
                try {
                        int rs = statement.executeUpdate(queryStatement, Statement.RETURN_GENERATED_KEYS);
                        return rs;
                } catch (Exception e) {
                        System.out.print(e.toString());
                        return -1;
                }
        }
        
   

        public Statement getStatement() {
                return statement;
        }

        public int getGeneratedKey() {
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                        int primkey = -1;

                        if (generatedKeys.next()) {
                                primkey = generatedKeys.getInt(1);
                        }

                        return primkey;
                } catch (SQLException e) {
                        e.printStackTrace();
                        return -1;
                }
        }

        /**
         * Singleton method to get instance
         * 
         * @return
         */
        public static DB getObj() {
                if (db == null) {
                        db = new DB();
                }
                return db;
        }

}