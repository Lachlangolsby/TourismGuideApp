package au.edu.unsw.infs3634.tourismguide;

import java.util.ArrayList;

public class attractions {

    // 1. Declaring variable for attraction class type
    private String Attraction;
    private String type;
    private String location;
    private String suburb;
    private double rating;
    private String AttractionCode;
    private String priceGuide;
    private String imageUrl;
    private String imageUrl2;
    private String imageUrl3;
    private String phoneNumber;
    private String email;
    private String description;

    // 2. Creating constructor for attractions class
    public attractions(String Attraction, String type, String location, String suburb, double rating, String AttractionCode, String priceGuide, String imageUrl,String imageUrl2, String imageUrl3, String phoneNumber, String email, String description) {
        this.Attraction = Attraction;
        this.type = type;
        this.location = location;
        this.suburb = suburb;
        this.rating = rating;
        this.AttractionCode = AttractionCode;
        this.priceGuide = priceGuide;
        this.imageUrl = imageUrl;
        this.imageUrl2 = imageUrl2;
        this.imageUrl3 = imageUrl3;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.description = description;

    }

    // 3.creating Array list to be used by adapter class to implement correctly into the recycler view. (Acts similar to a database for the workings of the app).
    public static ArrayList<attractions> getAttractions() {
        ArrayList<attractions> Attractions = new ArrayList<>();
        Attractions.add(new attractions("Bondi Beach", "Recreational", "Bondi Beach, Sydney NSW 2026", "Bondi 2026", 4.6, "BB", "$30 PP", "https://upload.wikimedia.org/wikipedia/commons/e/e5/Bondi_Beach_Sydney_Australia_7.jpg", "https://cdn.theculturetrip.com/wp-content/uploads/2019/11/khj7eh.jpg","https://www.sydney.com/sites/sydney/files/styles/landscape_992x558/public/2019-09/147392-56.jpg?itok=uFCTfJ0m","(02) 9083 8000 ", "info@waverley.nsw.gov.au", "Bondi Beach is Australia's most famous beach. The jewel of Sydney's laid-back beach lifestyle is home to one of the oldest surf lifesaving clubs in the world and one of Australia's oldest swimming clubs."));
        Attractions.add(new attractions("Sydney Opera House", "Arts", "Bennelong Point, Sydney NSW 2000", "Haymarket 2000", 4.3, "OH", "$40 PP  ", "https://media-cdn.tripadvisor.com/media/photo-m/1280/17/3b/95/61/photo2jpg.jpg","https://imgs.classicfm.com/images/112697?width=1000&crop=16_9&signature=XBbdgPuFObxMZ8mc5K5XIhWcJSw=" ,"https://i.pinimg.com/originals/79/10/c3/7910c32621f7579d05ae20728f1abf55.jpg","(02) 9250 7111", "bookings@sydneyoperahouse.com", "The Opera House is Sydney's best-known landmark. It is a multipurpose performing arts facility whose largest venue, the 2,679-seat Concert Hall, is host to symphony concerts, choir performances, and popular music shows."));
        Attractions.add(new attractions("Sydney Harbour Bridge", "Historical", "Sydney Harbour Bridge, Sydney NSW 2000", "Haymarket 2000", 4.3, "SB", "$100 PP", "https://images.arcadis.com/media/A/F/D/%7BAFDCAEB3-7314-48FC-B624-D209EC987F35%7DSydney-Harbour-Bridge-header.jpg?width=1920&height=0&mode=crop&anchor=top","https://www.sydney.com/sites/sydney/files/styles/landscape_992x558/public/2019-10/150417-Header.jpg?itok=9fxZoqXC","https://visitgayaustralia.com.au/wp-content/uploads/2019/04/Sydney%20Harbour%20Bridge%20Fireworks%20VGA.jpg", "(02) 8274 7777", "admin@bridgeclimb.com", "The Sydney Harbour Bridge is the world's widest and tallest (but not longest) steel arch bridge."));
        Attractions.add(new attractions("Royal Botanical Gardens", "Recreational", "Mrs Macquaries Rd, Sydney NSW 2000", "Haymarket 2000", 4.1, "BG", "$15 PP", "https://sydneylivingmuseums.com.au/sites/default/files/crop%20Spring%20Walk%202007%2026.jpg","https://assets.atdw-online.com.au/images/fdb160eeadc7d83ce96aa78c6c684b9d.jpeg?rect=178","https://pbs.twimg.com/media/ET1cmusWAAAVKJj.jpg", "(02) 9231 8111", "feedback@rbgsyd.nsw.gov.au", "The Royal Botanic Garden Sydney, an oasis of 30 hectares in the heart of the city. Wrapped around Sydney Harbour, the Gardens occupy one of Sydney's most spectacular positions. "));
        Attractions.add(new attractions("Taronga Zoo", "Recreational", "Bradleys Head Rd, Sydney NSW 2088", "Mosman 2088", 4.0, "TZ", "$75 PP", "https://www.ausleisure.com.au/images/ausleisure/files/_news-main/Taronga_Zoo_Sydney_1.jpg","https://www.savingdessert.com/wp-content/uploads/2018/06/Taronga-Zoo-Sydney-Australia-3.jpg","https://taronga.org.au/sites/default/files/styles/opengraph/public/content/header-images/header-tz-shows-keeper-talks-birdshow-2880.jpg?itok=Thl61-81", "(02) 9969 2777", "tz@zoo.nsw.gov.au", "the award-winning Taronga Zoo is home to over 4,000 animals, including Australian native wildlife, as well as rare and endangered exotic animals. Overlooking the magnificent Sydney Harbour."));
        Attractions.add(new attractions("Sydney Tower", "Viewing point", "100 Market St, Sydney NSW 2000", "Haymarket 2000", 4.1, "ST", "$50 PP", "https://media.timeout.com/images/105264886/630/472/image.jpg","https://m.experiencesydneyaustralia.com/images/sendbinary.asp?path=imagesDB/gallery/Gallery_sydneytower_1.jpg","https://image.iventurecard.com/images/attractions/attraction_57_main_5ed6effb8af50.jpg", "Not Available", "sydneytowereye@merlinentertainments.com.au", "The Tower is 309 metres tall from top to bottom and can hold almost 1,000 people at any given time. It's the second tallest observation tower in the Southern Hemisphere. The Sydney Tower was opened in 1981."));
        Attractions.add(new attractions("Cockatoo Island", "Recreational", "Cockatoo Island, Sydney", "Rozelle 2039", 4.6, "CI", "$30 pp", "https://media.timeout.com/images/103835951/image.jpg","https://media.timeout.com/images/105554912/image.jpg","https://sydneyuncovered.com/wp-content/uploads/2020/04/cockatoo-island.jpg", "(02) 8969 2100", "info@harbourtrust.gov.au", "A short ferry ride from the CBD, Cockatoo Island is a historically significant place where visitors can explore historic landmarks and stay overnight.Cockatoo Island???s offers heritage accommodation, waterfront camping and picnic spots with panoramic harbour views."));
        Attractions.add(new attractions("Luna Park", "Recreational", "1 Olympic Dr, Sydney NSW 2061", "Milsons Point 2061", 4.9, "LP", "$80 PP", "https://thebigbus.com.au/wp-content/uploads/2019/08/Luna-Park-Unlimited-Rides-Pass-2.jpg","https://coasterbuzz.com/CoasterPhoto/CoasterPhotoImage/550","https://www.lunaparksydney.com/sites/default/files/2020-08/img_0737.jpg", "(02) 9922 6644", "tourism@lunaparksydney.com", "Sydney's much-loved Luna Park is a superbly restored 1930s amusement park where everyone goes - just for fun.Take on crazy rides like the Tango Train or nostalgic favourites such as the beautifully restored Ferris Wheel."));
        Attractions.add(new attractions("Powerhouse Museum", "Historical", "500 Harris St, Sydney NSW 2007", "Ultimo 2007", 4.4, "PM", "$40 PP ", "https://www.ausleisure.com.au/images/ausleisure/files/_news-main/Powerhouse_Museum_MAAS_Ultimo_lr.jpg", "https://media.timeout.com/images/103101762/630/472/image.jpg","https://maas.museum/app/uploads/2015/01/space-3-2500x1667.jpg","(02) 9217 0111 500", "events@maas.com.au", "Located in the Ultimo Power Station in Darling Harbour, the Powerhouse Museum's building is in itself worthwhile visiting as part of Sydney's history. The collections on display span science, technology, design etc."));
        Attractions.add(new attractions("Paddy's Markets", "Food and shopping", "9-13 Hay St, Sydney NSW 2000", "Haymarket 2000", 3.7, "PD", "$30 PP ", "https://www.rydges.com/accommodation/sydney-nsw/sydney-central/wp-content/uploads/sites/4/2015/10/500x434-Paddys-Markets.jpg","https://escape.files.wordpress.com/2012/02/paddysmarketssydney.jpg","https://c8.alamy.com/comp/MP2M4N/sydney-australia-april-6-2018-famous-paddys-market-specializing-in-imported-clothes-giftware-MP2M4N.jpg", "(02) 9325 6200", "manager@paddysmarkets.com.au", "Started as a market to encourage local fashion designers, craftspeople, jewellery makers and artists, the market has over 150 unique stalls filled with creative fashion and accessories"));
        Attractions.add(new attractions("Port Jackson Bay", "Recreational", "Port Jackson, New South Wales", "Mosman 2088", 4.5, "PJ", "$30 PP", "https://www.nma.gov.au/__data/assets/image/0010/634654/Port-Jackson-1400w-1.jpg","https://cdn.concreteplayground.com/content/uploads/2011/12/eddy-milfort-nielsen-park-vaucluse-1920x1440.jpg" ,"https://www.visitsydneyaustralia.com.au/images/mosman-bay.jpg"," (02) 9936 8100", "council@northsydney.nsw.gov.au", "Port Jackson, consisting of the waters of Sydney Harbour, Middle Harbour, North Harbour and the Lane Cove and Parramatta Rivers, is the ria or natural harbour of Sydney, New South Wales, Australia."));
        Attractions.add(new attractions("Darling Harbour", "Food and shopping", "Darling Harbour, Sydney, NSW 2000", "Haymarket 2000", 4.3, "DH", "$40 PP  ", "https://cf.bstatic.com/images/hotel/max1024x768/171/171428026.jpg", "https://www.cocklebaywharf.com.au/sites/default/files/styles/hero_image/public/125100-3.jpg?itok=v9rlgFo9&c=8bd21f6f6c889b5e8dcf9ad037586697","https://i.pinimg.com/originals/ea/5c/0c/ea5c0c5a0095a95a132d27ed996859b9.jpg","(02) 9240 8500", "pag.contactusdarlingharbour@property.nsw.gov.au", "Darling Harbour is a harbour adjacent to the city centre of Sydney, New South Wales, Australia that is made up of a large recreational and pedestrian precinct that is situated on western outskirts of the Sydney central business district."));
        Attractions.add(new attractions("Manly Beach", "Recreational", "Manly Beach, Sydney NSW 2095", "Manly 2095", 4.4, "MB", "$30 PP", "https://assets.atdw-online.com.au/images/e8a55b1da3eedfbe4ae7c4c967ee2e62.jpeg?rect=462,0,6953,5215&w=745&h=559&&rot=360","https://i.redd.it/7ftscnnffes31.jpg" ,"https://www.parraparents.com.au/wp-content/uploads/2017/01/manly-beach.jpg","1300 434 434", "council@northernbeaches.nsw.gov.au", "Manly Beach is a world famous Australian landmark. It is one of the most renowned beaches for surfing. The beach was named by Capt. Arthur Phillip after the indigenous people living there"));
        Attractions.add(new attractions("The Star Casino", "Recreational", "80 Pyrmont St, Sydney NSW 2009", "Pyrmont 2009", 4.1, "SC", "$150 PP", "https://www.casino.org/news/wp-content/uploads/2019/02/The-Star-Casino.png","https://www.luckynuggetcasino.com/luckyblog/images/uploads/2017/08/StarCasinoSydney.jpg","https://www.star.com.au/sydney/sites/default/files/thumbnails/image/rSuperbowl%20LI%20at%20The%20Star-320.jpg", "(02) 9777 9000", "STARRESERVATIONS@STAR.COM.AU", "The casino features two gaming floors ??? the main gaming floor on level one for general entry and the Sovereign Room on level three. The Sovereign Room table bet ranges from $25 to $75,000 and also contains the Inner Sanctum, with table bet ranges of $100 to $500,000. "));
        Attractions.add(new attractions("Sydney Town Hall", "Historcial", "483 George St, Sydney NSW 2000", "Haymarket 2000", 4.0, "TH", "$25 PP", "https://s3.ap-southeast-2.amazonaws.com/cdn.sydneytownhall.com.au/media/STHFrontsteps.jpg","https://www.cityofsydney.nsw.gov.au/-/jssmedia/corporate/images/places-and-spaces/landmarks/sydney-town-hall/centennial-hall.jpg?mw=640","https://i.redd.it/olvrmohu6n021.jpg", "(02) 9265 9333", "council@cityofsydney.nsw.gov.au", "The Sydney Town Hall is a late 19th-century heritage-listed town hall building in the city of Sydney, the capital city of New South Wales, Australia, housing the chambers of the Lord Mayor of Sydney, council offices, and venues for meetings and functions."));
        return Attractions;
    }

    // 4. Creating getters and setters for the various attributes of attractions class type
    public String getAttraction() {
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

    public String getAttractionCode() {
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

    public String getImageUrl2() {
        return imageUrl2;
    }

    public void setImageUrl2(String ImageUrl2) {
        this.imageUrl2 = ImageUrl2;
    }

    public String getImageUrl3() {
        return imageUrl3;
    }

    public void setImageUrl3(String ImageUrl3) {
        this.imageUrl3 = ImageUrl3;
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
}