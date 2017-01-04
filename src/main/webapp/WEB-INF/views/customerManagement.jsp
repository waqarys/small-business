<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Customer Management Page</h1>

            <p class="lead">This is the customer management page!</p>
        </div>

        <table class="table table-striped table-hover">
            <thead>
            <tr class="bg-success">
                <th>Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Username</th>
                <th>Enabled</th>
            </tr>
            </thead>
            <c:forEach items="${customerList}" var="customer">
                <tr>
                    <td style="display: table-cell;">${customer.customerName}</td>
                    <td style="display: table-cell;">${customer.customerEmail}</td>
                    <td style="display: table-cell;">${customer.customerPhone}</td>
                    <td style="display: table-cell;">${customer.username}</td>
                    <td style="display: table-cell;">${customer.enabled}</td>
                </tr>
            </c:forEach>
        </table>

<%@ include file="/WEB-INF/views/footer.jsp" %>