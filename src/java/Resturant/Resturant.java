/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Resturant;

/**
 *
 * @author Wesley
 */
public class Resturant {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  private String name;
  public Resturant(String name){
     setName(name);
  }
  
}
