public class BoiteAMeuh {
    private boolean isTurned = false;
    public void retourne(){
        if(isTurned){
            System.out.println("Meuh");
            isTurned= false;
        }else{
            isTurned = true;
        }
    }
}
