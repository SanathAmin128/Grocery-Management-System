/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import javax.swing.JOptionPane;
import java.io.*;


/**
 *
 * @author SANATH
 */
public class OpenPdf
{
    public static void openById(String id)
    {
        try
        {
            if((new File("C:\\Users\\SANATH\\Grocery Pdf"+id+".pdf")).exists())
            {
                Process p=Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\SANATH\\Grocery Pdf"+id+".pdf");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "File Not Found");
        }
    }
}
