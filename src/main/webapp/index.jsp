<%@include file="head.jsp"%>
<html>
<link href="results.css" rel="stylesheet" type="text/css"/>
<body>
<h2>User Display Exercise - Week 1</h2>
<%--<a href = "searchUser">Display All Users</a>--%>
<%--<a href="">Search by Last Name</a>--%>

<script>
    function check(searchType) {
        document.getElementById("answer").value=browser;
        var input = document.createElement("input");
        input.type = "text";
        document.body.appendChild(input);
    }
</script>

<form action="searchUser" name="" id="usersearch" method="GET">
    <table class="searchtable">
        <tr><td><label for="byId">Search User by Last Name</label></td>
            <td><input type="radio" name="searchType" id="byId" value="L" required></td>
            <td><input type="text" name="searchTerm" id="termText" value = "" ></td>
        </tr>
        <tr><td><label for="byId">Display All Users</label></td>
            <td><input type="radio" name="searchType" id="all" value="A" required></td>
        </tr>
        <tr><td class="submitButton"><input type="submit" value="Submit"></td></tr>
    </table>
</form>
</body>
</html>