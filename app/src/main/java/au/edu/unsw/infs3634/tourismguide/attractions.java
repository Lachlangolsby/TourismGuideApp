package au.edu.unsw.infs3634.tourismguide;

import java.util.ArrayList;

public class attractions {

    public attractions(String Attraction, String type, String location, int rating, String AttractionCode) {
        this.Attraction = Attraction;
        this.type = type;
        this.location = location;
        this.rating = rating;
        this.AttractionCode = AttractionCode;
    }

    private String Attraction;
    private  String type;
    private String location;
    private  int rating;
    private static String AttractionCode;

    public  String getAttraction() {
        return Attraction;
    }

    public void setAttraction(String attraction) {
        this.Attraction = attraction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    public static String getAttractionCode() {
        return AttractionCode;
    }

    public void setAttractionCode(String AttractionCode) {
        this.AttractionCode = AttractionCode;
    }

    public static ArrayList<attractions> getAttractions() {
        ArrayList<attractions> Attractions = new ArrayList<>();
        Attractions.add(new attractions("Bondi Beach", "Recreational", "Bondi Beach, Sydney NSW 2026", 4, "BB"));
        Attractions.add(new attractions("Sydney Opera House", "Arts", "Bennelong Point, Sydney NSW 2000", 4, "OH"));
        Attractions.add(new attractions("Sydney Harbour Bridge", "Historical", "Sydney Harbour Bridge, Sydney NSW", 5, "SB"));
        Attractions.add(new attractions("Royal Botanical Gardens", "Recreational", "Mrs Macquaries Rd, Sydney NSW 2000", 4, "BG"));
        Attractions.add(new attractions("Taronga Zoo", "Recreational", "Bradleys Head Rd, Mosman NSW 2088", 4, "TZ"));
        Attractions.add(new attractions("Sydney Tower", "Viewing point", "100 Market St, Sydney NSW 2000", 4, "ST"));
        Attractions.add(new attractions("Paddington Markets", "Food and shopping", "395 Oxford St, Paddington NSW 2021", 3, "PM"));
        Attractions.add(new attractions("Cockatoo Island", "Recreational", "Camber Wharf Docks Precinct, Balmain NSW 2041", 4, "CI"));
        Attractions.add(new attractions("Luna Park", "Recreational", "1 Olympic Dr, Milsons Point NSW 2061", 5, "LP"));
        Attractions.add(new attractions("Powerhouse Museum", "Historical", "500 Harris St, Ultimo NSW 2007", 4, "PM"));
        return Attractions;
    }

}