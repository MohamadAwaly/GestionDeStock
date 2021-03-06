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
<%--    <link type="text/css" rel="stylesheet" href="../resources/css/allCss.css">--%>
    <script type="text/javascript" src="../resources/js/script.js"></script>
    <script type="text/javascript" src="../resources/js/jquery-3.5.1.js"></script>
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
            crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#"> Stock management</a>
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
                        <a class="dropdown-item" href="#">Add Role</a>
                        <a class="dropdown-item" href="#">Add User</a>
                        <a class="dropdown-item" href="#">Update user</a>
                        <a class="dropdown-item" href="#">Delete user</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Users list</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                       aria-haspopup="true" aria-expanded="false">Address</a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="#">Add City</a>
                        <a class="dropdown-item" href="#">Add country</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Cities list</a>
                        <a class="dropdown-item" href="#">Countries list</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                       aria-haspopup="true" aria-expanded="true">Product</a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="#">Add product</a>
                        <a class="dropdown-item" href="#">update product</a>
                        <a class="dropdown-item" href="#">delete product</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Product list</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                       aria-haspopup="true" aria-expanded="true">Brands</a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="#">Add brand</a>
                        <a class="dropdown-item" href="#">update brand</a>
                        <a class="dropdown-item" href="#">delete brand</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Brands list</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                       aria-haspopup="true" aria-expanded="true">Categories</a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="#">Add category</a>
                        <a class="dropdown-item" href="#">update category</a>
                        <a class="dropdown-item" href="#">delete category</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Categories list</a>
                    </div>
                </li>

            </ul>
        </div>
    </div>
</nav>