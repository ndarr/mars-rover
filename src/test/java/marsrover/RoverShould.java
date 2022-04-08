package marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverShould {
    Rover rover;

    @Test
    void startAtPosition_0_0_N() {
        rover = new Rover();
        assertEquals("0:0:N", rover.execute(""));
    }

    @Test
    void havePosition_2_3_N_when_navigatedWith_MMRMMLM() {
        rover = new Rover();
        assertEquals("2:3:N", rover.execute("MMRMMLM"));
    }
}
