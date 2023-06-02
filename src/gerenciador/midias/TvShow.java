package gerenciador.midias;

import java.util.ArrayList;

public class TvShow {
    private String name;
    private String director;
    private int duration;
    private String streamingService;
    private int parentalRating;

    public TvShow(String name, String director, int duration, String streamingService, int parentalRating) {
        this.name = name;
        this.director = director;
        this.duration = duration;
        this.streamingService = streamingService;
        this.parentalRating = parentalRating;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public String getStreamingService() {
        return streamingService;
    }

    public int getParentalRating() {
        return parentalRating;
    }

    ArrayList<TvShow> tvshows = new ArrayList<TvShow>();

    public void adiciona(TvShow tvshow) {
        this.tvshows.add(tvshow);

    }
}
