public class MaDate {
private int jour;
private int mois;
private int annee;

public MaDate(int jour, int mois, int annee) {
    this.jour = jour;
    this.mois = mois;
    this.annee = annee;
}

public MaDate(int annee) {
    this.annee = annee;
    this.jour = 1;
    this.mois = 1;
}

public int getJour() {
    return jour;
}

public int getMois() {
    return mois;
}

public int getAnnee() {
    return annee;
}

public void setJour(int jour) {
    this.jour = jour;
}

public void setMois(int mois) {
    this.mois = mois;
}

public void setAnnee(int annee) {
    this.annee = annee;
}

@Override
public String toString() {
    return jour + "/" + mois + "/" + annee;
}

public void ajouterUnJour() {
    int nbJours = joursDansMois(mois, annee);
    if (jour < nbJours) {
        jour++;
    } else {
        jour = 1;
        mois++;
        if (mois > 12) {
            mois = 1;
            annee++;
        }
    }
}

private int joursDansMois(int mois, int annee) {
    switch (mois) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            return 31;
        case 4: case 6: case 9: case 11:
            return 30;
        case 2:
            if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        default:
            return 30;
    }
}

public void ajouterPlusieursJours(int n) {
    for (int i = 0; i < n; i++) {
        ajouterUnJour();
    }
}

public void ajouterUnMois() {
    mois++;
    if (mois > 12) {
        mois = 1;
        annee++;
    }
    int nbJours = joursDansMois(mois, annee);
    if (jour > nbJours) {
        jour = nbJours;
    }
}

public void ajouterUnAn() {
    annee++;
    int nbJours = joursDansMois(mois, annee);
    if (jour > nbJours) {
        jour = nbJours;
    }
}

}
