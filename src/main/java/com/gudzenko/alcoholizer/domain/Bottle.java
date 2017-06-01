package com.gudzenko.alcoholizer.domain;

/**
 * Created by Micahel on 01.06.2017.
 */
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Micahel on 01.06.2017.
 */

@Entity
@Getter
@Setter

public class Bottle {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "DRINK_ID")
    private long drinkId; // ID of drink name

    @Column(name = "VOLUME")
    private double volume; //Bottle volume in litres

    @Column(name = "STRENGTH")
    private double strength;//Drink volume in 1`s. It means 40% == 0.4

    @Column(name = "PRICE")
    private double price;// Price in UAH

    @Column(name = "SHOP_ID")
    private long shopId;// ID of shop
}
