/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.springlab1;

/**
 *
 * @author Treetacle
 */
public class CalculatorForm {
    private double x;
    private double y;
    private String opt;
    private double wynik;

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }   
    
    public double getY() {
        return y;
    }
    
    public String getOpt() {
        return opt;
    }

    public void setOpt(String opt) {
        this.opt = opt;
    }
    
    public double wynik() {
        wynik = 0;
        if (opt.equals("+")) wynik = x + y;
        if (opt.equals("-")) wynik = x - y;
        if (opt.equals("*")) wynik = x * y;
        if (opt.equals("/")) wynik = x / y;

        return wynik;
    }
}
