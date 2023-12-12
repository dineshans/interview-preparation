package com.app.ocp.superhro;



import java.util.ArrayList;
import java.util.List;

public class OpenCloseprinciple {



    public static void main(String[] args) {

        List<SuperHero> list = new ArrayList<>();
        list.add(new Batman());
        list.add(new SuperMan());
        list.add(new CaptainAmerica());

       Attacker attacker = new Attacker();

        attacker.attackByHeros(list);
    }
}
