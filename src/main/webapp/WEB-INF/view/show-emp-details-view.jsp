<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2> Dear employee, you are welcome!!!</h2>
<br>
<br>

<%-- Your name: ${param.employeeName}--%>
Your name: ${employee.name}
<br>

Your surname: ${employee.surname}
<br>

Your salary: ${employee.salary}
<br>

Your department: ${employee.department}
<br>

Your car: ${employee.carBrand}
<br>

Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}"><!--переменная  lang будет принимать столько значений,
    сколько укажет пользоатель. forEach - значит для каждого элемента в массиве languages-->
    <li>
        ${lang}
    </li>
    </c:forEach>
</ul>

<a href="/employee/">Back</a>

</body>
</html>