package edu.device.interfaces;

/**
 * Interface Phone que define métodos para gerenciar chamadas e contatos.
 * 
 * @author Emerson Sousa
 * @version 1.0
 * @since 09/08/2024
 */
public interface Phone {

    /**
     * Faz uma chamada telefônica.
     */
    public void fazerChamada();

    /**
     * Encerra a chamada telefônica atual.
     */
    public void encerrarChamada();

    /**
     * Salva um novo contato.
     * 
     * @param contato A sequência de caracteres que representa o contato a ser salvo.
     */
    public void salvarContato(String contato);

    /**
     * Exclui um contato existente.
     * 
     * @param contato O nome do contato a ser excluído.
     */
    public void excluirContato(String contato);

    /**
     * Altera as informações de um contato existente.
     * 
     * @param nomeContato O nome do contato a ser alterado.
     */
    public void alterarContato(String nomeContato);

    /**
     * Bloqueia um contato.
     * 
     * @param nomeContato O nome do contato a ser bloqueado.
     */
    public void bloquearContato(String nomeContato);
}

