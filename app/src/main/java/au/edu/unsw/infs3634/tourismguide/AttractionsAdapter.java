package au.edu.unsw.infs3634.tourismguide;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AttractionsAdapter extends RecyclerView.Adapter<AttractionsAdapter.AttractionsViewHolder> implements Filterable {
    public static final int SORT_METHOD_TITLE = 1;
    public static final int SORT_METHOD_LOCATION = 2;
    private ArrayList<attractions> mAttractions;
    private ArrayList<attractions> mAttractionsFiltered;
    private RecyclerViewClickListener mListener;



    public AttractionsAdapter(ArrayList<attractions> Attractions, RecyclerViewClickListener listener) {
     mAttractions = Attractions;
     mAttractionsFiltered =Attractions;
     mListener = listener;
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    mAttractionsFiltered = mAttractions;
                } else {
                    ArrayList<attractions> filteredList = new ArrayList<>();
                    for (attractions Attractions : mAttractions) {
                        if (Attractions.getAttraction().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(Attractions);
                        }
                    }

                    mAttractions = filteredList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = mAttractionsFiltered;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                mAttractionsFiltered = (ArrayList<attractions>) filterResults.values;
                notifyDataSetChanged();


            }
        };
    }

    @NonNull
    @Override
    public AttractionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewtype) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new AttractionsViewHolder(v, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AttractionsViewHolder holder, int position) {
        attractions Attractions =mAttractionsFiltered.get(position);
        DecimalFormat df = new DecimalFormat("#,###,###,###");
        holder.attraction.setText(Attractions.getAttraction());
        holder.location.setText(Attractions.getLocation());
        holder.rating.setText("+" + df.format(Attractions.getRating()));
        holder.itemView.setTag(Attractions.getAttractionCode());
    }
    @Override
    public int getItemCount() {
        return mAttractionsFiltered.size();
    }


    public interface RecyclerViewClickListener {
        void onClick(View view, String countryCode);
    }

    public static class AttractionsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView attraction, location, rating;
        private AttractionsAdapter.RecyclerViewClickListener listener;


        public AttractionsViewHolder(@NonNull View itemView, RecyclerViewClickListener listener) {
            super(itemView);
            this.listener = listener;
            itemView.setOnClickListener(this);
            attraction = itemView.findViewById(R.id.tvTitle);
            location = itemView.findViewById(R.id.tvLocation);
            rating = itemView.findViewById(R.id.tvRating);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(v, (String) v.getTag());
        }
    }

    public void sort(final int sortMethod) {
        if (mAttractionsFiltered.size() > 0) {
            Collections.sort(mAttractionsFiltered, new Comparator<attractions>() {
                @Override
                public int compare(attractions t0, attractions t1) {
                    if (sortMethod == SORT_METHOD_TITLE) {
                        return Integer.toString(t0.getRating()).compareTo(Integer.toString(t1.getRating()));

                    } else if (sortMethod == SORT_METHOD_LOCATION) {
                        return t1.getLocation().compareTo(t0.getLocation());
                    }
                    return t1.getLocation().compareTo(t0.getLocation());
                }
            });
        } notifyDataSetChanged();
    }
}
