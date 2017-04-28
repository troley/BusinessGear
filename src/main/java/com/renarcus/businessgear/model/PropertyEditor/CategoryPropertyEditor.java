package com.renarcus.businessgear.model.PropertyEditor;

import com.renarcus.businessgear.model.Category;

import java.beans.PropertyEditorSupport;

/**
 * Converts the Id of Category from (String) text to Integer
 * when posting a form which contains Category as a foreign key.
 * If this is not done, then the BindingResult sees Category as null
 * which throws an error.
 */
public class CategoryPropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Category cat = new Category();
        cat.setId(Integer.parseInt(text));

        setValue(cat);
    }


}
