package com.eldermoraes.reserv;

import com.eldermoraes.client.Client;


public class Reserv {

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    private Client client;

    private Reserv(Client client) {
        this.client = client;
    }

    public static Reserv of(Client client) {
        return new Reserv(client);
    }
}
