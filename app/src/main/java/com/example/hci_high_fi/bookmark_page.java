package com.example.hci_high_fi;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

import java.util.ArrayList;

public class bookmark_page extends Fragment implements View.OnClickListener{
    public bookmark_page() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root_view=inflater.inflate(R.layout.fragment_bookmark_page, container, false);

        //create bookmark exhib(later need changes)



        LinearLayout to_insert_block=root_view.findViewById(R.id.to_insert_block);
        for (int i=0; i<MainActivity.bookmark_exhib_list.size(); i++){
            LinearLayout ll = new LinearLayout(getActivity().getApplicationContext());
            ll.setOrientation(LinearLayout.VERTICAL);
            LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(layoutParams);
            to_insert_block.addView(ll);
            //include blocks here
            View add_block = display_exhib_block(ll,i);
            ll.addView(add_block);
            //set listener and tag
            ConstraintLayout layout_to_click=ll.findViewById(R.id.to_click);
            String exhib_id="exhib_".concat(String.valueOf(MainActivity.bookmark_exhib_list.get_exhib_by_list_index(i).get_id()));
            layout_to_click.setTag(exhib_id);
            layout_to_click.setOnClickListener(this);
        }

        return root_view;
    }
    private View display_exhib_block(LinearLayout ll, int exhib_index){
        View add_block = getLayoutInflater()
                .inflate(R.layout.elem_bookmark_active_block, ll, false);
        ArrayList<ImageView> imgview= new ArrayList<ImageView>();
        imgview.add((ImageView)(add_block.findViewById(R.id.gallery_img_0)));
        imgview.add((ImageView)(add_block.findViewById(R.id.gallery_img_1)));
        imgview.add((ImageView)(add_block.findViewById(R.id.gallery_img_2)));
        for (int j=0; j<3; j++){
            String img_src=(bookmark_exhib_list.get_item_img_from_index(exhib_index)).get(j);
            Resources res = this.getResources();
            int resID = res.getIdentifier(img_src, "drawable", MainActivity.PACKAGE_NAME);
            (imgview.get(j)).setImageResource(resID);
        }
        return add_block;
    }

    public void onClick(View v) {
        Context context = getActivity().getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;
        String s = (String) v.getTag();
        Toast toast = Toast.makeText(context, s, duration);
        toast.show();
        String buffer = (String) MainActivity.getBuffer();
        Fragment fragment = new bookmark_gallery_page();
        getFragmentManager().beginTransaction()
                .replace(R.id.fragframe, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
    }
}
