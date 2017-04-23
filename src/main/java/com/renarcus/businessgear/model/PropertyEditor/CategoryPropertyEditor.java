package com.renarcus.businessgear.model.PropertyEditor;

import com.renarcus.businessgear.model.Category;

import java.beans.PropertyEditorSupport;

/**
 * Created by Troley on 23-4-2017
 */
public class CategoryPropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Category cat = new Category();
        cat.setId(Integer.parseInt(text));

        setValue(cat);
    }
}
