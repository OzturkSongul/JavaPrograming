package Day31_Constructors.ScrumTas;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO,BA,SM;
    public ArrayList<Tester>testerList=new ArrayList<>();
    // tester can be more than one so we can add or remove, so Arraylist is
    public ArrayList<Developer>developerList=new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester) { // we will add a tester to arraylist
        testerList.add(tester);
    }
    public void addTesters(Tester[] testers) {// multiple tester will be added to arraylist
        // adding array of tester into arraylist of tester
        testerList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer) {// adding one developer to arraylist

        developerList.add(developer);

    }
    public void addDevelopers(Developer[]developers) { // multiple developers
        developerList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID) {
        testerList.removeIf(p -> p.employeeID == employeeID);
    }

    public void removeDeveloper(int developerID){// we are removing specific developer through employee id
        developerList.removeIf(p-> p.employeeID== p.employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of tester=" + testerList.size() +
                ", total number of developers=" + developerList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}




