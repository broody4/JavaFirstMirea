package ru.mirea.task30;

import java.io.Serializable;

public interface Alcoholable extends Serializable {
    boolean isAlcoholicDrink();
    double getAlcoholVol();
}
