<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 11/10/2026
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session Detail</title>
</head>
<body>
<h1>Study Session Detail</h1>
<p>Subject ID: ${session.subjectId}</p>
<p>Duration: ${session.minutes} minutes</p>
<p>Notes: ${session.notes}</p>

<a href="${pageContext.request.contextPath}/sessions">
    Back to Sessions
</a>
</body>
</html>
