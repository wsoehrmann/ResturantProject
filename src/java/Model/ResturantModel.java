package Model;

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wesley
 */
public class ResturantModel {

    private double tip;
    private double tax;
    private double totalBeforeTax;
    private double totalAfterTax;
    private double TIP_RATE = .15;
    private double TAX_RATE = .05;
    private double menuItem1;

    public double getTIP_RATE() {
        return TIP_RATE;
    }

    public void setTIP_RATE(double TIP_RATE) {
        this.TIP_RATE = TIP_RATE;
    }

    public double getTAX_RATE() {
        return TAX_RATE;
    }

    public void setTAX_RATE(double TAX_RATE) {
        this.TAX_RATE = TAX_RATE;
    }

    public double getMenuItem1() {
        return menuItem1;
    }

    public void setMenuItem1(double menuItem1) {
        this.menuItem1 = menuItem1;
    }

    public double getMenuItem2() {
        return menuItem2;
    }

    public void setMenuItem2(double menuItem2) {
        this.menuItem2 = menuItem2;
    }

    public double getMenuItem3() {
        return menuItem3;
    }

    public void setMenuItem3(double menuItem3) {
        this.menuItem3 = menuItem3;
    }

    public double getMenuItem4() {
        return menuItem4;
    }

    public void setMenuItem4(double menuItem4) {
        this.menuItem4 = menuItem4;
    }

    public double getMenuItem5() {
        return menuItem5;
    }

    public void setMenuItem5(double menuItem5) {
        this.menuItem5 = menuItem5;
    }
    private double menuItem2;
    private double menuItem3;
    private double menuItem4;
    private double menuItem5;

    public double getTip() {
        return totalBeforeTax * TIP_RATE;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public double getTax() {
        return totalBeforeTax * TAX_RATE;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotalBeforeTax() {
        return menuItem1 + menuItem2 + menuItem3 + menuItem4 + menuItem5;
    }

    public void setTotalBeforeTax(double totalBeforeTax) {
        this.totalBeforeTax = totalBeforeTax;
    }

    public double getTotalAfterTax() {
        return tip + tax + totalBeforeTax;
    }

    public void setTotalAfterTax(double totalAfterTax) {
        this.totalAfterTax = totalAfterTax;
    }
}
