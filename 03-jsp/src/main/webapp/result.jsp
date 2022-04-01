<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
  <body>
    <center>
      <h1>Record for ${record.name}</h1>

      <h2>Main Details</h2>
      <table>
        <tbody>
          <tr>
            <td>Field 1</td>
            <td>${record.field1}</td>
          </tr>
          <tr>
            <td>Field 2</td>
            <td>${record.field2}</td>
          </tr>
          <tr>
            <td>Field 3</td>
            <td>${record.field3}</td>
          </tr>
        </tbody>
      </table>

      <h2>Other Details</h2>
      <table>
        <tbody>
          <c:forEach items="${otherDetails}" var="detail">
            <tr>
              <td>${detail.recordTypeField.name}</td>
              <td>${detail.value}</td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
      <p>
        <a href="Home"> Return to home page </a>
      </p>
    </center>
  </body>
</html>
