package com.example.fragements;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;

public class ftab1 extends Fragment {
    private RecyclerView recyclerView;
    ArrayList<Persons> personsArrayList;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ftab1.
     */
    // TODO: Rename and change types and number of parameters
    public static ftab1 newInstance(String param1, String param2) {
        ftab1 fragment = new ftab1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);



        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_ftab1, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        personsArrayList = new ArrayList<>();


        int[] images = {R.drawable.ic_baseline_person_24, R.drawable.ic_baseline_person_24, R.drawable.ic_baseline_person_24, R.drawable.ic_baseline_person_24, R.drawable.ic_baseline_person_24, R.drawable.ic_baseline_person_24, R.drawable.ic_baseline_person_24, R.drawable.ic_baseline_person_24};
        String[] names = {"Ali", "Asad", "Ammar", "Aleena", "Zamal", "Sarim", "Umair", "Afifa"};
        int[] date = {1990, 1998, 1987, 1876, 1999, 1977, 1999, 1998};
        String[] city = {"lahore", "Islamabad", "Karachi", "lahore", "Islamabad", "Muree", "Islamabad", "Lahore"};

        for (int i = 0; i < 8; i++) {
            personsArrayList.add(new Persons(images[i], names[i], date[i], city[i]));
        }
        RecyclerViewAdapter recyclerClassAdapter=new RecyclerViewAdapter(personsArrayList);
        recyclerView.setAdapter(recyclerClassAdapter);
        return view;
    }
}