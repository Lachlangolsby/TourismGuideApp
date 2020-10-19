package au.edu.unsw.infs3634.tourismguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    public static final String INTENT_MESSAGE = "au.edu.unsw.infs3634.tourismguide.intent_message";


    private TextView mLocation;
    private TextView mRatings;
    private ImageView msearch;
    private ImageView mImage;
    public Context context;
    private TextView mEmail;
    private TextView mPhone;
    private TextView mDescription;
    private TextView mTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String value = getIntent().getStringExtra("TestData");
        setContentView(R.layout.activity_detail);


        mLocation = findViewById(R.id.tvPriceGuide);
        mRatings = findViewById(R.id.tvRating);
        mImage = findViewById(R.id.ivAttraction);
        msearch = findViewById(R.id.search);
        context = mImage.getContext();
        mEmail =findViewById((R.id.tvEmail));
        mPhone =findViewById((R.id.tvPhone));
        mDescription =findViewById((R.id.tvDescription));
        mTitle =findViewById((R.id.tvTitle));



        Intent intent = getIntent();
        String AttractionCode = intent.getStringExtra(INTENT_MESSAGE);


        ArrayList<attractions> attraction = attractions.getAttractions();
        for (final attractions Attractions: attraction){

            if (Attractions.getAttractionCode().equals(AttractionCode)){
                // update all text views with all info
                setTitle(Attractions.getAttraction());
                mLocation.setText(Attractions.getLocation());
                mRatings.setText(String.valueOf(Attractions.getRating()));
                mEmail.setText(Attractions.getEmail());
                mPhone.setText(Attractions.getPhoneNumber());
                mDescription.setText(Attractions.getDescription());
                mTitle.setText(Attractions.getAttraction());
                Picasso.with(context).load(Attractions.getImageUrl()).resize(250, 250).into(mImage);


                msearch.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick (View v) {
                        searchAttraction(Attractions.getAttraction());
                    }
                });

                findViewById((R.id.tvFurtherInfo)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick (View v) {
                        searchAttraction(Attractions.getAttraction());
                    }
                });





            }
        }
    }

    private void searchAttraction (String Attraction) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q="+ Attraction+" Sydney"));
        startActivity(intent);
    }

}



