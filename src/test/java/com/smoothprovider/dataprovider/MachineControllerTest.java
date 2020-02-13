package com.smoothprovider.dataprovider;

import com.smoothprovider.dataprovider.controller.MachineController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import java.io.InputStream;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MachineController.class)
public class MachineControllerTest {

    private static final String MACHINES_FILE_PATH="machines.csv";
    private static final String PARAMETERS_FILE_PATH="parameters.csv";
    private static final String BASE_URI = "/smooth_operators/";

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void load_shouldReturnResponseWithError_IfMachineDataFileFormatIsNotSupported()
            throws Exception {

    }

    @Test
    public void load_shouldReturnResponseWithError_IfParameterDataFileFormatIsNotSupported()
            throws Exception{

    }

    @Test
    public void load_shouldReturnResponseWithError_IfMachineDataFormatIsIncorrect()
            throws Exception{

    }

    @Test
    public void load_shouldReturnResponseWithError_IfParameterDataFormatIsIncorrect()
            throws Exception{

    }

    @Test
    public void load_shouldReturnResponseWithError_IfMachineDataFileIsEmpty()
            throws Exception{

    }

    @Test
    public void load_shouldReturnResponseWithError_IfParameterDataFileIsEmpty()
            throws Exception{

    }

    @Test
    public void load_shouldReturnResponseWithError_IfDataFileIsDuplicated()
            throws Exception{

    }

    @Test
    public void load_shouldReturnResponseWithError_IfMachineDataFileIsMissing()
            throws Exception {

    }

    @Test
    public void load_shouldReturnResponseWithError_IfParameterDataFileIsMissing()
            throws Exception{

    }

    @Test
    public void load_shouldReturnResponseWithError_IfNoFileIsProvided()
            throws Exception{

    }

    @Test
    public void load_shouldReturnResponseWithSuccess_IfMachinesAndParametersDataFilesAreProvided()
            throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream machinesDataStream = classLoader.getResourceAsStream(MACHINES_FILE_PATH);
        InputStream parametersDataStream = classLoader.getResourceAsStream(PARAMETERS_FILE_PATH);
        MockMultipartFile machines = new MockMultipartFile("machines","machines.csv",
                "text/csv",machinesDataStream);
        MockMultipartFile parameters = new MockMultipartFile("parameters","parameters.csv",
                "text/csv",parametersDataStream);
        mockMvc.perform(MockMvcRequestBuilders.multipart(BASE_URI+"/load")
                        .file(machines)
                        .file(parameters)
                        .contentType(MediaType.MULTIPART_FORM_DATA_VALUE))
                .andDo(MockMvcResultHandlers.log())
                .andExpect(status().isCreated());
    }

}
