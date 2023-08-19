package exercise;

import java.util.Arrays;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        int rows = image.length;
        int cols = image[0].length;

        String[][] enlargedImage = new String[rows * 2][cols * 2];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                enlargedImage[i * 2][j * 2] = image[i][j];
                enlargedImage[i * 2][j * 2 + 1] = image[i][j];
                enlargedImage[i * 2 + 1][j * 2] = image[i][j];
                enlargedImage[i * 2 + 1][j * 2 + 1] = image[i][j];
            }
        }

        return enlargedImage;
    }
}
// END
