package com.smoothprovider.dataprovider.controller;

import com.smoothprovider.dataprovider.dto.MachineDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/smooth_operators")
public class MachineController {

    @PostMapping("/load")
    @ResponseStatus(HttpStatus.CREATED)
    public void load(@RequestParam("machines") MultipartFile machinesDataFile,
                     @RequestParam("parameters") MultipartFile parametersDataFile){
        MultipartFile multipartFile1 = machinesDataFile;
        MultipartFile multipartFile2 = parametersDataFile;

    }

    @GetMapping("/machines")
    public MachineDTO get(){
        return null;
    }

}
