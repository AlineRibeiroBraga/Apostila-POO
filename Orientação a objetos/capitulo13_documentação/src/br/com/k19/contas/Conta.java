package br.com.k19.contas;
/* *
 *
 * Documentação da classe Conta
 *
 * @author Aline Ribeiro
 *
 * @version 1.0
 */
public class Conta {
    /* *
     * Documentação do atributo numero
     */
    private int numero;

/* *
* Documentação do construtor
*
* @param numero
* documentação do atributo numero
*
* @throws IllegalArgumentException
*
documentação da situação que gera a exception
*
*IllegalArgumentException
*/

public Conta(int numero ) {
    if ( numero < 0) {
        throw new IllegalArgumentException ( " número negativo " ) ;
    }
    this . numero = numero ;
}
    /* *
     * Documentação do método getNumero
     *
     * @return documentação do valor de retorno
     */
    public int getNumero () {
        return numero ;
    }
}