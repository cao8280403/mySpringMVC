<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/12/26
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%= "sex:"+request.getParameter("sex") %><br>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%= "sex:"+request.getParameter("sex") %><br>

<br> 使用的协议：<%=request.getProtocol() %>
helloworld,${name}
<br/>${url}

</body>
</html>
