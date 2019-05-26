package com.example.hci_high_fi;
// 整個展覽的統合class
// 包含多個 bookmark_item class
// exhib_info(name, time ...)
// exhib_image()
// func(add_item, delete, edit)

import android.content.Intent;

import java.util.ArrayList;

public class bookmark_exhib {
    private java.util.ArrayList<bookmark_item> item_list=new java.util.ArrayList<bookmark_item>();
    private String exhib_name;
    private Integer id;
    public ArrayList<String> three_img=new java.util.ArrayList<String>();
    public  bookmark_exhib(String exhib_name, Integer id){
        this.exhib_name=exhib_name;
        this.id=id;
        for (int i=0;i<3;i++){
            this.three_img.add("no_img");
        }
    }
    void add_bookmark_item(bookmark_item new_item){
        Integer item_id= item_list.size();
        item_list.add(new_item);
        this.three_img.set(2,three_img.get(1));
        this.three_img.set(1,three_img.get(0));
        this.three_img.set(0,new_item.image_src);

    }
    Integer get_id(){
        return id;
    }

    void generate_n(int n){
        for (int i=0;i<n;i++){
            bookmark_item new_item= new bookmark_item(i,"test"+String.valueOf(i),"test description","smell");
            this.add_bookmark_item(new_item);
        }
    }

}
