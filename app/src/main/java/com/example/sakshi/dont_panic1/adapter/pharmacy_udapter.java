/*
 * %W% %E% Zain-Ul-Abedin
 *
 * Copyright (c) 2017-2018. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of ZainMustafaaa.
 * You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement
 * for learning purposes.
 *
 */
package com.example.sakshi.dont_panic1.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sakshi.dont_panic1.Hospital.NearbyHospitalsDetail;
import com.example.sakshi.dont_panic1.Pharmacy.NearestPharmacy;
import com.example.sakshi.dont_panic1.Pharmacy.PharmacyDetail;
import com.example.sakshi.dont_panic1.R;

import java.util.ArrayList;


public class pharmacy_udapter extends BaseAdapter {
    private Context context;
    private ArrayList<PharmacyDetail> PharmacyList;

    public pharmacy_udapter(Context context,ArrayList<PharmacyDetail> PharmacyList) {
        this.context = context;
        this.PharmacyList = PharmacyList;
    }


    @Override
    public int getCount() {
        return PharmacyList.size();
    }


    @Override
    public Object getItem(int i) {
        return PharmacyList.get(i);
    }


    @Override
    public long getItemId(int i) {
        return 3232;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null) view = view.inflate(context, R.layout.pharmacy_view_list, null);

        TextView placeTextView =  view.findViewById(R.id.placeNameTextView);
        TextView ratingTextView =  view.findViewById(R.id.ratingTextView);
        TextView openNowTextView =  view.findViewById(R.id.openingTime);

        placeTextView.setText(PharmacyList.get(i).getPharmacyName());
        ratingTextView.setText(PharmacyList.get(i).getRating());
        openNowTextView.setText("Open now: " + PharmacyList.get(i).getOpeningHours());

        return view;
    }
}
