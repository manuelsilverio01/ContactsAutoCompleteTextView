package com.meyerlaurent.cactv;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

/**
 * Created by laurentmeyer on 11/04/15.
 */
public class People {
    private Spanned name;
    private Spanned data;
    private Bitmap picture;

    public People(Spanned name, SpannableStringBuilder data, Bitmap picture) {
        this.name = name;
        this.data = data;
        this.picture = picture;
    }

    public Bitmap getPicture() {
        return picture;
    }

    public void setPicture(Bitmap picture) {
        this.picture = picture;
    }


    public Spanned getName() {
        return name;
    }

    public void setName(Spanned name) {
        this.name = name;
    }

    public Spanned getData() {
        return data;
    }

    public void setData(SpannableStringBuilder data) {
        this.data = data;
    }

    protected People(SpannableStringBuilder name, SpannableStringBuilder data) {
        this(name,data,null);
    }
}