package QUIS2;

public class quaterSLLMain {
    
    public static void main(String[] args) {
        quarterSLL quarter1 = new quarterSLL();
     
        team team01 = new team("RED BULL RACING HONDA RBPT", new driver("Max Verstappen"), new driver("Sergio Perez"));
        team team02 = new team("MCLAREN MERCEDES", new driver("Oscar Piastri"), new driver("Lando Norris"));
        team team03 = new team("FERRARI", new driver("Carlos Sainz"), new driver("Charles Leclerc"));
        team team04 = new team("MERCEDES", new driver("George Russell"), new driver("Lewis Hamilton"));
        team team05 = new team("RB HONDA RBPT", new driver("Yuki Tsunoda"), new driver("Daniel Ricciardo"));
        team team06 = new team("ALPINE RENAULT", new driver("Esteban Ocon"), new driver("Pierre Gasly"));
        team team07 = new team("HAAS FERRARI", new driver("Kevin Magnussen"), new driver("Nico Hulkenberg"));
        team team08 = new team("WILLIAMS MERCEDES", new driver("Alexander Albon"), new driver("Logan Sargeant"));
        team team09 = new team("KICK SAUBER FERRARI", new driver("Zhou Guanyu"), new driver("Valtteri Bottas"));
        team team10 = new team("ASTON MARTIN ARAMCO MERCEDES", new driver("Lance Stroll"), new driver("Fernando Alonso"));
        
        
        quarter1.addFirst(team01);
        quarter1.addTeam(team02);
        quarter1.addTeam(team03);
        quarter1.addTeam(team04);
        quarter1.addTeam(team05);
        quarter1.addTeam(team06);
        quarter1.addTeam(team07);
        quarter1.addTeam(team08);
        quarter1.addTeam(team09);
        quarter1.addLast(team10);
        
        quarter1.updateTeamPoints("RED BULL RACING HONDA RBPT", 12, 18);
        quarter1.updateTeamPoints("MCLAREN MERCEDES", 15, 25);
        quarter1.updateTeamPoints("FERRARI", 0, 16);
        quarter1.updateTeamPoints("MERCEDES", 4, 8);
        quarter1.updateTeamPoints("RB HONDA RBPT", 6, 0);
        quarter1.updateTeamPoints("ASTON MARTIN ARAMCO MERCEDES", 0, 2);
        quarter1.updateTeamPoints("KICK SAUBER FERRARI", 0, 0);
        quarter1.updateTeamPoints("FERRARI", 12, 8);
        quarter1.updateTeamPoints("HAAS FERRARI", 0, 0);
        quarter1.updateTeamPoints("WILLIAMS MERCEDES", 0, 0);
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|   FORMULA 1 CRYPTO.COM MIAMI GRAND PRIX 2024 - RACE RESULT    |");
        System.out.println("-----------------------------------------------------------------");

        System.out.println("HASIL POINT SEBELUM RACE DI URUTKAN ");
        quarter1.sortTeamsByPoints();
        System.out.println("--------------------------------");
        quarter1.printTeams();
        System.out.println("HASIL POINT SESUDAH RACE DI URUTKAN ");
        System.out.println("--------------------------------");
        System.out.println("RESULT RACE KESELURUHAN DI MIAMI GRAN PRIX");
        quarter1.printTeams();
        
        quarter1.updateDriverLapTime("Max Verstappen", 0, 87.689);
        quarter1.updateDriverLapTime("Max Verstappen", 1, 87.566);
        quarter1.updateDriverLapTime("Max Verstappen", 2, 87.241);

        quarter1.updateDriverLapTime("Charles Leclerc", 0, 88.081);
        quarter1.updateDriverLapTime("Charles Leclerc", 1, 87.533);
        quarter1.updateDriverLapTime("Charles Leclerc", 2, 87.382);

        quarter1.updateDriverLapTime("Carlos Sainz", 0, 87.937);
        quarter1.updateDriverLapTime("Carlos Sainz", 1, 87.941);
        quarter1.updateDriverLapTime("Carlos Sainz", 2, 87.455);

        quarter1.updateDriverLapTime("Sergio Perez", 0, 87.772);
        quarter1.updateDriverLapTime("Sergio Perez", 1, 87.839);
        quarter1.updateDriverLapTime("Sergio Perez", 2, 87.460);

        quarter1.updateDriverLapTime("Lando Norris", 0, 87.913);
        quarter1.updateDriverLapTime("Lando Norris", 1, 87.871);
        quarter1.updateDriverLapTime("Lando Norris", 2, 87.594);

        quarter1.updateDriverLapTime("Oscar Piastri", 0, 88.032);
        quarter1.updateDriverLapTime("Oscar Piastri", 1, 87.721);
        quarter1.updateDriverLapTime("Oscar Piastri", 2, 87.675);

        quarter1.updateDriverLapTime("George Russell", 0, 88.159);
        quarter1.updateDriverLapTime("George Russell", 1, 88.095);
        quarter1.updateDriverLapTime("George Russell", 2, 88.067);

        quarter1.updateDriverLapTime("Lewis Hamilton", 0, 88.167);
        quarter1.updateDriverLapTime("Lewis Hamilton", 1, 87.697);
        quarter1.updateDriverLapTime("Lewis Hamilton", 2, 88.107);

        quarter1.updateDriverLapTime("Nico Hulkenberg", 0, 88.383);
        quarter1.updateDriverLapTime("Nico Hulkenberg", 1, 88.200);
        quarter1.updateDriverLapTime("Nico Hulkenberg", 2, 88.146);

        quarter1.updateDriverLapTime("Yuki Tsunoda", 0, 88.324);
        quarter1.updateDriverLapTime("Yuki Tsunoda", 1, 88.167);
        quarter1.updateDriverLapTime("Yuki Tsunoda", 2, 88.192);

        quarter1.updateDriverLapTime("Lance Stroll", 0, 88.177);
        quarter1.updateDriverLapTime("Lance Stroll", 1, 88.222);

        quarter1.updateDriverLapTime("Pierre Gasly", 0, 87.976);
        quarter1.updateDriverLapTime("Pierre Gasly", 1, 88.324);

        quarter1.updateDriverLapTime("Esteban Ocon", 0, 88.209);
        quarter1.updateDriverLapTime("Esteban Ocon", 1, 88.371);

        quarter1.updateDriverLapTime("Alexander Albon", 0, 88.343);
        quarter1.updateDriverLapTime("Alexander Albon", 1, 88.413);

        quarter1.updateDriverLapTime("Fernando Alonso", 0, 88.453);
        quarter1.updateDriverLapTime("Fernando Alonso", 1, 88.427);

        quarter1.updateDriverLapTime("Valtteri Bottas", 0, 88.463);

        quarter1.updateDriverLapTime("Logan Sargeant", 0, 88.487);

        quarter1.updateDriverLapTime("Daniel Ricciardo", 0, 88.617);

        quarter1.updateDriverLapTime("Kevin Magnussen", 0, 88.619);

        quarter1.updateDriverLapTime("Zhou Guanyu", 0, 88.824);

        quarter1.simulateQualification();
    }
}
    