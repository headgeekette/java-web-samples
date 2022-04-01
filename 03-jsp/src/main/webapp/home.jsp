<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
  
  <body>
    <center>
      <h1>Record List</h1>

      <table>
        <thead>
          <tr>
            <th>ID - NAME</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var = "record" items="${records}">
            <tr>
              <td>
                <c:url value="/FetchRecord" var="fetchRecordURL">
                  <c:param name="recordId" value="${record.id}"/>
                </c:url>
                <a href="<c:out value="${fetchRecordURL}"/>">
                  ${record.id} - ${record.name}
                </a>
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </center>
  </body>

</html>