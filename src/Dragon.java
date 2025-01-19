public class Dragon {

private int firePower;
private int treasureGuarded;

    public Dragon (int pfirepower, int ptreasureguarded) {
        firePower = pfirepower;
        treasureGuarded = ptreasureguarded;
    }

    public void setFirePower(int jsetfirepower){
        firePower = jsetfirepower;
    }

    public void setTreasureGuarded(int jsettreasureguarded) {
        treasureGuarded = jsettreasureguarded;
    }

    public int getFirePower(){

        return firePower;
    }

    public int getTreasureGuarded(){

        return treasureGuarded;
    }

    public void printInfo(){
        System.out.println("The fire power value is "+firePower+", and the treasure guarded value is "+treasureGuarded);
    }


}
