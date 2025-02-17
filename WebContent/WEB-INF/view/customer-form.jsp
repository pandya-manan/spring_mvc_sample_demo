<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Customer Registration Form</title>
<style>
.error {color:red}
</style>
</head>
<body>
Fill out the following form. Asterisk(*) means compulsory fields.
<br>

<form:form action="processForm" modelAttribute="customer">

First name(*): <form:input path="firstName"/>
<form:errors path="firstName" cssClass="error"></form:errors>
<br>
<br>
Last name: <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
<br>
<br>
Number of free passes: <form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error"></form:errors>
<br>
<br>
Postal Code: <form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"></form:errors>
<br>
<br>

Course Code: <form:input path="courseCode"/>
<form:errors path="courseCode" cssClass="error"></form:errors>
<br>
<br>

<input type="submit" value="Submit"/>
</form:form>
</body>
</html>
