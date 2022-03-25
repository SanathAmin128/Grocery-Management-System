/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author SANATH
 */
public class tables  //passing create table stmnt
{
    public static void main(String[] args)
    {
        try
        {
            String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(100),email varchar(200),mobileNumber varchar(10),address varchar(100),password varchar(100),status varchar(20),UNIQUE (email))";
            String adminDetails="insert into user(name,email,mobileNumber,address,password,status) values('Admin','admin@gmail.com','1234567890','Banglore','admin123','true')";
            String categoryTable="create table category(id int AUTO_INCREMENT primary key,name varchar(100) primary key)";
            String productTable="create table product(id int AUTO_INCREMENT primary key,name varchar(100),category varchar(100),price varchar(200),mfgdate varchar(20),expdate varchar(20))";
            String supplierTable = "create table supplier(id int AUTO_INCREMENT primary key,name varchar(100),phoneno varchar(10),supplies varchar(100))";
            String BillTable="create table bill(id int primary key,name varchar(100),mobileNumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
            DbOperation.setDataorDelete(userTable, "User Table Created Successfully");
            DbOperation.setDataorDelete(adminDetails, "Admin Details Added Successfully");
            DbOperation.setDataorDelete(categoryTable, "Category Table Created Successfully");
            DbOperation.setDataorDelete(productTable, "Product Table Created Successfully");
            DbOperation.setDataorDelete(supplierTable, "Supplier Table Created Successfully");
            DbOperation.setDataorDelete(BillTable, "Bill Table Created Successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
