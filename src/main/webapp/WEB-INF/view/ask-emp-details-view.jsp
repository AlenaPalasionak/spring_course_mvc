<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2> Dear employee, please enter your details</h2>
<br><br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br><br>
    Surname<form:input path="surname"/>
    <br><br>
    Salary<form:input path="salary"/>
    <br><br>
    Department<form:select path="department">
    <form:options items="${employee.departments}"/>
</form:select>
    <br><br>

    Which car do you want?
    <br>
    BMW <form:radiobutton path="carBrend" value="BMW"/>
    Audi <form:radiobutton path="carBrend" value="Audi"/>
    Mercedes-Benz <form:radiobutton path="carBrend" value="Mercedes-Benz"/>

    <br><br>
    <input type="submit" value="OK">

</form:form>
</body>
</html>