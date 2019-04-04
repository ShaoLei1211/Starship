import java.util.ArrayList;

public class Main {

    ArrayList<String> shipNames;

    public static void main(String[] args) {

        String[] all_names = new String[] {"Reliant","Enterprise","Yorktown","Saratoga","Voyager","Discovery","Constitution","Constellation","Grissom","Defiant","Intrepid","Britaan","Stargazer","Yamato","Galaxy","Ambassador","Nimitz","Equinox","Relativity","Challenger"};

        ArrayList<String> ship_names = new ArrayList<String>();

        for (String s : all_names){

            ship_names.add(s);

        }

        ArrayList<Starship> fleet = new ArrayList<Starship>();

        for (int i = 0; i < 20; i+=4) {

            fleet.add(new Escort(all_names[i]));

            fleet.add(new Frigate(all_names[i + 1]));

            fleet.add(new Cruise(all_names[i + 2]));

            fleet.add(new Battleship(all_names[i + 3]));

        }

        System.out.println("\nOverall available Fleet:");

        for (Starship x : fleet) {

            x.show_stats();

        }

        ArrayList<Is_Defense> defense_battalion = new ArrayList<>();

        ArrayList<Is_Offense> offense_battalion = new ArrayList<>();

        int sum, maxIndex;

        for (int i = 0; i < 4; i++) {

            sum = 0;

            maxIndex = 0;

            for (int j = 0; j < fleet.size(); j++) {

                if ((fleet.get(j). Hull_plating_rating + fleet.get(j).Sheild_discharge_rating) > sum && fleet.get(j) instanceof Is_Defense) {

                    sum = fleet.get(j).Hull_plating_rating + fleet.get(j).Sheild_discharge_rating;

                    maxIndex = j;

                }

            }

            defense_battalion.add((Is_Defense)fleet.remove(maxIndex));

        }

        for (int i = 0; i < 4; i++) {

            sum = 0;

            maxIndex = 0;

            for (int j = 0; j < fleet.size(); j++) {

                if ((fleet.get(j).Hull_plating_rating + fleet.get(j).Sheild_discharge_rating) > sum && fleet.get(j) instanceof Is_Offense) {

                    sum = fleet.get(j).Hull_plating_rating + fleet.get(j).Sheild_discharge_rating;

                    maxIndex = j;

                }

            }

            offense_battalion.add((Is_Offense)fleet.remove(maxIndex));

        }

        System.out.println("\nDefense Battalion:");

        for (Is_Defense x : defense_battalion ){

            x.show_stats();

        }

        System.out.println("\nOffense Battalion:");

        for (Is_Offense x : offense_battalion ) {

            x.show_stats();

        }

    }

}
