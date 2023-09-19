<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FTL List Demo</title>
</head>
<body>
<#--    list数据展示-->
<b>用List展示Person数据:</b>
<br>
<br>
<table>
    <tr>
        <td>NO:</td>
        <td>name:</td>
        <td>age:</td>
        <td>money:</td>
    </tr>
<#--    <#list personList as person>-->
<#--        <tr>-->
<#--            &lt;#&ndash;            ${k_index}：得到循环的下标，使用方法是在stu后边加"_index"，它的值是从0开始&ndash;&gt;-->
<#--            <td>${person_index+1}</td>-->
<#--            <td>${person.name}</td>-->
<#--            <td>${person.age}</td>-->
<#--            <td>${person.money}</td>-->
<#--        </tr>-->
<#--    </#list>-->
  <#if psersonList??>
      <#list personList as person>
      <#--        在freemarker中，判断是否相等，=与==是一样的-->
          <#if person.name == 'KaelvihN'>
              <tr style="color: cornflowerblue">
                  <td>${person_index+1}</td>
                  <td>${person.name}</td>
                  <td>${person.age}</td>
                  <td>${person.money}</td>
              </tr>
          <#else>
              <tr>
                  <td>${person_index+1}</td>
                  <td>${person.name}</td>
                  <td>${person.age}</td>
                  <td>${person.money}</td>
              </tr>
          </#if>
      </#list>
  </#if>
</table>

</body>
</html>