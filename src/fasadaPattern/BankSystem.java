package fasadaPattern;

public class BankSystem {

    public float sprawdzStanKontaBankomat(long nrKarty){
        if (nrKarty == 1234567890){
            return 356.78f;
        } else {
            return 0.00f;
        }
    }

    public float sprawdzStanKontaWeb(long id){
        if (id == 1234567890){
            return 984.78f;
        } else {
            return 0.00f;
        }
    }

    public String wypłacGotowke(int kwota){
        return "Z Konta wypłacono: " + kwota + " PLN.";
    }

    public String wpłacGotowke(int kwota){
        return "Na konto wpłacono: " + kwota + " PLN.";
    }

    public String aktywujKarte(long numerKarty){
        return "Karta kredytowa o numerze: " + numerKarty + " aktywna.";
    }

    public String platnoscWeb(String id){
        return "Bank Web" + id + "Zalogowano.";
    }

    public String platnoscInternetowa(long zKontaMojego, float kwota){
        return "Płatnosc z konta głównego nr: " + zKontaMojego + "\n" + "Kwota płatnosci za przedmiot: " + kwota + " Pln.";
    }

    public String wykonajPrzelew(long zKonta, long naKonto, float kwota){
        return "Przelew z konta nr: " + zKonta + "\n" + "Na konto nr: " + naKonto + "\n" + "Kwota przelana: " + kwota + " Pln." + "\n";
    }
}
