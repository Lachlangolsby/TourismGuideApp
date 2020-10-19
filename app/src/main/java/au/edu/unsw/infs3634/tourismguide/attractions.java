package au.edu.unsw.infs3634.tourismguide;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class attractions {

    public attractions(String Attraction, String type, String location, int rating, String AttractionCode, String imageUrl) {
        this.Attraction = Attraction;
        this.type = type;
        this.location = location;
        this.rating = rating;
        this.AttractionCode = AttractionCode;
        this.imageUrl = imageUrl;
    }

    private String Attraction;
    private  String type;
    private String location;
    private  int rating;
    private String AttractionCode;
    private String imageUrl;

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

    public  String getAttractionCode() {
        return AttractionCode;
    }
    public void setAttractionCode(String AttractionCode) {
        this.AttractionCode = AttractionCode;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String ImageUrl) {
        this.imageUrl = imageUrl;
    }



    public static ArrayList<attractions> getAttractions() {
        ArrayList<attractions> Attractions = new ArrayList<>();
        Attractions.add(new attractions("Bondi Beach", "Recreational", "Bondi Beach, Sydney NSW 2026", 4, "BB", "https://upload.wikimedia.org/wikipedia/commons/e/e5/Bondi_Beach_Sydney_Australia_7.jpg"));
        Attractions.add(new attractions("Sydney Opera House", "Arts", "Bennelong Point, Sydney NSW 2000", 4, "OH", "https://media-cdn.tripadvisor.com/media/photo-m/1280/17/3b/95/61/photo2jpg.jpg"));
        Attractions.add(new attractions("Sydney Harbour Bridge", "Historical", "Sydney Harbour Bridge, Sydney NSW", 5, "SB", "https://images.arcadis.com/media/A/F/D/%7BAFDCAEB3-7314-48FC-B624-D209EC987F35%7DSydney-Harbour-Bridge-header.jpg?width=1920&height=0&mode=crop&anchor=top"));
        Attractions.add(new attractions("Royal Botanical Gardens", "Recreational", "Mrs Macquaries Rd, Sydney NSW 2000", 4, "BG","https://sydneylivingmuseums.com.au/sites/default/files/crop%20Spring%20Walk%202007%2026.jpg"));
        Attractions.add(new attractions("Taronga Zoo", "Recreational", "Bradleys Head Rd, Mosman NSW 2088", 4, "TZ", "https://www.ausleisure.com.au/images/ausleisure/files/_news-main/Taronga_Zoo_Sydney_1.jpg"));
        Attractions.add(new attractions("Sydney Tower", "Viewing point", "100 Market St, Sydney NSW 2000", 4, "ST","https://media.timeout.com/images/105264886/630/472/image.jpg"));
        Attractions.add(new attractions("Paddington Markets", "Food and shopping", "395 Oxford St, Paddington NSW 2021", 3, "PM","https://www.jollyswagman.com.au/blog/wp-content/uploads/2015/01/Markets3.jpg"));
        Attractions.add(new attractions("Cockatoo Island", "Recreational", "Camber Wharf Docks Precinct, Balmain NSW 2041", 4, "CI","https://media.timeout.com/images/103835951/image.jpg"));
        Attractions.add(new attractions("Luna Park", "Recreational", "1 Olympic Dr, Milsons Point NSW 2061", 5, "LP","https://thebigbus.com.au/wp-content/uploads/2019/08/Luna-Park-Unlimited-Rides-Pass-2.jpg"));
        Attractions.add(new attractions("Powerhouse Museum", "Historical", "500 Harris St, Ultimo NSW 2007", 4, "PM","https://www.ausleisure.com.au/images/ausleisure/files/_news-main/Powerhouse_Museum_MAAS_Ultimo_lr.jpg"));
        return Attractions;
    }


}