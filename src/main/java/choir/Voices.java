package choir;

abstract class Voices {
    Sopran sopran;
    Alt alt;
    Tenor tenor;
    Bas bas;

    Voices(Sopran sopran, Alt alt, Tenor tenor, Bas bas){
        this.sopran=sopran;
        this.alt=alt;
        this.tenor=tenor;
        this.bas=bas;
    }
}
