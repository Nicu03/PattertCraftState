import com.pattern.craft.SiegeState;
import com.pattern.craft.State;
import com.pattern.craft.Tank;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SiegeStateTests {
    static Tank tank;
    @BeforeClass
    public static void setUp(){
        tank = new Tank();
        tank.toSiegeState();
    }

    @Test
    public void testSiegeStateDamage(){
        assertEquals("Incorrect damage for Siege Tank",20,tank.getDamage());
    }

    @Test
    public void testSiegeStateCanMove(){
        assertFalse("Siege tank CAN move",tank.isCanMove());
    }

    @Test
    public void testSiegeState(){
        State state = tank.getState();
        assertEquals("Incorrect state for Siege tank",SiegeState.class,state.getClass());
    }
}
