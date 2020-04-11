<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">

<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form  action="/fa">
<table align="center">
    <tr>
        <td><textarea id="words" cols="25" rows="5"  name="msg"></textarea></td>
    </tr>
    <tr>
        <td><button onclick="send()">发送消息</button></td>
    </tr>
</table>
</form>

</body>

</html>