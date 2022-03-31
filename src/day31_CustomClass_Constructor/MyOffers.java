package day31_CustomClass_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer myoffer1=new Offer();
        Offer myoffer2=new Offer();
        Offer myoffer3=new Offer();
        Offer myoffer4=new Offer();
        Offer myoffer5=new Offer();
        Offer myoffer6=new Offer();
        Offer myoffer7=new Offer();

        System.out.println(myoffer1);

        myoffer1.setInfo("California","Amazon","QA",80000,true,true,true,false);
        myoffer2.setInfo("VA","Microsoft","QA",110000,true,true,true,true);
        myoffer3.setInfo("California","Sony","SDET",120000,true,false,false,false);
        myoffer4.setInfo("VA","Cydeo","SDET",90000,true,true,true,false);
        myoffer5.setInfo("FL","Apple","QE",65000,false,false,false,false);
        myoffer6.setInfo("WA","Bank of America","BA",110000,true,true,true,true);
        myoffer7.setInfo("TX","CapitalOne","SM",89000,false,false,true,false);

        System.out.println("myoffer1 = " + myoffer1);
        System.out.println("myoffer2 = " + myoffer2);
        System.out.println("myoffer3 = " + myoffer3);
        System.out.println("myoffer4 = " + myoffer4);
        System.out.println("myoffer5 = " + myoffer5);
        System.out.println("myoffer6 = " + myoffer6);
        System.out.println("myoffer7 = " + myoffer7);

        Offer[] myOffers={myoffer1,myoffer2,myoffer3,myoffer4,myoffer5,myoffer6,myoffer7};

        ArrayList<Offer> fullTimeOffers=new ArrayList<>(Arrays.asList(myOffers));

        System.out.println("--------------------------------------");
        System.out.println();

        fullTimeOffers.removeIf(p->!p.isFullTime); // if the offer is not fulltime

        System.out.println("------------------------------------");

        ArrayList<Offer> localOffers=new ArrayList<>(Arrays.asList(myOffers));

        localOffers.removeIf(p->!p.location.equals("VA")); // removes the offer if the offer is not from local area

        System.out.println("local offers size: "+localOffers.size());

        System.out.println(" ------------------------------------------------------------");

        ArrayList<Offer> sdetQAOffers=new ArrayList<>(Arrays.asList(myOffers));
        sdetQAOffers.removeIf(p->!(p.jobTitle.equals("SDET")||p.jobTitle.equals("QA")));
        System.out.println("SDET/QA Offers: "+sdetQAOffers);

        System.out.println("----------------------------------------------");

        for (Offer each : myOffers) {
            System.out.println(each.companyName+"\t : "+each.salary);

        }



    }
}
/*Create a class named MyOffers:

				2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary


 */