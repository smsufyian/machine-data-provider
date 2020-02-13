package com.smoothprovider.dataprovider.dto;

import lombok.Value;

import java.util.Set;

@Value
public class MachineDTO {

    private String machineKey;
    private String machineName;
    private Set<ParameterDTO> parameters;
}
