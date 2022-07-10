package Section10.GenericsChallenge;

public class Main {
    public static void main(String[] args) {
        FootballPlayer billy = new FootballPlayer("Billy");
        BaseballPlayer bob = new BaseballPlayer(("Bob"));
        SoccerPlayer carl = new SoccerPlayer("Carl");

        Team<FootballPlayer> spaceCows = new Team<>("Space Cows");
        spaceCows.addPlayer(billy);
//        spaceCows.addPlayer(bob);
//        spaceCows.addPlayer(carl);

        System.out.println(spaceCows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Home Earth");
        baseballTeam.addPlayer(bob);

        Team<SoccerPlayer> brokenTeam = new Team<>("ths won't work");
        brokenTeam.addPlayer(carl);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(spaceCows, 3, 8);

        spaceCows.matchResult(fremantle, 2, 1);
//        spaceCows.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(spaceCows.getName() + " " + spaceCows.ranking());
        System.out.println(melbourne.getName() + " " + melbourne.ranking());
        System.out.println(fremantle.getName() + " " + fremantle.ranking());
        System.out.println(hawthorn.getName() + " " + hawthorn.ranking());

        System.out.println(spaceCows.compareTo(melbourne));
        System.out.println(spaceCows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(spaceCows));
        System.out.println(melbourne.compareTo(fremantle));
    }
}
