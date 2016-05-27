

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Products</title>
    </head>
    <body>
         <jsp:include page="header.jsp" ></jsp:include>
        
        <div class="container">
		<div class="account">
        <h4 style="font-size:30px; alignment-adjust: middle ">Add Products</h4>
        <form method="get" action="add2.jsp" enctype="multipart/form-data">
        <table style="width: 50%; height: 500px;">
                    
            
           <tr><td>Product Id</td><td><input type="text" name="pid"></td></tr>
            <tr><td>Product Name</td><td><input type="text" name="p_n"></td></tr>
            <tr><td>Category</td><td><input type="text" name="cat"></td></tr>
            <tr><td>Price</td><td><input type="text" name="price"></td></tr>
            <tr><td>Description</td><td><input type="text" name="desc"></td></tr>
            <tr><td>Image</td><td><input type="file" name="img" value="Browse" /></td></tr>
            <tr><td>Date</td><td><input type="date"  name="date"></td></tr>
            <tr><td>Brand</td><td><input type="text" name="bnd"></td></tr>
            <tr><td></td><td><input type="submit" value="Add"></td></tr>
        </table>
        </form>
                </div>
        </div>
        
        
        
        
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
