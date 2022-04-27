package edu.usfca.cs272;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.util.List;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Creates a web server to allow users to fetch HTTP headers for a URL.
 *
 * @author CS 272 Software Development (University of San Francisco)
 * @version Spring 2022
 */
public class HeaderServer {
	/**
	 * Starts a Jetty server on port 8080 and maps "/headers" requests to the
	 * {@link HeaderServlet}.
	 *
	 * @param args unused
	 * @throws Exception if unable to start server successfully
	 */
	public static void main(String[] args) throws Exception {
		// TODO Setup Jetty server on port 8080 here.
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * Servlet to GET handle requests to /headers.
	 */
	public static class HeaderServlet extends HttpServlet {
		/** ID used for serialization, which we are not using. */
		private static final long serialVersionUID = 1L;

		/**
		 * Displays a form where users can enter a URL to check. When the button is
		 * pressed, submits the URL back to "/headers" as a GET request.
		 *
		 * If a URL was included as a parameter in the GET request, safely fetch and
		 * display the HTTP headers of that URL.
		 */
		@Override
		protected void doGet(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
			// TODO Fill in to generate *and* respond to HTML form.
			throw new UnsupportedOperationException("Not yet implemented");
		}

		/**
		 * Opens a socket connection to the web server for the provided URL and uses
		 * the HTTP HEAD method to fetch and return ONLY the HTTP headers.
		 *
		 * @param url the URL to fetch HTTP headers for
		 * @return map of HTTP headers
		 * @throws Exception if unable to fetch for any reason
		 */
		public static Map<String, List<String>> getHttpHeaders(URL url) throws Exception {
			try (
					Socket socket = HttpsFetcher.openConnection(url);
					PrintWriter request = new PrintWriter(socket.getOutputStream());
					InputStreamReader input = new InputStreamReader(socket.getInputStream(), UTF_8);
					BufferedReader response = new BufferedReader(input);) {
				// TODO Fill in; do not use a GET request to fetch the HTTP headers!
				throw new UnsupportedOperationException("Not yet implemented");
			}
		}
	}
}
