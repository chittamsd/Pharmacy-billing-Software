/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author mbish
 */
public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("create table appuser (appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200), dob varchar(50),mobileNumber varchar(50),email varchar(200),username varchar(200),password varchar(200),address varchar(200))");
            stmt.executeUpdate("insert into appuser (userRole,name,dob,mobileNumber,email,username,password,address) values ('Admin','Admin','15-04-01','7735353911','admin@gmail.com','admin','admin','India')");
            stmt.executeUpdate("create table medicine (medicine_pk int AUTO_INCREMENT primary key,medicineName varchar(200),companyName varchar(200),SupplierName varchar(200),UnitOfMeasure varchar(200),MFG varchar(200),EXP varchar(200),PurchasePrice varchar(200),LendingRate varchar(200),MRP varchar(200),SalePrice varchar(200),taxtype varchar(200),taxPercentage varchar(200),quantity varchar(200))");
            JOptionPane.showMessageDialog(null, "Table Created Successfully.");

            // Create a table for suppliers
            stmt.executeUpdate("CREATE TABLE supplier ("
                    + "supplier_pk INT AUTO_INCREMENT PRIMARY KEY,"
                    + "supplierName VARCHAR(200),"
                    + "supplierType VARCHAR(200),"
                    + "address TEXT,"
                    + "mobileNumber VARCHAR(50),"
                    + "altMobile VARCHAR(50),"
                    + "email VARCHAR(200),"
                    + "otherDetails TEXT," // This is the correct column name
                    + "gstType VARCHAR(200),"
                    + "gstNumber VARCHAR(200),"
                    + "tinNumber VARCHAR(200),"
                    + "bankAccountNo VARCHAR(200),"
                    + "ifsc VARCHAR(200),"
                    + "conType VARCHAR(200)"
                    + ")");

            JOptionPane.showMessageDialog(null, "Supplier Table Created Successfully.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
