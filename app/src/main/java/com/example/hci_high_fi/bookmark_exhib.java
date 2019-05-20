package com.example.hci_high_fi;
// 整個展覽的統合class
// 包含多個 bookmark_item class
// exhib_info(name, time ...)
// exhib_image()
// func(add_item, delete, edit)
public class bookmark_exhib {
    private bookmark_item item_list[];
    private String exhib_name;
    public  bookmark_exhib(String exhib_name){
        this.exhib_name=exhib_name;
    }

}
