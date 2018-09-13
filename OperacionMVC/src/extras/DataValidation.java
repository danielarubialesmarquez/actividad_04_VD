/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;
import javax.swing.JOptionPane;
public class DataValidation{
    public int stringToInt(String value)
    {
        int res = 0;
        try{
            res = Integer.parseInt(value);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Caracter no valido amiguito");
            res = 0;
        }
        return res;
    }
    public double stringToDouble(String value)
    {
        double res = 0;
        try{
            res = Double.parseDouble(value);
        }catch(NumberFormatException e){
            System.out.println("Data validation");
            JOptionPane.showMessageDialog(null, "Caracter invalido amiguito");
            res = 0;
        }
        return res;
    }
}
/**
 *
 * @author Dani
 */

