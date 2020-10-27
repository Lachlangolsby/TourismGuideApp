package au.edu.unsw.infs3634.tourismguide;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AttractionsAdapter extends RecyclerView.Adapter<AttractionsAdapter.AttractionsViewHolder> implements Filterable {
    // 1. Declaring public variables to be accessed throughout application and private for adapter class
    public static final int SORT_METHOD_RATINGHL = 1;
    public static final int SORT_METHOD_RATINGLH = 2;
    private ArrayList<attractions> mAttractions;
    private ArrayList<attractions> mAttractionsFiltered;
    private RecyclerViewClickListener mListener;


    // 2. Creating constructor for adapter class.
    public AttractionsAdapter(ArrayList<attractions> Attractions, RecyclerViewClickListener listener) {
        mAttractions = Attractions;
        mAttractionsFiltered = Attractions;
        mListener = listener;


    }

    // 3. creating filter search method
    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                //4. creating charString variable to assess search has been entered
                String charString = charSequence.toString();
                //5. using if statements to adjust ArrayList before returning filtered results
                if (charString.isEmpty()) {
                    mAttractionsFiltered = mAttractions;
                } else {
                    ArrayList<attractions> filteredList = new ArrayList<>();
                    for (attractions Attractions : mAttractions) {
                        if (Attractions.getAttraction().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(Attractions);
                        }
                    }

                    mAttractionsFiltered = filteredList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = mAttractionsFiltered;
                return filterResults;
            }

            //6. publish results of filter() and changing data set
            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                mAttractionsFiltered = (ArrayList<attractions>) filterResults.values;
                notifyDataSetChanged();


            }
        };
    }

    //7. View holder required for recycler view, uses list row layout.
    @NonNull
    @Override
    public AttractionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewtype) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new AttractionsViewHolder(v, mListener);
    }


    @SuppressLint("SetTextI18n")
    //8. on bind view holder method retrieves data from attractions class and holds the correct data in each list row using attractions get methods.
    @Override
    public void onBindViewHolder(@NonNull AttractionsViewHolder holder, int position) {
        attractions Attractions = mAttractionsFiltered.get(position);
        DecimalFormat df = new DecimalFormat("#,###,###,###");
        holder.attraction.setText(Attractions.getAttraction());
        holder.price.setText(Attractions.getPriceGuide());
        holder.type.setText(Attractions.getType());
        holder.suburb.setText(Attractions.getSuburb());
        Picasso.with(holder.context).load(Attractions.getImageUrl()).resize(250, 250).into(holder.image); // Using Picasso API to retrieve images from the web.
        holder.rating.setText(Double.toString(Attractions.getRating()));
        holder.itemView.setTag(Attractions.getAttractionCode());
    }

    // 9. setting row count to number of items within the ArrayList
    @Override
    public int getItemCount() {
        return mAttractionsFiltered.size();
    }

    // 10. Filtering method created
    public void sort(final int sortMethod) {
        // 11. if a filtering option is selected . size will be > 0 then the comparator and if statements will filter results accordingly. before changing the data set shown on the UI.
        if (mAttractionsFiltered.size() > 0) {
            Collections.sort(mAttractionsFiltered, new Comparator<attractions>() {
                @Override
                public int compare(attractions t0, attractions t1) {
                    if (sortMethod == SORT_METHOD_RATINGHL) {
                        return Double.toString(t1.getRating()).compareTo(Double.toString(t0.getRating()));
                    } else if (sortMethod == SORT_METHOD_RATINGLH) {
                        return Double.toString(t0.getRating()).compareTo(Double.toString(t1.getRating()));
                    }
                    return Double.toString(t1.getRating()).compareTo(Double.toString(t0.getRating()));
                }
            });
        }
        notifyDataSetChanged();
    }

    // 12. creating interface RecyclerViewOnClickListener, which uses the on click method to take in a view and country code
    public interface RecyclerViewClickListener {
        void onClick(View view, String AttractionCode);
    }

    //13. assigning variables to UI XML elements used in the onBindViewHolder
    public static class AttractionsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView attraction, price, rating, type, suburb;
        public ImageView image;
        public Context context;
        private AttractionsAdapter.RecyclerViewClickListener listener;


        public AttractionsViewHolder(@NonNull View itemView, RecyclerViewClickListener listener) {
            super(itemView);
            this.listener = listener;
            itemView.setOnClickListener(this);
            attraction = itemView.findViewById(R.id.tvTitle);
            price = itemView.findViewById(R.id.tvPriceGuide);
            rating = itemView.findViewById(R.id.tvRating);
            image = itemView.findViewById(R.id.ivSight);
            context = itemView.getContext();
            type = itemView.findViewById(R.id.tvType);
            suburb = itemView.findViewById(R.id.tvLocation);

        }

        // 14. on click method to be used by recycler view in order to take in correct information.
        @Override
        public void onClick(View v) {
            listener.onClick(v, (String) v.getTag());
        }
    }
}
