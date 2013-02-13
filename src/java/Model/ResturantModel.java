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

    private Float tip;
    private Float tax;
    private Float totalBeforeTax;
    private Float totalAfterTax;
    private Float TIP_RATE = .15;
    private Float TAX_RATE = .05;
    private Float menuItem1;

    public Float getTIP_RATE() {
        return TIP_RATE;
    }

    public void setTIP_RATE(Float TIP_RATE) {
        this.TIP_RATE = TIP_RATE;
    }

    public Float getTAX_RATE() {
        return TAX_RATE;
    }

    public void setTAX_RATE(Float TAX_RATE) {
        this.TAX_RATE = TAX_RATE;
    }

    public Float getMenuItem1() {
        return menuItem1;
    }

    public void setMenuItem1(Float menuItem1) {
        this.menuItem1 = menuItem1;
    }

    public Float getMenuItem2() {
        return menuItem2;
    }

    public void setMenuItem2(Float menuItem2) {
        this.menuItem2 = menuItem2;
    }

    public Float getMenuItem3() {
        return menuItem3;
    }

    public void setMenuItem3(Float menuItem3) {
        this.menuItem3 = menuItem3;
    }

    public Float getMenuItem4() {
        return menuItem4;
    }

    public void setMenuItem4(Float menuItem4) {
        this.menuItem4 = menuItem4;
    }

    public Float getMenuItem5() {
        return menuItem5;
    }

    public void setMenuItem5(Float menuItem5) {
        this.menuItem5 = menuItem5;
    }
    private Float menuItem2;
    private Float menuItem3;
    private Float menuItem4;
    private Float menuItem5;

    public Float getTip() {
        return totalBeforeTax * TIP_RATE;
    }

    public void setTip(Float tip) {
        this.tip = tip;
    }

    public Float getTax() {
        return totalBeforeTax * TAX_RATE;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    public Float getTotalBeforeTax() {
        return menuItem1 + menuItem2 + menuItem3 + menuItem4 + menuItem5;
    }

    public void setTotalBeforeTax(Float totalBeforeTax) {
        this.totalBeforeTax = totalBeforeTax;
    }

    public Float getTotalAfterTax() {
        return tip + tax + totalBeforeTax;
    }

    public void setTotalAfterTax(Float totalAfterTax) {
        this.totalAfterTax = totalAfterTax;
    }
}
