package au.edu.unsw.infs3634.tourismguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    // 1. declaring variables to be used through out main
    private RecyclerView mRecyclerView;
    private AttractionsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 2. assigning recycler view to id in XML, and setting it to a fixed size
        mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);

        //3. calling recycleviewclicklistner method from the Attractions adapter class calling the launch detail activity method to switcch pages.
        AttractionsAdapter.RecyclerViewClickListener listener = new AttractionsAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, String AttractionCode) {
                launchDetailActivity(AttractionCode);
            }
        };


        // 4. declaring an adapter type variable which takes in array list from attractions class before assigning it to the recycler view.
        mAdapter = new AttractionsAdapter(attractions.getAttractions(), listener);
        mRecyclerView.setAdapter(mAdapter);
    }

    //5. method used to launch detail activity populated with the correct data.
    private void launchDetailActivity(String message) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.INTENT_MESSAGE, message);
        startActivity(intent);


    }

    @Override
    //6. altering the menu bar to have a search view option, the method then checks the query against items in the recycler view using the filer method from the adapter class.
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        SearchView SearchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        SearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {


            @Override
            public boolean onQueryTextSubmit(String s) {
                mAdapter.getFilter().filter(s);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                mAdapter.getFilter().filter(s);
                return false;
            }
        });
        return true;
    }

    //7. Method uses cases to distinguish between which filter option has been selected and filters results accordingly.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Sort_Rating:
                mAdapter.sort(AttractionsAdapter.SORT_METHOD_RATINGHL);
                return true;
            case R.id.sort_Rating2:
                mAdapter.sort(AttractionsAdapter.SORT_METHOD_RATINGLH);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

