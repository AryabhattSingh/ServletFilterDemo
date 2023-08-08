package filterDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class DemoFilter
 */

@WebFilter("/FilterDemoServlet")
// This url should be same as the servlet's url
// If we make the url as "/*" then this filter will apply for all the servlets in the web application

public class DemoFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public DemoFilter() {

	}

	/**
	 * @see Filter#destroy()
	 */
	@Override
	public void destroy() {
		// called at the end of filter's lifecycle
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// called everytime the filter is invoked or the servlet is being used

		// whatever we want to do, before the servlet gets called, should come here
		PrintWriter out = response.getWriter();
		out.println("Before going to servlet");

		// pass the request along the filter chain. The request will eventually get to
		// the servlet
		chain.doFilter(request, response);

		// when the response come from the servlet and enters in the filter
		out.println("After coming from servlet");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		// called in the starting of filter's lifecycle
	}

}
