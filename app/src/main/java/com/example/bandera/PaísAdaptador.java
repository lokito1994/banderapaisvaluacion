package com.example.bandera;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
public class PaísAdaptador extends ArrayAdapter<Pais> {

    private final Context context;
    private final ArrayList<Pais> countryList;

    public PaísAdaptador(Context context, ArrayList<Pais> countryList) {
        super(context, R.layout.listpais, countryList);
        this.context = context;
        this.countryList = countryList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listpais, null);
        }

        Pais country = countryList.get(position);

        if (country != null) {
            TextView countryName = view.findViewById(R.id.Paísnombre);
            TextView countryCapital = view.findViewById(R.id.capitalnombre);
            ImageView countryFlag = view.findViewById(R.id.imageViewCountryFlag);

            countryName.setText(country.getName());
            countryCapital.setText(country.getCapital());

            Picasso.get().load(country.getFlagURL()).into(countryFlag);
        }

        return view;
    }
}
