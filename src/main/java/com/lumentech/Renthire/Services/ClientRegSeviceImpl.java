package com.lumentech.Renthire.Services;

import com.lumentech.Renthire.Entity.ClientReg;
import com.lumentech.Renthire.Entity.Gender;
import com.lumentech.Renthire.Payload.ClientRegdto;
import com.lumentech.Renthire.Repository.ClientRegRepo;
import org.springframework.stereotype.Service;

import java.util.concurrent.Callable;

@Service

public class ClientRegSeviceImpl implements ClientRegService {
    private ClientRegRepo clientregrepo;
    public ClientRegSeviceImpl (ClientRegRepo clientregrepo){
        this.clientregrepo = clientregrepo;
    }

    @Override
    public ClientRegdto create(ClientRegdto clientregdto) {
        ClientReg clientreg =mapToEntity(clientregdto);
        ClientReg newclientreg=clientregrepo.save(clientreg);
        ClientRegdto clientresponse=mapToDto(newclientreg);
        return clientresponse;
    }

private ClientReg mapToEntity(ClientRegdto clientregdto){
        ClientReg clientreg=new ClientReg();
        clientreg.setClient_Id(clientregdto.getClient_Id());
        clientreg.setClientName(clientreg.getClientName());
        clientreg.setEmail(clientregdto.getEmail());
        clientreg.setClientAddress(clientregdto.getClientAddress());
        clientreg.setClientPhoneNum(clientregdto.getClientPhoneNum());
        clientreg.setGender(clientregdto.getGender());
        return  clientreg;
}
    private ClientRegdto mapToDto(ClientReg clientreg){
        ClientRegdto clientregdto=new ClientRegdto();
        clientregdto.setClient_Id(clientreg.getClient_Id());
        clientregdto.setClientName(clientreg.getClientName());
        clientregdto.setEmail(clientreg.getEmail());
        clientregdto.setClientAddress(clientreg.getClientAddress());
        clientregdto.setClientPhoneNum(clientreg.getClientPhoneNum());
        clientregdto.setGender(clientreg.getGender());
        return  clientregdto;
    }

        }


