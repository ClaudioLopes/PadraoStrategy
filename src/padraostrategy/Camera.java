/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

/**
 *
 * @author claudio
 */
public class Camera extends Produto{
    public Camera(){
        this.nome = "Camera";
        this.promocao = new PromocaoDiaMaes();
    }
}
