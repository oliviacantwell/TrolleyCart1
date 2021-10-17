package com.oliviapackage;

import java.util.Scanner;

public class Scenarios {
    public int kantScore;
    public int virtueScore;
    public int utilitarianScore;
    public int egoismScore;


    Scenarios(int kantScore, int virtueScore, int utilitarianScore, int egoismScore) {
        this.kantScore = kantScore;
        this.virtueScore = virtueScore;
        this.utilitarianScore = utilitarianScore;
        this.egoismScore = egoismScore;
    }

    public char choice(){ return 0; }

    public void addScore (int kantScore, int virtueScore, int utilitarianScore, int egoismScore){
        char addScoreKey = choice();
        switch(addScoreKey) {
            case 'e':
                egoismScore += 2;
                break;
            case 'u':
                utilitarianScore += 1;
                break;
            case 'v':
                virtueScore += 1;
                break;
            case 'k':
                kantScore += 1;
        }

    }

}

class Scenario1 extends Scenarios {

    Scenario1(int kantScore, int virtueScore, int utilitarianScore, int egoismScore) {
        super(kantScore, virtueScore, utilitarianScore, egoismScore);
    }

    public char choice(){
        String problem = "You are in a train yard and you see a trolley car coming down the tracks.\n " +
                "You look down the tracks and see that it is running straight towards five unsuspecting workers!\n" +
                "You know they will be killed on impact. But you see that right before where the workers are, there is\n" +
                "a branch off of the tracks with a switch to control it. Down that branch is only one worker. \n" +
                "You realize that you can switch the tracks to kill to one person, but it will save the five.\n " +
                "What should you do? \n ";
        System.out.println(problem);

        System.out.println("1. Let the cart go; I don't want to be responsible for any of this.");
        System.out.println("2. Pull the lever. Killing one is better than killing five!");
        System.out.println("3. Pull the lever. A moral person would choose to save the five.");

        Scanner sc = new Scanner(System.in);
        int answer = 4;
        while (answer > 3) {
            System.out.println("\nType the number choice: ");
            answer = sc.nextInt();
        }
        System.out.println(answer);
        char chosenTheory = 'u';

        switch(answer) {
            case 1:
                chosenTheory = 'e';
                break;
            case 2:
                chosenTheory = 'u';
                break;
            case 3:
                chosenTheory = 'v';
                break;
        }

        return chosenTheory;
    }


}


class Scenario2 extends Scenarios {

    Scenario2(int kantScore, int virtueScore, int utilitarianScore, int egoismScore) {
        super(kantScore, virtueScore, utilitarianScore, egoismScore);
    }

    public char choice(){
        String problem = "Now imagine that there is no switch in the tracks. The trolley car is \n" +
                "racing towards the five workers. This time, you are standing on a platform overlooking the track. \n" +
                "Next to you is a very fat man. You know that if you push the fat man off of the platform \n" +
                "and onto the tracks, the fat man will die. But you also know that it will stop the trolley car\n" +
                "and save the five workers. What do you do?\n";
        System.out.println(problem);

        System.out.println("1. Push the fat man; one is still better than five!");
        System.out.println("2. Push the fat man. So sad that he must die, but it would be the right thing \n" +
                "to do to save the five;");
        System.out.println("3. Don't push the fat man! I can't use him as a tool to save the others.");

        Scanner sc = new Scanner(System.in);
        int answer = 4;
        while (answer > 3) {
            System.out.println("\nType the number choice: ");
            answer = sc.nextInt();
        }
        System.out.println(answer);
        char chosenTheory = 'u';

        switch(answer) {
            case 1:
                chosenTheory = 'u';
                break;
            case 2:
                chosenTheory = 'v';
                break;
            case 3:
                chosenTheory = 'k';
                break;
        }

        return chosenTheory;
    }

}

class Scenario3 extends Scenarios {

    Scenario3(int kantScore, int virtueScore, int utilitarianScore, int egoismScore) {
        super(kantScore, virtueScore, utilitarianScore, egoismScore);
    }

    public char choice(){
        String problem = "Instead of pushing the fat man, you see that there is a trap door \n" +
                "beneath his feet and the button to the trap door is next to you. If you push the \n" +
                "button, then he will fall onto the tracks, die, and stop the trolley car from killing \n" +
                "the five. What would you do?";
        System.out.println(problem);

        System.out.println("1. Push the button. I would feel bad pushing him with my own hands \n" +
                "but less bad pushing the button.");
        System.out.println("2. This is the same as pushing him. I cannot use his death as a tool, even \n" +
                "if it is to save others.");
        System.out.println("3. Push the button, because sacrifices must be made to help the majority.");

        Scanner sc = new Scanner(System.in);
        int answer = 4;
        while (answer > 3) {
            System.out.println("\nType the number choice: ");
            answer = sc.nextInt();
        }
        System.out.println(answer);
        char chosenTheory = 'u';

        switch(answer) {
            case 1:
                chosenTheory = 'e';
                break;
            case 2:
                chosenTheory = 'k';
                break;
            case 3:
                chosenTheory = 'u';
                break;
        }

        return chosenTheory;
    }

}



