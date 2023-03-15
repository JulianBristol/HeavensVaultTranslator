package com.example.heavensvaulttranslator;

import com.example.heavensvaulttranslator.databaseCRUD.manageGlyphs;
import com.example.heavensvaulttranslator.model.HVT_Translation;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class HeavensVaultController {
    manageGlyphs dbCrud = new manageGlyphs();

    HVT_Translation selection = null;
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
    private Button btn_01;

    @FXML
    private Button btn_11;

    @FXML
    private Button btn_21;

    @FXML
    private Button btn_31;

    @FXML
    private Button btn_41;

    @FXML
    private Button btn_51;

    @FXML
    private Button btn_61;

    @FXML
    private Button btn_71;

    @FXML
    private Button btn_81;

    @FXML
    private Button btn_91;

    @FXML
    private Button btn_A1;

    @FXML
    private Button btn_B1;

    @FXML
    private Button btn_C1;

    @FXML
    private Button btn_D1;

    @FXML
    private Button btn_Q1;

    @FXML
    private Button btn_E1;

    @FXML
    private Button btn_F1;

    @FXML
    private Button btn_G1;

    @FXML
    private Button btn_H1;

    @FXML
    private Button btn_I1;

    @FXML
    private Button btn_J1;

    @FXML
    private Button btn_K1;

    @FXML
    private Button btn_L1;

    @FXML
    private Button btn_M1;

    @FXML
    private Button btn_N1;

    @FXML
    private Button btn_O1;

    @FXML
    private Button btn_P1;

    @FXML
    private Button btn_R1;

    @FXML
    private Button btn_S1;

    @FXML
    private Button btn_T1;

    @FXML
    private Button btn_U1;

    @FXML
    private Button btn_V1;

    @FXML
    private Button btn_W1;

    @FXML
    private Button btn_X1;

    @FXML
    private Button btn_Y1;

    @FXML
    private Button btn_Z1;

    @FXML
    private Button btn_Semicolon1;

    @FXML
    private Button btn_SingleQuote1;

    @FXML
    private Button btn_Period1;

    @FXML
    private Button btn_QuestionMark1;

    @FXML
    private Button btn_OpenParenthesis1;

    @FXML
    private Button btn_Comma1;

    @FXML
    private Button btn_DoubleQuote1;

    @FXML
    private Button btn_EqualSign1;

    @FXML
    private Button btn_Colon1;

    @FXML
    private Button btn_CloseParenthesis1;

    @FXML
    private Button btn_BackBtn1;

    @FXML
    private Button btn_ClearBtn1;

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
    public Label pane_DeleteLabel;

    @FXML
    public Button pane_ConfirmDeleteBtn;

    @FXML
    public Button pane_CancelDeleteBtn;

    @FXML
    private CheckBox checkBox_Confirmed;

    @FXML
    private CheckBox checkBox_Marked;

    @FXML
    private Button cancelEditTranslation;

    @FXML
    private Tab tab_Translations;

    @FXML
    private ToggleButton tog_Btn_AncientScript;

    @FXML
    private AnchorPane anchorPane_AncientScript;

    @FXML
    private TableView<HVT_Translation> tableView_Translations;

    @FXML
    private TableColumn<HVT_Translation, String> col_AncientGlyphs;
    @FXML
    private TableColumn<HVT_Translation, String> col_Translations;
    @FXML
    private TableColumn<HVT_Translation, Integer> col_Confirmed;
    @FXML
    private TableColumn<HVT_Translation, Integer> col_Marked;

    @FXML
    private TextField textField_SearchBar;

    @FXML
    private TextField textField_SearchBarAncient;

    @FXML
    private TextField textField_SearchBarAncientPrompt;

    @FXML
    private Pane pane_togglePane;

    @FXML
    private Button pane_CancelBtn;

    @FXML
    private Button pane_DeleteBtn;

    @FXML
    private Button pane_EditBtn;

    @FXML
    private Label pane_EditField;

    @FXML
    private Pane pane_DeletePane;
    @FXML
    private Button btn_Search;

    @FXML
    protected void handleAncientBtnClick(String character) {
        if (tog_Btn_AncientScript.isSelected()){
            textField_SearchBarAncient.setText(textField_SearchBarAncient.getText() + character);
        }else{
            ancientGlyphView.setText(ancientGlyphView.getText() + character);
        }
    }

    @FXML
    protected void onSemicolonButtonClick() {
        handleAncientBtnClick(";");
    }

    @FXML
    protected void onDoubleQuotesButtonClick() {
        handleAncientBtnClick("\"");
    }

    @FXML
    protected void onCloseParenthesisButtonClick() {
        handleAncientBtnClick(")");
    }

    @FXML
    protected void onOpenParenthesisButtonClick() {
        handleAncientBtnClick("(");
    }

    @FXML
    protected void onSingleQuoteButtonClick() {
        handleAncientBtnClick("'");
    }

    @FXML
    protected void onXButtonClick() {
        handleAncientBtnClick("x");
    }

    @FXML
    protected void onPeriodButtonClick() {
        handleAncientBtnClick(".");
    }

    @FXML
    protected void onColonButtonClick() {
        handleAncientBtnClick(":");
    }

    @FXML
    protected void onQuestionMarkButtonClick() {
        handleAncientBtnClick("?");
    }

    @FXML
    protected void onCommaButtonClick() {
        handleAncientBtnClick(",");
    }

    @FXML
    protected void on0ButtonClick() {
        handleAncientBtnClick("0");
    }

    @FXML
    protected void on1ButtonClick() {
        handleAncientBtnClick("1");
    }

    @FXML
    protected void on2ButtonClick() {
        handleAncientBtnClick("2");
    }

    @FXML
    protected void on3ButtonClick() {
        handleAncientBtnClick("3");
    }

    @FXML
    protected void on4ButtonClick() {
        handleAncientBtnClick("4");
    }

    @FXML
    protected void on5ButtonClick() {
        handleAncientBtnClick("5");
    }

    @FXML
    protected void on6ButtonClick() {
        handleAncientBtnClick("6");
    }

    @FXML
    protected void on7ButtonClick() {
        handleAncientBtnClick("7");
    }

    @FXML
    protected void on8ButtonClick() {
        handleAncientBtnClick("8");
    }

    @FXML
    protected void on9ButtonClick() {
        handleAncientBtnClick("9");
    }

    @FXML
    protected void onWButtonClick() {
        handleAncientBtnClick("w");
    }

    @FXML
    protected void onJButtonClick() {
        handleAncientBtnClick("j");
    }

    @FXML
    protected void onFButtonClick() {
        handleAncientBtnClick("f");
    }

    @FXML
    protected void onEqualButtonClick() {
        handleAncientBtnClick("=");
    }

    @FXML
    protected void onZButtonClick() {
        handleAncientBtnClick("z");
    }

    @FXML
    protected void onTButtonClick() {
        handleAncientBtnClick("t");
    }

    @FXML
    protected void onVButtonClick() {
        handleAncientBtnClick("v");
    }

    @FXML
    protected void onHButtonClick() {
        handleAncientBtnClick("h");
    }

    @FXML
    protected void onUButtonClick() {
        handleAncientBtnClick("u");
    }

    @FXML
    protected void onYButtonClick() {
        handleAncientBtnClick("y");
    }

    @FXML
    protected void onSButtonClick() {
        handleAncientBtnClick("s");
    }

    @FXML
    protected void onLButtonClick() {
        handleAncientBtnClick("l");
    }

    @FXML
    protected void onRButtonClick() {
        handleAncientBtnClick("r");
    }

    @FXML
    protected void onKButtonClick() {
        handleAncientBtnClick("k");
    }

    @FXML
    protected void onCButtonClick() {
        handleAncientBtnClick("c");
    }

    @FXML
    protected void onOButtonClick() {
        handleAncientBtnClick("o");
    }

    @FXML
    protected void onQButtonClick() {
        handleAncientBtnClick("q");
    }

    @FXML
    protected void onIButtonClick() {
        handleAncientBtnClick("i");
    }

    @FXML
    protected void onPButtonClick() {
        handleAncientBtnClick("p");
    }

    @FXML
    protected void onBButtonClick() {
        handleAncientBtnClick("b");
    }

    @FXML
    protected void onDButtonClick() {
        handleAncientBtnClick("d");
    }

    @FXML
    protected void onEButtonClick() {
        handleAncientBtnClick("e");
    }

    @FXML
    protected void onGButtonClick() {
        handleAncientBtnClick("g");
    }

    @FXML
    protected void onNButtonClick() {
        handleAncientBtnClick("n");
    }

    @FXML
    protected void onMButtonClick() {
        handleAncientBtnClick("m");
    }

    @FXML
    protected void onAButtonClick() {
        handleAncientBtnClick("a");
    }

    @FXML
    protected void onBackButtonClick() {
        if (tog_Btn_AncientScript.isSelected()){
            if (textField_SearchBarAncient.getText().length() > 0){
                textField_SearchBarAncient.setText(textField_SearchBarAncient.getText().substring(0, textField_SearchBarAncient.getText().length() - 1));
            }
        }else {
            if (ancientGlyphView.getText().length() > 0){
                ancientGlyphView.setText(ancientGlyphView.getText().substring(0, ancientGlyphView.getText().length() - 1));
            }
        }
    }

    @FXML
    protected void onCancelButtonClick() {
        pane_togglePane.setVisible(false);
    }

    @FXML
    protected void onDeleteButtonClick() {
        pane_togglePane.setVisible(false);
        pane_DeletePane.setVisible(true);
    }

    @FXML
    protected void onEditButtonClick() {
        pane_togglePane.setVisible(false);
        pane_DeletePane.setVisible(false);
        cancelEditTranslation.setVisible(true);
        tab_Translations.setDisable(true);
        submitTranslation.setText("Edit");
        tab_NewTranslation.setText("Edit Translation");
        tabPane.getSelectionModel().select(tab_NewTranslation);
        ancientGlyphView.setText(selection.getAncientGlyph());
        ancientGlyphTranslation.setText(selection.getTranslation());
        markTranslation.setSelected(selection.getIsMarked() == 1);
        confirmTranslation.setSelected(selection.getIsConfirmed() == 1);
    }

    @FXML
    protected void onCancelDeleteButtonClick() {
        pane_togglePane.setVisible(true);
        pane_DeletePane.setVisible(false);
    }

    @FXML
    protected void onConfirmDeleteButtonClick() {
        dbCrud.deleteTranslation(selection.getTranslationID());
        pane_DeletePane.setVisible(false);
        pane_togglePane.setVisible(false);
        onSearchButtonClick();
    }

    @FXML
    protected void onClearButtonClick() {
        if (tog_Btn_AncientScript.isSelected()){
            textField_SearchBar.setText("");
            textField_SearchBarAncient.setText("");
        }else {
            ancientGlyphView.setText("");
        }
    }

    @FXML
    protected void onCancelSubmitButtonClick() {
        pane_DeletePane.setVisible(false);
        pane_togglePane.setVisible(false);
        ancientGlyphView.setText("");
        ancientGlyphTranslation.setText("");
        markTranslation.setSelected(false);
        confirmTranslation.setSelected(false);
        submitTranslation.setText("Submit");
        tab_NewTranslation.setText("New Translation");
        cancelEditTranslation.setVisible(false);
        tab_Translations.setDisable(false);
        tabPane.getSelectionModel().select(tab_Translations);
        onSearchButtonClick();
    }

    @FXML
    protected void onSubmitButtonClick() {
        if (tab_NewTranslation.getText().compareTo("New Translation") == 0){
            if (ancientGlyphView.getText().compareTo("") != 0) {
                HVT_Translation newTranslation = new HVT_Translation(
                        ancientGlyphView.getText(),
                        ancientGlyphTranslation.getText(),
                        markTranslation.isSelected() ? 1 : 0,
                        confirmTranslation.isSelected() ? 1 : 0);
                dbCrud.insertTranslation(newTranslation);
                ancientGlyphView.setText("");
                ancientGlyphTranslation.setText("");
                markTranslation.setSelected(false);
                confirmTranslation.setSelected(false);
            }
        }else{
            if (ancientGlyphView.getText().compareTo("") != 0) {
                HVT_Translation editedTranslation = new HVT_Translation(
                        selection.getTranslationID(),
                        ancientGlyphView.getText(),
                        ancientGlyphTranslation.getText(),
                        markTranslation.isSelected() ? 1 : 0,
                        confirmTranslation.isSelected() ? 1 : 0)
                        ;
                dbCrud.updateTranslation(
                        editedTranslation.getTranslationID(),
                        editedTranslation.getAncientGlyph(),
                        editedTranslation.getTranslation(),
                        editedTranslation.getIsConfirmed(),
                        editedTranslation.getIsMarked());
                onCancelSubmitButtonClick();
            }
        }

    }

    @FXML
    protected void display_AncientPrompt() {
        textField_SearchBarAncientPrompt.setVisible(true);
        textField_SearchBarAncientPrompt.setPromptText(textField_SearchBarAncient.getText());
    }

    @FXML
    protected void onAncientPromptClick() {
        textField_SearchBar.setVisible(true);
        textField_SearchBar.requestFocus();
        textField_SearchBarAncientPrompt.setVisible(false);
    }

    @FXML
    protected void onToggleAncientScriptTrue() {
        tog_Btn_AncientScript.setText("Hide Ancient Script");
        tableView_Translations.setVisible(false);
        tog_Btn_AncientScript.setSelected(true);
        onClearButtonClick();
        textField_SearchBar.setVisible(false);
        textField_SearchBarAncient.setVisible(true);
        anchorPane_AncientScript.setVisible(true);
    }

    @FXML
    protected void onToggleAncientScriptFalse() {
        tog_Btn_AncientScript.setText("Show Ancient Script");
        onClearButtonClick();
        textField_SearchBar.setVisible(true);
        textField_SearchBarAncient.setVisible(false);
        tog_Btn_AncientScript.setSelected(false);
        tableView_Translations.setVisible(true);
        anchorPane_AncientScript.setVisible(false);
    }

    @FXML
    protected void onToggleAncientScriptBTN() {
        if (tog_Btn_AncientScript.isSelected()){
            onToggleAncientScriptTrue();
            textField_SearchBarAncientPrompt.setVisible(false);
        }else{
            onToggleAncientScriptFalse();
            textField_SearchBarAncientPrompt.setVisible(false);
        }
    }

    @FXML
    protected void onSearchButtonClick() {
        ObservableList<HVT_Translation> data;
        if (tog_Btn_AncientScript.isSelected()){
            data = dbCrud.getAncients(textField_SearchBarAncient.getText(), checkBox_Marked.isSelected(), checkBox_Confirmed.isSelected());
            display_AncientPrompt();
            onToggleAncientScriptFalse();
            textField_SearchBar.setVisible(false);
        }else{
            data = dbCrud.getTranslations(textField_SearchBar.getText(), checkBox_Marked.isSelected(), checkBox_Confirmed.isSelected());
        }

        //Add to columns
        col_AncientGlyphs.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getAncientGlyph()));
        col_Translations.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTranslation()));
        col_Confirmed.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getIsConfirmed()).asObject());
        col_Marked.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getIsMarked()).asObject());

        //Adding data to the table
        tableView_Translations.setItems(data);
    }

    @FXML
    protected void onRevertOptionClick() {
        dbCrud.revertApp();
    }
    @FXML
    protected void translationOptions(MouseEvent event) {
        if(event.getButton().equals(MouseButton.SECONDARY)){
            selection = tableView_Translations.getSelectionModel().getSelectedItem();
            pane_togglePane.setVisible(true);
            pane_EditField.setText("Edit: " + selection.getTranslation());

        }
        event.consume();
    }































































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

        assert btn_Search != null : "fx:id=\"btn_Search\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_BackBtn1 != null : "fx:id=\"btn_BackBtn1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_ClearBtn1 != null : "fx:id=\"btn_ClearBtn1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_CloseParenthesis1 != null : "fx:id=\"btn_CloseParenthesis1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_Colon1 != null : "fx:id=\"btn_Colo1n\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_EqualSign1 != null : "fx:id=\"btn_EqualSign1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_Comma1 != null : "fx:id=\"btn_Comma1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_Semicolon1 != null : "fx:id=\"btn_Semicolon1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_DoubleQuote1 != null : "fx:id=\"btn_DoubleQuote1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_OpenParenthesis1 != null : "fx:id=\"btn_OpenParenthesis1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_SingleQuote1 != null : "fx:id=\"btn_SingleQuote1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_Period1 != null : "fx:id=\"btn_Period1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_QuestionMark1 != null : "fx:id=\"btn_QuestionMark1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_01 != null : "fx:id=\"btn_01\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_11 != null : "fx:id=\"btn_11\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_21 != null : "fx:id=\"btn_21\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_31 != null : "fx:id=\"btn_31\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_41 != null : "fx:id=\"btn_41\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_51 != null : "fx:id=\"btn_51\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_61 != null : "fx:id=\"btn_61\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_71 != null : "fx:id=\"btn_71\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_81 != null : "fx:id=\"btn_81\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_91 != null : "fx:id=\"btn_91\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_A1 != null : "fx:id=\"btn_A1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_B1 != null : "fx:id=\"btn_B1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_C1 != null : "fx:id=\"btn_C1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_D1 != null : "fx:id=\"btn_D1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_E1 != null : "fx:id=\"btn_E1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_F1 != null : "fx:id=\"btn_F1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_G1 != null : "fx:id=\"btn_G1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_H1 != null : "fx:id=\"btn_H1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_I1 != null : "fx:id=\"btn_I1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_J1 != null : "fx:id=\"btn_J1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_K1 != null : "fx:id=\"btn_K1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_L1 != null : "fx:id=\"btn_L1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_M1 != null : "fx:id=\"btn_M1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_N1 != null : "fx:id=\"btn_N1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_O1 != null : "fx:id=\"btn_O1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_P1 != null : "fx:id=\"btn_P1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_Q1 != null : "fx:id=\"btn_Q1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_R1 != null : "fx:id=\"btn_R1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_S1 != null : "fx:id=\"btn_S1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_T1 != null : "fx:id=\"btn_T1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_U1 != null : "fx:id=\"btn_U1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_V1 != null : "fx:id=\"btn_V1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_W1 != null : "fx:id=\"btn_W1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_X1 != null : "fx:id=\"btn_X1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_Y1 != null : "fx:id=\"btn_Y1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert btn_Z1 != null : "fx:id=\"btn_Z1\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";


        assert pane_DeleteLabel != null : "fx:id=\"pane_DeleteLabel\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert pane_ConfirmDeleteBtn != null : "fx:id=\"pane_ConfirmDeleteBtn\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert pane_CancelDeleteBtn != null : "fx:id=\"pane_CancelDeleteBtn\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert pane_CancelBtn != null : "fx:id=\"pane_CancelBtn\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert pane_DeleteBtn != null : "fx:id=\"pane_DeleteBtn\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert pane_EditBtn != null : "fx:id=\"pane_EditBtn\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert pane_DeletePane != null : "fx:id=\"pane_DeletePane\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert pane_togglePane != null : "fx:id=\"pane_togglePane\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert pane_EditField != null : "fx:id=\"pane_EditField\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";


        assert checkBox_Confirmed != null : "fx:id=\"checkBox_Confirmed\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert checkBox_Marked != null : "fx:id=\"checkBox_Marked\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";

        assert tab_Translations != null : "fx:id=\"tab_Translations\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert tableView_Translations != null : "fx:id=\"tableView_Translations\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";
        assert textField_SearchBar != null : "fx:id=\"textField_SearchBar\" was not injected: check your FXML file 'Heaven's Vault Translator.fxml'.";

    }
}