<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>form_Document_index2 </title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

   
</head>

<body >


    <div class="container-fluid" style="margin-top: 300px;">

            
            <form method="get">
               <input type="text" class="form-control" name="name" placeholder="name" >
               <input type="password" class="form-control" name="pass" placeholder="pass">
               <input type="hidden" class="form-control" name="sessionid" value="123" >
                  <input type="submit" class="btn" value="ok">
            </form>
         <% 
         try
         {
         String name=request.getParameter("name");
          String pass=request.getParameter("pass");
          
         int a=Integer.parseInt(name);
         // int b=Integer.parseInt(pass);
          int c=1;
          
          for(int i=1;i<=a;i++)
          {
        	c=c*i;  
          }
          out.println(c);
         }
         catch(NullPointerException e)
         {
        	out.println("tr"); 
         }
         catch(NumberFormatException r)
         {
        	 out.println("try again");
         }
          %>
    </div>


</body>

</html>