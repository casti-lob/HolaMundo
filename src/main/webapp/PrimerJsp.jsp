<%@page import="utility.Persona"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="utility.FechaActual" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hola mundo</h1>
	<%!int numVisitas =0; %>
	<%=FechaActual.getFechaActual() %>
	
	<%
		Persona p = new Persona("inma", "olias");
		p.setNombre("dddd");
		out.println("Escribiendo en consola" + p.toString());
		
		out.println("<h1>El numero de visitas es"+numVisitas+" </h1>");
	%>
</body>
</html>