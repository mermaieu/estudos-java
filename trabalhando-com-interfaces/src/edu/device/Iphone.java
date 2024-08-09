package edu.device;

import edu.device.interfaces.Browser;
import edu.device.interfaces.Ipod;
import edu.device.interfaces.Phone;

/**
 * Classe Iphone que implementa as interfaces Phone, Ipod e Browser.
 * Esta classe fornece funcionalidades para gerenciar chamadas, 
 * controlar a reprodução de música e navegar na internet.
 * 
 * @author Emerson Sousa
 * @version 1.0
 * @since 09/08/2024
 */
public class Iphone implements Phone, Ipod, Browser {

    /**
     * Liga o dispositivo.
     */
    public void ligarDispositivo() {
        System.out.println("Ligando aparelho...");
    }

    /**
     * Desliga o dispositivo.
     */
    public void desligarDispositivo() {
        System.out.println("Desligando aparelho...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void navegarInternet() {
        System.out.println("Navegando na internet...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void abrirNovaAba() {
        System.out.println("Abrindo nova aba...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void fecharAba() {
        System.out.println("Fechando aba...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void ampliarZoom() {
        System.out.println("Ampliando zoom...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void reduzirZoom() {
        System.out.println("Reduzindo zoom...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deslizarTelaCima() {
        System.out.println("Deslizando tela para cima...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deslizarTelaBaixo() {
        System.out.println("Deslizando tela para baixo...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo volume...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void passarMusica() {
        System.out.println("Passando música...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void voltarMusica() {
        System.out.println("Voltando música...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void pausarMusica() {
        System.out.println("Pausando música...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando chamada...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void salvarContato(String contato) {
        System.out.println("Salvando o contato " + contato + "...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void excluirContato(String nomeContato) {
        System.out.println("Excluindo o contato " + nomeContato + "...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void alterarContato(String nomeContato) {
        System.out.println("Alterando o contato " + nomeContato + "...");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void bloquearContato(String nomeContato) {
        System.out.println("Bloqueando o contato " + nomeContato + "...");
    }
}
