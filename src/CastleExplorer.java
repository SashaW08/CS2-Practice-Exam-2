public class CastleExplorer {


    public static void main(String[] args) {
        CastleExplorer castleexplorer = new CastleExplorer();
    }

    private String ancientRunes = "z%nxt#%lh#@wsife#w#qr$mt*h!lho#gr&tw#sxrk^o#wl#tvqu!mf#*pzl#i#e!ksv#fe*$sioe#s#i#pmn#?*wt#bh#rzfhwie#xf#jntxo#h%nr#fue#*!orzs#jst#^*@";

    Dragon[] dragons = new Dragon[50];

    public CastleExplorer(){
        System.out.println("Welcome, brave knight! May your code be as strong as your sword!");

        for(int x=0; x<dragons.length; x++){
            dragons[x] = new Dragon((int)((Math.random()*91)+10), (int)((Math.random()*451)+50));
        }

        displayDragons();
        System.out.println("It is "+checkFirePower()+" that 2 or more dragons have the same fire power.");
        decipher(ancientRunes);
    }

    public void displayDragons(){

        for(int x=0; x<dragons.length; x++){
            dragons[x].printInfo();
        }
    }

    public boolean checkFirePower(){

        boolean sameyesorno = false;

        for(int x=0; x<dragons.length; x++){
            for(int i=0; i<dragons.length; i++){
                if(dragons[x].getFirePower()==dragons[i].getFirePower()){
                    sameyesorno = true;
                }
            }
        }

        return sameyesorno;
    }

    public String decipher(String pancientrunes){

        String decodedstring = "";
        int hashtagindex = pancientrunes.indexOf("#");

        while(pancientrunes.contains("#")){

            decodedstring = decodedstring + pancientrunes.charAt(hashtagindex-1);
            pancientrunes = pancientrunes.substring(hashtagindex+1);
            hashtagindex = pancientrunes.indexOf("#");
        }

        return decodedstring;
    }

}