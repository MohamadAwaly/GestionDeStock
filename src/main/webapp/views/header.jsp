<%--
  Created by IntelliJ IDEA.
  User: Awaly Mohamad
  Date: 25-05-21
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://bootswatch.com/4/flatly/bootstrap.min.css">

    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script type="text/javascript"
            src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script type="text/javascript"
            src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>

    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
            crossorigin="anonymous"></script>

    <script type="text/javascript" src="../resources/js/script.js"></script>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Stock management</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01"
                aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarColor01">
            <ul class="navbar-nav me-auto">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                       aria-haspopup="true" aria-expanded="false">Users</a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="#">add User</a>
                        <a class="dropdown-item" href="#">update user</a>
                        <a class="dropdown-item" href="#">delete user</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Separated link</a>
                    </div>
                </li>
<%--                <li class="nav-item">--%>
<%--                    <a class="nav-link active" href="#">Home--%>
<%--                        <span class="visually-hidden">(current)</span>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--                <li class="nav-item">--%>
<%--                    <a class="nav-link" href="#">Features</a>--%>
<%--                </li>--%>
<%--                <li class="nav-item">--%>
<%--                    <a class="nav-link" href="#">Pricing</a>--%>
<%--                </li>--%>
<%--                <li class="nav-item">--%>
<%--                    <a class="nav-link" href="#">About</a>--%>
<%--                </li>--%>
<%--                <li class="nav-item dropdown">--%>
<%--                    <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"--%>
<%--                       aria-haspopup="true" aria-expanded="false">Dropdown</a>--%>
<%--                    <div class="dropdown-menu">--%>
<%--                        <a class="dropdown-item" href="#">Action</a>--%>
<%--                        <a class="dropdown-item" href="#">Another action</a>--%>
<%--                        <a class="dropdown-item" href="#">Something else here</a>--%>
<%--                        <div class="dropdown-divider"></div>--%>
<%--                        <a class="dropdown-item" href="#">Separated link</a>--%>
<%--                    </div>--%>
<%--                </li>--%>

            </ul>
        </div>
    </div>
</nav>
</body>
</html>