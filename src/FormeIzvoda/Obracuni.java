
package FormeIzvoda;

import KlaseOsoba.Radnik;

public interface Obracuni {
    public long obracunajRadneSate(Radnik radnik);
    public double obracunajPlatu(Radnik radnik);
    public double obracunajBonus(Radnik radnik);
    public long obracunajKvotu(Radnik radnik);
}
