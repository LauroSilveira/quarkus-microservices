package com.laurocorreia.client;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;

@Entity
public class Client extends PanacheEntity {

  public String name;
}
