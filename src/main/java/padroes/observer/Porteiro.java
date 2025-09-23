package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
    private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

    public void registrarObservador(ObservadorChegadaAniversariante observador) {
        observadores.add(observador);
    }

    public void monitorar(){
        Scanner sc = new Scanner(System.in);
        String valor = "";

        while(!"sair".equalsIgnoreCase(valor)){
            System.out.print("Aniversariante chegou? ");
            valor = sc.nextLine();

            if("sim".equalsIgnoreCase(valor)){
                //CRIAR EVENTO
                EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

                //Notificar observer
                observadores.stream().forEach(observador -> {
                    observador.chegou(evento);
                });
                valor = "sair";
            } else {
                System.out.println("alarme falso");
            }
        }

        sc.close();
    }
}
