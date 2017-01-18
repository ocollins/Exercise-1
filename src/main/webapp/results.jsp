<!--testing comments-->
<%@include file="head.jsp"%>

<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="results.css" rel="stylesheet" type="text/css"/>

<body>

<%--TODO Pretty up the results!--%>
    <h2>Search Results: </h2>
    <%--${usersResults}--%>

<table class="resulttable">
    <th>User ID</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Age</th>
    <c:forEach var="user" items="${usersResults}">
        <tr class="displayresults">
            <td>${user.userid}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.age}</td>
        </tr>
    </c:forEach>
</table>



</body>
</html>
