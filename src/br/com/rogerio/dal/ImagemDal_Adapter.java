/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.dal;

import br.com.rogerio.interfaces.Interface_ImagemAlvo;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author roger
 */
public class ImagemDal_Adapter implements Interface_ImagemAlvo{
    
    DistribuidoraDeImagemDal objeto = new DistribuidoraDeImagemDal();
    
    JFileChooser chooser = new JFileChooser();
    File f;

    @Override
    public String carregarPath() throws Exception {
       try {
            chooser.showOpenDialog(null);
            f = chooser.getSelectedFile();
            String caminho = f.getAbsolutePath();
            return caminho;
        } catch (Exception erro) {
            throw new Exception("Erro ao carregar o caminho\n" + erro);
        }
    }

    @Override
    public ImageIcon carregarImagem(String caminho) throws Exception {
        
       return objeto.distribuirImagem(caminho);
    }
    
}
