package cwiczenia;

public class Arrays {

    public void getLetters(String[] tab) {

        tab[0] = "A";
        tab[1] = "B";
        tab[2] = "C";
        tab[3] = "D";
        tab[4] = "E";
    }

    public void reverse(int[] array) {
        int buf;
        for (int i = 0; i < array.length / 2; i++) {
            buf = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buf;
        }
    }

    public int[] createIntArray(int x) {
        int[] array = new int[x];
        return array;
    }

    public int[][] createIntArray(int x, int y) {
        int[][] array = new int[x][y];
        return array;
    }

    public int[][] identityMatrix(int x) {
        int[][] matrix = new int[x][x];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j) matrix[i][j] = 0;
                else matrix[i][j] = 1;
            }
        }
        return matrix;
    }

    public void view(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.print("\n");
        }
    }

    public void view(int[] array) {
        for (int x : array) {
            System.out.print(x);
        }
    }

    public void view(char[] array) {
        for (char x : array) {
            System.out.print(x);
        }
    }

    public String change(int x) {
        String number = Integer.toString(x);
        char[] charnum = number.toCharArray();
        char buf = 0;
        for (int i = 0; i < charnum.length / 2; i++) {
            buf = charnum[i];
            charnum[i] = charnum[charnum.length - 1 - i];
            charnum[charnum.length - 1 - i] = buf;
        }
        return String.valueOf(charnum);
    }

    public void bubbleSort(int[] array) {
        int n = array.length;
        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int x = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = x;
                }
            }
            n--;
        }
    }
}

