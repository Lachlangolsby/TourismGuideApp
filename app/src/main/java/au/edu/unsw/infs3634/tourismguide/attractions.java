package au.edu.unsw.infs3634.tourismguide;

import java.util.ArrayList;

public class attractions {
    private static String attraction;
    private String type;
    private String location;
    private double rating;
    public attractions(String attraction, String type, String location, double rating) {
        attractions.attraction = attraction;
        this.type = type;
        this.location = location;
        this.rating = rating;
    }

    public static ArrayList<attractions> getAttractions() {
        ArrayList<attractions> attraction = new ArrayList<>();
        attraction.add(new attractions("Bondi Beach", "Recreational", "Bondi Beach, Sydney NSW 2026", 4.5));
        attraction.add(new attractions("Sydney Opera House", "Arts", "Bennelong Point, Sydney NSW 2000", 4.8));
        attraction.add(new attractions("Sydney Harbour Bridge", "Historical", "Sydney Harbour Bridge, Sydney NSW", 4.6));
        attraction.add(new attractions("Royal Botanical Gardens", "Recreational", "Mrs Macquaries Rd, Sydney NSW 2000", 4.4));
        attraction.add(new attractions("Taronga Zoo", "Recreational", "Bradleys Head Rd, Mosman NSW 2088", 4.3));
        attraction.add(new attractions("Sydney Tower", "Viewing point", "100 Market St, Sydney NSW 2000", 4.3));
        attraction.add(new attractions("Paddington Markets", "Food and shopping", "395 Oxford St, Paddington NSW 2021", 4.1));
        attraction.add(new attractions("Cockatoo Island", "Recreational", "Camber Wharf Docks Precinct, Balmain NSW 2041", 4.5));
        attraction.add(new attractions("Luna Park", "Recreational", "1 Olympic Dr, Milsons Point NSW 2061", 4.3));
        attraction.add(new attractions("Powerhouse Museum", "Historical", "500 Harris St, Ultimo NSW 2007", 4.2));
        return attraction;
    }

    public static String getAttraction() {
        return attraction;
    }

    public void setAttraction(String attraction) {
        this.attraction = attraction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getlocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}