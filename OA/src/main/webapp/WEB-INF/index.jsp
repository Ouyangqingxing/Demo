<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="static/js/jQuery-2.2.4.min.js" ></script>
        <script type="text/javascript" src="static/js/index.js" ></script>
        <title>hello world</title>
    </head>
    <body>
        <h1>${user.id}</h1>
        <h1>年龄：${user.age}</h1>
        <h1>姓名：${user.name}</h1>
        <p>如果你点击“隐藏” 按钮，我将会消失。</p>
        <button id="hide">隐藏</button>
        <button id="show">显示</button>
    </body>
</html>