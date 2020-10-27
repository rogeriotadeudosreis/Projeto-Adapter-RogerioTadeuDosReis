/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.interfaces;

import javax.swing.ImageIcon;

/**
 *
 * @author roger
 */
public interface Interface_ImagemAlvo {
    
     public String carregarPath()throws Exception;
     public ImageIcon carregarImagem(String caminho)throws Exception;
}
