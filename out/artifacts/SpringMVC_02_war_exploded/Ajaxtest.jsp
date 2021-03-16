
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>
    <script type="text/javascript">
        function addinfo()
        {
            $.post("${pageContext.request.contextPath}/Ajaxtest",function (data){
                var html=""
                for(let i=0;i<data.length;i++)
                {
                    html+="<tr>"+
                        "<td>"+data[i].bookID+"</td>"+
                        "<td>"+data[i].bookName+"</td>"+
                        "<td>"+data[i].bookCounts+"</td>"+
                        "<td>"+data[i].detail+"</td>"+
                        "</tr>"
                }
                $("#content").html(html)
            })
        }
    </script>
</head>
<body>
<input type="button" value="加载数据" onclick="addinfo()">

<table>
    <tr>
        <td>编号</td>
        <td>书名</td>
        <td>数量</td>
        <td>信息</td>
    </tr>
    <tbody id="content">

    </tbody>
</table>
</body>
</html>
