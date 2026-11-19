public class TerrariaCloneTest {

    public static void main(String[] args) {
        testAirCreatesOpenSpace();
        testSolidNeighborhoodHasNoOpenSpace();
        testNonCollidableBlockCreatesOpenSpace();

        System.out.println("TerrariaClone tests passed.");
    }

    private static void testAirCreatesOpenSpace() {
        Integer[][] blocks = filledArea(1);
        blocks[1][2] = 0;

        assertTrue(TerrariaClone.hasOpenSpace(2, 2, blocks),
                "an air block should count as open space");
    }

    private static void testSolidNeighborhoodHasNoOpenSpace() {
        Integer[][] blocks = filledArea(1);

        assertFalse(TerrariaClone.hasOpenSpace(2, 2, blocks),
                "a neighborhood of collidable blocks should not be open");
    }

    private static void testNonCollidableBlockCreatesOpenSpace() {
        Integer[][] blocks = filledArea(1);
        blocks[1][1] = 8;

        assertTrue(TerrariaClone.hasOpenSpace(2, 2, blocks),
                "a non-collidable block should count as open space");
    }

    private static Integer[][] filledArea(int block) {
        Integer[][] blocks = new Integer[5][5];
        for (int y = 0; y < blocks.length; y++) {
            for (int x = 0; x < blocks[y].length; x++) {
                blocks[y][x] = block;
            }
        }
        return blocks;
    }

    private static void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    private static void assertFalse(boolean condition, String message) {
        assertTrue(!condition, message);
    }
}
