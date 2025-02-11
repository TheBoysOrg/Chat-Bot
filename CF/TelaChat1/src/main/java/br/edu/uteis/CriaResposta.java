package br.edu.uteis;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class CriaResposta {
    
    public static String responde(String mensagem){
        try {
                String json = AnalizaMensagem.mandamensagem(mensagem);

                ObjectMapper objectMapper = new ObjectMapper();
                Bot response = objectMapper.readValue(json, Bot.class);
                
                
                if(response.toString().equals("melhor_jogador")){
                    return "Cristiano Ronaldo é o melhor jogador da história do futebol, acumulando recordes"
                            + " impressionantes e conquistas inesquecíveis. Entre seus maiores feitos, "
                            + "destaca-se o fato de ser o maior artilheiro da Liga dos Campeões, "
                            + "com mais de 140 gols, sendo peça-chave em cinco títulos do torneio. "
                            + "Além disso, ele se tornou o maior artilheiro de seleções, superando"
                            + " a marca de 120 gols por Portugal, liderando sua equipe a conquistas"
                            + " históricas, como a Eurocopa de 2016. Outro marco incrível foi alcançar "
                            + "o posto de maior artilheiro do futebol, superando a marca de 920 gols "
                            + "oficiais. Seu legado é incomparável, sendo símbolo de talento, disciplina e mentalidade vencedora.";
                }
                else if(response.toString().equals("vencedor_copa")) {
                    return "A Copa do Mundo da FIFA já teve várias seleções vencedoras ao longo dos anos. O Brasil é "
                            + "o país com mais títulos, conquistando o torneio em 1958, 1962, 1970, 1994 e 2002. "
                            + "A Alemanha venceu quatro vezes, com títulos em 1954, 1974, 1990 "
                            + "(como Alemanha Ocidental) e 2014 (como Alemanha unificada). A Argentina também tem três "
                            + "conquistas, em 1978, 1986 e 2022. O Uruguai foi campeão nas edições de 1930 e 1950, enquanto a "
                            + "Itália conquistou a taça em 1934, 1938, 1982 e 2006. A França venceu em 1998 e 2018, a Inglaterra "
                            + "em 1966 e a Espanha em 2010. Esses países representam a elite do futebol mundial,"
                            + " com o Brasil dominando o torneio com seus 5 títulos. 🌍⚽";
                }
                else if(response.toString().equals("cartao_vermelho")){
                    return "O cartão vermelho pode ser aplicado em situações como: Falta violenta ou conduta agressiva, "
                            + "Impedir uma oportunidade clara de gol com falta, Uso de linguagem ofensiva ou gestos obscenos,"
                            + " Receber o segundo cartão amarelo na partida";
                }
                else if(response.toString().equals("escanteio")){
                    return "Um escanteio é concedido quando a bola cruza a linha de fundo após ter sido tocada por um jogador"
                            + " do time defensor. O time adversário cobra o escanteio a partir do canto do campo.";
                }
                else if(response.toString().equals("impedimento")){
                    return "Um jogador está impedido se, no momento do passe, ele estiver mais próximo do gol adversário"
                            + " do que o penúltimo defensor e tirar vantagem dessa posição (recebendo a bola ou interferindo no lance).";
                }
                else if(response.toString().equals("jogador_mais_gols")){
                    return "O jogador com mais gols oficiais na história do futebol é Cristiano Ronaldo, com impressionantes"
                            + " 924 gols em competições reconhecidas oficialmente. No entanto, se considerarmos gols em "
                            + "partidas não oficiais, Pelé lidera com um total de 1.282 gols. Pelé somou esses gols ao "
                            + "longo de sua carreira, incluindo amistosos e outros jogos não reconhecidos pela FIFA, "
                            + "consolidando-se como um dos maiores ícones do esporte. Ambos os jogadores são lendas,"
                            + " cada um com seu legado único. ⚽🔥";
                }
                else if(response.toString().equals("quantidade_jogador")){
                    return "Cada time pode ter 11 jogadores em campo, incluindo o goleiro. Se um time ficar com menos"
                            + " de 7 jogadores, a partida pode ser encerrada pelo árbitro.";
                }
                else if(response.toString().equals("roubou_bola_ouro")){
                    return "Lionel Messi é, sem dúvida, um dos maiores jogadores da história do futebol, mas muitos "
                            + "consideram que ele conquistou Bolas de Ouro de forma injusta em algumas edições, "
                            + "especialmente em 2019, 2021 e 2023. Em 2019, Messi venceu o prêmio, mas muitos acreditam "
                            + "que o título deveria ter sido para Virgil van Dijk, que teve uma temporada excepcional, "
                            + "levando o Liverpool à vitória na Liga dos Campeões e sendo decisivo em sua defesa. "
                            + "Já em 2021, Messi conquistou sua setima Bola de Ouro, mas a vitória foi muito contestada,"
                            + " já que Robert Lewandowski fez uma temporada histórica pelo Bayern de Munique, quebrando"
                            + " recordes de gols, e deveria ter sido o vencedor daquela edição. Em 2023, a vitória de"
                            + " Messi foi vista com críticas, especialmente pelo desempenho de Erling Haaland, que teve"
                            + " uma temporada incrível pelo Manchester City, conquistando a Liga dos Campeões e marcando"
                            + " uma quantidade impressionante de gols. Esses jogadores apresentaram performances muito"
                            + " superiores em termos de títulos e estatísticas, o que gerou debates sobre a justiça das "
                            + "premiações de Messi nesses anos.";
                }
                
                else if(response.toString().equals("tempo_jogo")){
                    return "Uma partida tem 90 minutos, divididos em dois tempos de 45 minutos cada, com um "
                            + "intervalo de 15 minutos. Se houver empate em jogos eliminatórios, pode haver "
                            + "prorrogação, que consiste em dois tempos de 15 minutos cada. Se o empate persistir,"
                            + " a decisão vai para os pênaltis.";
                }
                else if(response.toString().equals("tiro_meta")){
                    return "Um tiro de meta acontece quando a bola cruza a linha de fundo e foi tocada por um "
                            + "jogador do time atacante, reiniciando o jogo com um chute do goleiro ou outro defensor.";
                }
                else if(response.toString().equals("clube_mais_champions")){
                    return "O clube com mais títulos da Champions League é o Real Madrid, com 14 conquistas."
                            + " Outros times históricos como AC Milan (7 títulos), Bayern de Munique e Liverpool"
                            + " (6 títulos) também são grandes vencedores da competição.";
                }
                else if(response.toString().equals("falta")){
                    return "No futebol, as faltas acontecem quando um jogador infringe as regras ao impedir "
                            + "o adversário de forma irregular. Elas podem ser leves, sem risco físico "
                            + "(como um empurrão ou toque de mão acidental), ou graves, quando envolvem"
                            + " violência ou perigo (como carrinhos agressivos ou cotoveladas), "
                            + "resultando em cartões amarelos ou vermelhos. Há também as faltas "
                            + "táticas, feitas de propósito para parar um contra-ataque, geralmente "
                            + "punidas com cartão amarelo. Se a falta ocorre fora da área, o adversário "
                            + "recebe um tiro livre; se for dentro da área, é marcado um pênalti. "
                            + "As faltas são parte do jogo, mas seu excesso pode prejudicar um time "
                            + "com expulsões e suspensões.";
                }
                else if(response.toString().equals("principais_ligas")){
                    return "As ligas mais importantes do mundo incluem a Premier League (Inglaterra), com alta "
                            + "competitividade; a La Liga (Espanha), dominada por Real Madrid e Barcelona; "
                            + "a Bundesliga (Alemanha), com o Bayern de Munique como destaque; a Serie A"
                            + " (Itália), conhecida por seu estilo tático; e a Ligue 1 (França), com"
                            + "o Paris Saint-Germain, além do Campeonato Brasileiro, que é altamente"
                            + " imprevisível e formador de novos talentos.";
                }
                else if(response.toString().equals("rivalidade_maior")){
                    return "A maior rivalidade entre clubes é o El Clásico entre Barcelona e Real Madrid"
                            + ", que envolve questões políticas além do futebol. Outros grandes clássicos"
                            + " incluem Boca Juniors x River Plate na Argentina, Manchester United x Liverpool"
                            + " na Inglaterra e Flamengo x Vasco no Brasil. Entre jogadores, a rivalidade entre "
                            + "Cristiano Ronaldo e Messi é a mais icônica, enquanto disputas históricas como Pelé x Maradona "
                            + "também marcaram gerações.";
                }
                else if(response.toString().equals("sistema_rebaixamento")){
                    return "O sistema de rebaixamento determina que os times que terminam nas últimas"
                            + " posições de uma liga sejam enviados para uma divisão inferior, enquanto"
                            + " os melhores da segunda divisão sobem. No Brasil, por exemplo, os quatro"
                            + " últimos da Série A são rebaixados para a Série B, e os quatro primeiros da Série B sobem para a Série A.";
                }
                else if(response.toString().equals("copa_america_mais")){
                    return "Maior vencedor da Copa América:\n" +
                            "\n" +
                            "• O Uruguai e o Brasil são os países com mais títulos da Copa América.\n" +
                            "   • Uruguai tem 15 títulos.\n" +
                            "   • Brasil também tem 9 títulos.\n" +
                            "O Uruguai é o país com mais conquistas, seguido pelo Brasil.";
                }
                else if(response.toString().equals("liga_inglesa_mais")){
                    return "Maior vencedor da Premier League:\n" +
                            "\n" +
                            "• O Manchester United é o clube com mais títulos da Premier League,"
                            + " com 13 conquistas desde a criação da competição na temporada 1992-1993.\n" +
                            "• Eles são seguidos pelo Manchester City, que tem 9 títulos, e o Liverpool, "
                            + "com 19 títulos no total, mas considerando todas as edições da liga (incluindo a antiga First Division).";
                }
                else if(response.toString().equals("maior_artilheiro_selecao_brasileira")){
                    return "O maior artilheiro da história da Seleção Brasileira é Neymar, com 79"
                            + " gols até agora, superando Ronaldo Fenômeno, que tinha 62 gols.";
                }
                else if(response.toString().equals("maior_goleiro")){
                    return "A resposta a essa pergunta pode variar dependendo de opiniões pessoais e critérios."
                            + " Alguns dos goleiros mais frequentemente mencionados como os melhores de todos os tempos são:\n" +
                            "• Lev Yashin, o único goleiro a ganhar a Bola de Ouro.\n" +
                            "• Gianluigi Buffon, com uma carreira de sucesso na Juventus e na Seleção Italiana.\n" +
                            "• Dino Zoff, famoso por suas conquistas na Itália.\n" +
                            "• Manuel Neuer, que revolucionou a posição com seu estilo de goleiro \"líbero\" e grandes"
                            + " conquistas com a Alemanha e o Bayern de Munique.";
                }
                else if(response.toString().equals("mundial_palmeiras")){
                    return "O palmeiras não possui, e provavelmente, nunca terá.";
                }
                else if(response.toString().equals("treinador_mais_vitorioso")){
                    return "O treinador mais vitorioso da história do futebol, em termos de títulos conquistados,"
                            + " é Sir Alex Ferguson. Ele tem uma carreira extraordinária, com 49 títulos principais, incluindo:" +
                            "\n" +
                            "• 13 títulos da Premier League com o Manchester United.\n" +
                            "• 2 Ligas dos Campeões da UEFA.\n" +
                            "• 5 FA Cups.\n" +
                            "• 4 Copas da Liga Inglesa.\n" +
                            "Além de muitos outros títulos nacionais e internacionais.\n" +
                            "Ferguson é amplamente reconhecido não apenas pela quantidade de títulos, mas pela"
                            + " sua habilidade em manter o Manchester United no topo por mais de duas décadas."
                            + " Sua longevidade e sucesso são incomparáveis, fazendo dele um dos maiores treinadores da história do futebol.";
                }
                else if(response.toString().equals("brasileirao_mais_titulo_time")){
                    return "O Palmeiras é o time com mais títulos do Campeonato Brasileiro, com 11 conquistas"
                            + " (em 1960, 1967, 1967, 1972, 1973, 1993, 1994, 2016, 2018, 2022, 2023).";
                }
                else if(response.toString().equals("edicao_mais_desputada_brasileirao")){
                    return "A edição de 2011 foi uma das mais disputadas do Campeonato Brasileiro, quando o"
                            + " Fluminense venceu o título com apenas 1 ponto de vantagem sobre o Corinthians,"
                            + " que ficou em segundo. Foi uma competição muito equilibrada, com a disputa pelo "
                            + "título acontecendo até a última rodada.";
                }
                else if(response.toString().equals("mais_titulos_seguidos_brasileirao")){
                    return "Flamengo e São Paulo são os clubes que mais venceram o Campeonato Brasileiro em "
                            + "edições consecutivas. O Flamengo ganhou em 2019 e 2020, e o São Paulo em 2006, 2007 e 2008.";
                }
                else if(response.toString().equals("sistema_pontos_brasileirao")){
                    return "No sistema de pontos corridos do Campeonato Brasileiro, todas as equipes jogam entre"
                            + " si em um turno e returno. Cada vitória soma 3 pontos, um empate soma 1 ponto, e uma"
                            + " derrota não soma pontos. O time com o maior número de pontos ao final de todas as "
                            + "rodadas é o campeão. Além disso, os 4 primeiros colocados se classificam para a Copa"
                            + " Libertadores, enquanto os 4 últimos são rebaixados para a Série B.";
                }
                else if(response.toString().equals("trenador_mais_vitorioso_brasileirao")){
                    return "O Luxemburgo é o técnico com mais títulos do Campeonato Brasileiro, com 4 conquistas"
                            + " (1993, 1994, 1998, 2003).";
                }
                else if(response.toString().equals("maior_goleada_brasileirao")){
                    return "A maior goleada da história do Campeonato Brasileiro foi 10 a 1. Esse placar ocorreu "
                            + "em uma partida entre o Gremio e o Santos em 1997.";
                }
                else if(response.toString().equals("nosense")){
                    return "fale algo que tenha sentido";
                }
                else{
                    return "eu não sei";
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "eu não sei";
    }
}