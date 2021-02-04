<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

       <form action="hi">
       <input type="number" name="id" placeholder="id">
       <input type="text" name="name" placeholder="name">
       <input type="number" name="sal" placeholder="sal"><br/>
       
       <input type="radio" id="insert" name="operation" value="insert">
       <label for="insert">insert</label><br>
       
      <input type="radio" id="update" name="operation" value="update">
      <label for="update">update</label><br>
      
      <input type="radio" id="delete" name="operation" value="delete">
       <label for="delete">delete</label><br>
       
       
       <input type="radio" id="showAll" name="operation" value="showAll">
       <label for="showAll">showAll</label><br>
       
       <input type="submit">
       
       </form>
       

        
</body>
</html>