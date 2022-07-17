package heranca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner kboard = new Scanner(System.in);
    static List<List<Veiculo>> veiculos = new ArrayList<>();
    public static void main(String[] args) {

        //Carro 1
        veiculos.add(new ArrayList<Veiculo>());
        //Moto 2
        veiculos.add(new ArrayList<Veiculo>());
        //Caminhão 3
        veiculos.add(new ArrayList<Veiculo>());
        //Avião 4
        veiculos.add(new ArrayList<>());
        //Helicoptero 5
        veiculos.add(new ArrayList<>());
        //Navio 6
        veiculos.add(new ArrayList<>());
        //Submarino 7
        veiculos.add(new ArrayList<>());


    }

    public void menu(){

        while(true){
           System.out.println("[1] Cadastrar um veiculo" +
                              "[2] Exibir os veiculos" +
                              "[3] ");
            
        }
    }

    public static void cadastro(){
        System.out.print("[1] Cadastrar um carro\n"   +
        "[2] Cadastrar uma moto\n"    +
        "[3] Cadastrar um caminhão\n" +
        "[4] Cadastrar um avião\n"    +
        "[5] Cadastrar um helicoptero"+
        "[6] Cadastrar um navio"      +
        "[7] Cadastrar um submarino");
        
        int key = kboard.nextInt();

        switch (key) {
            case 1:
                Carro c = new Carro();
                c.cadastro();
                veiculos.get(0).add(c);
                break;

            case 2:
                Moto m = new Moto();
                m.cadastro();
                veiculos.get(1).add(m);

                break;
            case 3:
                Caminhao cm = new Caminhao();
                cm.cadastro();
                veiculos.get(3).add(cm);    
            
                break;
            
            case 4:
                aviao a = new aviao();
                a.cadastro();
                veiculos.get(4).add(a);    
                break;
            
            case 5:
                helicoptero h = new helicoptero();
                h.cadastro();
                veiculos.get(5).add(h);
                break;
            
            case 6:
                Navio n = new Navio();
                n.cadastro();
                veiculos.get(6).add(n);    

                break;
            
            case 7:
                Submarino s = new Submarino();
                s.cadastro();
                veiculos.get(7).add(s);
                break;
            
        }
    }

    public static void exibir(){
        System.out.print("[1] Exibir todos os carros\n"   +
                        "[2]  Exibir todas as motos\n"    +
                        "[3]  Exibir todos os caminhões\n" +
                        "[4]  Exibir todos os aviões\n"    +
                        "[5]  Exibir todos os helicopteros"+
                        "[6]  Exibir todos os navios"      +
                        "[7]  Exibir todos os submarinos");
        
        int key = kboard.nextInt();

        switch (key) {
            case 1:

                for(Carro i : veiculos.get(0)){

                    
                }
                break;

            case 2:
                Moto m = new Moto();
                m.cadastro();
                veiculos.get(1).add(m);

                break;
            case 3:
                Caminhao cm = new Caminhao();
                cm.cadastro();
                veiculos.get(3).add(cm);    
            
                break;
            
            case 4:
                aviao a = new aviao();
                a.cadastro();
                veiculos.get(4).add(a);    
                break;
            
            case 5:
                helicoptero h = new helicoptero();
                h.cadastro();
                veiculos.get(5).add(h);
                break;
            
            case 6:
                Navio n = new Navio();
                n.cadastro();
                veiculos.get(6).add(n);    

                break;
            
            case 7:
                Submarino s = new Submarino();
                s.cadastro();
                veiculos.get(7).add(s);
                break;
            
        }
    }
}