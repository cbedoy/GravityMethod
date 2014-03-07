package com.cbedoy.methodgravity.models;

import com.cbedoy.methodgravity.interfaces.IModel;

/**
 * Created by Carlos on 5/03/14.
 */
public class LabelFieldModel implements IModel {
    private String label;
    private String field;
    private String value;

    public LabelFieldModel(){

    }

    public String getField() {
        return field;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
