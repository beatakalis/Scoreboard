package com.example.sport.board;

public interface Scoreboard {

    void startNewGame(String homeTeam, String awayTeam);

    void updateScore(int homeTeamScore, int awayTeamScore);

    void finishGame();

    String getSummaryOfGames();

}
