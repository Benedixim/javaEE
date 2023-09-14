<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= new java.util.Date() %>
</h1>

<p>
    <%
        java.util.Date now = new java.util.Date();
        String someString = "Tekywaя data: " + now;

    %>
    <%= someString%>
    

</p>
<p >
    <%@ page import="java.util.Date, com.logic.Test"
    %>

    <%= new Date()  %>

    <%
        Test clas = new Test();
        for (int i = 0; i < 10; i++) {
            out.println("<p>" + "Я рад " + i + "-раз" + "</p>");
        }
    %>

    <%= clas.getInfo()%>
</p>

<p>
    <% String name = request.getParameter("name"); %>
    <%= "Я тута " + name%>
</p>

<form action="hello-servlet">
    <label for="size">Количество:</label>
    <input type="number" name="kol" id="size">
    <br>
    <label for="lines">Размер:</label>
    <input type="number" name="px" id="lines">
    <br>
    <label for="color">Цвет:</label>
    <input type="color" name="color" id="color">
    <br>
    <button type="submit">Generate text</button>
</form>

<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>