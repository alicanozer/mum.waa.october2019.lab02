<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

</head>
<body>
<%
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/InputForm.jsp");
    dispatcher.forward(request, response);
%>

</body>
</html>