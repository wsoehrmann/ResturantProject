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
    <h1>Your bill before tax and tip is</h1>
     <p>: 
            <%
                Object objTotal = request.getAttribute("Total");
                String billTotal = "";
                if (objTotal != null) {
                    billTotal = objTotal.toString();

                    out.print(billTotal);
                }
            %>

        </p>
    
    
    <h1>Your bill with tax is</h1>
    
     <p>: 
            <%
                Object objWithTip = request.getAttribute("TotalWithTip");
                String totalWithTip = "";
                if (objWithTip != null) {
                    totalWithTip = objWithTip.toString();

                    out.print(totalWithTip);
                }
            %>

        </p>
    
    <h1>Your bill with tax and tip</h1>
    
     <p>: 
            <%
                Object objTaxedTotal = request.getAttribute("TotalAfterTax");
                String totalAfterTax = "";
                if (objTaxedTotal!= null) {
                    totalAfterTax = objTaxedTotal.toString();

                    out.print(totalAfterTax);
                }
            %>

        </p>
    
</body>
</html>
