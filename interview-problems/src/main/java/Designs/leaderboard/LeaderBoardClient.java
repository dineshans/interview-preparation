package Designs.leaderboard;

/*
*  ["Leaderboard","addScore","addScore","addScore","addScore","addScore","top","reset","reset","addScore ","top"]
[[],[1,73],[2,56],[3,39],[4,51],[5,4],
*
* top --> [1],
* reset --> [1],[2],
* add score --> [2,51],
* top --> [3]]
* */

public class LeaderBoardClient {

    public static void main(String[] args) {

        LeaderBoard leaderBoard = new LeaderBoardServiceImpl();

        leaderBoard.addScore(1,73);
        leaderBoard.addScore(2,56);
        leaderBoard.addScore(3,39);
        leaderBoard.addScore(4,51);
        leaderBoard.addScore(5,4);
        leaderBoard.top(1);
        leaderBoard.reset(1);
        leaderBoard.reset(2);
        leaderBoard.addScore(2,51);
        leaderBoard.top(3);
    }
}
