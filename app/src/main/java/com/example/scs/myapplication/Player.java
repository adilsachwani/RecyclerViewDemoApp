package com.example.scs.myapplication;

public class Player {

    private String playerName;
    private String playerCountry;
    private int playerRanking;
    private int playerPoints;
    private int playerImage;

    public Player(String playerName, String playerCountry, int playerRanking, int playerPoints, int playerImage) {
        this.playerName = playerName;
        this.playerCountry = playerCountry;
        this.playerRanking = playerRanking;
        this.playerPoints = playerPoints;
        this.playerImage = playerImage;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerCountry() {
        return playerCountry;
    }

    public int getPlayerRanking() {
        return playerRanking;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public int getPlayerImage() {
        return playerImage;
    }
}