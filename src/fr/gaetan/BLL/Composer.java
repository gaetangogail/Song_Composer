package fr.gaetan.BLL;

public class Composer {

    String theme;
    String accord;
    String style;
    String contrainte;
    String composition;
    String ecriture;

    public Composer(String theme, String accord, String style, String contrainte, String composition, String ecriture) {
        this.theme = theme;
        this.accord = accord;
        this.style = style;
        this.contrainte = contrainte;
        this.composition = composition;
        this.ecriture = ecriture;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getAccord() {
        return accord;
    }

    public void setAccord(String accord) {
        this.accord = accord;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getContrainte() {
        return contrainte;
    }

    public void setContrainte(String contrainte) {
        this.contrainte = contrainte;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getEcriture() {
        return ecriture;
    }

    public void setEcriture(String ecriture) {
        this.ecriture = ecriture;
    }
}
