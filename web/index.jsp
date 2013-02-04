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
              
              function addItem(menuFoods, selFoods){
                  if(menuFoods.selectedIndex == -1){
                    alert("Please add a food item");
                  }else{
                      if(selectFoods.length ==0){
                          selectFoods.options[0] = new Option(menuFoods.option)
                      }
                  }
              }
              </script>
    </head>
    <body>
        <h1></h1>
    </body>
</html>
