package com.hackerrank.dataStructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        int sort = Integer.compare(player2.score, player1.score);
        if (sort == 0) {
            sort = player1.name.compareTo(player2.name);
        }
        return sort;
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class P11_JavaComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scanner.next(), scanner.nextInt());
        }

        Arrays.sort(player, checker);
        for (Player value : player) {
            System.out.printf("%s %s\n", value.name, value.score);
        }
    }
}
