package com.lumentech.Renthire.Payload;

import com.lumentech.Renthire.Entity.Gender;
import lombok.Data;

@Data
public class ClientRegdto {
    private long client_Id;

    private String clientName;
    private String clientAddress;

    private long clientPhoneNum;

    private String Email;

    private Gender gender;

}
