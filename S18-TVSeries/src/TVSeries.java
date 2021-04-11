import java.util.ArrayList;

public class TVSeries {

    private String title;
    private int numberOfEpisodes;
    private ArrayList<Actor> actors;

    public TVSeries(String title) {
        this.title = title;
        numberOfEpisodes = 0;
        actors = new ArrayList<>();
    }

    public void hireActor(Actor actor) {
        actors.add(actor);
    }

    public int getNumberOfActors() {
        return actors.size();
    }

    public Actor getActor(int index) {
        return actors.get(index);
    }

    public void awardEmmy(String name) {
        for (Actor actor : actors) if (actor.getName().equals(name)) {
            actor.awardEmmy();
            return;
        }
    }

    public void makeNextEpisode() {
        numberOfEpisodes++;
        for (Actor actor : actors) actor.participateInEpisodes();
    }

    public ArrayList<Actor> getEmmyWinners() {
        ArrayList<Actor> toReturn = new ArrayList<>();
        for (Actor actor : actors) if (actor.getNumberOfEmmys() > 0) toReturn.add(actor);
        return toReturn;
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder( "TVSeries{title=" + title + ", numberOfEpisodes= " + numberOfEpisodes + ", actors={");
        for (int i = 0; i < actors.size() - 1; i++) toReturn.append(actors.get(i) + ", ");
        return toReturn.append(actors.get(actors.size())).append("}}").toString();
    }
}
