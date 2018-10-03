# spring-boot-jwt-auth-demo
Sample code for spring boot jwt auth implementation

Usage

1) Set the antMatcher to be authenticated in /src/main/java/com/iamyasas/springbootjwtauthdemo/security/SecurityConfig.java
 
2) Any username with password "pass" will give a valid JWT token and set it in a cookie automatically.
POST http://localhost:8080/login  -Authorization Basic base64encode(username:password)

3) Any resourse request which matches above ant path should give correct response.

4) Access control(Authorization)

  4.1) Annotation : @PreAuthorize("#employeeID == authentication.principal") 
  See getEmployee() in src/main/java/com/iamyasas/springbootjwtauthdemo/controllers/EmployeeController.java for an example.

  4.2) Programatically : SecurityContextHolder.getContext().getAuthentication().getPrincipal();
  See getEmployees() in src/main/java/com/iamyasas/springbootjwtauthdemo/services/EmployeeService.java for an example.
