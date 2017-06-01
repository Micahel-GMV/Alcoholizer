package com.gudzenko.alcoholizer;

import com.gudzenko.alcoholizer.domain.Bottle;
import com.gudzenko.alcoholizer.repository.BottleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Micahel on 01.06.2017.
 */

@Component
public class ConsoleTest {

    @Autowired
    private BottleRepository bottleRepository;

    public void showEntries(){
        for (Bottle bottle:bottleRepository.findAll()){
            System.out.println("Bottle = " + bottle);
        }
    }
}
