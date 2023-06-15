package com.example.questionario

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView

class ResultadoTela: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_tela)

        val buttonWeb = findViewById<Button>(R.id.buttonGIT)

        buttonWeb.setOnClickListener {
            val webpage =
                Uri.parse("https://github.com/guilhermeMaiaSupernova/Desenvolvimento_mobile_Ap2.git")
            val intent = Intent(Intent.ACTION_VIEW, webpage)
            startActivity(intent)
        }

        var textResp: String = ""

        var textDesc: String = ""

        if (Dados.musica == 3 && Dados.preco == 3 && Dados.data == 3) {
            textResp = "ONIBUS OFICIAL OPEN BAR - GAROTA VIP RIO 2023"
            textDesc = "Sabado, 19 de Agosto - Parque Olimpico - Barra da Tijuca - Rio de Janeiro" + ":: ATRAÇÕES :Wesley Safadão/Leo Santana/ Mumuzinho/Murilo Jorge e Mateus"
        } else if (Dados.musica == 3 && Dados.preco == 2 && Dados.data == 3) {
            textResp = "ZECA PAGODINHO NO QUALISTAGE"
            textDesc = "Data : 30/09/2023\n" +
                    "Horário do Evento: 21h\n" +
                    "Local: Qualistage\n" +
                    "Endereço: Via Parque Shopping - Av. Ayrton Senna, 3000 - Barra da Tijuca"
        } else if (Dados.musica == 3 && Dados.preco == 3 && Dados.data == 2) {
            textResp = "RAÇA NEGRA NO QUALISTAGE"
            textDesc = "Data: 23/06/2023\n" +
                    "Horário do Evento: 22h\n" +
                    "Local: Qualistage\n" +
                    "Endereço: Via Parque Shopping - Av. Ayrton Senna, 3000 - Barra da Tijuca"
        } else if (Dados.musica == 4 && Dados.preco == 3 && Dados.data == 3) {
            textResp = "Alma Festival"
            textDesc = "MÚSICA • GAMES • ARTES • ESPORTES\n" +
                    "Uma conexão jamais vista no Rio de Janeiro, viveremos essa experiência dia 15 DE JULHO, no Rio de Janeiro!"
        } else if (Dados.musica == 3 && Dados.preco == 3 && Dados.data == 4) {
            textResp = "Numanice – RJ"
            textDesc = "Numanicers do errejota, vocês estão preparados pro que vai acontecer aqui? O maior Numanice de todos os tempos vem GRANDÃO - em todos os sentidos. Dia 08 de Julho no Engenhão, a gente vai fazer história no Rio de Janeiro. "
        } else if (Dados.musica == 2 && Dados.preco == 3 && Dados.data == 3) {
            textResp = "We Make Better Days"
            textDesc = "A gente se encontra no dia 09 de setembro, feriadão da Independência, com nosso full open bar padrão, muitas surpresas & aquela energia surreal que vocês já conhecem!"
        } else if (Dados.musica == 2 && Dados.preco == 4 && Dados.data == 2) {
            textResp = "Vintage is a Festival"
            textDesc = "Esqueça tudo que você já viu e ouviu sobre Vintage Culture.\n" +
                    "\n" +
                    "Esqueça os rótulos, evite comparações, a nova era começa agora…\n" +
                    "\n" +
                    "VINTAGE IS A FESTIVAL"
        } else if (Dados.musica == 3 && Dados.preco == 2 && Dados.data == 4) {
            textResp = "Sorriso Maroto As Antigas"
            textDesc = "O Maior evento de pagode do Brasil vai explodir Niterói de uma forma sem igual!\n"+"São muitas horas de show com os grandes sucessos do grupo!"
        } else if (Dados.musica == 1 && Dados.preco == 2 && Dados.data == 1) {
            textResp = "CarnaRildy – 2024"
            textDesc = "O CarnaRildy vai voltar em 2024 em um formato ainda maior, muuuuitas atrações e uma estrutura para deixar todo mundo de queixo caído"

        } else if (Dados.musica == 3 && Dados.preco == 1 && Dados.data == 1) {
            textResp = "CarnaRildy – 2024"
            textDesc = "O CarnaRildy vai voltar em 2024 em um formato ainda maior, muuuuitas atrações e uma estrutura para deixar todo mundo de queixo caído"

        } else if (Dados.musica == 1 && Dados.preco == 1 && Dados.data == 3) {
            textResp = "Festa Baderna"
            textDesc = "A BADERNA MAIS INCRÍVEL DA SUA VIDA ESTÁ DE VOLTA!\n" +
                    "Estavam com saudade, né?! A gente também!\n" +
                    "Baderna é bagunça, é alegria, é o melhor de todos os mundos em uma noite"
        } else if (Dados.musica == 1 && Dados.preco == 4 && Dados.data == 3) {
            textResp = "SEU VIDAL | O Fantástico Arraiá das Laricas"
            textDesc = "22 jul - 2023 • 21:00 > 23 jul - 2023 • 07:00\n" +
                    "Sejam bem-vindos ao FANTÁSTICO ARRAIÁ DAS LARICAS !!!\n"+
                    "Um OPEN BAR de milhões; e um OPEN FOOD de dar água na boca!"
        } else if (Dados.musica == 3 && Dados.preco == 4 && Dados.data == 3) {
            textResp = "SEU VIDAL | O Fantástico Arraiá das Laricas"
            textDesc = "22 jul - 2023 • 21:00 > 23 jul - 2023 • 07:00\n" +
                    "Sejam bem-vindos ao FANTÁSTICO ARRAIÁ DAS LARICAS !!!\n"+
                    "Um OPEN BAR de milhões; e um OPEN FOOD de dar água na boca!"
        } else if (Dados.musica == 1 && Dados.preco == 3 && Dados.data == 3) {
            textResp = "Baile do Dennis"
            textDesc = "Data: 29 de Julho de 2023\n" +
                    "Fala aê, diz aê : preparados pro maior baile do mundo? "
        } else if (Dados.musica == 1 && Dados.preco == 2 && Dados.data == 3) {
            textResp = "Resenha do Mumu"
            textDesc ="Data: 09 de Julho de 2023\n" +
                    "A maior resenha do Brasil vai voltar em grande estilo."
        } else if (Dados.musica == 1 && Dados.preco == 1 && Dados.data == 1) {
            textResp = "Reveillon na praia de Copacabana"
            textDesc ="Que tal curtir um show ao vivo enquanto assiste aos fogos mundialmente conhecidos de Copacabana?"
        } else if (Dados.musica == 3 && Dados.preco == 1 && Dados.data == 1) {
            textResp = "Resenha do Mumu"
            textDesc ="Que tal curtir um show ao vivo enquanto assiste aos fogos mundialmente conhecidos de Copacabana?"
        } else if (Dados.musica == 2 && Dados.preco == 3 && Dados.data == 4) {
            textResp = "Rio ME"
            textDesc =" a Rio ME retorna com uma agenda intensa, incluindo também um evento em formato open bar, dia 10 dezembro, no Morro da Urca."
        } else if (Dados.musica == 2 && Dados.preco == 1 && Dados.data == 4) {
            textResp = "Miroir"
            textDesc =" O “mijuá” é uma das festas eletrônicas mais conhecidas da Zona Sul do Rio e possui uma localização privilegiada. Está preso na lagoa Rodrigo de Freitas."
        } else if (Dados.musica == 2 && Dados.preco == 1 && Dados.data == 3) {
            textResp = "Palaphitas"
            textDesc ="O espaço é amplo, possui pista de dança (área coberta) e área com mesas externas. Ele está preso no Jockey Club da Gávea. "
        } else if (Dados.musica == 2 && Dados.preco == 1 && Dados.data == 2) {
            textResp = "Zero Zero "
            textDesc ="Amplo espaço para dançar, com um restaurante ao lado da pista e que fecha por volta da meia-noite, quando começa a encher!\n" +
                    "Se você tiver sorte, poderá encontrar alguns famosos por lá!"
        } else if (Dados.musica == 2 && Dados.preco == 1 && Dados.data == 1) {
            textResp = "Nuth Club"
            textDesc ="  Casa noturna na Avenida Armando Lombardi, que é “a avenida dos discos na Barra da Tijuca”. Tocar música eletrônica e outros estilos também!"
        } else {
            textResp = "Zero Zero "
            textDesc =
                "Amplo espaço para dançar, com um restaurante ao lado da pista e que fecha por volta da meia-noite, quando começa a encher!\n" +
                        "Se você tiver sorte, poderá encontrar alguns famosos por lá!"
        }


            val textoResposta: TextView = findViewById(R.id.Resposta)
            textoResposta.text = "Que tal conferir a festa: $textResp"


            val textoRespostaDesc: TextView = findViewById(R.id.RespostaDesc)
            textoRespostaDesc.text = "$textDesc"
            textoRespostaDesc.movementMethod = ScrollingMovementMethod()



        }
    }
