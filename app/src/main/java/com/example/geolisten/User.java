package com.example.geolisten;

import static com.example.geolisten.Mode.*;

// need authorization -> probably POST/GET for the Spotify token information
// start with unit testing and shit

public class User {

    private String spotifyId;
    private Mode mode;
    private String userName;
    private String password;

    private Context context;
    private SpotifyAgent agent;


    public User(String spotifyId, String userName, String password) {
        this.spotifyId = spotifyId;
        this.mode = PRIVATE;
        this.userName = userName;
        this.password = password;


        // placeholder until more knowledge about spotify api
        this.agent = new SpotifyAgent();
        this.context = this.agent.retrieveContext(spotifyId);
    }

    public User(String spotifyId, Mode mode, String userName, String password) {
        this.spotifyId = spotifyId;
        this.mode = mode;
        this.userName = userName;
        this.password = password;

        // placeholder until more knowledge about spotify api
        this.agent = new SpotifyAgent();
        this.context = this.agent.retrieveContext(spotifyId);
    }

    public String getSpotifyId() {
        return spotifyId;
    }

    public Mode getMode() {
        return mode;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setSpotifyId(String spotifyId) {
        this.spotifyId = spotifyId;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }


//    public User(int mode) {
//        this.mode = mode;
//    }
}
