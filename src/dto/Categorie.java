package dto;

public class Categorie {
    private int categorieID;
    private int bedNbr;
    private String tarif ;
    public int getCategorieID() {
        return categorieID;
    }

    public void setCategorieID(int categorieID) {
        this.categorieID = categorieID;
    }

    public int getBedNbr() {
        return bedNbr;
    }

    public void setBedNbr(int bedNbr) {
        this.bedNbr = bedNbr;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }


}
