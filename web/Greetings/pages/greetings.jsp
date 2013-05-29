<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%--
  Created by IntelliJ IDEA.
  User:
  Date: 5/25/13
  Time: 7:49 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Struts 2 + Spring 3 Integration Sample</title>
</head>
<body>
    <h1>Struts 2 + Spring 3 Integration Sample</h1>
    <s:form action="Greeting">
        <s:property value="greetingService.getGreetings()"/>
    </s:form>
</body>
</html>