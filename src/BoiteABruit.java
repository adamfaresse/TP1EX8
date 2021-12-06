public abstract class BoiteABruit {

    public abstract  String bruit();


    private boolean isTurned = false;
    public void retourne(){
        if(isTurned){
            System.out.println(bruit());
            isTurned= false;
        }else{
            isTurned = true;
        }
    }
}
