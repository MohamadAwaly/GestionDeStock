<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>

</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>

<%--<form method="post" action="Servlet">--%>
<%--    <input type="submit" value="Envoyer le formulaire">--%>
<%--</form>--%>
<form method="post" action="home">
    <h2>Page home</h2>
    <a href="Servlet">Hello Servlet</a>
    <input type="submit" value="Envoyer le formulaire">
</form>
</body>
</html>