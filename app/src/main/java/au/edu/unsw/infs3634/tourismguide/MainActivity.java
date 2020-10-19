package au.edu.unsw.infs3634.tourismguide;

import android.content.Context;
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
    private RecyclerView mRecyclerView;
   private AttractionsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);


        AttractionsAdapter.RecyclerViewClickListener listener = new AttractionsAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, String AttractionCode) {
                launchDetailActivity(AttractionCode);
            }
        };



        mAdapter = new AttractionsAdapter(attractions.getAttractions(),listener );
        mRecyclerView.setAdapter(mAdapter);
    }
    private void launchDetailActivity (String message) {
        Intent intent = new Intent ( this, DetailActivity.class);
        intent.putExtra(DetailActivity.INTENT_MESSAGE, message);
        startActivity(intent);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        SearchView SearchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        SearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){


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
        } );return true;
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()){
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

