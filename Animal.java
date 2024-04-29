public abstract class Animal {

    public void nakarmZwierzaka()
    {
        System.out.println("Zwierzak zostal nakarmiony");
    }
    public final void wyprowadzNaSpacer()
    {
        System.out.println("Zwierzak zostal wyprowadzony na spacer");
    }

    public abstract void pobawSieZeZwierzakiem();
    public abstract void zabierzZwierzakaDoWeterynarza();


}
