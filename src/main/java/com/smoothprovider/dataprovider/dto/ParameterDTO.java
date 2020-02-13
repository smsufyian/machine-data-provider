package com.smoothprovider.dataprovider.dto;

import lombok.Value;

@Value
public class ParameterDTO {

    private String parameterkey;
    private String parameterName;
    private String type;
    private String unit;
    private String value;
}
