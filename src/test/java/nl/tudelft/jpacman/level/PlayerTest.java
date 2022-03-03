package nl.tudelft.jpacman.level;

import static org.junit.jupiter.api.Assertions.assertTrue;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    private static final PacManSprites SPRITE_STORE = new PacManSprites();
    private PlayerFactory pf;
    /**
     * Resets the unit under test.
     */
    @BeforeEach
    void setUp() {
         pf = new PlayerFactory(SPRITE_STORE);
    }

    /**a newly created player is alive.
     */
    @Test
    void testIsAlive() {
        Player player = pf.createPacMan();
        assertTrue(player.isAlive());
    }
}
