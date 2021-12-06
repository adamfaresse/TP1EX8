public class BoiteAMeuhSaintValentin extends BoiteAMeuh{
    private int numSerie ;
    private int numRetourne =0;
    static int numSerieActuelle =0;
    public BoiteAMeuhSaintValentin(){
        this.numSerie = numSerieActuelle;
        numSerieActuelle = numSerieActuelle+1;
    }
    public int getNumSerie(){
        return numSerie;
    }

    @Override
    public void retourne() {
        if(numRetourne ==9){
            System.out.println("Je t'ai");
            super.retourne();
            numRetourne=0;
        }else{
            numRetourne = numRetourne +1;
            super.retourne();
        }
    }
}
