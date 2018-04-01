package fr.gaetan.controller;

import fr.gaetan.BLL.Composer;


public class ComposerController {

    String tableauTheme[] = {"Amour fou", "Hymne à la danse", "Amour perdu" , "L'enfance","Le rêve",
                             "Le monde va mal","Ego trip","Folle nuit","Feel good song","Une sirene / Sorcière","Le destin"};

    String tableauAccord[] = {"Sim Sol Mim La", "Lam Fa Do Sol", "Dom Fam" , "Lam Fa","Do Fa Sol","Lam Sol Fa Sol","Mim Do Si",
                              "Lam Rem Sol Do","Do Fa","Lam Lam+6","Dom Fam"};

    String tableauStyle[] = {"Rock", "Electro", "Reggae" , "Folk","Funk","Electro rock","Jazz/Soul","Rock alternatif","Indi pop","Blues"};

    String tableauContrainte[] = {"Modulation", "Commence par le refrain", "Swing" , "Ukulélé","Note inversé","Solo","2 styles","Même accord dans toute la musique"
                                 ,"Mandoline","Refrain instrumental"};

    String tableauComposition[] = {"Intro avec une tonalité différente", "3 parties", "Passage en 6/8" , "Commencer par la basse","Pas de basse avant le refrain",
                                   "Passage a cappella","Break rythmique","Pas de batterie au pont","Note bourdon","100-105 bpm"};

    String tableauEcriture[] = {"Phrase espagnole", "Cacher un mot", "Inventer un mot" , "Citer 3 villes","Onomatopée","Caler \"Whouou\"",
                                "Alliteration","Caler \"La lala\"","Paler d'un lieu secret"};


    public Composer createASong(){

        Composer song = null;

        String theme = "";
        String accord = "";
        String style = "";
        String contrainte = "";
        String composition = "";
        String ecriture = "";

        theme = choiceItem(tableauTheme);
        accord = choiceItem(tableauAccord);
        style = choiceItem(tableauStyle);
        contrainte = choiceItem(tableauContrainte);
        composition = choiceItem(tableauComposition);
        ecriture = choiceItem(tableauEcriture);

        song = new Composer(theme , accord ,style,contrainte,composition,ecriture);

        return song;
    }

    private String choiceItem(String tableauItem[]){

        String item = "";
        int lower = 0;
        int higher = tableauItem.length;
        int random = (int)(Math.random() * (higher-lower)) + lower;

        item = tableauItem[random];

        return item;
    }
}
