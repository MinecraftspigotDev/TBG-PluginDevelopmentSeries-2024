# Starten met Minecraft Plugin Development - 1.20.4 van The Belgium Games

Welkom bij de broncode van het project "Starten met Minecraft Plugin Development - 1.20.4" geïnspireerd door The Belgium Games.

## Over dit project

Dit project is een persoonlijke passieproject en is **niet goedgekeurd of verbonden aan** The Belgium Games. Alle code en documentatie in deze repository zijn onafhankelijk ontwikkeld en vertegenwoordigen mijn eigen werk en interpretatie van de tutorials en richtlijnen van The Belgium Games.

## Inhoud

Deze repository bevat de broncode en documentatie voor het ontwikkelen van een Minecraft plugin voor versie 1.20.4. Het doel van dit project is om beginnende ontwikkelaars te helpen begrijpen hoe ze hun eigen plugins kunnen maken en aanpassen.

## Vereisten

- [PaperMC](https://papermc.io/) als server software
- [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/) voor de ontwikkelomgeving
- [Minecraft Development plugin](https://plugins.jetbrains.com/plugin/8327-minecraft-development) voor IntelliJ IDEA
- [Apache Maven](https://maven.apache.org/download.cgi) voor projectbeheer en afhankelijkheidsbeheer

## Installatie

1. **Clone de repository:**
    ```sh
    git clone https://github.com/MinecraftspigotDev/TBG-PluginDevelopmentSeries-2024.git
    cd TBG-PluginDevelopmentSeries-2024
    ```

2. **Importeer het project in IntelliJ IDEA Community Edition.**
    - Zorg ervoor dat je de [Minecraft Development plugin](https://plugins.jetbrains.com/plugin/8327-minecraft-development) hebt geïnstalleerd.

3. **Configureer de PaperMC API in je `pom.xml`:**
    ```xml
    <dependency>
        <groupId>io.papermc.paper</groupId>
        <artifactId>paper-api</artifactId>
        <version>1.20.4-R0.1-SNAPSHOT</version>
        <scope>provided</scope>
    </dependency>
    ```

4. **Bouw het project met Maven:**
    ```sh
    mvn clean install
    ```

5. **Plaats de gegenereerde JAR in de `plugins` map van je PaperMC server.**
    - De JAR bevindt zich in de `target` map na het bouwen van het project.

6. **Start je PaperMC server om de plugin te laden.**

## Gebruik

Zodra de plugin is geïnstalleerd en de server is gestart, kun je de nieuwe functies testen en aanpassen volgens je eigen behoeften. Raadpleeg de documentatie en de broncode voor specifieke gebruiksinstructies en voorbeeldcommando's.

## Tutorial Video's

Om te starten met het volgen van de video's, bekijk de YouTube-serie [hier](https://www.youtube.com/watch?v=cbDEDV7WsO4).

## Bijdragen

Bijdragen aan dit project zijn welkom. Voel je vrij om een pull request in te dienen of issues te openen om bugs te melden of nieuwe functies aan te vragen.

## Licentie

Dit project is gelicentieerd onder de MIT-licentie. Zie het [LICENSE](LICENSE) bestand voor meer informatie.

## Disclaimer

Dit project is **niet goedgekeurd of verbonden aan** The Belgium Games. Het is een onafhankelijk ontwikkelingsproject geïnspireerd door hun werk.

Deze README is geschreven met behulp van ChatGPT. Hierdoor kunnen er fouten in staan. Meld eventuele fouten op Discord (techjunkyben) of dien een pull request in op GitHub.

## Contact

Voor vragen of suggesties, neem contact op via Discord: **techjunkyben**.

Veel plezier met het ontwikkelen van je eigen Minecraft plugins!
