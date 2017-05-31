package com.gudzenko.alcoholizer.domain;

/**
 * Created by Micahel on 01.06.2017.
 */
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Created by Micahel on 01.06.2017.
 */

@Entity
@Getter
@Setter

public class Bottle {
    private long id;
    private long drinkId; // ID of drink name
    private double volume; //Bottle volume in litres
    private double strength;//Drink volume in 1`s. It means 40% == 0.4
    private double price;// Price in UAH
    private long shopId;// ID of shop
}
