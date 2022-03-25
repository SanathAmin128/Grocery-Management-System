/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import model.Supplier;
import dao.DbOperation;
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author SANATH
 */
public class SupplierDao
{
    public static void save(Supplier supplier)
    {
        String query="insert into supplier(name,phoneno,supplies) values('"+supplier.getName()+"','"+supplier.getPhno()+"','"+supplier.getSupplies()+"')";
        DbOperation.setDataorDelete(query,"Supplier Added Successfully");
    }
    public static ArrayList<Supplier> getAllRecords()
    {
        ArrayList<Supplier> arrayList=new ArrayList<>();
        try
        {
            ResultSet rs=DbOperation.getData("select * from supplier");
            while(rs.next())
            {
                Supplier supplier=new Supplier();
                supplier.setId(rs.getInt("id"));
                supplier.setName(rs.getString("name"));
                supplier.setPhno(rs.getString("phoneno"));
                supplier.setSupplies(rs.getString("supplies"));
                arrayList.add(supplier);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void update(Supplier supplier)
    {
        String query="update supplier set name='"+supplier.getName()+"',phoneno='"+supplier.getPhno()+"',supplies='"+supplier.getSupplies()+"' where id='"+supplier.getId()+"'";
        DbOperation.setDataorDelete(query,"Supplier Updated Successfully");
    }
    
    public static void delete(String id)
    {
        String query="delete from supplier where id='"+id+"'";
        DbOperation.setDataorDelete(query,"Supplier Deleted Successfully");
    }
}
