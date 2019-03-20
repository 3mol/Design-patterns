package ch01;

import ch01.behavior.StudyOfAtomicEnergyBehavior;
import ch01.interest.ChemicalInterest;
import ch01.role.Disable;
import ch01.role.Man;
import ch01.role.Mystery;
import ch01.role.Programer;

public class Main {

    public static void main(String[] args) {

        Man programerMan = new Programer();
        programerMan.display();
        programerMan.preformBehavior();
        programerMan.preformInterest();

        Man disableMan = new Disable();
        disableMan.display();
        disableMan.preformBehavior();
        disableMan.preformInterest();


        //神秘人
        Man mysteryMan = new Mystery();
        //动态设置兴趣和工作内容
        mysteryMan.setInterest(new ChemicalInterest());
        mysteryMan.setWorkBehavior(new StudyOfAtomicEnergyBehavior());
        mysteryMan.display();
        mysteryMan.preformBehavior();
        mysteryMan.preformInterest();
    }
}
