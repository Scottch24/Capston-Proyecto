/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Miguel
 */
public class FormasPago {

    private int idFormapago;
    private String FormaPägo;

    public FormasPago() {
    }

    public FormasPago(int idFormapago, String FormaPägo) {
        this.idFormapago = idFormapago;
        this.FormaPägo = FormaPägo;
    }

    public int getIdFormapago() {
        return idFormapago;
    }

    public void setIdFormapago(int idFormapago) {
        this.idFormapago = idFormapago;
    }

    public String getFormaPägo() {
        return FormaPägo;
    }

    public void setFormaPägo(String FormaPägo) {
        this.FormaPägo = FormaPägo;
    }

    
    
    
}
