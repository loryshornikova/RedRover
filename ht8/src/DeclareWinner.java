public class DeclareWinner {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        String whoWins = "";

        if (fighter1.name.equals(firstAttacker)) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if(fighter2.health <= 0) {
                    whoWins = fighter1.name;
                    break;
                }
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    whoWins = fighter2.name;
                    break;
                }
            }
        } else if (fighter2.name.equals(firstAttacker)) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    whoWins = fighter2.name;
                    break;
                }
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    whoWins = fighter1.name;
                    break;
            }
        }

        }

            return whoWins;
    }
}





