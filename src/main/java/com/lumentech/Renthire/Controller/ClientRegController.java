package com.lumentech.Renthire.Controller;

import com.lumentech.Renthire.Payload.ClientRegdto;
import com.lumentech.Renthire.Services.ClientRegService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientReg")
public class ClientRegController {
    private ClientRegService clientregservice;
    public ClientRegController(ClientRegService clientregservice){
        this.clientregservice=clientregservice;
    }
    @PostMapping
    public ResponseEntity<ClientRegdto>create(@RequestBody ClientRegdto clientregdto){
        return new ResponseEntity<>(clientregservice.create(clientregdto), HttpStatus.CREATED);
    }

}
