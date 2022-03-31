<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
    <body>
        <center>
            <h1>Available Brands</h1>

            <p>We have <br><br></p>
            <c:forEach var = "i" items="${brands}">
                Item <c:out value = "${i}"/><p>
            </c:forEach>
        </center>
    </body>

</html>