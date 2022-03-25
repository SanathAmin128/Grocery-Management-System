/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Bill;
import java.util.*;
/**
 *
 * @author SANATH
 */
public class BillDao
{
    public static String getId()
    {
        int id=1;
        try
        {
            ResultSet rs=DbOperation.getData("select max(id) from bill");
            if(rs.next())
            {
                id=rs.getInt(1);
                id=id+1;
            }
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    
    public static void save(Bill bill)
    {
        String query="insert into bill values('"+bill.getId()+"','"+bill.getName()+"','"+bill.getMobileNumber()+"','"+bill.getEmail()+"','"+bill.getDate()+"','"+bill.getTotal()+"')";
        DbOperation.setDataorDelete(query, "Bill Details Added Successfully");
    }
    
   public static ArrayList<Bill> getAllRecords(String date)
   {
       ArrayList<Bill> arrayList=new ArrayList<>();
       try
       {
           ResultSet rs=DbOperation.getData("select * from bill where date like '%"+date+"%'");
           while(rs.next())
           {
               Bill bill=new Bill();
               bill.setId(rs.getInt("id"));
               bill.setName(rs.getString("name"));
               bill.setMobileNumber(rs.getString("mobileNumber"));
               bill.setEmail(rs.getString("email"));
               bill.setDate(rs.getString("date"));
               bill.setTotal(rs.getString("total"));
               arrayList.add(bill);
           }
       }
       catch(Exception e)
       {
           
       }
       return arrayList;
   }
}
