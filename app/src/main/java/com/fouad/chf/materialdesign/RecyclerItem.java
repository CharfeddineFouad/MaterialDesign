package com.fouad.chf.materialdesign;

/**
 * Created by FOUAD on 19/07/2017.
 */

public class RecyclerItem {

     String Nom ;
    int Img ;


    public RecyclerItem(String nom, int img) {
        Nom = nom;
        Img = img;

    }

    public String getNom() {
        return Nom;
    }

    public int getImg() {
        return Img;
    }




    public void setNom(String nom) {
        Nom = nom;
    }

    public void setTitle(int img) {
        Img = img;
    }


}
