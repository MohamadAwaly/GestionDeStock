<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:import url="header.jsp"/>
<p>Page de test de connexion avec la DB lister les utilisateurs</p>
<p class="test">List of Users</p>

<table class="table table-striped table-hover" border="1px solid black">
    <thead>
    <tr>
        <th>ID_User</th>
        <th>login</th>
<%--        <th>ID_Role</th>--%>
        <th>lastName</th>
        <th>firstName</th>
        <th>dayOfBirth</th>
        <th>inscriptionDate</th>
        <th>VAT</th>
        <th>mail</th>
        <th>password</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="adresse" items="${adresse}">
        <tr>
            <td><c:out value="${ adresse.idUser } "/></td>
            <td><c:out value="${ adresse.login } "/></td>
<%--            <td><c:out value="${ adresse.rolesByIdRole } "/></td>--%>
            <td><c:out value="${ adresse.lastName } "/></td>
            <td><c:out value="${ adresse.firstName } "/></td>
            <td><c:out value="${ adresse.dayOfBirth } "/></td>
            <td><c:out value="${ adresse.inscriptionDate } "/></td>
            <td><c:out value="${ adresse.vat } "/></td>
            <td><c:out value="${ adresse.mail } "/></td>
            <td><c:out value="${ adresse.password } "/></td>

        </tr>
    </c:forEach>
    </tbody>
</table>

<c:import url="footer.jsp"/>