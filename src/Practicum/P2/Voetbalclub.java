package Practicum.P2;

public class Voetbalclub {
    private String name;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String naam){
        name = naam;
    }

    public Voetbalclub() {

    }

    public String getName() {
        if (name == null)
            return "FC";
        return name;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalGespeeld(){
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public int aantalPunten(){
        return  aantalGewonnen * 3 + aantalGelijk;

    }

    @Override
    public String toString() {
        return getName()
                + aantalGespeeld()
                + " "
                + aantalGewonnen
                + " "
                + aantalGelijk
                + " "
                + aantalVerloren
                + " "
                + aantalPunten()
                + " " ;
    }

    public static void main(String[] args) {
        Voetbalclub ajx = new Voetbalclub("Ajax       ");
        Voetbalclub feij = new Voetbalclub("Feijenoord ");

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');

        System.out.println("Feijenoord punten: " + feij.aantalPunten());
        System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
        System.out.println();

        System.out.println(ajx);
        System.out.println(feij);

    }
}
