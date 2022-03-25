/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author SANATH
 */
public class CategoryDao
{
    public static void save(Category category)
    {
        String query="insert into category (name) values('"+category.getName()+"')";
        DbOperation.setDataorDelete(query, "Category Added Successfully");
    }
    public static ArrayList<Category> getAllRecords()  //to display what is there in category table 
    {
        ArrayList<Category> arrayList=new ArrayList<>();
        try
        {
            ResultSet rs=DbOperation.getData("select * from category");
            while(rs.next())
            {
                Category category=new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    public static void delete(String id)
    {
        String query="delete from category where id='"+id+"'";
        DbOperation.setDataorDelete(query, "Category Deleted Successfully");
    }
}
