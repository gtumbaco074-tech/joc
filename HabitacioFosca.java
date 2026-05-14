public class HabitacioFosca extends Habitacio {
    private boolean illuminada = false;

    public HabitacioFosca(String nom, String descripcio){
        super(nom, descripcio);
    }

    // TO DO: canviar per utilitzarItem()



    @Override
    public String toString() {
        if (!illuminada) {
            return "L'habitació és a les fosques, no es veu res.";
        }
        else {
            return super.toString();
        }
    }

    @Override
    public Item getItem(){
        if (!illuminada) {
            return null;
        }
        else {
            return super.getItem();
        }
    }

    @Override
    public void utilitzarItem(Item item){
        if(item.getNom().equals("Llanterna")){
            this.illuminada = true;
            System.out.println("Has ences la llantena i l'habitació ja no esta a les fosques");
            System.out.println(super.toString());
        }else{
            super.utilitzarItem(item);
        }
    }
}
