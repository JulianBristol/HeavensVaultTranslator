package com.example.heavensvaulttranslator;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class HeavensVaultController {
    @FXML
    private VBox HVApplicationVBox;

    @FXML
    private MenuItem aboutApp;

    @FXML
    private TabPane tabPane;

    @FXML
    private TextField ancientGlyphTranslation;

    @FXML
    private TextField ancientGlyphView;

    @FXML
    private MenuItem appPreferences;

    @FXML
    private Button btn_0;

    @FXML
    private Button btn_1;

    @FXML
    private Button btn_2;

    @FXML
    private Button btn_3;

    @FXML
    private Button btn_4;

    @FXML
    private Button btn_5;

    @FXML
    private Button btn_6;

    @FXML
    private Button btn_7;

    @FXML
    private Button btn_8;

    @FXML
    private Button btn_9;

    @FXML
    private Button btn_A;

    @FXML
    private Button btn_B;

    @FXML
    private Button btn_C;

    @FXML
    private Button btn_D;

    @FXML
    private Button btn_Q;

    @FXML
    private Button btn_E;

    @FXML
    private Button btn_F;

    @FXML
    private Button btn_G;

    @FXML
    private Button btn_H;

    @FXML
    private Button btn_I;

    @FXML
    private Button btn_J;

    @FXML
    private Button btn_K;

    @FXML
    private Button btn_L;

    @FXML
    private Button btn_M;

    @FXML
    private Button btn_N;

    @FXML
    private Button btn_O;

    @FXML
    private Button btn_P;

    @FXML
    private Button btn_R;

    @FXML
    private Button btn_S;

    @FXML
    private Button btn_T;

    @FXML
    private Button btn_U;

    @FXML
    private Button btn_V;

    @FXML
    private Button btn_W;

    @FXML
    private Button btn_X;

    @FXML
    private Button btn_Y;

    @FXML
    private Button btn_Z;

    @FXML
    private Button btn_Semicolon;

    @FXML
    private Button btn_SingleQuote;

    @FXML
    private Button btn_Period;

    @FXML
    private Button btn_QuestionMark;

    @FXML
    private Button btn_OpenParenthesis;

    @FXML
    private Button btn_Comma;

    @FXML
    private Button btn_DoubleQuote;

    @FXML
    private Button btn_EqualSign;

    @FXML
    private Button btn_Colon;

    @FXML
    private Button btn_CloseParenthesis;

    @FXML
    private Button btn_BackBtn;

    @FXML
    private Button btn_ClearBtn;

    @FXML
    private MenuItem closeApp;

    @FXML
    private CheckBox confirmTranslation;

    @FXML
    private CheckBox markTranslation;

    @FXML
    private MenuItem revertApp;

    @FXML
    private Button submitTranslation;

    @FXML
    private Tab tab_NewTranslation;

    @FXML
    void initialize() {
        assert HVApplicationVBox != null : "fx:id=\"HVApplicationVBox\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert aboutApp != null : "fx:id=\"aboutApp\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert ancientGlyphTranslation != null : "fx:id=\"ancientGlyphTranslation\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert ancientGlyphView != null : "fx:id=\"ancientGlyphView\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert appPreferences != null : "fx:id=\"appPreferences\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert closeApp != null : "fx:id=\"closeApp\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert confirmTranslation != null : "fx:id=\"confirmTranslation\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert markTranslation != null : "fx:id=\"markTranslation\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert revertApp != null : "fx:id=\"revertApp\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert submitTranslation != null : "fx:id=\"submitTranslation\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert tab_NewTranslation != null : "fx:id=\"tab_NewTranslation\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert tabPane != null : "fx:id=\"tabPane\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";

        assert btn_BackBtn != null : "fx:id=\"btn_BackBtn\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_ClearBtn != null : "fx:id=\"btn_ClearBtn\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_CloseParenthesis != null : "fx:id=\"btn_CloseParenthesis\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_Colon != null : "fx:id=\"btn_Colon\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_EqualSign != null : "fx:id=\"btn_EqualSign\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_Comma != null : "fx:id=\"btn_Comma\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_Semicolon != null : "fx:id=\"btn_Semicolon\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_DoubleQuote != null : "fx:id=\"btn_DoubleQuote\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_OpenParenthesis != null : "fx:id=\"btn_OpenParenthesis\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_SingleQuote != null : "fx:id=\"btn_SingleQuote\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_Period != null : "fx:id=\"btn_Period\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_QuestionMark != null : "fx:id=\"btn_QuestionMark\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_0 != null : "fx:id=\"btn_0\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_1 != null : "fx:id=\"btn_1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_2 != null : "fx:id=\"btn_2\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_3 != null : "fx:id=\"btn_3\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_4 != null : "fx:id=\"btn_4\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_5 != null : "fx:id=\"btn_5\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_6 != null : "fx:id=\"btn_6\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_7 != null : "fx:id=\"btn_7\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_8 != null : "fx:id=\"btn_8\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_9 != null : "fx:id=\"btn_9\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_A != null : "fx:id=\"btn_A\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_B != null : "fx:id=\"btn_B\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_C != null : "fx:id=\"btn_C\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_D != null : "fx:id=\"btn_D\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_E != null : "fx:id=\"btn_E\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_F != null : "fx:id=\"btn_F\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_G != null : "fx:id=\"btn_G\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_H != null : "fx:id=\"btn_H\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_I != null : "fx:id=\"btn_I\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_J != null : "fx:id=\"btn_J\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_K != null : "fx:id=\"btn_K\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_L != null : "fx:id=\"btn_L\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_M != null : "fx:id=\"btn_M\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_N != null : "fx:id=\"btn_N\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_O != null : "fx:id=\"btn_O\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_P != null : "fx:id=\"btn_P\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_Q != null : "fx:id=\"btn_Q\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_R != null : "fx:id=\"btn_R\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_S != null : "fx:id=\"btn_S\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_T != null : "fx:id=\"btn_T\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_U != null : "fx:id=\"btn_U\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_V != null : "fx:id=\"btn_V\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_W != null : "fx:id=\"btn_W\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_X != null : "fx:id=\"btn_X\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_Y != null : "fx:id=\"btn_Y\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_Z != null : "fx:id=\"btn_Z\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";

    }
}