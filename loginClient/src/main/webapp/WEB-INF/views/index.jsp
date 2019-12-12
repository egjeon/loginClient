<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
 <sec:authorize access="isAnonymous()">
    <h5><a href='<c:url value="/secu/loginPage"/>'>LOGIN</a> login plase</h5>
</sec:authorize>

 
 
 <h1>SECURITY AUTH TEST</h1>
<a href='<c:url value="/guest/page"/>'>GUEST</a> <br>
<a href='<c:url value="/user/page"/>'>USER</a> <br>
<a href='<c:url value="/member/page"/>'>MEMBER</a> <br>
<a href='<c:url value="/admin/page"/>'>ADMIN</a> <br>

