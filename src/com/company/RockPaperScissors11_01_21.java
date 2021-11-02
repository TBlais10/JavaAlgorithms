package com.company;
//https://edabit.com/challenge/3S8XppR6Yf5mXPxij

public class RockPaperScissors11_01_21 {

    public static String rps(String s1, String s2) {
        player p1 = new player("Player 1", s1);
        player p2 = new player("Player 2", s2);

        if (p1.getOption().equalsIgnoreCase(p2.getOption())){
            return "TIE";
        } else if (p1.getOption().equalsIgnoreCase("rock") && !p2.getOption().equalsIgnoreCase("paper")){
            return p1.getPlayerName() + " wins";
        } else if (p1.getOption().equalsIgnoreCase("paper") && !p2.getOption().equalsIgnoreCase("scissors")){
            return p1.getPlayerName() + " wins";
        } else if (p1.getOption().equalsIgnoreCase("scissors") && !p2.getOption().equalsIgnoreCase("rock")){
            return p1.getPlayerName() + " wins";
        }

        return p2.getPlayerName() + " wins";

    }

    public static class player { //inner class

        String playerName;
        String option;

        public player(String playerName, String option) {
            this.playerName = playerName;
            this.option = option;
        }


        public String getPlayerName() {
            return playerName;
        }

        public String getOption() {
            return option;
        }
    }

    public static void main(String[] args) {
        System.out.println(rps("paper", "scissors")); //should return Tie
    }


}
