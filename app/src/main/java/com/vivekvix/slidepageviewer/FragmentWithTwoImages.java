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

public class FragmentWithTwoImages extends Fragment {
    private String title;
    private int imageMain;
    private int imageSecondary;


    public static FragmentWithTwoImages newInstance(String title, int resMainImage, int resSecondaryImage) {
        FragmentWithTwoImages fragment = new FragmentWithTwoImages();
        Bundle args = new Bundle();
        args.putInt("imageMain", resMainImage);
        args.putInt("imageSecondary", resSecondaryImage);
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageMain = getArguments().getInt("imageMain", 0);
        imageSecondary = getArguments().getInt("imageSecondary", 0);
        title = getArguments().getString("title");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two_images, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.txtMain);
        tvLabel.setText(title);

        ImageView imageView = (ImageView) view.findViewById(R.id.imgMain);
        imageView.setImageResource(imageMain);

        ImageView imageViewSecondary = (ImageView) view.findViewById(R.id.imgSecondary);
        imageViewSecondary.setImageResource(imageSecondary);
        return view;
    }
}