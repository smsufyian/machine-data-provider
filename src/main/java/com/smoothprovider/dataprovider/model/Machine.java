package com.smoothprovider.dataprovider.model;

import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Value @Entity
public class Machine {

    @Id
    String machineKey;

    @NotBlank(message = "Machine name cannot be null empty or blank")
    String machineName;

    @ManyToMany
    Set<Parameters> parameters;

}
