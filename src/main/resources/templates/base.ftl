<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>FreeMarker Demo</title>
</head>
<body>

<h3>普通文本String展示：</h3>
<br>
<#--这是一行注释-->
Hello ${name!''}
<br>

<hr>

<h3>对象Person的数据:</h3>
<br>
name: ${person.name}
<br>
age: ${person.age}

<hr>

</body>
