package Model;

import Resturant.Resturant;
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
   private ArrayList<Resturant> orders  = new ArrayList<Resturant>();
   private String[] foods;
   public ResturantModel(String[] foods){
   this.foods = foods;
   }
   public ArrayList<Resturant> processOrders(){
       for(int x = 0; x<foods.length; x++){
           Resturant r = new Resturant(foods[x]);
           orders.add(r);
       }
       return orders;
   }
   
}
