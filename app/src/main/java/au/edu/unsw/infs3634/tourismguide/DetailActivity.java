package au.edu.unsw.infs3634.tourismguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    public static final String INTENT_MESSAGE = "au.edu.unsw.infs3634.tourismguide.intent_message";

    private TextView mAttractionName;
    private TextView mLocation;
    private TextView mRatings;
    private ImageView msearch;
    private ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String value = getIntent().getStringExtra("TestData");
        setContentView(R.layout.activity_detail);

        mAttractionName = findViewById(R.id.tvTitle);
        mLocation = findViewById(R.id.tvLocation);
        mRatings = findViewById(R.id.tvRating);
        mImage = findViewById(R.id.ivAttraction);
        msearch = findViewById(R.id.search);


        Intent intent = getIntent();
        String AttractionCode = intent.getStringExtra(INTENT_MESSAGE);


        ArrayList<attractions> attraction = attractions.getAttractions();
        for (final attractions Attractions: attraction){
//            Code = Attractions.getAttractionCode();
//            Intent intent = getIntent();
//            String AttractionCode = intent.getStringExtra(Code);

            if (Attractions.getAttractionCode().equals(AttractionCode)){
                // update all text views with all info
                setTitle(Attractions.getAttractionCode());
                mAttractionName.setText(Attractions.getAttraction());
                mLocation.setText(Attractions.getLocation());
                mRatings.setText(String.valueOf(Attractions.getRating()));

                ImageView videoButton = findViewById(R.id.search);
                msearch.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick (View v) {
                        searchAttraction(Attractions.getAttraction());
                    }
                });





            }
        }
    }

    private void searchAttraction (String Attraction) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com/search/"+ Attraction));
        startActivity(intent);
    }

}



