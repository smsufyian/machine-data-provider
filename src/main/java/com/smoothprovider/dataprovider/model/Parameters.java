package com.smoothprovider.dataprovider.model;

import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity @Value
public class Parameters {

    @Id
    String parameterKey;

    @NotBlank(message = "Parameter name cannot be empty null or blank")
    String name;

    @NotBlank(message = "Parameter type cannot be null empty or blank")
    String type;

    String parameterUnit;

    @ManyToMany
    Set<Machine> machines;
}
