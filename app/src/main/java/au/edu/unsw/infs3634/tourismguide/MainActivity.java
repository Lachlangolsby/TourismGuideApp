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


        mAdapter = new AttractionsAdapter(attractions.getAttractions(),listener);
        mRecyclerView.setAdapter(mAdapter);
    }
    private void launchDetailActivity (String message) {
        Intent intent = new Intent ( this, DetailActivity.class);
        intent.putExtra(DetailActivity.Code, message);
        startActivity(intent);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        SearchView SearchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        SearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
            @Override
            public boolean onQueryTextSubmit (String query){
                mAdapter.getFilter().filter(query);
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText){
                mAdapter.getFilter().filter(newText);
                return false;
            }

        } );return true;
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()){
            case R.id.sort_Title:
                mAdapter.sort(AttractionsAdapter.SORT_METHOD_TITLE);
                return true;
            case R.id.sort_Location:
                mAdapter.sort(AttractionsAdapter.SORT_METHOD_LOCATION);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

