package com.example.vaibhavi.first_application;

import android.widget.EditText;

import java.util.regex.Pattern;

/**
 * Created by Vaibhavi on 25-09-2016.
 */
public class Validation {

    public static final String TEXT_REG = "[a-zA-Z]+";

    public static boolean isText(EditText edittext)
    {

        String text=edittext.getText().toString();
        edittext.setError(null);

        boolean check=hasText(edittext);

        if(!check)
            return false;

        boolean var= Pattern.matches(TEXT_REG, text);

        if(!var) {
            edittext.setError("Enter text correctly!");
            return false;
        }
        if(text.length() > 7) {
            edittext.setError("Invalid length!");
            return false;
        }


        return true;
    }

    public static boolean hasText(EditText edittext) {

        String text = edittext.getText().toString();
        edittext.setError(null);

        int length;
        length = text.length();

        if (length == 0)
        {
            edittext.setError("Enter the text!");
            return false;
        }

        return true;
    }






}
