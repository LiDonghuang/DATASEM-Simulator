package governanceModels;

import kanbanSimulator.*;
//import java.io.File;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.Comparator;
//import java.util.LinkedList;
//import repast.simphony.random.RandomHelper;
//import repast.simphony.util.SimUtilities;

public class ValueManagement {
    public ValueManagement() {
        
    }
    public void manageValue (ServiceProviderAgent SP, KSSTask wItem) {
        //System.out.println("ValueManagement: "+wItem.getName());
        // Get Base Value
        double perceivedValue = wItem.getBvalue();
        // Add Derived Hierarchy Value
        perceivedValue += deriveHierarchyValue(wItem);
        // Add Derived Precedency Value
        perceivedValue += derivePrecedencyValue(wItem);
        //
        wItem.setPerceivedValue(perceivedValue);
    }
    
    public double deriveHierarchyValue(KSSTask wItem) {
        double finalInheritValue = 0;
        // Derive Hierarchical Value
        if (!wItem.getUpperTasks().isEmpty()) {
//            double previousUpperTaskValue = 0;
            for (int ut=0;ut<wItem.getUpperTasks().size();ut++) {
                KSSTask currentUpperTask = wItem.getUpperTasks().get(ut);
                if (currentUpperTask.isCreated()) {
                    int numCurrentParallelTasks = 0;
                    for (int n=0;n<currentUpperTask.getSubTasks().size();n++) {
                        KSSTask currentParallelTask = currentUpperTask.getSubTasks().get(n);
                        if (currentParallelTask.isCreated() && !currentParallelTask.isCompleted()) {
                            numCurrentParallelTasks ++;
                        }        
                    }
                    double inheritValue = currentUpperTask.getPerceivedValue()/(double)numCurrentParallelTasks;
//                    double inheritValue = currentUpperTask.getPerceivedValue();
                    finalInheritValue += inheritValue;    
                }
            }                
        }
        return finalInheritValue;
    }
    
    public double derivePrecedencyValue(KSSTask wItem) {
        double finalInheritValue = 0;
        if (!wItem.getSuccessorTasks().isEmpty()) {
            for (int suc=0;suc<wItem.getSuccessorTasks().size();suc++) {
                KSSTask currentSuccessor = wItem.getSuccessorTasks().get(suc);
                if (currentSuccessor.isCreated() && !currentSuccessor.isCompleted()) {
                    finalInheritValue += currentSuccessor.getPerceivedValue();
                }
            }
        }
        return finalInheritValue;
    }
}

