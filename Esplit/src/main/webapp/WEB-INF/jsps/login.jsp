<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
	</head>		

	<body>
	    <tiles:insertAttribute name="header"/>
		<h1><strong>Login Form</strong></h1>
		
		<form:form action="/login" method="post">
			<label>User name:</label> <input type="text" name="username" />
			<label>Password:</label> <input type="password" name="password" />
			<input type="submit"/>
		</form:form>
	</body>
</html>