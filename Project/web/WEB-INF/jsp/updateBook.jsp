
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示 </title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <%--    <link href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/4.5.3/css/bootstrap.css" rel="stylesheet">--%>
    <%--    <link href="https://cdn.bootcdn.net/ajax/libs/bootstrap-material-design/4.0.2/bootstrap-material-design.css" rel="stylesheet">--%>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <div class="form-group">
            <input type="hidden" name="bookID" value="${QBook.bookID}" >
        </div>
        <div class="form-group">
            <label for="bookname">书籍名称</label>
            <input type="text" name="bookName" class="form-control" id="bookname" value="${QBook.bookName}" placeholder="书籍名称" required>
        </div>
        <div class="form-group">
            <label for="bookcount">书籍数量</label>
            <input type="text" name="bookCounts" class="form-control" id="bookcount" value="${QBook.bookCounts}" placeholder="数量" required>
        </div>
        <div class="form-group">
            <label for="detail">书籍描述</label>
            <input type="text" name="detail" class="form-control" id="detail" value="${QBook.detail}" placeholder="描述" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="提交">
        </div>


    </form>



</div>
</body>
</html>
