package com.example.hci_high_fi;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class bookmark_exhib_list {

    private String exhib_name;
    private static java.util.ArrayList<bookmark_exhib> exhib_list=new java.util.ArrayList<bookmark_exhib>();
    void add_bookmark_exhib(bookmark_exhib one_exhib){
        exhib_list.add(one_exhib);
    }
    int size(){
        return exhib_list.size();
    }
    void generate_n(int n){
        for (int i=0; i<n; i++){
            bookmark_exhib new_exhib= new bookmark_exhib("test_name",i);
            exhib_list.add(new_exhib);
        }
    }
    static ArrayList<String> get_item_img_from_index(int n){
        return (exhib_list.get(n)).three_img;
    }
    bookmark_exhib get_exhib_by_list_index(Integer index){
        return exhib_list.get(index);
    }
}
