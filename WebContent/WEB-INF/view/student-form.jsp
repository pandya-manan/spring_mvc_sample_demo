<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<form:form action="processForm" modelAttribute="student">
First Name: <form:input path="firstName"/>
Last Name: <form:input path="lastName"/>
<br><br>

Country: 
<form:select path="country">
<form:options items="${student.countryOptions}"/>

</form:select>

<br><br>
Favorite Language: <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguages}"/>

<br><br>

Operating Systems: 
Linux <form:checkbox path="operatingSystem" value="Linux"/>
Windows <form:checkbox path="operatingSystem" value="Windows"/>
Mac OS  <form:checkbox path="operatingSystem" value="Mac OS"/>


<input type="submit" value="Submit"/>
</form:form>
</body>


</html>