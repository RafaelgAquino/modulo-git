public class Main {
    public static void main(String[] args) {
        Maquina daten = new Maquina("Daten");
        Maquina lenovo = new Maquina("Lenovo");
        Maquina hp = new Maquina("HP");
            lenovo.ligar();
    }
}

class Maquina {
    String modelo;

    public Maquina(String modelo){
        System.out.println("Máquina criada");
        this.modelo = modelo;
    }
    public void ligar(){
        System.out.println("Ligando a máquina " + modelo);
    }
}