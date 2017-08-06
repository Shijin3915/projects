<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>

<form:form method="POST" action="checkRegistration.do" modelAttribute="registrationUser" >
<span style="align:center"></span>

		
	<table width="100%" border="0">
          <tr>
            <td>
            	<p>Firstname</p>
                <form:input path="firstname" id="firstname" /> 
            </td>
            <td>
                <p>Lastname</p>
                <form:input path="lastname" id="lastname" /> 
            </td>
            <td>
                <p>email</p>
                <form:input path="email" id="email" /> 
            </td>
            <td>
                <p>password</p>
                <form:input path="password" id="password" /> 
            </td>
          </tr>
    </table>
         <input type="submit" value="submit">
        
</form:form>
</body>
</html>