package com.example.hci_high_fi;

public class bookmark_item {
    private Integer item_id;
    String item_name;
    String item_description;
    String image_src;
    public bookmark_item(Integer id, String item_name, String item_description, String image_src){
        this.item_id=id;
        this.item_name=item_name;
        this.item_description=item_description;
        this.image_src=image_src;
    }
}
