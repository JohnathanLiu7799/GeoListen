package com.example.geolisten;
//import com.spotify.android.appremote.api.*;
import com.spotify.android.appremote.api.ConnectionParams;
import com.spotify.android.appremote.api.Connector;
import com.spotify.android.appremote.api.SpotifyAppRemote;

import com.spotify.protocol.client.Subscription;
import com.spotify.protocol.types.PlayerState;
import com.spotify.protocol.types.Track;

// This will be the only class that directly interacts with Spotify API. We will convert everything here to our custom Context information
public class SpotifyAgent {

    // Unique identifier for the app. Used for:
    private static final String clientId = "ead03efbe9ed408cb99fbb42408253de";
    // Key used to authorize App's Web API or SDK calls. We call get with this as our authorizer; it goes to user who, if SPotify is open, will get the
    // option to authorize back. If authorized, we get our token :-)
    private static final String clientSecret = "79ba1fce691a453cad6efa9042e25993";
    private static final String redirectUri = "http://localhost:8888/callback";
    private SpotifyAppRemote agent;

    public SpotifyAgent() {
//        ConnectionParams connectionParams =
//                new ConnectionParams.Builder(clientId)
//                        .setRedirectUri(REDIRECT_URI)
//                        .showAuthView(true)
//                        .build();
    }

    public Context retrieveContext(String spotifyId) {
        return null;
    }
}
