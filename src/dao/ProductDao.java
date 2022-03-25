/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import model.Product;
import dao.DbOperation;
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author SANATH
 */
public class ProductDao
{
    public static void save(Product product)
    {
        String query="insert into product(name,category,price,mfgdate,expdate) values('"+product.getName()+"','"+product.getCategory()+"','"+product.getPrice()+"','"+product.getMfgdate()+"','"+product.getExpdate()+"')";
        DbOperation.setDataorDelete(query,"Product Added Successfully");
    }
    
    public static ArrayList<Product> getAllRecords()
    {
        ArrayList<Product> arrayList=new ArrayList<>();
        try
        {
            ResultSet rs=DbOperation.getData("select * from product");
            while(rs.next())
            {
                Product product=new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setPrice(rs.getString("price"));
                product.setMfgdate(rs.getString("mfgdate"));
                product.setExpdate(rs.getString("expdate"));
                arrayList.add(product);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void update(Product product)
    {
        String query="update product set name='"+product.getName()+"',category='"+product.getCategory()+"',price='"+product.getPrice()+"',mfgdate='"+product.getMfgdate()+"',expdate='"+product.getExpdate()+"' where id='"+product.getId()+"'";
        DbOperation.setDataorDelete(query,"Product Updated Successfully");
    }
    
    public static void delete(String id)
    {
        String query="delete from product where id='"+id+"'";
        DbOperation.setDataorDelete(query,"Product Deleted Successfully");
    }
    
    public static ArrayList<Product> getAllRecordsByCategory(String category)   //to display all items of a category
    {
        ArrayList<Product> arrayList=new ArrayList<>();
        try
        {
            ResultSet rs=DbOperation.getData("select * from product where category='"+category+"'");
            while(rs.next())
            {
                Product product=new Product();
                product.setName(rs.getString("name"));
                arrayList.add(product);
            }    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static ArrayList<Product> filterProductByname(String name,String category)   //to display all items of a category
    {
        ArrayList<Product> arrayList=new ArrayList<>();
        try
        {
            ResultSet rs=DbOperation.getData("select * from product where name like '%"+name+"%' and category ="+category+"'");
            while(rs.next())
            {
                Product product=new Product();
                product.setName(rs.getString("name"));
                arrayList.add(product);
            }    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static Product getProductByname(String name)
    {
        Product product=new Product();
        try
        {
             ResultSet rs=DbOperation.getData("select * from product where name='"+name+"'");
             while(rs.next())
            {
                product.setName(rs.getString(2));
                product.setCategory(rs.getString(3));
                product.setPrice(rs.getString(4));
            } 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return product;
    }
}
