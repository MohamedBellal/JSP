<%--
  Created by IntelliJ IDEA.
  User: Grand Sultan Mohamed
  Date: 21/03/2024
  Time: 00:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books List</title>
</head>
<body>
    <h1>Books List</h1>
    <table>
        <tr>
            <th>Title</th>
            <th>Author</th>
            <th>ISBN</th>
            <th>Quantity</th>
        </tr>
        <c:forEach var="Book" items="${bookList}">
            <tr>
                <td>${Book.title}</td>
                <td>${Book.author}</td>
                <td>${Book.ISBN}</td>
                <td>${Book.quantity}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
