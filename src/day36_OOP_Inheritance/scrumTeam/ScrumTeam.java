package day36_OOP_Inheritance.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;

    public ArrayList<Tester> testers=new ArrayList<>();  // in constructor or here we create an object to store data
    public ArrayList<Developer> developers=new ArrayList<>();
    // birden fazla tester ve developer olduğu için ArrayList kullanıyoruz. ArrayList dynamic ve biz kolayca ekleyip çıkarabiliriz bu listeden


    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO =PO;
        this.BA = BA;
        this.SM = SM;

    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int ID){
        testers.removeIf(p->p.ID==ID);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDevelopers(Developer [] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeDevelopers(int ID){
        developers.removeIf(p->p.ID==ID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO= " + PO.name +
                ", BA= " + BA.name +
                ", SM= " + SM.name +
                ", Number of testers= " + testers.size() +
                ", Number of developers= " + developers.size() +
                '}';
    }
}
