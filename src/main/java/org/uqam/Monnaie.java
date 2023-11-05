package org.uqam;

public final class Monnaie {
    private long montantEnSous;
    public long getMontantEnSous(){
        return montantEnSous;
    }

    public Monnaie(long montantEnSous) {
        this.montantEnSous = montantEnSous;
    }

    public Monnaie additionner(Monnaie monnaie){
        return new Monnaie(monnaie.montantEnSous + this.montantEnSous);
    }

    public Monnaie calculerPourcentage(double pourcentage){
        return new Monnaie(Math.round(pourcentage * montantEnSous));
    }

    public Monnaie soustraire(Monnaie monnaie){
        return new Monnaie(this.montantEnSous - monnaie.montantEnSous);
    }

    @Override
    public String toString() {
        return montantEnSous / 100.0 + "$";
    }
}
