package com.example.crudopsngback.resource;

import com.example.crudopsngback.enumeration.Status;
import com.example.crudopsngback.model.Server;
import com.example.crudopsngback.service.ServerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(ServerResource.class)
class ServerResourceTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper mapper;

    @Mock
    private ServerService serverService;
    @MockBean
    private ServerResource serverResource;

    @Test
    void getServerById() throws Exception {
        Server server   = new Server(23L, "192.168.1.23" , "WINDOWS 10","16 GB", "Lenovo",  "Lenovo", Status.SERVER_DOWN);

        System.out.println("serverService object " +serverResource.getServerById(23L));
        System.out.println("serverService object size" +serverResource.getServers().size());
        Mockito.when(serverService.findServerById(23L)).thenReturn(Optional.of(server));
//        mockMvc.perform(MockMvcRequestBuilders
//                        .get("/server/servers/")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isOk())
////                .andExpect(jsonPath("$", hasSize(5)));
//                .andExpect(MockMvcResultMatchers.model().size(5));
//                .andExpect(jsonPath("$", notNullValue()));
//                .andExpect(jsonPath("$.name").value("WINDOWS 10"));
    }
}