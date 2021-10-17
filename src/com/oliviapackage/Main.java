package com.oliviapackage;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Welcome intro");

        int kantScore = 0;
        int virtueScore = 0;
        int utilitarianScore = 0;
        int egoismScore = 0;

        Scenarios scenarios1 = new Scenario1(kantScore, virtueScore, utilitarianScore, egoismScore);
        //Scenarios scenarios = new Scenarios(kantScore, virtueScore, utilitarianScore, egoismScore);
        scenarios1.choice();
        scenarios1.addScore(kantScore, virtueScore, utilitarianScore, egoismScore);

        Scenarios scenarios2 = new Scenario2(kantScore, virtueScore, utilitarianScore, egoismScore);
        scenarios2.choice();
        scenarios2.addScore(kantScore, virtueScore, utilitarianScore, egoismScore);
        //System.out.println(egoismScore);

        Scenarios scenarios3 = new Scenario3(kantScore, virtueScore, utilitarianScore, egoismScore);
        scenarios3.choice();
        scenarios3.addScore(kantScore, virtueScore, utilitarianScore, egoismScore);
    }
}
