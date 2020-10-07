package au.edu.unsw.infs3634.tourismguide;

import java.util.ArrayList;

public class attractions {
    private String attraction;
    private String type;
    private String location;
    private double rating;
    public attractions(String attraction, String type, String location, double rating) {
        this.attraction = attraction;
        this.type = type;
        this.location = location;
        this.rating = rating;
    }

    public static ArrayList<attractions> getCountries() {
        ArrayList<attractions> attractions = new ArrayList<>();
        attractions.add(new attractions("Bondi Beach", "Recreational", "Bondi Beach, Sydney NSW 2026", 4.5));
        attractions.add(new attractions("Sydney Opera House", "Arts", "Bennelong Point, Sydney NSW 2000", 4.8));
        attractions.add(new attractions("Sydney Harbour Bridge", "Historical", "Sydney Harbour Bridge, Sydney NSW", 4.6));
        attractions.add(new attractions("Royal Botanical Gardens", "Recreational", "Mrs Macquaries Rd, Sydney NSW 2000", 4.4));
        attractions.add(new attractions("Taronga Zoo", "Recreational", "Bradleys Head Rd, Mosman NSW 2088", 4.3));
        attractions.add(new attractions("Sydney Tower", "Viewing point", "100 Market St, Sydney NSW 2000", 4.3));
        attractions.add(new attractions("Paddington Markets", "Food and shopping", "395 Oxford St, Paddington NSW 2021", 4.1));
        attractions.add(new attractions("Cockatoo Island", "Recreational", "Camber Wharf Docks Precinct, Balmain NSW 2041", 4.5));
        attractions.add(new attractions("Luna Park", "Recreational", "1 Olympic Dr, Milsons Point NSW 2061", 4.3));
        attractions.add(new attractions("Powerhouse Museum", "Historical", "500 Harris St, Ultimo NSW 2007", 4.2));
        return attractions;
    }

    public String getAttraction() {
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

