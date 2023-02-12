package algoexpert.io.arrays;

import java.util.*;

public class TournamentWinner {

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        long len = results.size();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            ArrayList<String> competition = competitions.get(i);
            int result = results.get(i);
            String team;
            if (result == 0) team = competition.get(1);
            else team = competition.get(0);
            if (hashMap.containsKey(team)) {
                int point = hashMap.get(team) + 3;
                hashMap.put(team, point);
            } else {
                hashMap.put(team, 3);
            }
        }
        return Collections.max(hashMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }

    public String tournamentWinnerAnother(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        Map<String, Integer> hashMap = new HashMap<>();
        String team, winner = "";

        for (int i = 0; i < competitions.size(); i++) {
            team = competitions.get(i).get(results.get(i) == 0 ? 1 : 0);
            hashMap.put(team, hashMap.getOrDefault(team, 0) + 3);
            winner = hashMap.get(team) > hashMap.getOrDefault(winner, 0) ? team : winner;
        }
        return winner;
    }

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        a.add("HTML");
        a.add("C#");
        ArrayList<String> b = new ArrayList<>();
        b.add("C#");
        b.add("Python");
        ArrayList<String> c = new ArrayList<>();
        c.add("Python");
        c.add("HTML");

        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        competitions.add(a);
        competitions.add(b);
        competitions.add(c);

        ArrayList<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(0);
        results.add(1);

        System.out.println(new TournamentWinner().tournamentWinner(competitions, results));
        System.out.println(new TournamentWinner().tournamentWinnerAnother(competitions, results));


    }
}
