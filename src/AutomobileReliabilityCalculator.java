
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ryan
 */
public class AutomobileReliabilityCalculator {

    public static ListInterface componentList = new ComponentList();

    public static void main(String[] args) {
        
    int days;    
        
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.println("Engine:");
            componentList.addNode(new Engine(getMBTF(input)));
            System.out.println("\nTransmission:");
            componentList.addNode(new Transmission(getMBTF(input)));
            System.out.println("\nCooling:");
            componentList.addNode(new Cooling(getMBTF(input)));
            System.out.println("\nBrakes");
            componentList.addNode(new Brake(getMBTF(input), getMBTF(input)));
            System.out.println("\nExhaust");
            componentList.addNode(new Exhaust(getMBTF(input)));
        
            System.out.println("\nHow many days? ");
            days = input.nextInt();
        }
        

        
        System.out.println("\nMBTF for each automobile component: \n");
        componentList.prntList(componentList.getRoot());
        
        System.out.println("\nChance of success over " + days + " day trip:");
        System.out.println
            (componentList.calcTotProblty(days, componentList.getRoot()));
    }

    public static int getMBTF(Scanner input) {
        int mbtf;
        System.out.println("Enter MBTF: ");
        mbtf = input.nextInt();
        return mbtf;
    }
}

