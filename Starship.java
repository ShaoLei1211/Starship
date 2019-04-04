import java.util.Random;
public class Starship {
    //super class star ship
protected int Hull_plating_rating, Sheild_discharge_rating, Beam_weapon_power, Torpedo_count;

protected int[] plating;
protected int[] discharge;
protected int[] weapon;
protected int[] torpedo;

protected String Registry;

    protected int random_generate(int[] range) {

        Random rand = new Random();

        return rand.nextInt(range[1] - range[0]) + range[0];

    }

public void show_stats(){
    System.out.printf("%15s:\tHull: %d\tShields: %d\tBeam Weapons: %d\tTorpedoes: %d\n",Registry,plating,discharge,weapon,torpedo);
}
}
