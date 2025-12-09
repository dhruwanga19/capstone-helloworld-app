# Use Tomcat 11 with Java 17
FROM tomcat:11.0-jdk17

# Metadata
LABEL maintainer="dhruwang@example.com"
LABEL application="capstone-helloworld"
LABEL version="1.0"

# Remove default Tomcat applications
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR file to Tomcat webapps as ROOT
COPY target/helloworld.war /usr/local/tomcat/webapps/ROOT.war

# Expose Tomcat port
EXPOSE 8080

# Health check
HEALTHCHECK --interval=30s --timeout=3s --start-period=60s --retries=3 \
  CMD curl -f http://localhost:8080/ || exit 1

# Start Tomcat
CMD ["catalina.sh", "run"]
