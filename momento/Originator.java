package Momento.Originator;

/**
 * Created by ppolozhe on 4/10/19.
 */
public class Originator {
    static  int i = 1;

    private static final String ARR =
                ".%c:%c:%c.\n" +
                ".%c:%c:%c.\n" +
                ".%c:%c:%c.\n";

    public String toString(){
        return String.format(ARR,
                arr[0][0], arr[0][1], arr[0][2],
                arr[1][0], arr[1][1], arr[1][2],
                arr[2][0], arr[2][1], arr[2][2]);
    }

    char[][] arr = {{' ',' ',' '}, {' ',' ',' '}, {' ',' ',' '}};


    public void setStep(int x, int y) {
       if(i % 2 != 0)
           arr[x][y] = 'x';
            else
            arr[x][y] = 'o';
       i++;
    }

    public Momento save() {
        char[][] dest = new char[3][3];

        for (int i = 0; i < 3; i++) {
            System.arraycopy(arr[i], 0, dest[i], 0, dest[i].length);
        }
        return new Momento(dest);
    }

    public void saved(Momento saved) {
        arr = saved.getMomento();
    }

}
