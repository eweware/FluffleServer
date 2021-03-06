package com.eweware.fluffle.obj;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Ignore;
import com.googlecode.objectify.annotation.Index;

import java.util.List;

/**
 * Created by davidvronay on 5/10/16.
 */

@Entity
@Index
public class BunnyBreedObj {
    @Id
    public Long id;
    public String BreedName;
    public int rarity;
    //@Ignore
    public List<BunnyFurColorObj> possibleFurColors;


    public BunnyBreedObj() {
    }

    public BunnyBreedObj(String theName, int theChance) {
        BreedName = theName;
        rarity = theChance;
    }
}
