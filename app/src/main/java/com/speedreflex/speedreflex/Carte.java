package com.speedreflex.speedreflex;

import android.graphics.Bitmap;

/**
 * Created by xavier on 17/01/15.
 */
public class Carte {

    public Elements premierElements;
    public Elements deuxiemeElements;
    public Elements bonElements;

    private Bitmap imageCarte;


    public Carte(Elements un, Elements deux, Elements trois, Bitmap imageCarte){
        setBonElements(trois);
        setDeuxiemeElements(deux);
        setPremierElements(un);
        setImageCarte(imageCarte);
    }

    public Bitmap getImageCarte() {
        return imageCarte;
    }

    public Elements getBonElements() {
        return bonElements;
    }

    public Elements getDeuxiemeElements() {
        return deuxiemeElements;
    }

    public Elements getPremierElements() {
        return premierElements;
    }

    public void setImageCarte(Bitmap imageCarte) {
        this.imageCarte = imageCarte;
    }

    public void setBonElements(Elements bonElements) {
        this.bonElements = bonElements;
    }

    public void setDeuxiemeElements(Elements deuxiemeElements) {
        this.deuxiemeElements = deuxiemeElements;
    }

    public void setPremierElements(Elements premierElements) {
        this.premierElements = premierElements;
    }
}