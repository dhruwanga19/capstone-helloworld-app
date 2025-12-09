package com.capstone.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String hostname = InetAddress.getLocalHost().getHostName();
        String ipAddress = InetAddress.getLocalHost().getHostAddress();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Capstone Project - HelloWorld</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>🎉 Welcome to Capstone Project!</h1>");
        out.println("<div class='info-box'>");
        out.println("<h2>Server Information</h2>");
        out.println("<p><strong>Hostname:</strong> " + hostname + "</p>");
        out.println("<p><strong>IP Address:</strong> " + ipAddress + "</p>");
        out.println("<p><strong>Timestamp:</strong> " + timestamp + "</p>");
        out.println("<p><strong>Environment:</strong> Production</p>");
        out.println("</div>");
        out.println("<div class='success-message'>");
        out.println("<p>✅ Application deployed successfully using Terraform and CI/CD pipeline!</p>");
        out.println("<p>🚀 Auto Scaling Group is managing this instance</p>");
        out.println("<p>📊 Load Balancer is distributing traffic</p>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}