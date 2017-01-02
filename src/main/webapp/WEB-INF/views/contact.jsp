<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
    
    <!-- Main Content -->
	<c:set var="register_url" value="${pageContext.request.contextPath}/register.html"/>
	<div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                <p>Want to get in touch with us? Fill out the form below to send us a message and we will try to get back to you within 24 hours!</p>
                <!-- Contact Form - Enter your email address on line 19 of the mail/contact_me.php file to make this form work. -->
                <!-- WARNING: Some web hosts do not allow emails to be sent through forms to common mail hosts like Gmail or Yahoo. It's recommended that you use a private domain email address! -->
                <!-- NOTE: To use the contact form, your site must be on a live web host with PHP! The form will not work locally! -->
                <form method="post" action="${register_url}" commandName="customer" id="contactForm" novalidate>
					<form:errors path="*" cssClass="alert alert-error alert-danger form-group" element="div" />
                    <div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
                            <label>Name</label>
							<s:message code="NotEmpty.customer.firstName" text="First name is required" var="msgFirstName"/>
							<form:input path="contact.name" placeholder="Name" cssClass="span8 required input form-control form-control-md" id="firstName" title="${msgFirstName}"/>
							   <form:errors path="customer.name" cssClass="error" />
                            <p class="help-block text-danger"></p>
                        </div>
                    </div>
                    <div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
                            <label>Email Address</label>
                            <!-- <input type="email" class="form-control" placeholder="Email Address" id="email" required data-validation-required-message="Please enter your email address."> -->
                            <form:input path="customer.email" placeholder="Email Address" id="email" required data-validation-required-message="Please enter your email address."/>
                            <p class="help-block text-danger"></p>
                        </div>
                    </div>
                    <div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
                            <label>Phone Number</label>
                            <!-- <input type="tel" class="form-control" placeholder="Phone Number" id="phone" required data-validation-required-message="Please enter your phone number."> -->
                            <form:input path="customer.phoneNumber" placeholder="Phone Number" id="phone" required data-validation-required-message="Please enter your phone Number."/>
                            <p class="help-block text-danger"></p>
                        </div>
                    </div>
                    <div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
                            <label>Message</label>
                            <form:textarea rows="5" path="customer.message" class="form-control" placeholder="Message" id="message" required data-validation-required-message="Please enter a message." />
                            <p class="help-block text-danger"></p>
                        </div>
                    </div>
                    <br>
                    <div id="success"></div>
                    <div class="row">
                        <div class="form-group col-xs-12">
                            <button type="submit" class="btn btn-default">Send</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    
    <hr>

<!-- Footer -->
<%@ include file="/WEB-INF/views/footer.jsp" %>