FROM rsunix/yourkit-openjdk17

ADD target/Dawan_Trivian.jar Dawan_Trivian.jar
ENTRYPOINT ["java", "-jar", "Dawan_Trivian.jar"]
EXPOSE 8070