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

    public String getAncientGlyph() {
        return ancientGlyph;
    }

    public void setAncientGlyph(String ancientGlyph) {
        this.ancientGlyph = ancientGlyph;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public int getTranslationID() {
        return translationID;
    }

    public int getIsMarked() {
        return isMarked;
    }

    public void setIsMarked(int isMarked) {
        this.isMarked = isMarked;
    }

    public int getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(int isConfirmed) {
        this.isConfirmed = isConfirmed;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ancient Glyphs: " + getAncientGlyph()).append("\n");
        sb.append("Translation: " + getTranslation()).append("\n");
        sb.append("TranslationID: " + getTranslationID()).append("\n");
        sb.append("Is Confirmed?: "+ getIsConfirmed()).append("\n");
        sb.append("Is Marked?: " + getIsMarked());
        return sb.toString();
    }
}
