/**
 * UserAgentFilter is a servlet filter that intercepts HTTP requests and checks the User-Agent header.
 * If the User-Agent contains "Chrome", the request is allowed to proceed.
 * Otherwise, the request is forwarded to a "badBrowser.jsp" page.
 * 
 * <p>This filter is mapped to all URL patterns (/*).</p>
 * 
 * <p>Methods:</p>
 * <ul>
 *   <li>{@link #doFilter(ServletRequest, ServletResponse, FilterChain)} - Intercepts the request and checks the User-Agent header.</li>
 *   <li>{@link #destroy()} - Called when the filter is taken out of service.</li>
 *   <li>{@link #init(FilterConfig)} - Called when the filter is put into service.</li>
 * </ul>
 * 
 * @see jakarta.servlet.Filter
 * @see jakarta.servlet.FilterChain
 * @see jakarta.servlet.FilterConfig
 * @see jakarta.servlet.ServletRequest
 * @see jakarta.servlet.ServletResponse
 * @see jakarta.servlet.RequestDispatcher
 * @see jakarta.servlet.ServletException
 */
package com.rvg.patterns.interceptingfilter;

import java.io.IOException;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.ServletException;


@WebFilter("/*")
public class UserAgentFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        String userAgentHeader = ((HttpServletRequest) request).getHeader("User-Agent");
        if (userAgentHeader.contains("Chrome")) {
            chain.doFilter(request, response);
            return;
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("badBrowser.jsp");
        dispatcher.forward(request, response);
    }

    public void destroy() {
    }

    public void init(FilterConfig fConfig) {
    }
}
