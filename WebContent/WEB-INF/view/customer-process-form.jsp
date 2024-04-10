<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>
Customer Confirmation Page
</title>
</head>
<body>

The customer is thereby confirmed: ${customer.firstName} ${customer.lastName}
<br>
The customer is entitled to ${customer.freePasses} number of free Passes
<br>
Postal Code received: ${customer.postalCode}
<br>
Course Code applied for: ${customer.courseCode}

</body>
</html>