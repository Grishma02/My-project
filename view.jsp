<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<html>
<head>
<script language="javascript">
function editRecord(id){
    var f=document.form;
    f.method="post";
    f.action='edit.jsp?id='+id;
    f.submit();
}
</script>
</head>
<body>


<%
String id = request.getParameter("userId");
String driverName = "org.h2.Driver";
String connectionUrl = "jdbc:h2:tcp://localhost/~/test";
String userId = "sa";
String password = "";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>Products List</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="Orange">
<td><b>Product ID</b></td>
<td><b>Product Name></b></td>
<td><b>Product Price</b></td>
<td><b>Availability</b></td>
<td><b>Product Description</b></td>
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl, userId, password);
statement=connection.createStatement();
String sql ="select*from Product;";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<br> 
<form method="post" name="form">
<tr bgcolor="Pink">

<td><%=resultSet.getString("pid") %></td>
<td><%=resultSet.getString("pname") %></td>
<td><%=resultSet.getString("pprice") %></td>
<td><%=resultSet.getString("avail") %></td>
<td><%=resultSet.getString("pdesc") %></td>
<td><input type="button" name="edit" value="Edit" style="background-color:green;font-weight:bold;color:white;" onclick="editRecord(<%=resultSet.getString("pid")%>);"></td>
<td><input type="button" name="delete" value="Delete" style="background-color:orange;font-weight:bold;color:white;" onclick="deleteRecord(<%=resultSet.getString("pid")%>);"></td>

</tr>

<% 
}
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</form>
</body>
</html>