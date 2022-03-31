<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<body>

    <center>
        <h1>Available Types</h1>

        <br>We have <br><br>
        
        <c:out value = "${greetings}"/>

        <c:forEach var="employee" items="${listEmployee}">
            <p>${employee.id} - ${employee.fullName}</p>
    </c:forEach>
    </center>

</body>

</html>