<%--
  Created by IntelliJ IDEA.
  User: ttmescal
  Date: 5/2/23
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza-Time</title>
</head>
<body>


<form action = "/pizza-order" method = "post" >

    <label > Place Order </label >
    <label for="user" > Enter Name </label >
    <input id = "user" name = "delivery" type = "text" >
    <label for="address" > Enter Delivery Address</label >
    <input id = "address" name = "delivery" type = "text" >


    <label for="crust" > Choose Crust </label >
    <select id = "crust" name = "crust" required >
        
        <option value = "Regular" selected > Regular </option >
        <option value = "Thin" > Thin </option >
        <option value = "Deep" > Deep </option >
        
    </select >
    
    <label for="sauce" > Choose Sauce </label >
    <select id = "sauce" name = "sauce" required >
        
        <option value = "Marinara" selected > Marinara </option >
        <option value = "Alfredo" > Alfredo </option >
        <option value = "Buffalo" > Buffalo </option >
        
    </select >

    <label for="size" > Choose Size </label >
    <select id = "size" name = "size" required >

        <option value = "Super Colossal" selected > Super Colossal </option >
        <option value = "Small" > Small </option >
        <option value = "Medium" > Medium </option >
        <option value = "Large" > Large </option >

    </select >

    <label > Choose Toppings </label >
    <label for="pepperoni" > Peperoni </label >
    <input type = "checkbox" name = "toppings" id = "pepperoni" >
    <label for="chicken" > Chicken </label >
    <input type = "checkbox" name = "toppings" id = "chicken" >
    <label for="sausage" > Sausage </label >
    <input type = "checkbox" name = "toppings" id = "sausage" >
    <label for="onion" > Onion </label >
    <input type = "checkbox" name = "toppings" id = "onion" >
    <label for="peppers" > Peppers </label >
    <input type = "checkbox" name = "toppings" id = "peppers" >

<button type="submit">Submit Order</button>
</form >

</body>
</html>
