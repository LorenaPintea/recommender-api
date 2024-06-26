package io.datajek.springbootdemo.recommender_api;

public class Movie {
    private int id;
    private String name;
    private double rating;

    public Movie() {
    }


    public Movie(int id, String name, double rating) {
        super();
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
