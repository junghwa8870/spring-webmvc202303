<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Insert Your Title</title>
</head>
<body>


   <%-- 방법1의 결과 로직
     <c:choose>
           <c:when test="${success}">
               <p>로그인 성공! 환영합니다. ${id}님</p>
           </c:when>
           <c:when test="${'grape111' eq id}">
               <p>로그인 실패. 비밀번호를 다시 입력해주세요.</p>
           </c:when>
           <c:otherwise>
               <p>아이디가 존재하지 않습니다.</p>
           </c:otherwise>
       </c:choose>
     --%>

     <h1>${result}</h1>

     <script>

        // javascript단에서 model 데이터를 활용하는 법
        const msg = '${result}'; // 문자열로 el을 사용해서 변수에 할당 가능.
        if(msg !== null) {
            alert(msg);
        }

     </script>


</body>
</html>