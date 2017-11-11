package com.vivekvix.slidepageviewer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by R P Singh on 11/11/2017.
 */

public class Aboutme extends Fragment {


    public static Aboutme newInstance() {
        Aboutme fragment = new Aboutme();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.aboutme);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.aboutme, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.txtMain);


        ImageView imageView = (ImageView) view.findViewById(R.id.imgMain);

        return view;
    }


}
