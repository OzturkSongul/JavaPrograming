package Day31_Constructors.ScrumTas;

public class MyScrumTeam {
    public static void main(String[] args) {
        // 4 tester objects

        Tester tester1 = new Tester("ayse", 11, "QA", 12000);
        Tester tester2 = new Tester("fatma", 12, "SDET", 1500);
        Tester tester3 = new Tester("Ali", 13, "SE", 18000);
        Tester tester4 = new Tester("ahmet", 14, "QA", 16000);

        Tester[] testers = {tester2, tester3, tester4};

        //4 developers object
        Developer developer1 = new Developer("ahmet", 22, "java developer", 125000);
        Developer developer2 = new Developer("songul", 23, "java mastar", 126000);
        Developer developer3 = new Developer("selim", 24, "software  developer", 127000);
        Developer developer4 = new Developer("yavuz", 25, "java developer", 128000);

        Developer[] developers = {developer2, developer3, developer4};

//1 ScrumTeam Object

        ScrumTeam scrum = new ScrumTeam("nigara", "huseyin", "neira", 14);

        scrum.addTester(tester1);
        ;
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("...................");

        for (Tester eachTester : scrum.testerList) {// we are looking each tester name and salary
            System.out.println(eachTester.name + " :" + eachTester.salary);
        }
        for (Developer eachdeveloper : scrum.developerList) {// first we look scrumlist then call for each
            System.out.println(eachdeveloper.name + " :" + eachdeveloper.salary);
        }

        scrum.removeTester(14);
        scrum.removeDeveloper(25);

        System.out.println(scrum);

        }


        }


