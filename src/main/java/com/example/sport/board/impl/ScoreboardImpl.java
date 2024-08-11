package com.example.sport.board.impl;

import com.example.sport.board.Scoreboard;
import com.example.sport.board.model.Match;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScoreboardImpl implements Scoreboard {

    private final List<Match> matches = new ArrayList<>();

    @Override
    public void startNewGame(String homeTeam, String awayTeam) {
        final Match match = new Match(homeTeam, awayTeam, 0, 0);
        matches.add(match);
    }

    @Override
    public void updateScore(int homeTeamScore, int awayTeamScore) {
        // TODO: which match we should update?
        matches.get(matches.size() - 1).setHomeScore(homeTeamScore);
        matches.get(matches.size() - 1).setAwayScore(awayTeamScore);
    }

    @Override
    public void finishGame() {
        // TODO: which match we should finish?
        matches.remove(matches.size() - 1);
    }

    @Override
    public String getSummaryOfGames() {
        // TODO: implement this method
        return "";
    }
}
