package other;

/**
 * A Tar osztaly segitsegevel publikus változókban eltárolhatjuk<br>
 * a tile-ok ketto tulajdonsagat, azaz koordinataikat
 * @author Felegyi Mihaly Patrik
 * @param <first> az elso tile (x koordinata)
 * @param <second> a masodik tile (y koordinata)
 */
public class Tar<first, second> {
    
    public first first;
    public second second;

    public Tar() {}
}
