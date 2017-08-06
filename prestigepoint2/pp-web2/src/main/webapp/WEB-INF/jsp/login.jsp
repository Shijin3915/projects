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

<form:form method="POST" action="checkLogin.do" modelAttribute="loginUser" >
<span style="align:center"></span>
<fieldset>
		<legend><span style="color:black;"><strong>User Information</strong></span></legend>
	<table width="100%" border="0">
          <tr>
            <td>
            	<p>Email</p>
                <form:input path="email" id="email" /> 
            </td>
            <td>
                <p>Password</p>
                <form:input path="password" id="password" /> 
            </td>
          </tr>
    </table>
         <input type="submit" value="submit">
         </fieldset>
</form:form>
</body>
</html>