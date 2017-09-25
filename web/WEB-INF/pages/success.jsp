<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/19
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/js/jquery.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
跳转成功
<c:forEach items="${users}" var="user">
    ${user.id}--${user.username}
</c:forEach>

<form action="/insert" method="post">
    <input type="text" name="id">
    <input type="text" name="username">
    <input type="submit">
</form>

<script type="text/javascript">
    $(function () {
        $.post("/selectOne", {"id": 1}, function (data) {
            alert(data.id);
        }, "json");
    });
</script>

<script type="text/javascript">
    $(function () {
        $.post("/findAll", function (data) {
            //alert(data.id);
            $.each(data, function (i, n) {
                alert(i + "..." + n.id);
            });
        }, "json");
    });
</script>

<script type="text/javascript">
    $(function () {
        $.post("/selectMap", function (data) {
            //alert(data.id);
            alert(data.id);
        }, "json");
    });
</script>


</body>
</html>
