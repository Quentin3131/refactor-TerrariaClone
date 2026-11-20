import java.util.ArrayList;
import java.util.HashMap;
import java.awt.Color;
import java.awt.image.BufferedImage;

final class GameDataInitializer {
    private GameDataInitializer() {}

    static void initialize(TerrariaClone target) {
        TerrariaClone.DURABILITY = DurabilityData.create(target.toolList);

                TerrariaClone.BLOCKTOOLS = new HashMap<Integer,Short[]>();

        Short[][] blocktools = {{}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {11, 12, 13, 14, 52, 55, 58, 146, 149, 155, 158, 170, 173}, {11, 12, 13, 14, 52, 55, 58, 146, 149, 155, 158, 170, 173}, {11, 12, 13, 14, 52, 55, 58, 146, 149, 155, 158, 170, 173}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {11, 12, 13, 14, 52, 55, 58, 146, 149, 155, 158, 170, 173}, {}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {11, 12, 13, 14, 52, 55, 58, 146, 149, 155, 158, 170, 173}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {11, 12, 13, 14, 52, 55, 58, 146, 149, 155, 158, 170, 173}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 11, 12, 13, 14, 51, 52, 54, 55, 57, 58, 145, 146, 148, 149, 154, 155, 157, 158, 169, 170, 172, 173}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {11, 12, 13, 14, 52, 55, 58, 146, 149, 155, 158, 170, 173}, {11, 12, 13, 14, 52, 55, 58, 146, 149, 155, 158, 170, 173}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}, {7, 8, 9, 10, 51, 54, 57, 145, 148, 154, 157, 169, 172}};

                for (int i=0; i<blocktools.length; i++) {
                    for (int j=0; j<blocktools[i].length; j++) {
                        blocktools[i][j] = new Short((short)blocktools[i][j]);
                    }
                }

                for (int i=1; i<target.blocknames.length; i++) {
                    TerrariaClone.BLOCKTOOLS.put(i, blocktools[i]);
                }

                TerrariaClone.TOOLSPEED = new HashMap<Short,Double>();

                for (int i=1; i<target.items.length; i++) {
                    TerrariaClone.TOOLSPEED.put(new Short((short)i), 0.175);
                }

                TerrariaClone.TOOLSPEED.put(new Short((short)154), 0.100);// wood:   P100 S100
                TerrariaClone.TOOLSPEED.put(new Short((short)155), 0.100);
                TerrariaClone.TOOLSPEED.put(new Short((short)156), 0.100);
                TerrariaClone.TOOLSPEED.put(new Short((short)157), 0.110);// stone:  P110 S105
                TerrariaClone.TOOLSPEED.put(new Short((short)158), 0.110);
                TerrariaClone.TOOLSPEED.put(new Short((short)159), 0.105);
                TerrariaClone.TOOLSPEED.put(new Short((short)7), 0.120);  // copper: P120 S110
                TerrariaClone.TOOLSPEED.put(new Short((short)11), 0.120);
                TerrariaClone.TOOLSPEED.put(new Short((short)16), 0.110);
                TerrariaClone.TOOLSPEED.put(new Short((short)8), 0.130);  // iron:   P130 S115
                TerrariaClone.TOOLSPEED.put(new Short((short)12), 0.130);
                TerrariaClone.TOOLSPEED.put(new Short((short)17), 0.115);
                TerrariaClone.TOOLSPEED.put(new Short((short)9), 0.140);  // silver: P140 S120
                TerrariaClone.TOOLSPEED.put(new Short((short)13), 0.140);
                TerrariaClone.TOOLSPEED.put(new Short((short)18), 0.120);
                TerrariaClone.TOOLSPEED.put(new Short((short)10), 0.150); // gold:   P150 S125
                TerrariaClone.TOOLSPEED.put(new Short((short)14), 0.150);
                TerrariaClone.TOOLSPEED.put(new Short((short)19), 0.125);
                TerrariaClone.TOOLSPEED.put(new Short((short)51), 0.160); // zinc:   P160 S130
                TerrariaClone.TOOLSPEED.put(new Short((short)52), 0.160);
                TerrariaClone.TOOLSPEED.put(new Short((short)53), 0.130);
                TerrariaClone.TOOLSPEED.put(new Short((short)54), 0.170); // rhyme:  P170 S135
                TerrariaClone.TOOLSPEED.put(new Short((short)55), 0.170);
                TerrariaClone.TOOLSPEED.put(new Short((short)56), 0.135);
                TerrariaClone.TOOLSPEED.put(new Short((short)57), 0.180); // obdur:  P180 S140
                TerrariaClone.TOOLSPEED.put(new Short((short)58), 0.180);
                TerrariaClone.TOOLSPEED.put(new Short((short)59), 0.140);
                TerrariaClone.TOOLSPEED.put(new Short((short)145), 0.350);// alumin: P250 S175
                TerrariaClone.TOOLSPEED.put(new Short((short)146), 0.350);
                TerrariaClone.TOOLSPEED.put(new Short((short)147), 0.245);
                TerrariaClone.TOOLSPEED.put(new Short((short)148), 0.130);// lead:   P130 S115
                TerrariaClone.TOOLSPEED.put(new Short((short)149), 0.130);
                TerrariaClone.TOOLSPEED.put(new Short((short)150), 0.115);
                TerrariaClone.TOOLSPEED.put(new Short((short)169), 0.250); // magne:  P350 S245
                TerrariaClone.TOOLSPEED.put(new Short((short)170), 0.250);
                TerrariaClone.TOOLSPEED.put(new Short((short)171), 0.175);
                TerrariaClone.TOOLSPEED.put(new Short((short)172), 0.350); // irrad:  P350 S245
                TerrariaClone.TOOLSPEED.put(new Short((short)173), 0.350);
                TerrariaClone.TOOLSPEED.put(new Short((short)174), 0.245);

                TerrariaClone.TOOLSPEED.put(new Short((short)33), 0.125); // stone lighter

                TerrariaClone.TOOLDAMAGE = new HashMap<Short,Integer>();

                for (int i=0; i<target.items.length; i++) {
                    TerrariaClone.TOOLDAMAGE.put(new Short((short)i), 1);
                }

                TerrariaClone.TOOLDAMAGE.put(new Short((short)7), 2);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)8), 3);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)9), 3);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)10), 4);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)11), 3);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)12), 4);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)13), 5);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)14), 6);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)16), 5);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)17), 8);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)18), 13);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)19), 18);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)51), 6);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)52), 9);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)53), 24);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)54), 8);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)55), 11);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)56), 30);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)57), 10);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)58), 15);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)59), 38);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)145), 7);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)146), 10);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)147), 27);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)148), 4);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)149), 5);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)150), 9);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)154), 1);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)155), 1);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)156), 3);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)157), 1);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)158), 2);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)159), 4);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)57), 20);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)58), 30);
                TerrariaClone.TOOLDAMAGE.put(new Short((short)59), 75);

                short[] drops = {0, 1, 2, 3, 4, 5, 6, 15, 20, 21, 22, 23, 24, 25, 26, 15, 0, 27, 28, 34, 35, 36, 37, 27, 35, 35, 36, 36, 37, 37, 0, 38, 39, 40, 41, 42, 43, 44, 44, 45, 46, 47, 48, 49, 50, 74, 75, 0, 0, 0, 78, 0, 0, 80, 0, 0, 82, 0, 0, 84, 0, 0, 86, 0, 0, 88, 0, 0, 90, 0, 0, 92, 1, 1, 93, 93, 94, 0, 0, 96, 151, 152, 153, 15, 161, 162, 163, 164, 165, 166, 168, 1, 50, 1, 175, 175, 175, 175, 175, 175, 176, 176, 176, 177, 177, 178, 178, 178, 178, 178, 178, 180, 180, 180, 180, 180, 180, 180, 180, 181, 181, 181, 181, 181, 181, 181, 181, 182, 182, 182, 182, 183, 183, 184, 184, 185, 185, 186, 186, 186, 186, 186, 186, 186, 186, 187, 187, 187, 187, 187, 187, 187, 187, 188, 188, 188, 188, 188, 188, 188, 188, 189, 189, 189, 189, 189, 189, 189, 189};

                TerrariaClone.BLOCKDROPS = new HashMap<Integer,Short>();

                for (int i=1; i<target.blocknames.length; i++) {
                    TerrariaClone.BLOCKDROPS.put(i, drops[i]);
                }

                int[] itemblocks = {0, 1, 2, 3, 4, 5, 6, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 8, 9, 10, 11, 12, 13, 14, 17, 18, 0, 0, 0, 0, 0, 19, 20, 21, 22, 31, 32, 33, 34, 35, 36, 37, 39, 40, 41, 42, 43, 44, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 45/*72*/, 46, 47, 48, 0, 51, 0, 54, 0, 57, 0, 60, 0, 63, 0, 66, 0, 69, 0, 75, 76, 77, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 80, 81, 82, 0, 0, 0, 0, 0, 0, 0, 84, 85, 86, 87, 88, 89, 0, 90, 0, 0, 0, 0, 0, 0, 94, 100, 103, 105, 0, 111, 119, 127, 131, 133, 135, 137, 145, 153, 161, 0};

                TerrariaClone.ITEMBLOCKS = new HashMap<Short,Integer>();

                for (int i=1; i<target.items.length; i++) {
                    TerrariaClone.ITEMBLOCKS.put(new Short((short)i), itemblocks[i]);
                }

                TerrariaClone.OUTLINES = new HashMap<Integer,String>();

                for (int i=1; i<target.blocknames.length; i++) {
                    TerrariaClone.OUTLINES.put(i, "default");
                }

                TerrariaClone.OUTLINES.put(7, "wood");
                TerrariaClone.OUTLINES.put(8, "none");
                TerrariaClone.OUTLINES.put(9, "none");
                TerrariaClone.OUTLINES.put(10, "none");
                TerrariaClone.OUTLINES.put(11, "none");
                TerrariaClone.OUTLINES.put(12, "none");
                TerrariaClone.OUTLINES.put(13, "none");
                TerrariaClone.OUTLINES.put(14, "none");
                TerrariaClone.OUTLINES.put(15, "tree");
                TerrariaClone.OUTLINES.put(17, "none");
                TerrariaClone.OUTLINES.put(20, "none");
                TerrariaClone.OUTLINES.put(21, "none");
                TerrariaClone.OUTLINES.put(22, "none");
                TerrariaClone.OUTLINES.put(23, "none");
                TerrariaClone.OUTLINES.put(24, "none");
                TerrariaClone.OUTLINES.put(25, "none");
                TerrariaClone.OUTLINES.put(26, "none");
                TerrariaClone.OUTLINES.put(27, "none");
                TerrariaClone.OUTLINES.put(28, "none");
                TerrariaClone.OUTLINES.put(29, "none");
                TerrariaClone.OUTLINES.put(30, "tree_root");
                TerrariaClone.OUTLINES.put(47, "square");
                TerrariaClone.OUTLINES.put(77, "none");
                TerrariaClone.OUTLINES.put(78, "none");
                TerrariaClone.OUTLINES.put(79, "none");
                TerrariaClone.OUTLINES.put(80, "none");
                TerrariaClone.OUTLINES.put(81, "none");
                TerrariaClone.OUTLINES.put(82, "none");
                TerrariaClone.OUTLINES.put(83, "tree");
                TerrariaClone.OUTLINES.put(84, "square");
                TerrariaClone.OUTLINES.put(85, "square");
                TerrariaClone.OUTLINES.put(86, "square");
                TerrariaClone.OUTLINES.put(87, "square");
                TerrariaClone.OUTLINES.put(89, "square");
                TerrariaClone.OUTLINES.put(90, "wood");
                TerrariaClone.OUTLINES.put(94, "wire");
                TerrariaClone.OUTLINES.put(95, "wire");
                TerrariaClone.OUTLINES.put(96, "wire");
                TerrariaClone.OUTLINES.put(97, "wire");
                TerrariaClone.OUTLINES.put(98, "wire");
                TerrariaClone.OUTLINES.put(99, "wire");
                TerrariaClone.OUTLINES.put(100, "none");
                TerrariaClone.OUTLINES.put(101, "none");
                TerrariaClone.OUTLINES.put(102, "none");
                TerrariaClone.OUTLINES.put(103, "square");
                TerrariaClone.OUTLINES.put(104, "square");
                TerrariaClone.OUTLINES.put(105, "none");
                TerrariaClone.OUTLINES.put(106, "none");
                TerrariaClone.OUTLINES.put(107, "none");
                TerrariaClone.OUTLINES.put(108, "none");
                TerrariaClone.OUTLINES.put(109, "none");
                TerrariaClone.OUTLINES.put(110, "none");
                TerrariaClone.OUTLINES.put(111, "none");
                TerrariaClone.OUTLINES.put(112, "none");
                TerrariaClone.OUTLINES.put(113, "none");
                TerrariaClone.OUTLINES.put(114, "none");
                TerrariaClone.OUTLINES.put(115, "none");
                TerrariaClone.OUTLINES.put(116, "none");
                TerrariaClone.OUTLINES.put(117, "none");
                TerrariaClone.OUTLINES.put(118, "none");
                TerrariaClone.OUTLINES.put(119, "none");
                TerrariaClone.OUTLINES.put(120, "none");
                TerrariaClone.OUTLINES.put(121, "none");
                TerrariaClone.OUTLINES.put(122, "none");
                TerrariaClone.OUTLINES.put(123, "none");
                TerrariaClone.OUTLINES.put(124, "none");
                TerrariaClone.OUTLINES.put(125, "none");
                TerrariaClone.OUTLINES.put(126, "none");
                TerrariaClone.OUTLINES.put(127, "none");
                TerrariaClone.OUTLINES.put(128, "none");
                TerrariaClone.OUTLINES.put(129, "none");
                TerrariaClone.OUTLINES.put(130, "none");
                TerrariaClone.OUTLINES.put(131, "none");
                TerrariaClone.OUTLINES.put(132, "none");
                TerrariaClone.OUTLINES.put(133, "none");
                TerrariaClone.OUTLINES.put(134, "none");
                TerrariaClone.OUTLINES.put(135, "none");
                TerrariaClone.OUTLINES.put(136, "none");

                for (int i=48; i<72; i++) {
                    TerrariaClone.OUTLINES.put(i, "none");
                }

                for (int i=137; i<169; i++) {
                    TerrariaClone.OUTLINES.put(i, "none");
                }

                TerrariaClone.UIBLOCKS = new HashMap<String,String>();

                for (int i=1; i<target.items.length; i++) {
                    TerrariaClone.UIBLOCKS.put(target.items[i], target.ui_items[i]);
                }

                TerrariaClone.UIENTITIES = new HashMap<String,String>();

                TerrariaClone.UIENTITIES.put("blue_bubble", "Blue Bubble");
                TerrariaClone.UIENTITIES.put("green_bubble", "Green Bubble");
                TerrariaClone.UIENTITIES.put("red_bubble", "Red Bubble");
                TerrariaClone.UIENTITIES.put("black_bubble", "Black Bubble");
                TerrariaClone.UIENTITIES.put("white_bubble", "White Bubble");
                TerrariaClone.UIENTITIES.put("zombie", "Zombie");
                TerrariaClone.UIENTITIES.put("armored_zombie", "Armored Zombie");
                TerrariaClone.UIENTITIES.put("shooting_star", "Shooting Star");
                TerrariaClone.UIENTITIES.put("sandbot", "Sandbot");
                TerrariaClone.UIENTITIES.put("snowman", "Snowman");
                TerrariaClone.UIENTITIES.put("bat", "Bat");
                TerrariaClone.UIENTITIES.put("bee", "Bee");
                TerrariaClone.UIENTITIES.put("skeleton", "Skeleton");

                TerrariaClone.BLOCKCD = new HashMap<Integer,Boolean>();

                for (int i=1; i<target.blockcds.length; i++) {
                    TerrariaClone.BLOCKCD.put(i, target.blockcds[i]);
                }

                TerrariaClone.MAXSTACKS = new HashMap<Short,Short>();

                short[] stacks = {100, 100, 100, 100, 100, 100, 100, 1, 1, 1, 1, 1, 1, 1, 1, 100, 1, 1, 1, 1, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 1, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100, 100, 100, 1, 1, 1, 1, 1, 1, 100, 100, 100, 100, 100, 100, 100, 100, 100, 1, 1, 1, 1, 1, 1, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 1};

                for (int i=0; i<target.items.length; i++) {
                    TerrariaClone.MAXSTACKS.put(new Short((short)i), stacks[i]);
                }

                TerrariaClone.SKYCOLORS = new HashMap<Integer,Color>();

                TerrariaClone.SKYCOLORS.put(28800, new Color(71, 154, 230));
                TerrariaClone.SKYCOLORS.put(28980, new Color(67, 146, 218));
                TerrariaClone.SKYCOLORS.put(29160, new Color(63, 138, 206));
                TerrariaClone.SKYCOLORS.put(29340, new Color(60, 130, 194));
                TerrariaClone.SKYCOLORS.put(29520, new Color(56, 122, 182));
                TerrariaClone.SKYCOLORS.put(29700, new Color(52, 114, 170));
                TerrariaClone.SKYCOLORS.put(29880, new Color(48, 105, 157));
                TerrariaClone.SKYCOLORS.put(30060, new Color(45, 97, 145));
                TerrariaClone.SKYCOLORS.put(30240, new Color(41, 89, 133));
                TerrariaClone.SKYCOLORS.put(30420, new Color(37, 81, 121));
                TerrariaClone.SKYCOLORS.put(30600, new Color(33, 73, 109));
                TerrariaClone.SKYCOLORS.put(30780, new Color(30, 65, 97));
                TerrariaClone.SKYCOLORS.put(30960, new Color(26, 57, 85));
                TerrariaClone.SKYCOLORS.put(31140, new Color(22, 48, 72));
                TerrariaClone.SKYCOLORS.put(31320, new Color(18, 40, 60));
                TerrariaClone.SKYCOLORS.put(31500, new Color(15, 32, 48));
                TerrariaClone.SKYCOLORS.put(31680, new Color(11, 24, 36));
                TerrariaClone.SKYCOLORS.put(31860, new Color(7, 16, 24));
                TerrariaClone.SKYCOLORS.put(32040, new Color(3, 8, 12));
                TerrariaClone.SKYCOLORS.put(32220, new Color(0, 0, 0));

                TerrariaClone.SKYCOLORS.put(72000, new Color(3, 8, 12));
                TerrariaClone.SKYCOLORS.put(72180, new Color(7, 16, 24));
                TerrariaClone.SKYCOLORS.put(72360, new Color(11, 24, 36));
                TerrariaClone.SKYCOLORS.put(72540, new Color(15, 32, 48));
                TerrariaClone.SKYCOLORS.put(72720, new Color(18, 40, 60));
                TerrariaClone.SKYCOLORS.put(72900, new Color(22, 48, 72));
                TerrariaClone.SKYCOLORS.put(73080, new Color(26, 57, 85));
                TerrariaClone.SKYCOLORS.put(73260, new Color(30, 65, 97));
                TerrariaClone.SKYCOLORS.put(73440, new Color(33, 73, 109));
                TerrariaClone.SKYCOLORS.put(73620, new Color(37, 81, 121));
                TerrariaClone.SKYCOLORS.put(73800, new Color(41, 89, 133));
                TerrariaClone.SKYCOLORS.put(73980, new Color(45, 97, 145));
                TerrariaClone.SKYCOLORS.put(74160, new Color(48, 105, 157));
                TerrariaClone.SKYCOLORS.put(74340, new Color(52, 114, 170));
                TerrariaClone.SKYCOLORS.put(74520, new Color(56, 122, 182));
                TerrariaClone.SKYCOLORS.put(74700, new Color(60, 130, 194));
                TerrariaClone.SKYCOLORS.put(74880, new Color(63, 138, 206));
                TerrariaClone.SKYCOLORS.put(75060, new Color(67, 146, 218));
                TerrariaClone.SKYCOLORS.put(75240, new Color(71, 154, 230));
                TerrariaClone.SKYCOLORS.put(75420, new Color(75, 163, 243));

                TerrariaClone.SKYLIGHTS = new HashMap<Integer,Integer>();

                TerrariaClone.SKYLIGHTS.put(28883, 18);
                TerrariaClone.SKYLIGHTS.put(29146, 17);
                TerrariaClone.SKYLIGHTS.put(29409, 16);
                TerrariaClone.SKYLIGHTS.put(29672, 15);
                TerrariaClone.SKYLIGHTS.put(29935, 14);
                TerrariaClone.SKYLIGHTS.put(30198, 13);
                TerrariaClone.SKYLIGHTS.put(30461, 12);
                TerrariaClone.SKYLIGHTS.put(30724, 11);
                TerrariaClone.SKYLIGHTS.put(30987, 10);
                TerrariaClone.SKYLIGHTS.put(31250, 9);
                TerrariaClone.SKYLIGHTS.put(31513, 8);
                TerrariaClone.SKYLIGHTS.put(31776, 7);
                TerrariaClone.SKYLIGHTS.put(32039, 6);
                TerrariaClone.SKYLIGHTS.put(32302, 5);
                TerrariaClone.SKYLIGHTS.put(72093, 6);
                TerrariaClone.SKYLIGHTS.put(72336, 7);
                TerrariaClone.SKYLIGHTS.put(72639, 8);
                TerrariaClone.SKYLIGHTS.put(72912, 9);
                TerrariaClone.SKYLIGHTS.put(73185, 10);
                TerrariaClone.SKYLIGHTS.put(73458, 11);
                TerrariaClone.SKYLIGHTS.put(73731, 12);
                TerrariaClone.SKYLIGHTS.put(74004, 13);
                TerrariaClone.SKYLIGHTS.put(74277, 14);
                TerrariaClone.SKYLIGHTS.put(74550, 15);
                TerrariaClone.SKYLIGHTS.put(74823, 16);
                TerrariaClone.SKYLIGHTS.put(75096, 17);
                TerrariaClone.SKYLIGHTS.put(75369, 18);
                TerrariaClone.SKYLIGHTS.put(75642, 19);

                TerrariaClone.LIGHTLEVELS = new HashMap<Integer,BufferedImage>();

                for (int i=0; i<17; i++) {
                    TerrariaClone.LIGHTLEVELS.put(i, target.loadImage("light/" + i + ".png"));
                }

                TerrariaClone.BLOCKLIGHTS = new HashMap<Integer,Integer>();

                for (int i=0; i<target.blocknames.length; i++) {
                    TerrariaClone.BLOCKLIGHTS.put(i, 0);
                }

                TerrariaClone.BLOCKLIGHTS.put(19, 21);
                TerrariaClone.BLOCKLIGHTS.put(20, 15);
                TerrariaClone.BLOCKLIGHTS.put(21, 18);
                TerrariaClone.BLOCKLIGHTS.put(22, 21);
                TerrariaClone.BLOCKLIGHTS.put(23, 15);
                TerrariaClone.BLOCKLIGHTS.put(24, 15);
                TerrariaClone.BLOCKLIGHTS.put(25, 15);
                TerrariaClone.BLOCKLIGHTS.put(26, 18);
                TerrariaClone.BLOCKLIGHTS.put(27, 18);
                TerrariaClone.BLOCKLIGHTS.put(28, 21);
                TerrariaClone.BLOCKLIGHTS.put(29, 21);
                TerrariaClone.BLOCKLIGHTS.put(36, 15);
                TerrariaClone.BLOCKLIGHTS.put(36, 15);
                TerrariaClone.BLOCKLIGHTS.put(38, 18);
                TerrariaClone.BLOCKLIGHTS.put(51, 15);
                TerrariaClone.BLOCKLIGHTS.put(52, 15);
                TerrariaClone.BLOCKLIGHTS.put(53, 15);
                TerrariaClone.BLOCKLIGHTS.put(95, 6);
                TerrariaClone.BLOCKLIGHTS.put(96, 7);
                TerrariaClone.BLOCKLIGHTS.put(97, 8);
                TerrariaClone.BLOCKLIGHTS.put(98, 9);
                TerrariaClone.BLOCKLIGHTS.put(99, 10);
                TerrariaClone.BLOCKLIGHTS.put(100, 12);
                TerrariaClone.BLOCKLIGHTS.put(101, 12);
                TerrariaClone.BLOCKLIGHTS.put(102, 12);
                TerrariaClone.BLOCKLIGHTS.put(104, 21);
                TerrariaClone.BLOCKLIGHTS.put(112, 12);
                TerrariaClone.BLOCKLIGHTS.put(114, 12);
                TerrariaClone.BLOCKLIGHTS.put(116, 12);
                TerrariaClone.BLOCKLIGHTS.put(118, 12);
                TerrariaClone.BLOCKLIGHTS.put(123, 12);
                TerrariaClone.BLOCKLIGHTS.put(124, 12);
                TerrariaClone.BLOCKLIGHTS.put(125, 12);
                TerrariaClone.BLOCKLIGHTS.put(126, 12);

                TerrariaClone.BLOCKLIGHTS.put(137, 12);
                TerrariaClone.BLOCKLIGHTS.put(138, 12);
                TerrariaClone.BLOCKLIGHTS.put(139, 12);
                TerrariaClone.BLOCKLIGHTS.put(140, 12);
                TerrariaClone.BLOCKLIGHTS.put(145, 12);
                TerrariaClone.BLOCKLIGHTS.put(146, 12);
                TerrariaClone.BLOCKLIGHTS.put(147, 12);
                TerrariaClone.BLOCKLIGHTS.put(148, 12);
                TerrariaClone.BLOCKLIGHTS.put(153, 12);
                TerrariaClone.BLOCKLIGHTS.put(154, 12);
                TerrariaClone.BLOCKLIGHTS.put(155, 12);
                TerrariaClone.BLOCKLIGHTS.put(156, 12);
                TerrariaClone.BLOCKLIGHTS.put(161, 12);
                TerrariaClone.BLOCKLIGHTS.put(162, 12);
                TerrariaClone.BLOCKLIGHTS.put(163, 12);
                TerrariaClone.BLOCKLIGHTS.put(164, 12);

                TerrariaClone.GRASSDIRT = new HashMap<Integer,Integer>();

                TerrariaClone.GRASSDIRT.put(72, 1);
                TerrariaClone.GRASSDIRT.put(73, 1);
                TerrariaClone.GRASSDIRT.put(74, 75);
                TerrariaClone.GRASSDIRT.put(93, 91);

                TerrariaClone.ARMOR = new HashMap<Short,Integer>();

                for (int i=0; i<target.items.length; i++) {
                    TerrariaClone.ARMOR.put(new Short((short)i), 0);
                }

                TerrariaClone.ARMOR.put(new Short((short)105), 1);
                TerrariaClone.ARMOR.put(new Short((short)106), 2);
                TerrariaClone.ARMOR.put(new Short((short)107), 1);
                TerrariaClone.ARMOR.put(new Short((short)108), 1);
                TerrariaClone.ARMOR.put(new Short((short)109), 1);
                TerrariaClone.ARMOR.put(new Short((short)110), 3);
                TerrariaClone.ARMOR.put(new Short((short)111), 2);
                TerrariaClone.ARMOR.put(new Short((short)112), 1);
                TerrariaClone.ARMOR.put(new Short((short)113), 2);
                TerrariaClone.ARMOR.put(new Short((short)114), 4);
                TerrariaClone.ARMOR.put(new Short((short)115), 3);
                TerrariaClone.ARMOR.put(new Short((short)116), 1);
                TerrariaClone.ARMOR.put(new Short((short)117), 3);
                TerrariaClone.ARMOR.put(new Short((short)118), 6);
                TerrariaClone.ARMOR.put(new Short((short)119), 5);
                TerrariaClone.ARMOR.put(new Short((short)120), 2);
                TerrariaClone.ARMOR.put(new Short((short)121), 4);
                TerrariaClone.ARMOR.put(new Short((short)122), 7);
                TerrariaClone.ARMOR.put(new Short((short)123), 6);
                TerrariaClone.ARMOR.put(new Short((short)124), 3);
                TerrariaClone.ARMOR.put(new Short((short)125), 5);
                TerrariaClone.ARMOR.put(new Short((short)126), 9);
                TerrariaClone.ARMOR.put(new Short((short)127), 7);
                TerrariaClone.ARMOR.put(new Short((short)128), 4);
                TerrariaClone.ARMOR.put(new Short((short)129), 7);
                TerrariaClone.ARMOR.put(new Short((short)130), 12);
                TerrariaClone.ARMOR.put(new Short((short)131), 10);
                TerrariaClone.ARMOR.put(new Short((short)132), 6);
                TerrariaClone.ARMOR.put(new Short((short)133), 4);
                TerrariaClone.ARMOR.put(new Short((short)134), 7);
                TerrariaClone.ARMOR.put(new Short((short)135), 6);
                TerrariaClone.ARMOR.put(new Short((short)136), 3);
                TerrariaClone.ARMOR.put(new Short((short)137), 2);
                TerrariaClone.ARMOR.put(new Short((short)138), 4);
                TerrariaClone.ARMOR.put(new Short((short)139), 3);
                TerrariaClone.ARMOR.put(new Short((short)140), 1);
                TerrariaClone.ARMOR.put(new Short((short)141), 10);
                TerrariaClone.ARMOR.put(new Short((short)142), 18);
                TerrariaClone.ARMOR.put(new Short((short)143), 14);
                TerrariaClone.ARMOR.put(new Short((short)144), 8);

                TerrariaClone.TOOLDURS = new HashMap<Short,Short>();

                TerrariaClone.TOOLDURS.put(new Short((short)7), new Short((short)400));   // copper: P0200 A0200 S0125
                TerrariaClone.TOOLDURS.put(new Short((short)8), new Short((short)500));   // iron:   P0250 A0250 S0150
                TerrariaClone.TOOLDURS.put(new Short((short)9), new Short((short)600));   // silver: P0300 A0300 S0200
                TerrariaClone.TOOLDURS.put(new Short((short)10), new Short((short)800));  // gold:   P0400 A0400 S0300
                TerrariaClone.TOOLDURS.put(new Short((short)11), new Short((short)400));
                TerrariaClone.TOOLDURS.put(new Short((short)12), new Short((short)500));
                TerrariaClone.TOOLDURS.put(new Short((short)13), new Short((short)600));
                TerrariaClone.TOOLDURS.put(new Short((short)14), new Short((short)800));
                TerrariaClone.TOOLDURS.put(new Short((short)16), new Short((short)250));
                TerrariaClone.TOOLDURS.put(new Short((short)17), new Short((short)300));
                TerrariaClone.TOOLDURS.put(new Short((short)18), new Short((short)400));
                TerrariaClone.TOOLDURS.put(new Short((short)19), new Short((short)600));
                TerrariaClone.TOOLDURS.put(new Short((short)33), new Short((short)100));
                TerrariaClone.TOOLDURS.put(new Short((short)51), new Short((short)1100));  // zinc:   P0550 A0550 S0475
                TerrariaClone.TOOLDURS.put(new Short((short)52), new Short((short)1100));
                TerrariaClone.TOOLDURS.put(new Short((short)53), new Short((short)950));
                TerrariaClone.TOOLDURS.put(new Short((short)54), new Short((short)1350));  // rhyme:  P0675 A0675 S0625
                TerrariaClone.TOOLDURS.put(new Short((short)55), new Short((short)1350));
                TerrariaClone.TOOLDURS.put(new Short((short)56), new Short((short)1250));
                TerrariaClone.TOOLDURS.put(new Short((short)57), new Short((short)1600));  // obdur:  P0800 A0800 S0800
                TerrariaClone.TOOLDURS.put(new Short((short)58), new Short((short)1600));
                TerrariaClone.TOOLDURS.put(new Short((short)59), new Short((short)1600));
                TerrariaClone.TOOLDURS.put(new Short((short)145), new Short((short)200)); // alumin: P0100 A0100 S0050
                TerrariaClone.TOOLDURS.put(new Short((short)146), new Short((short)200));
                TerrariaClone.TOOLDURS.put(new Short((short)147), new Short((short)100));
                TerrariaClone.TOOLDURS.put(new Short((short)148), new Short((short)2400));// lead:   P1200 A1200 S0800
                TerrariaClone.TOOLDURS.put(new Short((short)149), new Short((short)2400));
                TerrariaClone.TOOLDURS.put(new Short((short)150), new Short((short)1600));
                TerrariaClone.TOOLDURS.put(new Short((short)154), new Short((short)200)); // wood:   P0100 A0100 S0050
                TerrariaClone.TOOLDURS.put(new Short((short)155), new Short((short)200));
                TerrariaClone.TOOLDURS.put(new Short((short)156), new Short((short)100));
                TerrariaClone.TOOLDURS.put(new Short((short)157), new Short((short)300)); // stone:  P0150 A0150 S0075
                TerrariaClone.TOOLDURS.put(new Short((short)158), new Short((short)300));
                TerrariaClone.TOOLDURS.put(new Short((short)159), new Short((short)150));
                TerrariaClone.TOOLDURS.put(new Short((short)169), new Short((short)1200)); // magne:  P0600 A0600 S0600
                TerrariaClone.TOOLDURS.put(new Short((short)170), new Short((short)1200));
                TerrariaClone.TOOLDURS.put(new Short((short)171), new Short((short)1200));
                TerrariaClone.TOOLDURS.put(new Short((short)172), new Short((short)4000));// irrad:  P2000 A2000 S2000
                TerrariaClone.TOOLDURS.put(new Short((short)173), new Short((short)4000));
                TerrariaClone.TOOLDURS.put(new Short((short)174), new Short((short)4000));
                TerrariaClone.TOOLDURS.put(new Short((short)190), new Short((short)400));

                TerrariaClone.TOOLDURS.put(new Short((short)105), new Short((short)200)); // copper: 0300
                TerrariaClone.TOOLDURS.put(new Short((short)106), new Short((short)200)); // copper: 0300
                TerrariaClone.TOOLDURS.put(new Short((short)107), new Short((short)200)); // copper: 0300
                TerrariaClone.TOOLDURS.put(new Short((short)108), new Short((short)200)); // copper: 0300
                TerrariaClone.TOOLDURS.put(new Short((short)109), new Short((short)200)); // iron:   0400
                TerrariaClone.TOOLDURS.put(new Short((short)110), new Short((short)200)); // iron:   0400
                TerrariaClone.TOOLDURS.put(new Short((short)111), new Short((short)200)); // iron:   0400
                TerrariaClone.TOOLDURS.put(new Short((short)112), new Short((short)200)); // iron:   0400
                TerrariaClone.TOOLDURS.put(new Short((short)113), new Short((short)200)); // silver: 0550
                TerrariaClone.TOOLDURS.put(new Short((short)114), new Short((short)200)); // silver: 0550
                TerrariaClone.TOOLDURS.put(new Short((short)115), new Short((short)200)); // silver: 0550
                TerrariaClone.TOOLDURS.put(new Short((short)116), new Short((short)200)); // silver: 0550
                TerrariaClone.TOOLDURS.put(new Short((short)117), new Short((short)200)); // gold:   0700
                TerrariaClone.TOOLDURS.put(new Short((short)118), new Short((short)200)); // gold:   0700
                TerrariaClone.TOOLDURS.put(new Short((short)119), new Short((short)200)); // gold:   0700
                TerrariaClone.TOOLDURS.put(new Short((short)120), new Short((short)200)); // gold:   0700
                TerrariaClone.TOOLDURS.put(new Short((short)121), new Short((short)200)); // zinc:   0875
                TerrariaClone.TOOLDURS.put(new Short((short)122), new Short((short)200)); // zinc:   0875
                TerrariaClone.TOOLDURS.put(new Short((short)123), new Short((short)200)); // zinc:   0875
                TerrariaClone.TOOLDURS.put(new Short((short)124), new Short((short)200)); // zinc:   0875
                TerrariaClone.TOOLDURS.put(new Short((short)125), new Short((short)200)); // rhyme:  1000
                TerrariaClone.TOOLDURS.put(new Short((short)126), new Short((short)200)); // rhyme:  1000
                TerrariaClone.TOOLDURS.put(new Short((short)127), new Short((short)200)); // rhyme:  1000
                TerrariaClone.TOOLDURS.put(new Short((short)128), new Short((short)200)); // rhyme:  1000
                TerrariaClone.TOOLDURS.put(new Short((short)129), new Short((short)200)); // obdur:  1400
                TerrariaClone.TOOLDURS.put(new Short((short)130), new Short((short)200)); // obdur:  1400
                TerrariaClone.TOOLDURS.put(new Short((short)131), new Short((short)200)); // obdur:  1400
                TerrariaClone.TOOLDURS.put(new Short((short)132), new Short((short)200)); // obdur:  1400
                TerrariaClone.TOOLDURS.put(new Short((short)133), new Short((short)200)); // alumin: 0150
                TerrariaClone.TOOLDURS.put(new Short((short)134), new Short((short)200)); // alumin: 0150
                TerrariaClone.TOOLDURS.put(new Short((short)135), new Short((short)200)); // alumin: 0150
                TerrariaClone.TOOLDURS.put(new Short((short)136), new Short((short)200)); // alumin: 0150
                TerrariaClone.TOOLDURS.put(new Short((short)137), new Short((short)200)); // lead:   2000
                TerrariaClone.TOOLDURS.put(new Short((short)138), new Short((short)200)); // lead:   2000
                TerrariaClone.TOOLDURS.put(new Short((short)139), new Short((short)200)); // lead:   2000
                TerrariaClone.TOOLDURS.put(new Short((short)140), new Short((short)200)); // lead:   2000

                TerrariaClone.FUELS = new HashMap<Short,Double>();

                TerrariaClone.FUELS.put(new Short((short)15), 0.01);
                TerrariaClone.FUELS.put(new Short((short)28), 0.001);
                TerrariaClone.FUELS.put(new Short((short)160), 0.02);
                TerrariaClone.FUELS.put(new Short((short)168), 0.01);
                TerrariaClone.FUELS.put(new Short((short)179), 0.0035);
                TerrariaClone.FUELS.put(new Short((short)20), 0.0025);
                TerrariaClone.FUELS.put(new Short((short)21), 0.00125);
                TerrariaClone.FUELS.put(new Short((short)35), 0.02);
                TerrariaClone.FUELS.put(new Short((short)36), 0.011);
                TerrariaClone.FUELS.put(new Short((short)77), 0.02);
                TerrariaClone.FUELS.put(new Short((short)79), 0.02);
                TerrariaClone.FUELS.put(new Short((short)81), 0.02);
                TerrariaClone.FUELS.put(new Short((short)83), 0.02);
                TerrariaClone.FUELS.put(new Short((short)85), 0.02);
                TerrariaClone.FUELS.put(new Short((short)87), 0.02);
                TerrariaClone.FUELS.put(new Short((short)89), 0.0035);
                TerrariaClone.FUELS.put(new Short((short)91), 0.02);
                TerrariaClone.FUELS.put(new Short((short)95), 0.02);
                TerrariaClone.FUELS.put(new Short((short)78), 0.01);
                TerrariaClone.FUELS.put(new Short((short)80), 0.01);
                TerrariaClone.FUELS.put(new Short((short)82), 0.01);
                TerrariaClone.FUELS.put(new Short((short)84), 0.01);
                TerrariaClone.FUELS.put(new Short((short)86), 0.01);
                TerrariaClone.FUELS.put(new Short((short)88), 0.01);
                TerrariaClone.FUELS.put(new Short((short)90), 0.01);
                TerrariaClone.FUELS.put(new Short((short)92), 0.01);
                TerrariaClone.FUELS.put(new Short((short)96), 0.01);
                for (int i=97; i<103; i++) {
                    TerrariaClone.FUELS.put(new Short((short)i), 0.0035);
                }
                TerrariaClone.FUELS.put(new Short((short)154), 0.002);
                TerrariaClone.FUELS.put(new Short((short)155), 0.002);
                TerrariaClone.FUELS.put(new Short((short)156), 0.00333);

                TerrariaClone.WIREP = new HashMap<Integer,Integer>();

                TerrariaClone.WIREP.put(0, 94);
                TerrariaClone.WIREP.put(1, 95);
                TerrariaClone.WIREP.put(2, 96);
                TerrariaClone.WIREP.put(3, 97);
                TerrariaClone.WIREP.put(4, 98);
                TerrariaClone.WIREP.put(5, 99);

                TerrariaClone.TORCHESL = new HashMap<Integer,Integer>();

                TerrariaClone.TORCHESL.put(20, 24);
                TerrariaClone.TORCHESL.put(21, 26);
                TerrariaClone.TORCHESL.put(22, 28);
                TerrariaClone.TORCHESL.put(100, 101);
                TerrariaClone.TORCHESL.put(105, 107);
                TerrariaClone.TORCHESL.put(106, 108);
                TerrariaClone.TORCHESL.put(127, 127);
                TerrariaClone.TORCHESL.put(128, 128);

                TerrariaClone.TORCHESR = new HashMap<Integer,Integer>();

                TerrariaClone.TORCHESR.put(20, 25);
                TerrariaClone.TORCHESR.put(21, 27);
                TerrariaClone.TORCHESR.put(22, 29);
                TerrariaClone.TORCHESR.put(100, 102);
                TerrariaClone.TORCHESR.put(105, 109);
                TerrariaClone.TORCHESR.put(106, 110);
                TerrariaClone.TORCHESR.put(127, 129);

                TerrariaClone.TORCHESB = new HashMap<Integer,Boolean>();

                for (int i=0; i<target.blocknames.length; i++) {
                    TerrariaClone.TORCHESB.put(i, false);
                }

                TerrariaClone.TORCHESB.put(20, true);
                TerrariaClone.TORCHESB.put(21, true);
                TerrariaClone.TORCHESB.put(22, true);
                TerrariaClone.TORCHESB.put(100, true);
                TerrariaClone.TORCHESB.put(24, true);
                TerrariaClone.TORCHESB.put(26, true);
                TerrariaClone.TORCHESB.put(28, true);
                TerrariaClone.TORCHESB.put(101, true);
                TerrariaClone.TORCHESB.put(25, true);
                TerrariaClone.TORCHESB.put(27, true);
                TerrariaClone.TORCHESB.put(29, true);
                TerrariaClone.TORCHESB.put(102, true);
                TerrariaClone.TORCHESB.put(105, true);
                TerrariaClone.TORCHESB.put(106, true);
                TerrariaClone.TORCHESB.put(107, true);
                TerrariaClone.TORCHESB.put(108, true);
                TerrariaClone.TORCHESB.put(109, true);
                TerrariaClone.TORCHESB.put(110, true);
                TerrariaClone.TORCHESB.put(127, true);
                TerrariaClone.TORCHESB.put(128, true);
                TerrariaClone.TORCHESB.put(129, true);
                TerrariaClone.TORCHESB.put(130, true);

                TerrariaClone.GSUPPORT = new HashMap<Integer,Boolean>();

                for (int i=0; i<target.blocknames.length; i++) {
                    TerrariaClone.GSUPPORT.put(i, false);
                }

                TerrariaClone.GSUPPORT.put(15, true);
                TerrariaClone.GSUPPORT.put(83, true);
                TerrariaClone.GSUPPORT.put(20, true);
                TerrariaClone.GSUPPORT.put(21, true);
                TerrariaClone.GSUPPORT.put(22, true);
                TerrariaClone.GSUPPORT.put(77, true);
                TerrariaClone.GSUPPORT.put(78, true);
                TerrariaClone.GSUPPORT.put(100, true);
                TerrariaClone.GSUPPORT.put(105, true);
                TerrariaClone.GSUPPORT.put(106, true);
                TerrariaClone.GSUPPORT.put(131, true);
                TerrariaClone.GSUPPORT.put(132, true);
                TerrariaClone.GSUPPORT.put(133, true);
                TerrariaClone.GSUPPORT.put(134, true);
                TerrariaClone.GSUPPORT.put(135, true);
                TerrariaClone.GSUPPORT.put(136, true);

                for (int i=48; i<73; i++) {
                    TerrariaClone.GSUPPORT.put(i, true);
                }

                TerrariaClone.FSPEED = new HashMap<Short,Double>();

                for (int i=0; i<target.blocknames.length; i++) {
                    TerrariaClone.FSPEED.put(new Short((short)i), 0.001);
                }

                TerrariaClone.FSPEED.put(new Short((short)85), -0.001);
                TerrariaClone.FSPEED.put(new Short((short)86), -0.001);

                TerrariaClone.DDELAY = new HashMap<Integer,Integer>();

                for (int i=137; i<145; i++) {
                    TerrariaClone.DDELAY.put(i, 10);
                }
                for (int i=145; i<153; i++) {
                    TerrariaClone.DDELAY.put(i, 20);
                }
                for (int i=153; i<161; i++) {
                    TerrariaClone.DDELAY.put(i, 40);
                }
                for (int i=161; i<169; i++) {
                    TerrariaClone.DDELAY.put(i, 80);
                }

                target.sun = target.loadImage("environment/sun.png");
                target.moon = target.loadImage("environment/moon.png");
                target.FRI1 = new ArrayList<Short>(0);
                target.FRN1 = new ArrayList<Short>(0);
                target.FRI2 = new ArrayList<Short>(0);
                target.FRN2 = new ArrayList<Short>(0);

                target.FRI1.add(new Short((short)3)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)29)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)4)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)30)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)5)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)31)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)6)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)32)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)38)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)60)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)39)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)61)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)40)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)62)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)41)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)63)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)42)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)64)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)43)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)65)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)44)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)67)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)45)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)68)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)46)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)69)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)47)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)70)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)48)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)71)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)49)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)72)); target.FRN2.add(new Short((short)1));
                target.FRI1.add(new Short((short)50)); target.FRN1.add(new Short((short)4)); target.FRI2.add(new Short((short)73)); target.FRN2.add(new Short((short)1));
                for (int i=8; i>2; i--) {
                    target.FRI1.add(new Short((short)74)); target.FRN1.add(new Short((short)i)); target.FRI2.add(new Short((short)76)); target.FRN2.add(new Short((short)i));
                    target.FRI1.add(new Short((short)2)); target.FRN1.add(new Short((short)i)); target.FRI2.add(new Short((short)162)); target.FRN2.add(new Short((short)i));
                    target.FRI1.add(new Short((short)161)); target.FRN1.add(new Short((short)i)); target.FRI2.add(new Short((short)163)); target.FRN2.add(new Short((short)i));
                    target.FRI1.add(new Short((short)165)); target.FRN1.add(new Short((short)i)); target.FRI2.add(new Short((short)166)); target.FRN2.add(new Short((short)i));
                    target.FRI1.add(new Short((short)15)); target.FRN1.add(new Short((short)i)); target.FRI2.add(new Short((short)179)); target.FRN2.add(new Short((short)i));
                }
                for (int j=97; j<103; j++) {
                    target.FRI1.add(new Short((short)j)); target.FRN1.add(new Short((short)1)); target.FRI2.add(new Short((short)167)); target.FRN2.add(new Short((short)8));
                }
    }
}
