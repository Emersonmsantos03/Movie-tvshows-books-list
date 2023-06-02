package gerenciador.midias;

import java.util.ArrayList;

public class Movie {
    private String name;
    private String Director;
    private String streamingService;
    private int realeaseDate;
    private int duration;
    private int parentalRating;
    private Action action;

    public Movie(String name, String director, String streamingService, int realeaseDate, int duration, int parentalRating, Action action) {
        this.name = name;
        Director = director;
        this.streamingService = streamingService;
        this.realeaseDate = realeaseDate;
        this.duration = duration;
        this.parentalRating = parentalRating;
        this.action = action;
    }

    public String getAuthor() {
        return Director;
    }

    public String getName() {
        return name;
    }

    public String getStreamingService() {
        return streamingService;
    }

    public int getRealeaseDate() {
        return realeaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public int getParentalRating() {
        return parentalRating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name:'" + name + '\'' +
                ", Director:'" + Director + '\'' +
                ", streamingService:'" + streamingService + '\'' +
                ", realeaseDate:" + realeaseDate +
                ", duration:" + duration +
                ", parentalRating:" + parentalRating +
                ", Action:" + action +
                '}';
    }
}

    
    
    



