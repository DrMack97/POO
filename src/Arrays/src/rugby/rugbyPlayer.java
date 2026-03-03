package rugby;

public class rugbyPlayer {
    private String name;
    private String team;
    private int tries;
    
    public rugbyPlayer(String name, String team, int tries) {
        this.name = name;
        this.team = team;
        this.tries = tries;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getTries() {
        return tries;
    }
}
