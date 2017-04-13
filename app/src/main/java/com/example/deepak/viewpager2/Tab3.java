package com.example.deepak.viewpager2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.deepak.viewpager2.model.PlacementRecords;
import com.example.deepak.viewpager2.model.PlacementRecordsYear;

import java.util.ArrayList;

/**
 * Created by deepak on 8/4/17.
 */

public class Tab3 extends Fragment {

    RecyclerView rvPlacementsRecords  ;
    ArrayList<PlacementRecordsYear> placementRecordsYearArrayList ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab3, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        placementRecordsYearArrayList = new ArrayList<PlacementRecordsYear>();
        placementRecordsYearArrayList.add(new PlacementRecordsYear(2010));
        placementRecordsYearArrayList.add(new PlacementRecordsYear(2011));
        placementRecordsYearArrayList.add(new PlacementRecordsYear(2012));
        placementRecordsYearArrayList.add(new PlacementRecordsYear(2013));

        rvPlacementsRecords = (RecyclerView) getActivity().findViewById(R.id.rvPlacmentsRecords);
        PlacementRecordsYearAdapter placementRecordsYearAdapter = new PlacementRecordsYearAdapter();
        rvPlacementsRecords.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvPlacementsRecords.setAdapter(placementRecordsYearAdapter);
<<<<<<< HEAD

=======
>>>>>>> 6ad65d8ed9a1670c8ef9ae3ec8d14208c6f8d214
    }

    class PlacmentRecordsyearHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tvRecordYear;
        public PlacmentRecordsyearHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            this.tvRecordYear = (TextView) itemView.findViewById(R.id.tvRecordYear);
        }

        @Override
        public void onClick(View v) {
            //Start new Activity
        }
    }


    class PlacementRecordsYearAdapter extends RecyclerView.Adapter<PlacmentRecordsyearHolder>{

        @Override
        public PlacmentRecordsyearHolder onCreateViewHolder(ViewGroup parent, int viewType) {
<<<<<<< HEAD

            LayoutInflater layoutInflater = getLayoutInflater(null);
=======
            LayoutInflater layoutInflater = getLayoutInflater(null);
            
>>>>>>> 6ad65d8ed9a1670c8ef9ae3ec8d14208c6f8d214
            View itemView;
            itemView = layoutInflater.inflate(R.layout.rv_placement_records_year,parent,false);
            return new PlacmentRecordsyearHolder(itemView);
        }

        @Override
        public void onBindViewHolder(PlacmentRecordsyearHolder holder, int position) {
            PlacementRecordsYear placementRecordsYear = placementRecordsYearArrayList.get(position);
<<<<<<< HEAD
            holder.tvRecordYear.setText(String.valueOf(placementRecordsYear.getYear())) ;
=======
            holder.tvRecordYear.setText(placementRecordsYear.getYear());
>>>>>>> 6ad65d8ed9a1670c8ef9ae3ec8d14208c6f8d214
        }

        @Override
        public int getItemCount() {
<<<<<<< HEAD
            return placementRecordsYearArrayList.size();
=======
            return 0;
>>>>>>> 6ad65d8ed9a1670c8ef9ae3ec8d14208c6f8d214
        }
    }
}


