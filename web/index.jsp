<%-- 
    Document   : index
    Created on : Feb 4, 2013, 11:57:16 AM
    Author     : Wesley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
        <script type="text/javascript">
              
              function addItem(menuFoods, selectFoods){
                  if(menuFoods.selectedIndex == -1){
                    alert("Please add a food item");
                  }else{
                      if(selectFoods.length ==0){
                          selectFoods.options[0] = new Option(menuFoods.option[menuFoods.selectedIndex].text);
                      }else{
                       selectFoods.add(new Option(menuFoods.options[menuFoods.selectedIndex].text), selectFoods.options[selectFoods.length]);
                       
                      }
                      }
                  }
                  function removeFoodItem(selectFoods){
                      if(selectFoods.selectedIndex == -1){
                          alert("You need to pick a item to remove it");
                          
                      }else{
                          selectFoods.remove(selectFoods.selectedIndex);
                          
                      }
                  }
              function checkSelectedFoods(foods){
                  if(foods.length < 1){
                      alert("Please select a food item");
                      return false;
                  }
                  for (x = 0; x< foods.length; x++){
                      food.options[x].selected = true;
                      
                  }
                  return true;
              }
              </script>
    </head>
    <body>
        <h1>Menu</h1>
        <form id="menu" name="menu" action="Order?action=order" method="POST"onSubmit="return checkSelectedFoods(selectedFoods)">
            <table with="50%" align ="center"border="0">
                <tr><td width="35%" bgcolor="red" align="center">
                        <strong>Food Menu</strong>
                    </td>
                    <td width="30" bgcolor="blue" align="center">
                        
                    </td>
                    <td width="45" bgcolors="red" align="center">
                        
                    </td>                   
                </tr>
                <tr><td width="40" bgcolor="blue" align ="center">
                        <select id="menuFoods" name="menuFoods" size= "6" style= "width:25ex;">
                            <option value value="1">Taco</option>
                            <option>Turkey Burger</option>
                            <option>Pie</option>
                            <option>Fish</option>
                            <option>Soda</option>
                            <option>Cookie</option>
                        </select>
                    </td>
                    <td width="20%"bgcolor="red" align="center">
                        <input type="button" onClick="addFoodItem(menuFoods, selectedFoods)"value="Add ->"/>
                        <br />
                        <input type="button" onClick="removeFoodItem(selectedFoods)" value="<- Remove"/>
                        <br/>
                        <input type="submit" value="Submit" />
                    </td>
                    <td width="35%" bgcolor="red" align="center">
                        <select id="selectedFoods" name="selectedFoods" size="5" multiple="true"style="width:25ex;" >
                            
                        </select>  
                    </td>
                        </tr>
            </table>
        </form>"
    </body>
</html>
