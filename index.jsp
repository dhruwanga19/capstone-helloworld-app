<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.InetAddress" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Capstone Project - HelloWorld</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div class="container">
        <h1>🎉 Welcome to Capstone Project!</h1>
        <div class="info-box">
            <h2>Server Information</h2>
            <p><strong>Hostname:</strong> <%= InetAddress.getLocalHost().getHostName() %></p>
            <p><strong>IP Address:</strong> <%= InetAddress.getLocalHost().getHostAddress() %></p>
            <p><strong>Timestamp:</strong> <%= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) %></p>
            <p><strong>Environment:</strong> Production</p>
        </div>
        <div class="success-message">
            <p>✅ Application deployed successfully using Terraform and CI/CD pipeline!</p>
            <p>🚀 Auto Scaling Group is managing this instance</p>
            <p>📊 Load Balancer is distributing traffic</p>
        </div>
    </div>
</body>
</html>