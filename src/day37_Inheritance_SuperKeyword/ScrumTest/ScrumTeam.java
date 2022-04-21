package day37_Inheritance_SuperKeyword.ScrumTest;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam{

    public ProductOwner PO;// we are customize the class so custom can be varibale name
    public BusinessAnalayst BA;
    public ScrumTeam SM;

    public ArrayList<Tester>testers= new ArrayList<>();
    public ArrayList<Developer>developers= new ArrayList<>();// there are multiple developers or testers, so arraylist will help to add or remove
    private String name;


    public ScrumTeam(ProductOwner PO, BusinessAnalayst BA, ScrumTeam SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester) {
        testers.add(tester);
    }
    public void addTester(Tester[]testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int ID){
        testers.removeIf(p-> p.ID==ID);
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }
    public void addDevelopers(Developer[]developers) {
        this.developers.addAll(Arrays.asList(developers));
    }


    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                ", BA=" + BA.name +
                ", SM=" + SM.name+
                ", number of testers=" + testers.size() +
                ", numbers of developers=" + developers.size() +
                '}';
    }
}

