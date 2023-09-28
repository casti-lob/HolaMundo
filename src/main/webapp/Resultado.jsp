<%@page import="utility.Calculadora"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Calculadora c = new Calculadora();
	
		double num1 = Double.parseDouble(request.getParameter("num1"));
		double num2 = Double.parseDouble(request.getParameter("num2"));
		int ope = Integer.parseInt(request.getParameter("operator"));
		double result = 0;
		c.setnum1(num1);
		if(ope ==1){
			result = num1+num2;
		}else{
			result = num1-num2;
		}
		out.println("El resultado es "+result);
	%>
	<a href="Calculadora.html"><button>Atras</button></a>
</body>
</html>