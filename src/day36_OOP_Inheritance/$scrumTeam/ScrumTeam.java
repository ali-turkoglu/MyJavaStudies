package day36_OOP_Inheritance.$scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO;
    public String BA;
    public String SM;
    public ArrayList<Tester> testers=new ArrayList<>();
    public ArrayList<Developer> developers=new ArrayList<>();

    public ScrumTeam(){//ProductOwner PO, String BA, String SM, ArrayList<Tester> testers, ArrayList<Developer> developers) {
        this.PO =PO;
        this.BA = BA;
        this.SM = SM;
        this.testers = testers;
        this.developers = developers;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void ddTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int ID){
        testers.removeIf(p->p.ID==ID);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void ddDevelopers(Developer [] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeDevelopers(int ID){
        developers.removeIf(p->p.ID==ID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }
}
