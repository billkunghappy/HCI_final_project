package com.example.hci_high_fi;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import static android.support.v4.content.res.TypedArrayUtils.getDrawable;

public class homepage extends Fragment {

    public homepage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootlayer=inflater.inflate(R.layout.fragment_homepage, container, false);
        String[] itemname ={
                "Exhibit1",
                "Exhibit2",
                "Exhibit3",
                "Exhibit4",
        };


        Integer[] img_src={
                R.drawable.main_small,
                R.drawable.main_small,
                R.drawable.main_small,
                R.drawable.main_small,
        };

        Integer[] dsrpid= {
                R.drawable.exhibit_dsrp,
                R.drawable.exhibit_dsrp,
                R.drawable.exhibit_dsrp,
                R.drawable.exhibit_dsrp,
        };
        LinearLayout list=rootlayer.findViewById(R.id.exhibit_list);
        //************** Exhibit List **************//
        for (int i=0;i<4;i++){
            View add_block = getLayoutInflater()
                    .inflate(R.layout.exhibit_list, list, false);
            ImageButton imgbtn = (ImageButton)add_block.findViewById(R.id.exhib_list_img);
            imgbtn.setImageResource(img_src[i]);
            list.addView(add_block);
        }

        return rootlayer;
    }

}
