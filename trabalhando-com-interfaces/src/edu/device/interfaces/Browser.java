package edu.device.interfaces;

/**
 * Interface Browser que define métodos para interagir com um navegador.
 * 
 * @author Emerson Sousa
 * @version 1.0
 * @since 09/08/2024
 */
public interface Browser {

    /**
     * Navega na internet.
     */
    public void navegarInternet();

    /**
     * Abre uma nova aba no navegador.
     */
    public void abrirNovaAba();

    /**
     * Fecha a aba atual do navegador.
     */
    public void fecharAba();

    /**
     * Amplia o zoom da página atual.
     */
    public void ampliarZoom();

    /**
     * Reduz o zoom da página atual.
     */
    public void reduzirZoom();

    /**
     * Desliza a tela para cima.
     */
    public void deslizarTelaCima();

    /**
     * Desliza a tela para baixo.
     */
    public void deslizarTelaBaixo();
}

