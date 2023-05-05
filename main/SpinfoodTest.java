package main;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Dies ist ein JUnit-Testfall, der die Funktionalität der "readData()" Methode der Spinfood-Klasse überprüft.
 * Der Testfall überprüft, ob die Methode eine CSV-Datei mit Teilnehmerinformationen liest, Paare von Teilnehmern
 * auf der Grundlage eines Matching-Algorithmus erstellt und eine korrekte Ausgabe zurückgibt.
 */
class SpinfoodTest {

    /**
     * Diese Methode testet die "readData()" Methode der Spinfood-Klasse.
     * Sie prüft, ob die Methode die erwarteten Daten aus einer CSV-Datei liest und verarbeitet.
     * Insbesondere prüft der Test, ob die Methode Pairs-Objekte zurückgibt, die nicht null sind,
     * und ob sie die erwartete Anzahl von gepaarten und ungepaarten Teilnehmern enthalten.
     * Wenn die Tests erfolgreich sind, werden die Namen und E-Mail-Adressen der gepaarten und ungepaarten Teilnehmer
     * in der Konsole ausgegeben, und der Testfall gibt eine Erfolgsmeldung aus.
     *
     * @throws IOException wenn ein Fehler beim Lesen der CSV-Datei auftritt
     */
    @org.junit.jupiter.api.Test
    void readData() throws IOException {
        String filename = "C:/Users/moham/Desktop/SWPraktikum2023/SP23_Gruppe2AldowayaFahammMokadamBadawi/teilnehmerliste.csv";
        try {
            // Lese die Daten aus der CSV-Datei
            Pairs pairs = Spinfood.readData(filename);

            // Überprüfe, dass die Pairs-Objekte nicht null sind und die erwartete Anzahl von Teilnehmern enthalten
            assertNotNull(pairs);
            assertNotNull(pairs.getPairedParticipants());
            assertNotNull(pairs.getSuccessorParticipants());

            assertEquals(69, pairs.getPairedParticipants().size());
            assertEquals(168, pairs.getSuccessorParticipants().size());

            // Gebe die Namen und E-Mail-Adressen der gepaarten und ungepaarten Teilnehmer aus
            System.out.println("Paired Participants:");
            for (Pair p :pairs.getPairedParticipants()) {
                System.out.println(p);
            }

            System.out.println("Unpaired Participants:");
            for (Participant p : pairs.getSuccessorParticipants()) {
                System.out.println(p);
            }
        } catch (IOException e) {
            // Wenn ein Fehler auftritt, ist der Test fehlgeschlagen
            fail("IOException was thrown");
        }

        // Gebe eine Erfolgsmeldung aus
        System.out.println("readData() test passed");
        System.out.println("--------------------------------------------");
    }
}
