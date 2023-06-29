package com.lumentech.Renthire.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientReg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long client_Id;
    @Column(name="clientName")
    private String clientName;
    @Column(name="clientAddress")
    private String clientAddress;
    @Column(name="clientPhoneNum", nullable=false)
    private long clientPhoneNum;
    @Column(name="Email", nullable=false,unique = true)
    private String Email;
    @Enumerated(EnumType.STRING)
    @Column(name="gender")
    private Gender gender;
}

