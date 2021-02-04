<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      
      <form action="nary">
         <input type="text" placeholder="userType" name="userType">
         <input type="text" placeholder="addWord"   name="word">
         <input type="text" placeholder="addMeaning" name="meaning"><br>
         <hr>
         <input type="text" placeholder="getMeaning" name="getMeaning"><br>
         <hr>
         <input type="submit">
         
      </form>
      <%
      Object o=request.getAttribute("meaning");
      out.println(o);
      %>
</body>
</html>