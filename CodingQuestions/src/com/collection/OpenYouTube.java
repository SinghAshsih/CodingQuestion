package com.collection;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenYouTube {
	public static void main(String[] args) {
		try {
			// Check if Desktop is supported by this platform
			if (Desktop.isDesktopSupported()) {
				Desktop desktop = Desktop.getDesktop();
				// Check if the action to browse is supported
				if (desktop.isSupported(Desktop.Action.BROWSE)) {
					// Create a URI object with the YouTube URL
					URI uri = new URI("https://www.youtube.com");
					// Open the default browser with the specified URI
					desktop.browse(uri);
				}
			} else {
				System.out.println("Desktop is not supported on this platform.");
			}
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
