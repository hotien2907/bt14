package baitap.baitap4;

import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<FootballTeam> teams = new ArrayList<>();
        teams.add(new FootballTeam(1, "Team A", 11, 30));
        teams.add(new FootballTeam(2, "Team B", 12, 25));
        teams.add(new FootballTeam(3, "Team C", 10, 35));
        teams.add(new FootballTeam(4, "Team D", 9, 20));
        System.out.println("Danh sách đội bóng trước khi sắp xếp:");
        printTeams(teams);
        System.out.println("Danh sách sau khi sắp xếp nổi bọt");
        bubbleSort(teams);
        printTeams(teams);
        System.out.println("Danh sách sau khi sắp xếp chọn");
        selectionSort(teams);
        printTeams(teams);
        System.out.println("Danh sách sau khi sắp xếp chèn");
         insertionSort(teams);
        printTeams(teams);
    }

    public static void printTeams(List<FootballTeam> teams) {

        for (FootballTeam team : teams) {
            System.out.println(team);
        }
    }

    public  static void   bubbleSort(List<FootballTeam> teams){
        for (int i = 1; i <teams.size() ; i++) {
            for (int j = 0; j <teams.size()-i ; j++) {
                    if(teams.get(j).getScore()< teams.get(j).getScore()){

                    }
                
            }
        }
    }
     public static void selectionSort(List<FootballTeam> teams){
         for (int i = 0; i < teams.size()-1; i++) {
             int minIndex = i;
             for (int j = 0; j < teams.size(); j++) {
                 if(teams.get(j).getScore() > teams.get(minIndex).getScore()) {
                     minIndex =j;
                 }
             }

             swap(teams, minIndex, i);

         }
     }

    public static void insertionSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 1; i < n; i++) {
            FootballTeam key = teams.get(i);
            int j = i - 1;
            while (j >= 0 && teams.get(j).getScore() < key.getScore()) {
                teams.set(j + 1, teams.get(j));
                j = j - 1;
            }
            teams.set(j + 1, key);
        }
    }

    public static  void swap(List<FootballTeam> teams, int i1,int i2) {
        FootballTeam temp = teams.get(i1);
           teams.set(i1,teams.get(i2));
           teams.set(i2, temp );
    }



}
