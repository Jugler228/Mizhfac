package org.pupa.characters;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.pupa.Battle;


/**
 * Unit test for simple App.
 */
class Fight
{
    @Test
    @DisplayName("1. Fight")
    public void fight() {
        // GIVEN
        var carl = new Warrior();
        var jim = new Knight();

        // WHEN
        var res = Battle.fight(carl,jim);

        // THEN
        assertEquals(false, res);

    }

    /*// Test driven approach = First make tests, then implementation.
    @Test
    @DisplayName("Smoke test")
    public void name() {
        // Arrange  | Given
        var chuck = new Warrior();
        var bruce = new Warrior();

        // Act  | When
        var res = Battle.fight(chuck,bruce);

        // Assert   | Then
        assertTrue(res);
        // YAGNI
        // You aren't gonna geed it
    }*/
}
