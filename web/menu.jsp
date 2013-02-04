<%-- 
    Document   : menu
    Created on : Feb 4, 2013, 1:10:36 PM
    Author     : Wesley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Resturant.Resturant;"%>
<%@page import="java.util.ArrayList;"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Items</title>
    </head>
    <body>
        <h1>Thank you for your order here are your totals</h1>
    </body>
    <ul
        <%
        ArrayList<Resturant>orders = (ArrayList)request.getAttribute("orders");
        for(int x = 0; x < orders.size(); x++){
            out.println("<li>" + orders.get(x).getName() + "</li>");
                       }
            out.println("</ul>");
                       
            %>
        
    </ul>
</body>
</html>
