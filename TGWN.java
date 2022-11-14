package tgwn;

import java.util.Scanner;

public class TGWN {

    public static String nome() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do seu personagem: ");
        String nome = input.next();
        return nome;
    }

    public static String nacionalidade() {
        int opc;
        String pais = "Sem pais escolhido.";
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu pais de origem, sabendo que: ");
        System.out.println("1: Argentina.");
        System.out.println("2: Brasil.");
        System.out.println("3: Chile.");
        System.out.println("4: Uruguai.");
        opc = input.nextInt();
        switch (opc) {
            case 1:
                pais = "Argentina";
                break;
            case 2:
                pais = "Brasil";
                break;
            case 3:
                pais = "Chile";
                break;
            case 4:
                pais = "Uruguai";
                break;
            default:
                System.out.println("Error, opção inválida.");

        }

        return pais;

    }

    public static int vida(int sangue, int dano){
        int status = (sangue - dano);   
        if (status <= 0) {
            retornavida(status);
        }
        return status;

    }
    
    public static String retornavida(int status){
        String statusvida = "A";
        if (status <= 0) {
            statusvida = "Você morreu!";
        } 
        
        return statusvida;
    }

    public static void history() {
        System.out.printf("Dia 25 de março de 2020, a pandemia está cada\n"
                + "dia mais difícil no cenário mundial, as mortes crescem rapidamente semana a\n"
                + "semana. Você é um agente da OMS, e hoje está se dirigindo a reunião da ONU, para\n"
                + "debater e chegar a uma solução para controlar os danos causados pela CoVid-19. \n"
                + "\n"
                + "Grandes potências mundiais se reúnem na assembleia\n"
                + "geral das nações unidas em Nova Iorque, para determinar o futuro da população\n"
                + "mundial.\n");
        System.out.printf("\n25/03/2020 05:31:09\n"
                + "--Você está no aeroporto pronto para embarcar rumo a reunião--\n"
                + "Ao embarcar todos são notificados pelo\n"
                + "comissário de bordo, que o voo será atrasado devido a uma forte tempestade no trajeto.\n"
                + "\n25/03/2020 07:54:02\n"
                + "O piloto então decide iniciar a viagem\n"
                + "\n"
                + "Após 30 minutos de voo o piloto informa sobre\n"
                + "uma possível turbulência, pois havia se formado uma nova tempestade.\n"
                + "\n"
                + "Devido a uma nuvem densa, o piloto decide\n"
                + "realizar uma manobra, desviando totalmente da rota original.\n"
                + "\n"
                + "Após cinco minutos o piloto acaba perdendo o\n"
                + "contato com a torre de controle.\n"
                + "\n"
                + "O voo acaba entrando em uma tempestade de\n"
                + "gelo, causando danos graves a aeronave;\n"
                + "O piloto então informa a tripulação sobre um\n"
                + "possível pouso forçado;\n"
                + "\n"
                + "--Máscaras caindo--\n"
                + "\n"
                + "--Você começa a seguir as orientações da\n"
                + "comissária de bordo--\n"
                + "O avião então começa a descer rapidamente, mas\n"
                + "ainda sob controle do piloto\n"
                + "\n"
                + "--Você sente um grande impacto e desmaia--\n"
                + "\n"
                + "--Você acorda, tira sua máscara e percebe que\n"
                + "o avião está em chamas--\n");

    }

    public static void Pergunta1() {

        System.out.println("\n25/03/20202 08:10:12 O que você faz:\n"
                + "\n"
                + "1) Sair imediatamente do avião\n"
                + "\n"
                + "2)Vasculhar o avião por completo\n"
                + "\n"
                + "3) Ir direto na cabine do piloto para chamar o resgate\n");
    }

    public static int Resposta() {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        return r;
    }

    public static void Pergunta2_1() {
        System.out.println("25/03/2020 08:15:32 \n"
                + "\n"
                + "Após sair imediatamente você percebe que está perdido no meio da floresta, e não consegue\n"
                + "encontrar nenhum outro sobrevivente.\n"
                + "\n"
                + "Você se distancia rapidamente do avião pois sabe que há possibilidade de uma\n"
                + "explosão.\n"
                + "\n"
                + "Após a explosão do tanque de combustível do avião, você retorna até o mesmo e\n"
                + "decide explorar o que sobrou do mesmo.\n"
                + "\n1) Você vai até a cabine\n"
                + "\n"
                + "2) Procurar por comida e kit\n"
                + "médico\n"
                + "\n"
                + "3) Procurar seus pertences");

    }

    public static void Pergunta2_2() {
        System.out.println("Você está vasculhando o avião mesmo sabendo que devido a queda existe a\n"
                + "possibilidade de uma explosão pertencente a um vazamento de combustível da aeronave.\n"
                + "\n"
                + "Após alguns segundos você resolve olhar pela janela e percebe que o combustível\n"
                + "esta vazando em uma quantidade altamente perigosa, pois havia um pequeno\n"
                + "incêndio próximo a turbina, então você resolve sair do avião, porém já é tarde...\n"
                + "O avião EXPLODE decorrente do vazamento junto as chamas.\n"
                + "\n"
                + "\n"
                + "KABUM!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n"
                + "\n"
                + "\n"
                + "THE\n"
                + "END");

    }

    public static void main(String[] args) {
        int sangue = 100;
        //System.out.println(nome());
        // System.out.println(nacionalidade());
        //history();
        sangue = vida(sangue, 20);
        System.out.println("VIDA ||||||||    " + sangue + "%");

        //primeira pergunta//
        Pergunta1();

        /* mostra a vida */
        System.out.println(sangue);

        //PERGUNTA 1
            
        switch (Resposta()) {
            case 1:
                Pergunta2_1();
                break;
            case 2:
                System.out.println(sangue = vida(sangue, 50));
                System.out.println(sangue = vida(sangue, 50));
                retornavida(sangue);
                break;
               
        }

    }


    }
    
