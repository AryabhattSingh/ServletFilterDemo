# Servlet Filter Demo

Servlet Filter Demo is a Java project that showcases the usage of servlet filters to intercept the request and response cycles of a servlet.
<br>
This project demonstrates how servlet filters can be employed to perform both pre-processing and post-processing logic on incoming requests and outgoing responses.

## Overview

Servlet filters are Java classes designed to intercept and manipulate the request and response data before it reaches the servlet or after the servlet has processed the 
request. Filters can be used for various purposes, such as security checks, logging, compression, and more.

One example of a filter is the `Injection Attack Filter`. This filter scans incoming data for strings that could potentially crash the container or compromise the database, 
providing an added layer of security to the application.

## Filter Lifecycle

The lifecycle of a filter closely resembles that of a servlet:

1. `public void init(FilterConfig config)` - Initialize the filter when it's loaded by the container.
2. `public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)` - Perform pre-processing logic on the request, optionally pass it to the next
   filter in the chain, or the servlet, and perform post-processing logic on the response.
4. `public void destroy()` - Clean up resources and perform finalization when the filter is removed from the container.


## Filter Chaining

Filter chaining involves applying multiple filters to a servlet or JSP in a specified order. Each filter in the chain can modify the request and response before passing 
them to the next filter or the servlet itself.

&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; ![filter](https://github.com/AryabhattSingh/ServletFilterDemo/assets/63608694/32889f86-7ed8-4796-80ce-db90f210fe56)




## Implementing a Filter
Filters can be implemented by implementing the `Filter` interface. Here's an example:

```java
import javax.servlet.*;
import java.io.IOException;

public class DemoFilter implements Filter {
    // Implement init(), doFilter(), and destroy() methods
}
```

## Project Structure

This project includes a simple demonstration of a filter in action:

- `DemoFilter`: A sample filter that intercepts requests and responses.
- `FilterDemoServlet`: A servlet that is accessed through a URL, showcasing the filter's functionality.


## Example Flow

1. User accesses the `FilterDemoServlet` URL.
2. `DemoFilter` intercepts the request, performs pre-processing and forwards it to the servlet.
3. The servlet processes the request and generates a response.
4. The response is intercepted by `DemoFilter`, which performs post-processing.
5. The modified response is sent to the user's web browser.

## Usage

1. Clone or download the project to your local machine.
2. Open the project in your preferred Java development environment (e.g., Eclipse, IntelliJ IDEA).
3. Run the servlet on a container (e.g., Apache Tomcat).
4. Access the `FilterDemoServlet` URL in your web browser.
5. Observe how the filter intercepts the request before it reaches the servlet and performs pre-processing.
6. After the servlet generates a response, the filter intercepts the response and performs post-processing.

