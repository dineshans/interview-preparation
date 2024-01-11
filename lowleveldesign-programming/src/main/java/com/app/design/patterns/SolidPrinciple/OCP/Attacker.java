package com.app.design.patterns.SolidPrinciple.OCP;

import java.util.List;

public class Attacker {

    public void attackByHeros(List<SuperHero> superHerosList){

        for(SuperHero superHero : superHerosList){
            superHero.attach();
         }
    }
}
