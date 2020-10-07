package au.edu.unsw.infs3634.tourismguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    private TextView mAttractionName;
    private TextView mLocation;
    private TextView mRatings;
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

        ArrayList<attractions> attraction = attractions.getAttractions();
        for (final attractions attractions: attraction){
            if (attractions.getAttraction().equals(attraction)){
                // update all text views with all info
                setTitle(attractions.getAttraction());
                mAttractionName.setText(attractions.getAttraction());
                mLocation.setText(attractions.getlocation());
                mRatings.setText((int) attractions.getRating());




            }
        }
    }

    private void searchAttraction (String Attraction) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com/search/ "+ Attraction));
        startActivity(intent);
    }

}



