package com.example.hci_high_fi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class bookmark_gallery_page extends Fragment {

    public bookmark_gallery_page() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root_view=inflater.inflate(R.layout.fragment_bookmark_gallery_page, container, false);

        //create gallery blocks
//        bookmark_exhib
        //insert gallery blocks
        LinearLayout to_insert_gallery_block=root_view.findViewById(R.id.to_insert_gallery_block);
        int count3=0,item_num=10;
        LinearLayout ll;
        for (int i=0; i*3<item_num; i+=1){
            ll = new LinearLayout(getActivity().getApplicationContext());
            ll.setOrientation(LinearLayout.HORIZONTAL);
            int height_in_px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 180, getResources().getDisplayMetrics());
            LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, height_in_px);
            ll.setPadding(15,15,15,15);
            ll.setWeightSum(3);
            ll.setLayoutParams(layoutParams);
            to_insert_gallery_block.addView(ll);

            //include blocks here
            for (int j=0; j<3; j++){
                if (i*3+j>=item_num)
                    break;
                View add_block = getLayoutInflater()
                        .inflate(R.layout.elem_bookmark_gallery_block, ll, false);
                ll.addView(add_block);

            }

            //set listener and tag
        }

        return root_view;

    }

}
