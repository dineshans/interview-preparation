package com.Design.problems.leaderboard;

public interface LeaderBoard {

    public void addScore(int playerId, int score);
    public int top(int K);
    public void reset(int playerId);
}
