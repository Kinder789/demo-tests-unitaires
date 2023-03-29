package test;

import fr.diginamic.enumerations.Saison;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SaisonTest {
    @Test
    public void testValueOfLibelle() {
        assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
        assertEquals(Saison.ETE, Saison.valueOfLibelle("Eté"));
        assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("Automne"));
        assertEquals(Saison.HIVER, Saison.valueOfLibelle("Hiver"));
    }

    @Test
    public void testValueOfLibelleCasLimite() {
        assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("prIntempS"));
        assertEquals(Saison.ETE, Saison.valueOfLibelle("ETÉ"));
        assertNull(Saison.valueOfLibelle("été "));
        assertNull(Saison.valueOfLibelle(""));
        assertNull(Saison.valueOfLibelle(null));
    }
}
