package com.example.geolisten;

// This will be the only class that directly interacts with Spotify API. We will convert everything here to our custom Context information
public class SpotifyAgent {

    // Unique identifier for the app. Used for:
    private String clientId;
    // Key used to authorize App's Web API or SDK calls. We call get with this as our authorizer; it goes to user who, if SPotify is open, will get the
    // option to authorize back. If authorized, we get our token :-)
    private String clientSecret;

    public Context retrieveContext(String spotifyId) {
        return null;
    }
}
