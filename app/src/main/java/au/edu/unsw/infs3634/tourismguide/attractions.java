package au.edu.unsw.infs3634.tourismguide;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class attractions {

    public attractions(String Attraction, String type, String location, String suburb, double rating, String AttractionCode, String priceGuide, String imageUrl, String phoneNumber, String email ,String description) {
        this.Attraction = Attraction;
        this.type = type;
        this.location = location;
        this.suburb = suburb;
        this.rating = rating;
        this.AttractionCode = AttractionCode;
        this.priceGuide = priceGuide;
        this.imageUrl = imageUrl;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.description = description;

    }

    private String Attraction;
    private  String type;
    private String location;
    private String suburb;
    private  double rating;
    private String AttractionCode;
    private String priceGuide;
    private String imageUrl;
    private String phoneNumber;
    private String email;
    private String description;




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

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public  String getAttractionCode() {
        return AttractionCode;
    }
    public void setAttractionCode(String AttractionCode) {
        this.AttractionCode = AttractionCode;
    }

    public String getPriceGuide() {
        return priceGuide;
    }

    public void setPriceGuide(String priceGuide) {
        this.priceGuide = priceGuide;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String ImageUrl) {
        this.imageUrl = ImageUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.priceGuide = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public static ArrayList<attractions> getAttractions() {
        ArrayList<attractions> Attractions = new ArrayList<>();
        Attractions.add(new attractions("Bondi Beach", "Recreational", "Bondi Beach, Sydney NSW 2026", "Bondi 2026",4.6, "BB", "$30 PP", "https://upload.wikimedia.org/wikipedia/commons/e/e5/Bondi_Beach_Sydney_Australia_7.jpg", "(02) 9083 8000 ", "info@waverley.nsw.gov.au", "Bondi Beach is Australia's most famous beach. The jewel of Sydney's laid-back beach lifestyle is home to one of the oldest surf lifesaving clubs in the world and one of Australia's oldest swimming clubs."));
        Attractions.add(new attractions("Sydney Opera House", "Arts", "Bennelong Point, Sydney NSW 2000", "Haymarket 2000",4.3, "OH","$40 PP  ", "https://media-cdn.tripadvisor.com/media/photo-m/1280/17/3b/95/61/photo2jpg.jpg", "(02) 9250 7111", "bookings@sydneyoperahouse.com", "The Opera House is Sydney's best-known landmark. It is a multipurpose performing arts facility whose largest venue, the 2,679-seat Concert Hall, is host to symphony concerts, choir performances, and popular music shows."));
        Attractions.add(new attractions("Sydney Harbour Bridge", "Historical", "Sydney Harbour Bridge, Sydney NSW", "Haymarket 2000",4.3, "SB","$100 PP", "https://images.arcadis.com/media/A/F/D/%7BAFDCAEB3-7314-48FC-B624-D209EC987F35%7DSydney-Harbour-Bridge-header.jpg?width=1920&height=0&mode=crop&anchor=top", "(02) 8274 7777", "admin@bridgeclimb.com", "The Sydney Harbour Bridge is the world's widest and tallest (but not longest) steel arch bridge."));
        Attractions.add(new attractions("Royal Botanical Gardens", "Recreational", "Mrs Macquaries Rd, Sydney NSW 2000", "Haymarket 2000",4.1, "BG","$15 PP","https://sydneylivingmuseums.com.au/sites/default/files/crop%20Spring%20Walk%202007%2026.jpg", "(02) 9231 8111", "feedback@rbgsyd.nsw.gov.au", "The Royal Botanic Garden Sydney, an oasis of 30 hectares in the heart of the city. Wrapped around Sydney Harbour, the Gardens occupy one of Sydney's most spectacular positions. "));
        Attractions.add(new attractions("Taronga Zoo", "Recreational", "Bradleys Head Rd, Mosman NSW 2088", "Mosman 2088",4.0, "TZ","$75 PP", "https://www.ausleisure.com.au/images/ausleisure/files/_news-main/Taronga_Zoo_Sydney_1.jpg", "(02) 9969 2777", "tz@zoo.nsw.gov.au", "the award-winning Taronga Zoo is home to over 4,000 animals, including Australian native wildlife, as well as rare and endangered exotic animals. Overlooking the magnificent Sydney Harbour."));
        Attractions.add(new attractions("Sydney Tower", "Viewing point", "100 Market St, Sydney NSW 2000","Haymarket 2000", 4.1, "ST","$50 PP","https://media.timeout.com/images/105264886/630/472/image.jpg", "Not Available", "sydneytowereye@merlinentertainments.com.au", "The Tower is 309 metres tall from top to bottom and can hold almost 1,000 people at any given time. It's the second tallest observation tower in the Southern Hemisphere. The Sydney Tower was opened in 1981."));
        Attractions.add(new attractions("Paddington Markets", "Food and shopping", "395 Oxford St, Paddington NSW 2021", "Paddington 2021",3.7, "PD","$30 PP ","https://www.jollyswagman.com.au/blog/wp-content/uploads/2015/01/Markets3.jpg", "+61 402 666 272", "manager@paddingtonmarkets.com.au", "Started as a market to encourage local fashion designers, craftspeople, jewellery makers and artists, the market has over 150 unique stalls filled with creative fashion and accessories"));
        Attractions.add(new attractions("Cockatoo Island", "Recreational", "Camber Wharf Docks Precinct, Balmain NSW 2041","Balmain 2041", 4.6, "CI","$30 pp","https://media.timeout.com/images/103835951/image.jpg", "(02) 8969 2100", "info@harbourtrust.gov.au", "A short ferry ride from the CBD, Cockatoo Island is a historically significant place where visitors can explore historic landmarks and stay overnight.Cockatoo Island’s offers heritage accommodation, waterfront camping and picnic spots with panoramic harbour views."));
        Attractions.add(new attractions("Luna Park", "Recreational", "1 Olympic Dr, Milsons Point NSW 2061", "Milsons Point 2061",4.9,"LP","$80 PP","https://thebigbus.com.au/wp-content/uploads/2019/08/Luna-Park-Unlimited-Rides-Pass-2.jpg", "(02) 9922 6644", "tourism@lunaparksydney.com", "Sydney's much-loved Luna Park is a superbly restored 1930s amusement park where everyone goes - just for fun.Take on crazy rides like the Tango Train or nostalgic favourites such as the beautifully restored Ferris Wheel."));
        Attractions.add(new attractions("Powerhouse Museum", "Historical", "500 Harris St, Ultimo NSW 2007", "Ultimo 2007",4.4, "PM","$40 PP ","https://www.ausleisure.com.au/images/ausleisure/files/_news-main/Powerhouse_Museum_MAAS_Ultimo_lr.jpg", "(02) 9217 0111 500", "events@maas.com.au", "Located in the Ultimo Power Station in Darling Harbour, the Powerhouse Museum's building is in itself worthwhile visiting as part of Sydney's history. The collections on display span science, technology, design etc."));
        return Attractions;
    }


}