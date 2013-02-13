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

    private Double tip;
    private Double tax;
    private Double totalBeforeTax;
    private Double totalAfterTax;
    private Double TIP_RATE = .15;
    private Double TAX_RATE = .05;
    private Double menuItem1;

    public Double getTIP_RATE() {
        return TIP_RATE;
    }

    public void setTIP_RATE(Double TIP_RATE) {
        this.TIP_RATE = TIP_RATE;
    }

    public Double getTAX_RATE() {
        return TAX_RATE;
    }

    public void setTAX_RATE(Double TAX_RATE) {
        this.TAX_RATE = TAX_RATE;
    }

    public Double getMenuItem1() {
        return menuItem1;
    }

    public void setMenuItem1(Double menuItem1) {
        this.menuItem1 = menuItem1;
    }

    public Double getMenuItem2() {
        return menuItem2;
    }

    public void setMenuItem2(Double menuItem2) {
        this.menuItem2 = menuItem2;
    }

    public Double getMenuItem3() {
        return menuItem3;
    }

    public void setMenuItem3(Double menuItem3) {
        this.menuItem3 = menuItem3;
    }

    public Double getMenuItem4() {
        return menuItem4;
    }

    public void setMenuItem4(Double menuItem4) {
        this.menuItem4 = menuItem4;
    }

    public Double getMenuItem5() {
        return menuItem5;
    }

    public void setMenuItem5(Double menuItem5) {
        this.menuItem5 = menuItem5;
    }
    private Double menuItem2;
    private Double menuItem3;
    private Double menuItem4;
    private Double menuItem5;

    public Double getTip() {
        return totalBeforeTax * TIP_RATE;
    }

    public void setTip(Double tip) {
        this.tip = tip;
    }

    public Double getTax() {
        return totalBeforeTax * TAX_RATE;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalBeforeTax() {
        return menuItem1 + menuItem2 + menuItem3 + menuItem4 + menuItem5;
    }

    public void setTotalBeforeTax(Double totalBeforeTax) {
        this.totalBeforeTax = totalBeforeTax;
    }

    public Double getTotalAfterTax() {
        return tip + tax + totalBeforeTax;
    }

    public void setTotalAfterTax(Double totalAfterTax) {
        this.totalAfterTax = totalAfterTax;
    }
}
