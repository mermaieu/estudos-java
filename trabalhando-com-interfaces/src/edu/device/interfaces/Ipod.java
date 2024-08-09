package edu.device.interfaces;

/**
 * Interface Ipod que define métodos para controlar a reprodução de música.
 * 
 * @author Emerson Sousa
 * @version 1.0
 * @since 09/08/2024
 */
public interface Ipod {

    /**
     * Toca a música atual.
     */
    public void tocarMusica();

    /**
     * Aumenta o volume da música.
     */
    public void aumentarVolume();

    /**
     * Diminui o volume da música.
     */
    public void diminuirVolume();

    /**
     * Passa para a próxima música.
     */
    public void passarMusica();

    /**
     * Volta para a música anterior.
     */
    public void voltarMusica();

    /**
     * Pausa a música atual.
     */
    public void pausarMusica();
}

