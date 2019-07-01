package com.example.hellofragmentlandscape;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListaFragment extends Fragment {

    public ListaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewListaFragment = inflater.inflate(R.layout.fragment_lista, container, false);
        ListView listEmail = viewListaFragment.findViewById(R.id.lvEmail);

        final String [] listItems = new String[] {"Email 1", "Email 2", "Email 3", "Email 4"};

        final ArrayAdapter <String> listAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, listItems);

        listEmail.setAdapter(listAdapter);

        listEmail.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                // String selectedEmail = listItems(position).toString();
                intent.putExtra("selectedEmail", listItems[position]);
                startActivity(intent);
            }
        });

        return viewListaFragment;
    }

}
