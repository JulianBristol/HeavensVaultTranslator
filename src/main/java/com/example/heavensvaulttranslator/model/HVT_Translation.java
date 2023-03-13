package com.example.heavensvaulttranslator.model;
//PURPOSE: intended to allow functionality to create, read, update, and delete translations in the database
public class HVT_Translation {

    private String ancientGlyph;
    private String translation;
    private int translationID;
    private int isMarked;
    private int isConfirmed;
    public HVT_Translation(String ancientGlyph, String translation, int isMarked, int isConfirmed){
        this.ancientGlyph = ancientGlyph;
        this.translation = translation;
        this.isMarked = isMarked;
        this.isConfirmed = isConfirmed;
    }
    public HVT_Translation(int translationID, String ancientGlyph, String translation, int isMarked, int isConfirmed){
        this.ancientGlyph = ancientGlyph;
        this.translation = translation;
        this.isMarked = isMarked;
        this.isConfirmed = isConfirmed;
        this.translationID = translationID;
    }
}
