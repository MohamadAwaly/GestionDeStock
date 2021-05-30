<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:import url="header.jsp"/>
<p class="test">List of Users</p>

<table class="Users" border="1px solid black">

    <tr class="" style="background: lightblue;
                    border-color: white;">
        <th>Nom</th>
        <th>Prenom</th>
        <th>Email</th>
        <th>Adresse rue</th>
        <th>Numéro</th>
        <th>Ville</th>
        <th>Role</th>
    </tr>
    <c:forEach var="adresse" items="${adresse}">
        <tr>
            <td><c:out value="${ adresse[0] } "/></td>
            <td><c:out value="${ adresse[1] } "/></td>
            <td><c:out value="${ adresse[2] } "/></td>
            <td><c:out value="${ adresse[3] } "/></td>
            <td><c:out value="${ adresse[4] }"/></td>
            <td><c:out value="${ adresse[5] }"/></td>
            <td><c:out value="${ adresse[6] }"/></td>

        </tr>
    </c:forEach>
</table>


<c:import url="footer.jsp"/>