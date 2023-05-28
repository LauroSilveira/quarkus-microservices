package com.laurocorreia.reserv;

import com.laurocorreia.client.Client;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Reserv extends PanacheEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    public Client client;
}
