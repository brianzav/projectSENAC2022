package projeto;

import java.util.Scanner;

public class Projeto {

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
        String statusvida = "";
        if (status <= 0) {
            statusvida = "You lose!";
            
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
                + "1)Sair imediatamente do avião\n"
                + "2)Vasculhar o avião por completo\n"
                + "3)Ir direto na cabine do piloto para chamar o resgate\n");
    }

    public static int Resposta() {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        return r;
    }

    public static void Pergunta2() {
        System.out.println("25/03/2020 08:15:32 \n"
                + "\n"
                + "Após sair imediatamente você percebe que está perdido no meio da floresta, e não consegue\n"
                + "encontrar nenhum outro sobrevivente.\n"
                + "\n"
                + "Você se distancia rapidamente do avião pois sabe que há possibilidade de uma\n"
                + "explosão.\n"
                + "Após a explosão do tanque de combustível do avião, você retorna até o mesmo e\n"
                + "decide explorar o que sobrou do mesmo.\n"
                + "\n1) Você vai até a cabine\n"
                + "2) Procurar por comida e kit médico\n"
                + "3) Procurar seus pertences\n");

    }
    
    public static void Pergunta2_1(){
        
        System.out.println("\n25/03/2020 10:13:01 \n" +
        "Mesmo após a explosão você vasculha a cabine em busca de alimento ou kit médico, pois está ferido devido à queda do avião.\n" +
        "Você não encontra alimento, mas acaba encontrando um kit médico junto a um sinalizador de emergência com apenas uma munição.\n "
      + "Então você rapidamente se retira do avião, pois dentro  dele ainda está uma temperatura altíssima devido ao incêndio causado pela explosão.\n" +
        "\n Então você decide sair e procurar algum rio, pois se lembra de um treinamento de sobrevivência que as margens dos rios sempre há a possibilidade de encontrar civilização.\n"
      + "\n1) Você decide seguir o rio\n" +
        "2) Você espera o resgate perto do avião\n");
        
        
    }
    
    public static void Pergunta2_2(){
        
        System.out.println("25/03/2020 10:13:01\n"
        + "Ao entrar no avião procurando por mantimentos você acaba não encontrando nada, mas ao chegar\n"
        + "próximo a cabine você encontra o kit médico junto a um sinalizador de emergência com apenas uma munição. \n"
        + "Então você rapidamente se retira do avião, pois dentro dele ainda está uma temperatura altíssima \n"
        + "devido ao incêndio causado pela explosão.\n"
        + "\n1) Você decide seguir o rio\n" +
        "2) Você espera o resgate perto do avião\n");
    }
    
    public static void Pergunta2_3(){
    
        System.out.println("25/03/2020 10:13:01\n" +
        "Ao entrar no avião procurando seus pertences você descobre que grande parte deles está carbonizada,\n"
       + "e então decide procurar por comida ou kit médico no resto do avião, ao vasculhar você não encontra \n"
       + "nenhum alimento, mas ao chegar mais perto da cabine você encontra o kit médico médico junto a um \n"
       + "sinalizador de emergência com apenas uma munição. Então você rapidamente se retira do avião, pois \n"
       + "dentro dele ainda está uma temperatura altíssima devido ao incêndio causado pela explosão.\n"
       + "\n1) Você decide seguir o rio\n" +
         "2) Você espera o resgate perto do avião\n");   
    
    }   

    public static void Pergunta1_2() {
        System.out.println("\n25/03/2020 08:15:32\n"
                + "Você está vasculhando o avião mesmo sabendo que devido a queda existe a\n"
                + "possibilidade de uma explosão pertencente a um vazamento de combustível da aeronave.\n"
                + "\n"
                + "Após alguns segundos você resolve olhar pela janela e percebe que o combustível\n"
                + "esta vazando em uma quantidade altamente perigosa, pois havia um pequeno\n"
                + "incêndio próximo a turbina, então você resolve sair do avião, porém já é tarde...\n"
                + "O avião EXPLODE decorrente do vazamento junto as chamas.\n"
                + "\n"
                + "KABUM!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n"
                + "\n"
                + "THE\n"
                + "END\n");

    }
    
    public static void Pergunta3_1(){
        System.out.println("\n25/03/2020 15:01:21\n"
        + "Depois de seguir por um bom tempo você decide parar para descansar e procurar por comida e um abrigo,\n"
        + "então você começa a andar pelos arredores do rio e encontra um Biribazeiro cheio de frutos, você já come alguns no local e\n"
        + "guarda alguns outros na maleta do Kit Médico, então você decide procurar por um pouco mais de comida, e encontra alguns\n"
        + "cocos no chão e ao abri-los você encontra alguns Gongos (Bicho-do-Coco), mesmo com desagrado você come alguns deles pois\n "
        + "sabe que são ricos em proteína.\n" +
        "Então você decide procurar por uma local para servir de abrigo perto do Rio, posteriormente você acaba encontrando uma\n"
        + "cavidade e passa a noite por ali.\n "
        + "\n26/03/2020 06:25:11\n" +
        "Ao acordar você percebe uma movimentação entranha ao seu redor, depois de se levantar calmamente você avista uma onça e ela te vê também.\n" +
        "O que você faz?\n" +
        "\n1)Atirar com o sinalizador na direção da onça para espantá-la. \n" +
        "2)Procura um galho desesperadamente para se defender, mas há chances de ser atacado antes.\n");
        
    }
    
    public static void Pergunta3_2(){
        System.out.println("\n25/03/2020 13:01:21\n" +
        "Depois de ter esperado um tempo perto do avião, você decide procurar por algum alimento ao redor do\n"
      + "local pois está com fome, depois de procurar um pouco você acaba encontrando um pé de Ingazeiro que é\n"
      + "um uma fruta silvestre, você então come umas duas pois não sabe se é venenosa e leva algumas consigo de\n"
      + "volta, depois de esperar mais um pouco você decide que é melhor tomar uma decisão.\n" +
        "O que você faz?\n"
      + "\n1)Limpar a área ao redor para fazer um abrigo ali mesmo.\n" +
        "2)Procurar alguma cavidade ao redor para servir de abrigo.\n");
        
        
    }
    
    
    public static void Pergunta3_1_1(){
        
        System.out.println("\nDepois de limpar uma pequena área, você começa a fazer uma pequena estrutura com\n"
      + "galhos e fios que restarão do avião, depois você procura algumas folhas para servir de cobertura, ao procurar\n"
      + "um pouco ao seu redor você encontra uma planta com folha muito grandes e pega algumas, mas nesse processo você\n"
      + "sente um textura diferente e tira sua mão rapidamente, mas depois pensa que é apenas uma lesma, ao pegar toda a\n"
      + "folha você olha para a planta de volta e avista um sapo muito pequeno de com a cor muito chamativa (azul e preto),\n"
      + "mas acaba ignorando por ele ser minúsculo ao voltar para o seu abrigo você posiciona as folhas, depois disso você\n"
      + "começa a se sentir muito mal e caba caindo no chão e desmaiando.\n" +
        "\nVocê morreu por conta do veneno do sapo que havia tocado sem saber, a quantidade que você teve contato é capaz de matar cerca de dez homens adultos.\n");
        
    }
        
        public static void Pergunta3_2_1(){
            
            System.out.println("\nDepois de procurar a na área ao redor você acaba encontrando uma cavidade e decide fazer ela de abrigo,\n"
          + "improvisa uma cama com parte das roupas queimadas e se deita, tarde da noite você acorda com uma forte dor na perna esquerda ao\n"
          + "pegar um isqueiro para iluminar você percebe que havia sido picado por uma jararaca e vai adormecendo lentamente contra a sua vontade.\n" +
            "\nVocê foi morto por veneno de cobra!\n"); 
        }
    
    
    public static void Pergunta4_1(){
        
            System.out.println("Ao disparar o sinalizador em direção a onça você acaba conseguindo espanta-la, depois desse susto\n"
          + "você volta ai seu abrigo e resolve comer algumas das frutas de sua maleta, e quando você está comendo escuta uma\n"
          + "música vindo da direção do rio, então você corre desesperadamente na direção desse som e ao chegar na margem acaba\n"
          + "avistando um Barco e começa a fazer sinais e gritar para ver se é avistado, mas nada acaba acontecendo pois a música\n"
          + "estava alta e o barco um pouco longe, caso você tivesse o seu sinalizador provavelmente teria sido avistado, depois dessa\n"
          + "frustração você acaba voltando para o abrigo para pegar sua maleta e um pouco mais de fruta para seguir viagem.\n" +
            "\n" +
            "26/03/2020 14:39:13\n" +
            "\n" +
            "Despois de muito tempo caminhando você decide fazer uma pausa pois estava esgotado, posteriormente você acorda e.\n" +
            "O que você faz?\n" +
            "\n1)Decide continuar andando mais um pouco\n" +
            "2)Continuar ali mesmo no abrigo, e começar sua jornada novamente no próximo dia.\n");
    }
    
    public static void Pergunta4_2(){
        
        System.out.println("Por sorte você encontra um galho para se defender e começa a intimidar a onça,\n"
      + "depois de alguns segundos de tensão você acaba conseguindo intimidá-la e ela vai embora, depois desse susto\n"
      + "você vai comer alguns dos frutos de sua maleta e acaba escutando uma música vindo do rio, você corre desesperadamente\n"
      + "e ao chegar a margem você avista uma embarcação, então você pega o seu sinalizador e atira para cima e começa a fazer\n"
      + "sinais com a mão, depois de alguns segundos o barco começa a vir na sua direção, e ao chegar mais perto a música\n"
      + "cessa e um tripulante te questiona o que você estava fazendo ali, depois de explicar a sua situação, você acaba sendo resgatado.\n"
      + "\nVocê Ganhou!\n"
      + "Você conseguiu ser salvo ao ser resgatado por um barco que lhe avistou");
    }
    
    public static void Pergunta5_1(){
        
        System.out.println("Mesmo muito cansado você continua pois é persistente, depois de mais algumas horas quase chegando\n"
      + "ao anoitecer você avista um raio de luz e vai em sua direção, por sorte é uma comunidade ribeirinha ao chegar conversar\n"
      + "com alguns deles e explica sua situação e eles te acolhem para passar a noite e no outro dia eles irão te levar para a\n"
      + "cidade mais próxima, pois está muito debilitado.\n"
      + "\nVocê Ganhou!\n"
      + "Você conseguiu ser salvo após encontrar uma cidadezinha");
        
    }
    
    public static void Pergunta5_2(){
        
        System.out.println("Você acaba acordando no meio da noite atordoado com uma grande chuva, e está tendo uma enchente\n"
      + "no rio então você decide se afastar um pouco, mas no processo a maleta escorrega da sua mão, e no reflexo para salvá-la acaba\n"
      + "escorregando no barranco e caindo na água, por conta do excesso de água você acaba não conseguindo voltar para a margem e morre afogado.\n"
                + "\nApós cair do barraco, você morreu afogado!\n");
        
    }
    
    
    public static void Pergunta1_3(){
        
        System.out.println("\n25/03/2020 08:15:32 \n" +
        "Inicia uma tentativa de contato com a central de controle, mas sua tentativa é falha,\n"
      + "então você se retira rapidamente do avião com o rádio da cabine, após sair do avião você:\n"
      + "\n1)Você permanece tentando contato com a torre de controle\n" +
        "2)Você olha ao redor e tenta encontrar uma colina.\n"
      + "3)Você espera o fogo do avião cessar\n");
    }
    
    public static void Pergunta1_3_3(){
        System.out.println("\n25/03/2020 08:17:16\n"
      + "Após sair do avião, o mesmo tem uma grande explosão, você não foi afetado\n"
      + "pela explosão, mas os estilhaços atingiram a sua perna e afetou a sua ateria femoral\n"
      + "Você morreu devido ao sangramento na arteria\n");
    }
    
    public static void Pergunta2_3_1(){
        System.out.println("Depois de sair do avião você continua tentando contato, mas depois de muita insistência a bateria\n"
  + "do comunicador acaba se esgotando, então você decide dar uma olhada ao redor para ver se encontra comida ou água, alguns minutos\n"
  + "mais tarde você encontra um rio e ao caminhar pela margem acaba encontrando um Biribazeiro, que é um pé de fruta silvestre, então\n"
  + "você come algumas olhando para o rio e pensando em alguma forma de sair do meio da floresta, então você avista um galho flutuando na\n"
  + "água e decide fazer uma jangada com bambos que tinha avistado no caminho para rio.\n" +
                
    "Posteriormente você volta ao avião para encontrar alguns fios para amarrar sua jangada, após pegar alguns fios você avista alguns outros, que estão um pouco mais presos.\n" +
    "Oque você faz?\n" +
    "\n1)Tem um trabalho bem maior para pegar mais alguns fios.\n" +
    "2)Você ignora e vai fazer sua jangada antes que chegue o anoitecer.\n");
    }
    
    public static void Pergunta2_3_2(){
        
        System.out.println("25/03/2020 08:42:11\n"
      + "Você olha ao redor e tenta encontrar uma colina.\n" +
        "Ao olhar ao seu redor você avista diversas montanhas e decide ir para a mais próxima, no caminho para a montanha ele\n"
      + "encontra um pé de Tucumã e ele acaba pegando algumas frutas e comendo ali no local, e depois pega um pouco mais e continua a sua jornada.\n" +
        "\nDepois de caminhar por um bom tempo você finalmente consegue chegar ao topo da montanha e avista uma arvore bem alta.\n" +
        "\nO que você faz?\n" +
        "\n1)Sobe na arvore para ter um melhor sinal.\n" +
        "2)Não sobe e tenta contatar ali mesmo.");   
    }
    
    public static void Pergunta2_3_3(){
        System.out.println("25/03/2020 13:22:06\n" +
        "Depois de passar muito tempo para conseguir tirar os fios você finalmente consegue, então decide pegar alguns bambus\n"
      + "com um pedaço dos destroços do avião, após conseguir uma quantidade suficiente para fazer a jangada você transporta tudo\n"
      + "para o leito do rio, ao finalizar você percebe que está anoitecendo e volta para o avião e passa a noite.\n" +
        "\n26/03/2020 06:11:07\n" +
        "\nNo dia seguinte você volta para o leito do rio e começa a construção da sua jangada, depois de um tempo amarrando tudo você\n"
      + "finalmente termina e decide recolher mais algumas frutas para levar em sua viagem.\n" +
        "O que você faz?\n" +
        "\n1)Inicia a sua viagem imediatamente." +
        "\n2)Decide começar no dia seguinte.");
    }
    
    public static void Pergunta2_3_3_1(){
        
        System.out.println("26/03/2020 14:11:07\n" +
        "Então você inicia sua viagem, após um tempo você acaba avistando uma corredeira e que você está\n"
      + "indo em direção a ela e não consegue mudar de rota, então você vai enfrentá-la, com muito esforço para não\n"
      + "virar você consegue passar pela primeira, mas na segunda você acaba virando pois já estava muito cansado do dia,\n"
      + "e a força da água acaba te empurrando para o fundo do rio, e você não tem forças para se salvar e morre."
                + "Você morreu afogado\n");
    }
    
    public static void Pergunta2_3_3_2(){
        
        System.out.println("26/03/2020 06:03:47\n" +
        "\nDepois de um bom descanso e ter comido bastante você inicia sua viagem, após um bom tempo navegando pelo rio\n"
      + "você chega em uma corredeira e não há como evitá-la, então com muito esforço e determinação você passa por elas\n"
      + "e continua sua viagem.\n" +
        "\nMais tarde depois de um longo percurso, você avista algumas casa perto do rio, e acredita que seja uma comunidade ribeirinha,\n"
      + "então você atraca sua jangada e vai buscar ajuda com alguma pessoa de lá, ao encontrar um morador você conta sua história e acaba sendo salvo.\n"
                + "\nVocê ganhou!");
    }
    
    public static void Pergunta2_3_3_3(){
        
        System.out.println("25/03/2020 13:22:06\n" +
        "Então você pega alguns bambus com um pedaço de metal dos destroços do avião, posteriormente ao pegar uma quantidade\n"
       + "suficiente você transporta tudo para a margem do rio e começa a efetuar a montagem.\n" +
        "\nApós um bom tempo efetuando a montagem você finalmente termina, mas já está anoitecendo, então volta para o avião e\n"
       + "passa a noite lá, ao amanhecer você faz o preparo de tudo, coleta mais algumas frutas e improvisa um remo, então finalmente você começa a navegar.\n" +
        "\nDepois de muito tempo na água você acaba chegando numa corredeira e não consegue mudar o trajeto para sair dela.\n" +
        "O que você faz?\n" +
        "\n1)Pula da sua jangada mesmos sabendo que a chance de sobrevivência é muito baixa.\n" +
        "2)Continua na jangada e decide enfrentar a corredeira.");
    }
    
    public static void Pergunta2_3_3_3_2(){
        System.out.println("26/03/2020 15:31:27\n" +
        "Então você desesperadamente no rio o começa a nadar para uma margem no percurso você é sugado\n"
      + "por um Rebojo (Redemoinho na água), que te leva para o fundo do rio e sem forças você acaba morrendo afogado.\n"
                + "Você morreu afogado!\n");
    }
    
    public static void Pergunta2_3_3_2_2(){
        
        System.out.println("Você toma coragem e vai enfrentar as corredeiras, mas quando passa por uma delas você percebe\n"
      + "que sua jangada está começando a se desmontar porque os fios não aguentaram, então você acaba caindo no meio das corredeiras e é carregado\n"
      + "pela força da água e não consegue ir para a margem e acaba morrendo afogado.\n"
                + "Você morreu afogado!\n");
    }
    
    public static void Pergunta3_2_2_3_1(){
        
        System.out.println("\n25/03/2020 13:49:57\n" +
        "Ao subir na arvore você tenta contato com a central e depois de alguns segundos alguém te responde, você explic\n"
      + "sua situação e eles vão te passar instruções, mas o galho que você está apoiado acaba se arrebentado e cai de uma altur\n"
      + "de 16 metros você acaba morrendo de Traumatismo Craniano.\n"
                + "Você morreu após uma queda, ocasionando um traumatismo craniano\n");
    }
    
    public static void Pergunta3_3_3_2_2(){
        
        System.out.println("\n25/03/2020 15:19:23\n"
      + "Pelo fato de estar receoso de subir na arvore você começa a tentar fazer contato ali do chão mesmo, depois de alguns\n"
      + "segundos o rádio parece captar alguma linha de sinal e você escuta uma voz, com muita alegria você tenta falar com essa voz,\n"
      + "mas o sinal fica falhando, desesperado você começa a andar ao redor para encontrar um melhor ponto de sinal.\n" +
        "\nE nisso você acaba caindo em um buraco que estava coberto com folhas e galhos, mas no meio da queda você se sente mais leve e\n"
      + "acaba desmaiando, um tempo depois você acorda e olha ao seu redor e vê um ambiente totalmente diferente da floresta, ao dar uma melhor observada você avista uma luz.\n" +
        "Oque você faz?\n" +
        "\n1)Vai em direção a ela.\n" +
        "2)Se amedronta e vai investigar ao redor.\n");         
    }
    
    public static void Pergunta3_3_4(){
        
        System.out.println("\n25/03/2020 15:21:18\n" +
        "\nAo ir em direção a luz você percebe que alguém está segurando-a, ao chegar mais perto você percebe que é um homem de terno e gravata,\n"
      + "quando você fica frente a frente com o homem, ele se aproxima e pega no seu ombro e te balança com uma força tremenda e começa a gritar seu nome.\n" +
        "Então você acorda no avião e vê seu assistente, com uma lanterna na sua cara muito preocupado, atordoado você tira a lanterna da sua cara e\n"
      + "pergunta ao assistente onde você está, então ele fala que vocês estão no avião há caminho da conferência, muito confuso você pergunta se avião\n"
      + "não tinha caído, e ele diz que no início da turbulência você acabou desmaiando e acordou naquele momento, mais confuso ainda você raciocina e\n"
      + "chega a conclusão que tudo aquilo foi um sono e nada era real.\n" +
        "\nVocê ganhou!\n");
    }
    
    public static void Pergunta3_4_3(){
        
        System.out.println("\n25/03/2020 15:20:12\n"
     + "Ao investigar ao redor você percebe que se sentindo mais leve lá e que consegue pular muito mais alto, e as plantas são\n"
     + "muito diferentes e brilham no escuro, os animais são totalmente diferente do normal fazendo coisas impossíveis, como se fosse magia,\n"
     + "como uma tartaruga com bico de Ornitorrinco que fazia uma espécie de cristal no seu casco, e quando eles caiam no chão brotavam plantas\n"
     + "instantaneamente da mesma espécie das outras ao seu redor, ao tocar em um desse cristais você sente muito frio em seu pés, e que algo\n"
     + "estava saindo do seu corpo e que cada parte que ele passava ficava gelada, ao olhar para suas mãos você não percebe nada de diferente,\n"
     + "depois olha para os seus pés e vê que está tudo menor olha ao redor e tudo parece mais perto, sem entender nada você começa a analisar\n"
     + "a situação e sente que você está encolhendo e do nada cai com tudo em direção ao chão, mas quando vai sentir o impacto você acorda e\n"
     + "percebe que caiu da cama e que está descoberto e com a janela aberta, e isso justifica o seu frio, depois de voltar para a cama você\n"
     + "começa a raciocinar e percebe que o Lockdown está te afetando e as noticias da televisão mais inda.\n"
                + "\nVocê ganhou!\n");
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

        //PERGUNTA 1
            
        switch (Resposta()) {
            case 1:
                Pergunta2();
                System.out.println(retornavida(sangue));
                switch(Resposta()){
                    case 1:
                        Pergunta2_1();
                        sangue = vida(sangue, 30);
                        System.out.println("VIDA |||||     "+ sangue + "%");
                        System.out.println(retornavida(sangue));
                        switch(Resposta()){
                            case 1:
                            Pergunta3_1();
                            sangue = vida(sangue, -20);
                                System.out.println("VIDA |||||||   "+sangue+"%");
                                System.out.println(retornavida(sangue));
                                switch(Resposta()){
                                    case 1:
                                        Pergunta4_1();
                                        sangue = vida(sangue, 10);
                                        System.out.println("VIDA ||||||    "+sangue+"%");
                                        System.out.println(retornavida(sangue));
                                        switch(Resposta()){
                                            case 1:
                                                Pergunta5_1();
                                                sangue = vida(sangue, 20);
                                                System.out.println(retornavida(sangue));
                                                //System.out.println("VIDA ||||      "+sangue+"%");
                                                //Menu//
                                                break;
                                            case 2:
                                                Pergunta5_2();
                                                sangue = vida(sangue, 100);
                                                System.out.println(retornavida(sangue));
                                                //Menu//
                                                break;
                                        }
                                        break;
                                        
                                    case 2:
                                        Pergunta4_2();
                                        sangue = vida(sangue, 0);
                                        //System.out.println("VIDA |||||||   "+sangue+"%");
                                        break;
                                        //Menu//
                                }
                                break;
                                
                            case 2:
                                Pergunta3_2();
                                sangue = vida(sangue, -10);
                                System.out.println("VIDA ||||||    "+sangue+"%");
                                System.out.println(retornavida(sangue));
                                switch(Resposta()){
                                    case 1:
                                        Pergunta3_1_1();
                                        sangue = vida(sangue, 100);
                                        System.out.println(retornavida(sangue));
                                        //Menu//
                                        break;
                                    case 2:
                                        Pergunta3_2_1();
                                        sangue = vida(sangue, 100);
                                        System.out.println(retornavida(sangue));
                                        //Menu//
                                        break;
                                } break;
                                
                             } break;
                        
                    case 2:
                        Pergunta2_2();
                        sangue = vida(sangue, 10);
                        System.out.println("VIDA |||||||   "+ sangue + "%");
                        System.out.println(retornavida(sangue));
                        switch(Resposta()){
                            case 1:
                                Pergunta3_1();
                                sangue = vida(sangue, -20);
                                System.out.println("VIDA |||||||   "+sangue+"%");
                                System.out.println(retornavida(sangue));     
                                switch(Resposta()){
                                    case 1:
                                        Pergunta4_1();
                                        sangue = vida(sangue, 10);
                                        System.out.println("VIDA ||||||    "+sangue+"%");
                                        System.out.println(retornavida(sangue));
                                        switch(Resposta()){
                                            case 1:
                                                Pergunta5_1();
                                                sangue = vida(sangue, 20);
                                                System.out.println(retornavida(sangue));
                                                //Menu
                                                break;
                                            case 2:
                                                Pergunta5_2();
                                                sangue = vida(sangue, 100);
                                                System.out.println(retornavida(sangue));
                                                //Menu
                                                break;
                                        }
                                        break;
                                        
                                    case 2:
                                        Pergunta4_2();
                                        sangue = vida(sangue, 20);
                                        System.out.println("VIDA |||||     "+sangue+"%");
                                        //Menu
                                        break;
                                }
                                break;
                            case 2:
                                Pergunta3_2();
                                sangue = vida(sangue, -10);
                                System.out.println("VIDA ||||||    "+sangue+"%");
                                System.out.println(retornavida(sangue));
                                break;
                        } break;
                        
                    case 3:
                        Pergunta2_3();
                        sangue = vida(sangue, 20);
                        System.out.println("VIDA ||||||    "+sangue+"%");
                        System.out.println(retornavida(sangue));
                        break;
                } break;
                
            case 2:
                Pergunta1_2();
                sangue = vida(sangue, 100);
                System.out.println(retornavida(sangue)); 
                retornavida(sangue);
                //Menu();
                break;
                
            case 3:
                Pergunta1_3();
                sangue = vida(sangue, 30);
                System.out.println("\nVIDA |||||     "+sangue+"%");
                System.out.println(retornavida(sangue));
                switch(Resposta()){
                    case 1:
                        Pergunta2_3_1();
                        sangue = vida(sangue, -10);
                        System.out.println("\nVIDA ||||||    "+sangue+"%");
                        switch(Resposta()){
                            case 1:
                                Pergunta2_3_3();
                                sangue = vida(sangue, -10);
                                System.out.println("\nVIDA |||||||   "+sangue+"%");
                                switch(Resposta()){
                                    case 1:
                                        Pergunta2_3_3_1();
                                        sangue = vida(sangue, 100);
                                        System.out.println(retornavida(sangue));
                                        //Menu
                                        break;
                                    case 2:
                                        Pergunta2_3_3_2();
                                        sangue = vida(sangue, 0);
                                        System.out.println("VIDA |||||||   "+sangue+"%");
                                        //Menu
                                        break;
                                }
                                break;
                            case 2:
                                Pergunta2_3_3_3();
                                sangue = vida(sangue, -10);
                                System.out.println("\nVIDA |||||||   "+sangue+"%");
                                switch(Resposta()){
                                    case 1:
                                        Pergunta2_3_3_3_2();
                                        sangue = vida(sangue, 70);
                                        System.out.println("\nVIDA           "+sangue+"%");
                                        System.out.println(retornavida(sangue));
                                        //Menu
                                        break;
                                    case 2:
                                        Pergunta2_3_3_2_2();
                                        sangue = vida(sangue, 70);
                                        System.out.println("\nVIDA          "+sangue+"%");
                                        System.out.println(retornavida(sangue));
                                        //Menu
                                        break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        Pergunta2_3_2();
                        sangue = vida(sangue, -10);
                        System.out.println("\nVIDA ||||||    "+sangue+"%");
                        switch(Resposta()){
                            case 1:
                                Pergunta3_2_2_3_1();
                                sangue = vida(sangue, 60);
                                System.out.println("\nVIDA           "+sangue+"%");
                                System.out.println(retornavida(sangue));
                                //Menu
                                break;
                            case 2:
                                Pergunta3_3_3_2_2();
                                sangue = vida(sangue, -10);
                                System.out.println("\nVIDA |||||||   "+sangue+"%");
                                switch(Resposta()){
                                    case 1:
                                        Pergunta3_3_4();
                                        sangue = vida(sangue, 0);
                                        System.out.println("\nVIDA |||||||    "+sangue+"%");
                                        break;
                                    case 2:
                                        Pergunta3_4_3();
                                        sangue = vida(sangue, 0);
                                        System.out.println("\nVIDA |||||||   "+sangue+"%");
                                        break;
                                }
                                break;
                        }
                        break;
                    case 3:
                        Pergunta1_3_3();
                        sangue = vida(sangue, 50);
                        System.out.println("\nVIDA           "+sangue+"%");
                        System.out.println(retornavida(sangue));
                        break;
                } 
                break;
                      
        }

    }


    }
    
 
