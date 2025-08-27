

public class PracticeUnit {
    public String whatsTheWeather (int weatherTemp) {
        if (weatherTemp > 95){
            return "It's too HOTT";
        } else if (weatherTemp > 85 ) {
            return "It's hot";
        } else if ( weatherTemp > 75) {
            return "Just about right";
        } else if (weatherTemp > 65) {
            return "THIS IS PERFECT!";
        } else if (weatherTemp > 55) {
            return "Sweater Weather";
        } else {
            return "Winter is Coming";
        }
    }
}
