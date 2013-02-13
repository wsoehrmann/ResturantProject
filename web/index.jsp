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

        <script type="text/javascript" language="JavaScript">
            
            function checkCheckBoxes(theForm) {
                if (
                    theForm.checkbox_1.checked == false &&
                    theForm.checkbox_2.checked == false &&
                    theForm.checkbox_3.checked == false && 
                    theForm.checkbox_4.checked == false &&
                    theForm.checkbox_5.checked == false)
                {
                    alert ('You didn\'t choose any of the checkboxes!');
                    return false;
                } else { 	
                    return true;
                }
            }
            
        </script> 

    </head>
    <body>
        <H4>Welcome to Hal's House of Ham</h>
        <h1>Menu</h1>
        <form  id="orderform" name="orderform" method="POST "action="OrderController" onsubmit="return validateRect()">


            <input type="checkbox" name="menuitem1" value="2.99">Taco 2.99<br>
            <input type="checkbox" name="menuitem2" value="4.99">Cheeseburger 4.99<br>
            <input type="checkbox" name="menuitem3" value="1.99">Fries 1.99<br>
            <input type="checkbox" name="menuitem4" value="0.99">Soda .99<br>
            <input type="checkbox" name="menuitem5" value="0.69">Milk .69<br>



            <input type="submit" value="Submit" name="submit" />





        </form>
</body>
</html>
