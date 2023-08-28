package org.example.applications;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JosephusProblemTest {
    @Test
    public void shouldReturnDanielaAsWinner() {
        String[] participants = {"Adriana", "Briana", "Carlos", "Daniela", "Eliana"};

        String result = JosephusProblem.solve(participants, 3);
        String expected = "Daniela";

        assertEquals(result, expected);
    }
}