A feladat megoldásához a csatolt orszagok.txt és varosok.txt fájlokat kell használni. Ezek
a fájlok egy országlistát, illetve egy városlistát tárolnak. Utóbbi fájlban értelemszerűen
tároljuk azt is, hogy egy-egy város melyik országban található.

Az adatok mindkét fájlban vesszővel ( , ) vannak elválasztva.

Az orszagok.txt fájl felépítése:
● Hárombetűs országkód
● Ország neve
● Kontinens
● Régió
● Terület
● Függetlenség elnyerésének időpontja (évszám vagy NULL)
● Populáció
● Államfő neve
A varosok.txt fájl felépítése:
● Város neve
● Hárombetűs országkód (ahol a város található)
● Város populációja

A feladatmegoldás közben ügyelj a kódformázásra és elnevezésekre is!
Figyelj a helyes hibakezelésre, a kezelendő hibák ne érjék el a main metódust!
A bemeneti fájlokat ne változtasd meg, a megoldásoknak az eredeti fájlokra kell helyesen
működniük!
Kiemelten figyelj a feladatokban meghatározott package-kre, osztályokra és metódusok
szignatúrájára. Hibás vagy hiányzó metódusok automatikusan 0 pontot érnek!
Fordítási hibát tartalmazó kód automatikusan 0 pontot ér. Figyelj oda, mit adsz be!
A feladatok a következő oldalon...

1. Hozd létre az országok és a városok adatait tároló osztályokat! (Természetesen
   fieldekkel, konstruktorokkal, getterekkel, setterekkel együtt.)
   Az országok és a városok között kétirányú kapcsolat van. Ez jelenjen meg az
   osztályokban!
   Hozz létre egy WorldStatistics osztályt is. Ebbe írd majd a következő (a 2.), valamint
   az 5-10. feladatok megoldásait!
   4 pont
2. Olvasd be a fájlok tartalmát, és tárold egy megfelelő adatstruktúrában!
   Az 5-10. feladatok metódusaiban a beolvasott adatokat használd!
   5 pont
3. A Country osztályba írj metódust az alábbi szignatúrával:
   public double getPopulationDensity()
   Ez a metódus visszaadja az adott ország népsűrűségét fő/km2

-ben! Ha az ország
területe vagy népessége nincs megadva, akkor a metódusod -1-gyel térjen vissza!
2 pont
4. A Country osztályba írj metódust az alábbi szignatúrával:
   public double getRuralPopulation()
   Ez a metódus visszaadja, hogy az adott országban hány fő él a felsorolt városokon
   kívül!
   2 pont
5. Írj metódust, amely az országkód alapján visszaadja egy ország összes adatát! A
   metódus szignatúrája az alábbi legyen:
   public Country findCountryByISoCode(String isoCode)
   2 pont
6. Írj metódust, amely visszaadja egy paraméterül kapott kontinens országainak az
   országkódjait! A metódus szignatúrája az alábbi legyen:
   public List<String> getCountriesOfContinent(String continentName)
   2 pont

7. Írj metódust, amely visszaadja egy paraméterül kapott ország városainak a neveit (az
   országot országkóddal adjuk meg)! A metódus szignatúrája az alábbi legyen:
   public Set<String> getCitiesOfCountry(String countryCode)
   2 pont

8. Hány országnak az államfőjének a nevében szerepel “Hamad” vagy “Ahmad” vagy
   “Ahmed”? Írj metódust, amely válaszol erre a kérdésre!
   A metódus szignatúrája az alábbi legyen:
   public int countAhmeds()
   2 pont
9. Melyik betűvel kezdődik a legtöbb országkód? Írj metódust, amely válaszol erre a
   kérdésre.
   A metódus szignatúrája az alábbi legyen:
   public String getPopularFirstLetter()
   5 pont
10. Melyik ország nyerte el legkésőbb (a nyilvántartás szerint) a függetlenségét? Add
    vissza a megfelelő országkódot, a metódus szignatúrája pedig az alábbi legyen:
    public String lastIndependentCountryCode()
    4 pont

11. Bónusz: A City osztályba írj egy metódust az alábbi szignatúrával:
    public double getPopulationPercentage()
    A metódus visszaadja, hogy az adott város populációja hány százaléka az
    anyaország populációjának! Ha akár a város, akár az anyaország populációja nincs
    megadva, a metódusod -1-gyel térjen vissza!
    3 pont