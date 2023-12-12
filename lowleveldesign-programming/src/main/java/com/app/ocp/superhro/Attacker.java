package com.app.ocp.superhro;

import java.util.List;

public class Attacker {

    public void attackByHeros(List<SuperHero> superHerosList){

        for(SuperHero superHero : superHerosList){
            superHero.attach();
         }
    }
}
