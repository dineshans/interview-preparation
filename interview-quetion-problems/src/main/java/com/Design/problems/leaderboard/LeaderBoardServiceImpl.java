package com.Design.problems.leaderboard;

import java.util.ArrayList;
import java.util.List;

public class LeaderBoardServiceImpl implements LeaderBoard {

    List<Integer> playerIds;
    List<Integer> scores;
    int size;

    public LeaderBoardServiceImpl(){

        playerIds = new ArrayList<>();
        scores = new ArrayList<>();
        size = 0;
    }

    // quick sort
    @Override
    public void addScore(int playerId, int score) {

        if(size == 0){
            playerIds.add(playerId);
            scores.add(score);
        } else {

            int indexId = playerIds.indexOf(playerId);
            if (indexId >= 0) {

                int newScore = scores.indexOf(indexId) + score;
                playerIds.remove(playerId);
                scores.remove(indexId);

                int index = searchByScore(scores, newScore);

                if (index < 0)
                    index = -index - 1;
                playerIds.add(index, playerId);
                scores.add(index, newScore);

            } else {
                int index = searchByScore(scores, score);
                if (index < 0)
                    index = -index - 1;
                playerIds.add(index, playerId);
                scores.add(index, score);

            }
        }
        size++;

       for(Integer playerid_ : playerIds){

           System.out.println("Player id is :  " + playerid_);

       }
    }


    // Binary Search
    public int searchByScore(List<Integer> scores, int key){

        int size = scores.size();

        int low = 0, high = size - 1;

        while(low <= high){
            int mid = (high - low) / 2 + low;

            int num = scores.get(mid);
            if (num == key) {
                return mid;
            } else if(num > key) {
                low = mid + 1;
            } else {
                high = mid-1;
            }

        }

        return -low - 1;

    }

    @Override
    public int top(int K){

        K = Math.min(K,size);
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += scores.get(i);
        }
        System.out.println(sum);
        return sum;
    }

    @Override
    public void reset(int playerId) {

        int index = playerIds.indexOf(playerId);
        playerIds.remove(index);
        scores.remove(index);
        size--;
    }
}
