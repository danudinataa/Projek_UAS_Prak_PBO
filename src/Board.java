/**
 * Class Board merepresentasikan sebuah papan dalam permainan battleship di mana seorang pemain meletakkan kapal-kapal dan pemain lainnya menebak posisi kapal-kapal tersebut.
 */
public class Board
{
    /** ukuran default papan */
    public static final int DEFAULT_GRID_SIZE = 10;

    /** panjang minimum kapal */
    public static final int MIN_SHIP_LENGTH = 2;

    // flag/tanda/status dari masing-masing sel pada board
    public static final char EMPTY = '.';
    public static final char SHIP = 'S';
    public static final char HIT = 'H';
    public static final char MISS = 'M';

    public static final boolean HORIZONTAL = true;
    public static final boolean VERTICAL = false;

    /** jumlah baris dalam grid */
    private int height;

    /** jumlah kolom dalam grid */
    private int width;

    /** grid / papan bermain */
    private char[][] grid;

    /** jumlah sel yang berisi kapal */
    private int totalShipCells;

    /** jumlah sel yang berisi kapal dan tertembak */
    private int totalHits;


    /**
     * Membuat sebuah board baru yang kosong dengan ukuran default.
     */
    public Board ()
    {
        this (DEFAULT_GRID_SIZE, DEFAULT_GRID_SIZE);
    }


    /**
     * Membuat sebuah board baru yang kosong.
     */
    public Board (int height, int width)
    {
        // TODO: lengkapi implementasi method ini

    
    }


    /**
     * Mengembalikan lebar dari grid.
     * 
     * @return jumlah kolom
     */
    public int getWidth ()
    {
        // TODO: lengkapi implementasi method ini
        
        
    }


    /**
     * Mengembalikan tinggi dari grid.
     * 
     * @return jumlah baris
     */
    public int getHeight ()
    {
        // TODO: lengkapi implementasi method ini
        
    }


    /**
     * Meletakkan sebuah kapal dengan panjang, koordinat paling kiri dan atas,
     * dan arah yang diberikan.
     * 
     * FULL SCORE: Jika kapal tidak bisa diletakkan (sudah ada kapal lain),
     * board harus dikembalikan ke kondisi awal sebelum diubah.
     * 
     * @param length
     *            panjang kapal harus >= 2
     * @param topRow
     *            koordinat paling atas kapal
     * @param leftCol
     *            koordinat paling kiri kapal
     * @param isHorizontal
     *            true jika horizontal, false jika vertikal
     * @return mengembalikan true jika kapal bisa diletakkan tanpa
     *         overlap/tumpang tindih dengan kapal lain.
     */
    public boolean placeShip (int length, int topRow, int leftCol,
            boolean isHorizontal)
    {
        // TODO: lengkapi implementasi method ini

    }


    /**
     * Mencetak status terakhir dari papan permainan ke console (System.out).
     * Jika hideShips == true, sembunyikan sel-sel yang berisi kapal.
     * 
     * @param hideShips
     *            jika true, jangan tampilkan sel-sel yang berisi kapal.
     */
    public void printBoard (boolean hideShips)
    {
        // TODO: lengkapi implementasi method ini

    }


    /**
     * Menembak pada koordinat baris dan kolom yang diberikan. Board pada
     * koordinat tersebut harus diubah jika hit dan mis. Diperbolehkan untuk
     * menembak pada koordinat yang sama lebih dari satu kali.
     * 
     * @param row
     *            koordinat baris (0 ... height - 1)
     * @param col
     *            koordinat kolom (0 ... width - 1)
     * @return true jika hit atau koordinat invalid, false jika miss
     */
    public boolean hit (int row, int col)
    {
        // TODO: lengkapi implementasi method ini

    }


    /**
     * Menembak pada koordinat yang diberikan. Board pada koordinat tersebut
     * harus diubah jika hit dan mis. Diperbolehkan untuk menembak pada
     * koordinat yang sama lebih dari satu kali.
     * 
     * @param coord
     *            koordinat seperti "A1", "J10", "a1", "j10"
     * @return true jika hit atau koordinat invalid, false jika miss
     */
    public boolean hit (String coord)
    {
        return hit (coordToRow (coord), coordToCol (coord));
    }


    /**
     * Memeriksa apakah koordinat yang diberikan valid.
     * 
     * @param row
     *            koordinat baris (0 ... height - 1)
     * @param col
     *            koordinat kolom (0 ... width - 1)
     * @return true jika koordinat valid, false jika koordinat invalid
     */
    public boolean isValidCoordinate (int row, int col)
    {
        // TODO: lengkapi implementasi method ini

    }


    /**
     * Mendapatkan posisi baris dari koordinat yang diberikan. Contoh:
     * coordToRow("B3") mengembalikan 2, coordToRow("G10") mengembalikan 9.
     * 
     * @param coord
     *            koordinat seperti "A1", "J10", "a1", "j10"
     * @return posisi baris (0 ... height - 1)
     */
    public static int coordToRow (String coord)
    {
        // TODO: lengkapi implementasi method ini

    }


    /**
     * Mendapatkan posisi kolom dari koordinat yang diberikan. Contoh:
     * coordToCol("B3") mengembalikan 1, coordToRow("G10") mengembalikan 6.
     * 
     * @param coord
     *            koordinat seperti "A1", "J10", "a1", "j10"
     * @return posisi kolom (0 ... width - 1)
     */
    public static int coordToCol (String coord)
    {
        // TODO: lengkapi implementasi method ini

    }


    /**
     * Memeriksa apakah semua sel yang berisi kapal sudah tertembak.
     * 
     * @return mengembalikan true jika semua kapal sudah dilumpuhkan total.
     */
    public boolean isAllShipSunk ()
    {
        // TODO: lengkapi implementasi method ini

    }

}
