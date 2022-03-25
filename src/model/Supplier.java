/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SANATH
 */
public class Supplier
{
    private int id;
    private String name;
    private String phno;
    private String supplies;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPhno()
    {
        return phno;
    }

    public void setPhno(String phno)
    {
        this.phno = phno;
    }

    public String getSupplies()
    {
        return supplies;
    }

    public void setSupplies(String supplies)
    {
        this.supplies = supplies;
    }
}
