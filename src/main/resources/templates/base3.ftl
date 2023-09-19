<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FTL Map Demo</title>
</head>
<body>
    <b>Map数据的展示：</b><br>
    <a href="###" style="">方式一:通过map['keyname'].property</a><br>
    姓名:${personMap['person1'].name}<br>
    年龄:${personMap['person1'].age}<br>
    <b>Map数据的展示：</b><br>
    <a href="###" style="">方式一:通过map.keyname.property</a><br>
    姓名:${personMap['person2'].name}<br>
    年龄:${personMap['person2'].age}<br>
    <hr>
    <a href="###">遍历map:</a>
    <table>
        <tr>
            <td>序号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>钱包</td>
        </tr>
        <#list personMap?keys as key>
            <tr>
                <td>${key_index+1}</td>
                <td>${personMap[key].name}</td>
                <td>${personMap[key].age}</td>
                <td>${personMap[key].money}</td>
            </tr>
        </#list>
    </table>
</body>
</html>