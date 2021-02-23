package com.kikitect.sdk;

import android.widget.EditText;

public class StringUtil {
    public String reverse(String input) {
        StringBuilder output = new StringBuilder(input);
        return output.reverse().toString();
    }
}
