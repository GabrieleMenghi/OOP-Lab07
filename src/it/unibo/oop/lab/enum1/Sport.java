/**
 * 
 */
package it.unibo.oop.lab.enum1;

/**
 * Represents an enumeration for declaring sports;
 * 
 * 1) Complete the definition of the enumeration.
 * 
 */
public enum Sport {
	BASKET("Basket"), SOCCER("soccer"), TENNIS("tennis"), BIKE("bike"), F1("f1"), MOTOGP("motoGP"), VOLLEY("volley");

	private final String name;
	private Sport(final String name) {
		this.name = name;
	}
    /*
     * declare the following sports: - basket - soccer - tennis - bike - F1 -
     * motogp - volley
     */
}
