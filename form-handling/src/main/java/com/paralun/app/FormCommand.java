package com.paralun.app;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class FormCommand {
    private String textField;
    private String textareaField;
    private String datetimeField;
    private String colorField;
    private boolean singleCheckboxField;
    private String[] multiCheckboxSelectedValues;
    private String radioButtonSelectedValue;
    private String dropdownSelectedValue;
}
